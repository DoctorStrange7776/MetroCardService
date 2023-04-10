package com.ruvedproject.metrocard.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PassengerTypeSummary {
 Map<String,Integer>passengerSummary;
}

