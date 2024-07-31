package com.kadod.kadod.model.repositories;

import com.kadod.fingerprint.model.entities.Option;
import com.kadod.fingerprint.model.entities.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OptionRepository extends JpaRepository<Option, Integer> {

    Option findOneById(Integer id);
    List<Option> findBySubscription(Subscription subscription);

}
