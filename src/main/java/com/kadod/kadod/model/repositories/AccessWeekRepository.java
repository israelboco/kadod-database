package com.kadod.kadod.model.repositories;

import com.kadod.fingerprint.model.entities.AccessWeek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessWeekRepository extends JpaRepository<AccessWeek, Integer> {

    AccessWeek findOneById(Integer id);

}
