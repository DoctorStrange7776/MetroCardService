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
@Table(name="MetroCards")
public class MetroCard implements Serializable {

    private static final long serialVersionUID = -8526640865325207968L;
    @Id
    @Column(name="id")
    private String metroId;

    @Column(name="balance")
    private Long balance;


    @OneToMany(targetEntity = Journey.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "metroId",referencedColumnName = "id")
    List<Journey> journeyList;
}
