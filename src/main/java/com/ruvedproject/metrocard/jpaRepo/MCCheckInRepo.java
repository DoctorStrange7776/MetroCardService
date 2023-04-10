package com.ruvedproject.metrocard.jpaRepo;

import com.ruvedproject.metrocard.domains.PrintSummary;
import com.ruvedproject.metrocard.entities.Journey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MCCheckInRepo extends JpaRepository<Journey,String> {
//    @Query(value = "select e from Journey e ")
//    List<Journey> getJourneyBy();
}