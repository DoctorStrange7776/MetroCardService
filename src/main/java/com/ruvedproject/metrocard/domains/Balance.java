package com.ruvedproject.metrocard.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Balance {
    private String metroCardId;
    private long balance;
}
