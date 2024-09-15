package com.kadod.database.model.repositories;

import com.kadod.database.model.entities.Employee;
import com.kadod.database.model.entities.RowConversation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RowConversationRepository extends JpaRepository<RowConversation, Integer> {

    RowConversation findOneById(Integer id);
    List<RowConversation> findByCreateByOrCreateToOrderByCreatedDesc(Employee createBy, Employee createTo);
//    RowConversation findByCreateByBetweenAndCreateToBetween(Employee createBy, Employee createTo, Employee createTo2, Employee createBy2);
//    RowConversation findByCreateByBetweenOrCreateToBetween(Employee createBy, Employee createTo, Employee createTo2, Employee createBy2);
//    RowConversation findByCreateByAndCreateToOrCreateByAndCreateTo(Employee sender, Employee receiver, Employee receiverInverse, Employee senderInverse);
    @Query("SELECT rc FROM RowConversation rc WHERE (rc.createBy = :sender AND rc.createTo = :receiver) OR (rc.createBy = :receiver AND rc.createTo = :sender)")
    RowConversation findConversationBetween(@Param("sender") Employee sender, @Param("receiver") Employee receiver);

}
