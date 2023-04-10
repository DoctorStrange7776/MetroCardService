package com.ruvedproject.metrocard.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PrintSummary {
    TotalCollection totalCollection;
    List<PassengerTypeSummary> printSummaryInfo;
}
