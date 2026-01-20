package com.trenc.rest.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
public class SensorData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long id;

    @Column
    @Getter
    @Setter
    private double degree;

    @Getter
    private LocalDateTime localDateTime = LocalDateTime.now();
}
