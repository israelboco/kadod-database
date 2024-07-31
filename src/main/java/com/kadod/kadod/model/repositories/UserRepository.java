package com.kadod.kadod.model.repositories;

import com.kadod.kadod.model.entities.Role;
import com.kadod.kadod.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findOneById(Integer id);
    User findOneByEmail(String email);
    List<User> findByRolesIn(List<Role> grants);

}
