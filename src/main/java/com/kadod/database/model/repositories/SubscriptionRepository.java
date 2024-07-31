package com.kadod.database.model.repositories;

import com.kadod.database.model.entities.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Integer> {

    Subscription findOneById(Integer id);

}
