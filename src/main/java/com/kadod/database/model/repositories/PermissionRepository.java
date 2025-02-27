package com.kadod.database.model.repositories;

import com.kadod.database.model.entities.Employee;
import com.kadod.database.model.entities.Permission;
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
    Page<Permission> findByEmployeeAndAcceptedOrderByIdDesc(Employee employee, Boolean accepted, Pageable pageable);
    Page<Permission> findByEmployeeAndAcceptedIsNullOrderByIdDesc(Employee employee, Pageable pageable);
    Page<Permission> findByEmployeeInAndAcceptedOrderByIdDesc(List<Employee> employees, Boolean accepted, Pageable pageable);
    Page<Permission> findByEmployeeInAndAcceptedIsNullOrderByIdDesc(List<Employee> employees, Pageable pageable);

}
