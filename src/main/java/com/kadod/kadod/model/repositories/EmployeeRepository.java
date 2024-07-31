package com.kadod.kadod.model.repositories;

import com.kadod.fingerprint.model.entities.Companie;
import com.kadod.fingerprint.model.entities.Employee;
import com.kadod.fingerprint.model.entities.EnrollInfo;
import com.kadod.fingerprint.model.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findOneById(Integer id);
    List<Employee> findByCompanie(Companie companie);
    List<Employee> findByCompanieAndIsAdmin(Companie companie, Boolean isAdmin);
    List<Employee> findByEmployeeAdmin(Employee employeeAdmin);
    Page<Employee> findByCompanie(Companie companie, Pageable pageable);
    Employee findByUser(User user);
    Employee findByEmail(String email);
    Employee findByEnrollInfo(EnrollInfo enrollInfo);
    Employee findByUserAndCompanie(User user, Companie companie);


}
