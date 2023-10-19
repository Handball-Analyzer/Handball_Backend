package com.example.handballanaylzer.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class ClubGym {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "club_id")
    private Club club;

    @ManyToOne
    @JoinColumn(name = "gym_id")
    private Gym gym;



}
