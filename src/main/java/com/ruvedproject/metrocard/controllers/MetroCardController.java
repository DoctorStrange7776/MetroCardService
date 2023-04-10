package com.ruvedproject.metrocard.controllers;

import com.ruvedproject.metrocard.domains.Balance;
import com.ruvedproject.metrocard.domains.CheckIN;
import com.ruvedproject.metrocard.domains.PrintSummary;
import com.ruvedproject.metrocard.entities.Journey;
import com.ruvedproject.metrocard.entities.MetroCard;
import com.ruvedproject.metrocard.services.MetroCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/metrocard")
public class MetroCardController {

    @Autowired
    MetroCardService metroCardService;


    @PostMapping(value = "/add",produces ="application/json")
    public void addMetroCard(@RequestBody MetroCard metroCard)
    {
        metroCardService.addMetroCardBalance(metroCard);
    }
    @PostMapping(value="/checkIN",produces ="application/json")
    public void addCheckIN(@RequestBody Journey journey)
    {
        metroCardService.checkInJourney(journey);
    }

    @GetMapping(value="/getfare",consumes ="application/json")
    public List<PrintSummary> getFareCollection()
    {
        return metroCardService.getPrintSummary();
    }
}
