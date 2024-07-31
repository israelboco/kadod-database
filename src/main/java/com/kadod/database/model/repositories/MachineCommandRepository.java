package com.kadod.database.model.repositories;

import com.kadod.database.model.entities.MachineCommand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MachineCommandRepository extends JpaRepository<MachineCommand, Integer> {
    MachineCommand findOneById(Integer id);

    List<MachineCommand> findBySendStatusAndSerial(int sendStatus, String serial);

}
