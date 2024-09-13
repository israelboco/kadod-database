package com.kadod.database.model.repositories;

import com.kadod.database.model.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    Person findOneById(Integer id);
    Person findOneByNameIgnoreCase(String Name);

}
