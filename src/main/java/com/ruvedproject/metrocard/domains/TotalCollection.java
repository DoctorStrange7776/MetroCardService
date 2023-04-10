package com.ruvedproject.metrocard.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TotalCollection {
    String passengerType;
    Integer totalCollectBalance;
    Integer totalDiscountBalance;
}
