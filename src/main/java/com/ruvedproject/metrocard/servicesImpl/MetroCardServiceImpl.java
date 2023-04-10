package com.ruvedproject.metrocard.servicesImpl;

import com.ruvedproject.metrocard.domains.Balance;
import com.ruvedproject.metrocard.domains.CheckIN;
import com.ruvedproject.metrocard.domains.CheckINBal;
import com.ruvedproject.metrocard.domains.PrintSummary;
import com.ruvedproject.metrocard.entities.Journey;
import com.ruvedproject.metrocard.entities.MetroCard;
import com.ruvedproject.metrocard.jpaRepo.MCBalanceRepo;
import com.ruvedproject.metrocard.jpaRepo.MCCheckInRepo;
import com.ruvedproject.metrocard.jpaRepo.MCFareRepo;
import com.ruvedproject.metrocard.services.MetroCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MetroCardServiceImpl implements MetroCardService {

    @Autowired
    MCBalanceRepo mcBalanceRepo;
    @Autowired
    MCCheckInRepo mcCheckInRepo;
    @Autowired
    MCFareRepo mcFareRepo;

    @Override
    public void addMetroCardBalance(MetroCard metroCard) {
        mcBalanceRepo.save(metroCard);
    }

    @Override
    public void checkInJourney(Journey journey) {
        journey.setDate(new Date());
//        journey.setPassengerType("half");
        //long fare=mcFareRepo.getFareByPassengerType(journey.getPassengerType()).getPrice();
        long charge=0;
        System.out.println(journey.getMetroCard().getMetroId());
        journey.setCharge(charge);
        mcCheckInRepo.save(journey);
    }

    @Override
    public List<PrintSummary> getPrintSummary() {
//     List<Journey> joruneyList=mcCheckInRepo.getJourneyBy();
//     joruneyList.stream().forEach(v->System.out.println(v.getMetroCard()+" "+v.getFare()+
//             " "+v.getFrom()+" "+v.getCharge()+" "+v.getDate()));
    return new ArrayList<>();
    }
}
