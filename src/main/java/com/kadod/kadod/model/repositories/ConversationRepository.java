package com.kadod.kadod.model.repositories;

import com.kadod.fingerprint.model.entities.RowConversation;
import com.kadod.fingerprint.model.entities.Conversation;
import com.kadod.fingerprint.model.entities.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConversationRepository extends JpaRepository<Conversation, Integer> {

    Conversation findOneById(Integer id);
    List<Conversation> findBySenderAndReceiverOrderByCreatedDesc(Employee sender, Employee receiver);
    Page<Conversation> findBySenderBetweenAndReceiverBetweenOrderByCreatedDesc(Employee sender, Employee receiver, Employee sender2, Employee receiver2, Pageable pageable);
    Page<Conversation> findByRowOrderByCreatedDesc(RowConversation row, Pageable pageable);
    List<Conversation> findByRowOrderByCreatedDesc(RowConversation row);
    List<Conversation> findBySenderBetweenAndReceiverBetweenOrderByCreatedDesc(Employee sender, Employee receiver, Employee sender2, Employee receiver2);

}
