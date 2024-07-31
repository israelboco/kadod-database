package com.kadod.kadod.model.repositories;

import com.kadod.fingerprint.model.entities.AccessDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessDayRepository extends JpaRepository<AccessDay, Integer> {

    AccessDay findOneById(Integer id);

}
