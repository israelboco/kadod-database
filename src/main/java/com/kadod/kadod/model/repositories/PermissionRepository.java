package com.kadod.kadod.model.repositories;

import com.kadod.fingerprint.model.entities.Employee;
import com.kadod.fingerprint.model.entities.Permission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Integer> {

    Permission findOneById(Integer id);
    List<Permission> findByEmployee(Employee employee);
    Page<Permission> findByEmployee(Employee employee, Pageable pageable);
    Page<Permission> findByEmployeeIn(List<Employee> employees, Pageable pageable);
    List<Permission> findByEmployeeAndAccepted(Employee employee, Boolean accepted);
    Page<Permission> findByEmployeeAndAccepted(Employee employee, Boolean accepted, Pageable pageable);
    Page<Permission> findByEmployeeInAndAccepted(List<Employee> employees, Boolean accepted, Pageable pageable);

}
