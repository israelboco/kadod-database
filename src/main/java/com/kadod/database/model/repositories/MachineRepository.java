package com.kadod.database.model.repositories;

import com.kadod.database.model.entities.Companie;
import com.kadod.database.model.entities.Machine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MachineRepository extends JpaRepository<Machine, Integer> {

    Machine findOneById(Integer id);
    Machine findOneBySerialNo(String id);
    List<Machine> findByActive(Boolean active);
    List<Machine> findByCompanieAndActive(Companie companie, Boolean active);
    List<Machine> findAllByCompanie(Companie companie);

}
