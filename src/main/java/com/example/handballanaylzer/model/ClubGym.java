package com.example.handballanaylzer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ClubGym {
    @Id
    @GeneratedValue
    private Long id;
    private Long club_id;
    private Long gym_id;
}
