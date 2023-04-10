package com.ruvedproject.metrocard.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Journey")
public class Journey implements Serializable {

    private static final long serialVersionUID = -1953709137850727673L;
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;

    @Column(name="from")
    private String from;

    @ManyToOne(targetEntity = MetroCard.class)
    @JoinColumn(name = "metroId", nullable = false)
    private MetroCard  metroCard;

    @ManyToOne(targetEntity = Fare.class)
    @JoinColumn(name="passengerType")
    private Fare fare;

    @Column(name="date")
    private Date date;
    @Column (name="charge")
    private Long charge;
}
