package com.kadod.kadod.model.repositories;

import com.kadod.kadod.model.entities.CompanieType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanieTypeRepository extends JpaRepository<CompanieType, Integer> {

    CompanieType findOneById(Integer id);
    CompanieType findOneByLabel(String id);

}
