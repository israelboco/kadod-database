package com.kadod.database.model.repositories;

import com.kadod.database.model.entities.AccessDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessDayRepository extends JpaRepository<AccessDay, Integer> {

    AccessDay findOneById(Integer id);

}
