package com.kadod.kadod.model.repositories;

import com.kadod.kadod.model.entities.Companie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanieRepository extends JpaRepository<Companie, Integer> {

    Companie findOneById(Integer id);
    Companie findOneByNomIgnoreCaseOrCodeIgnoreCase(String nom, String code);

}
