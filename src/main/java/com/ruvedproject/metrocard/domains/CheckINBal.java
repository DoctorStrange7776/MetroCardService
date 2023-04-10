package com.ruvedproject.metrocard.domains;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CheckINBal {
    String metroCardId;
    String passengerType;
    String from;
    long charge;
    Date date;

}
