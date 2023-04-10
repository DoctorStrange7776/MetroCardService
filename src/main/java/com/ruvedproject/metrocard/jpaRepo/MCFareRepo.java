package com.ruvedproject.metrocard.jpaRepo;

import com.ruvedproject.metrocard.entities.Fare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MCFareRepo extends JpaRepository<Fare,String> {
    Fare getFareByPassengerType(String passengerType);
}
