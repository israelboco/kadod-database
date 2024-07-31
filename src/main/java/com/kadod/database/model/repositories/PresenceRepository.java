package com.kadod.database.model.repositories;


import com.kadod.database.model.entities.Presence;
import com.kadod.database.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PresenceRepository extends JpaRepository<Presence, Integer> {

    Presence findOneById(Integer id);
    List<Presence> findByUser(User user);
    Presence findByUserAndCreatedBetween(User user, Date date1, Date date2);

}
