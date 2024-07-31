package com.kadod.kadod.model.repositories;

import com.kadod.kadod.model.entities.Employee;
import com.kadod.kadod.model.entities.RowConversation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RowConversationRepository extends JpaRepository<RowConversation, Integer> {

    RowConversation findOneById(Integer id);
    List<RowConversation> findByCreateByOrCreateToOrderByCreatedDesc(Employee createBy, Employee createTo);
    RowConversation findByCreateByBetweenAndCreateToBetween(Employee createBy, Employee createTo, Employee createTo2, Employee createBy2);
}
