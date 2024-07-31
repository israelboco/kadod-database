package com.kadod.database.model.repositories;

import com.kadod.database.model.entities.CompanieType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanieTypeRepository extends JpaRepository<CompanieType, Integer> {

    CompanieType findOneById(Integer id);
    CompanieType findOneByLabel(String id);

}
