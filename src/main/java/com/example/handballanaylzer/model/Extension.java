package com.example.handballanaylzer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Extension {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String Name;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
