package com.ruvedproject.metrocard.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Fare")
public class Fare implements Serializable {
    private static final long serialVersionUID = 8983106741403439958L;
    @Id
    @Column(name="passengerType",nullable = false)
    private String passengerType;
    @Column(name = "price")
    private long price;
}
