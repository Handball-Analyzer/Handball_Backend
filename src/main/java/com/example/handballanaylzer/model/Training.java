package com.example.handballanaylzer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Training {
    @Id
    @GeneratedValue
    private Long id;
    private Long team_id;
    private LocalDateTime localDateTime;
    private Long gym_id;

}
