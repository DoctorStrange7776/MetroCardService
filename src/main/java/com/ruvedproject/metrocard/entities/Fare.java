package com.ruvedproject.metrocard.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

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
    @OneToMany(mappedBy = "fare",cascade = CascadeType.ALL)
    List<Journey> journeyList;
}
