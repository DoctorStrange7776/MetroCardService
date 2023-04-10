package com.ruvedproject.metrocard.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CheckIN {
    String metroCardId;
    String passengerType;
    String from;
}
