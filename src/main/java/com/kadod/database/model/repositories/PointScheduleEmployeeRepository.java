package com.kadod.database.model.repositories;

import com.kadod.database.model.entities.PointScheduleEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointScheduleEmployeeRepository extends JpaRepository<PointScheduleEmployee, Integer> {
    PointScheduleEmployee findOneById(Integer id);

}
