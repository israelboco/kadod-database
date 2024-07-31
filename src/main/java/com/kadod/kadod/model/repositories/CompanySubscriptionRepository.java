package com.kadod.kadod.model.repositories;

import com.kadod.fingerprint.model.entities.Companie;
import com.kadod.fingerprint.model.entities.CompanySubscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CompanySubscriptionRepository extends JpaRepository<CompanySubscription, Integer> {

    CompanySubscription findOneById(Integer id);
    List<CompanySubscription> findByCompanieAndEndDateBefore(Companie companie, Date endDate);

}
