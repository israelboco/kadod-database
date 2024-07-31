package com.kadod.database.model.repositories;

import com.kadod.database.model.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findOneById(Integer id);

}
