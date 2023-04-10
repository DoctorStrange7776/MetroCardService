package com.ruvedproject.metrocard.services;

import com.ruvedproject.metrocard.domains.Balance;
import com.ruvedproject.metrocard.domains.CheckIN;
import com.ruvedproject.metrocard.domains.PrintSummary;
import com.ruvedproject.metrocard.entities.Journey;
import com.ruvedproject.metrocard.entities.MetroCard;

import java.util.List;

public interface MetroCardService {
    void addMetroCardBalance(MetroCard metroCard);
    void checkInJourney(Journey journey);
    List<PrintSummary> getPrintSummary();
}
