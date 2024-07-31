package com.kadod.kadod.model.repositories;

import com.kadod.fingerprint.model.entities.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {

    Device findOneById(Integer id);
    Device findBySerialNum(String serialNum);

}
