package com.crm.crm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
@Entity
@Table(name = "bus_stop")
public class BusStop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;

    @ManyToOne(optional = false)
    private Stop stop;

    @Column(name = "departure_time", nullable = false)
    private Time departureTime;

}