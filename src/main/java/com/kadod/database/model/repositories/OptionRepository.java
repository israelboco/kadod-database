package com.kadod.database.model.repositories;

import com.kadod.database.model.entities.Option;
import com.kadod.database.model.entities.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OptionRepository extends JpaRepository<Option, Integer> {

    Option findOneById(Integer id);
    List<Option> findBySubscription(Subscription subscription);

}
