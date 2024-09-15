package com.kadod.database.model.repositories;

import com.kadod.database.model.entities.Conversation;
import com.kadod.database.model.entities.Employee;
import com.kadod.database.model.entities.RowConversation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConversationRepository extends JpaRepository<Conversation, Integer> {

    Conversation findOneById(Integer id);
    List<Conversation> findBySenderAndReceiverOrderByCreatedDesc(Employee sender, Employee receiver);
    Page<Conversation> findBySenderBetweenAndReceiverBetweenOrderByCreatedDesc(Employee sender, Employee receiver, Employee sender2, Employee receiver2, Pageable pageable);
    Page<Conversation> findByRowOrderByCreatedDesc(RowConversation row, Pageable pageable);
//    List<Conversation> findByRowAndReceiverAndReadIsFalseOrderByCreatedAsc(RowConversation row, Employee receiver);
    @Query("SELECT c FROM Conversation c WHERE c.row = :row AND c.receiver = :receiver AND c.read = false ORDER BY c.created ASC")
    List<Conversation> findByRowAndReceiverAndReadIsFalseOrderByCreatedAsc(@Param("row") RowConversation row, @Param("receiver") Employee receiver);
    //    List<Conversation> findBySenderBetweenAndReceiverBetweenAndReadIsFalseOrderByCreatedAsc(Employee sender, Employee receiver, Employee sender2, Employee receiver2);
//    List<Conversation> findBySenderAndReceiverAndReadIsFalseOrReceiverAndSenderAndReadIsFalseOrderByCreatedAsc(Employee sender, Employee receiver, Employee receiverInverse, Employee senderInverse);
    @Query("SELECT c FROM Conversation c WHERE (c.sender = :sender AND c.receiver = :receiver OR c.sender = :receiver AND c.receiver = :sender) AND c.read = false ORDER BY c.created ASC")
    List<Conversation> findUnreadConversationsBetween(@Param("sender") Employee sender, @Param("receiver") Employee receiver);


}
