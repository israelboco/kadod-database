package com.kadod.kadod.model.repositories;

import com.kadod.fingerprint.model.entities.Records;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordsRepository extends JpaRepository<Records, Integer> {
    Records findOneById(Integer id);

}
