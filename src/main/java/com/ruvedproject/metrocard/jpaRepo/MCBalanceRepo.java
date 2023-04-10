package com.ruvedproject.metrocard.jpaRepo;

import com.ruvedproject.metrocard.domains.Balance;
import com.ruvedproject.metrocard.entities.MetroCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MCBalanceRepo extends JpaRepository<MetroCard,String> {
}
