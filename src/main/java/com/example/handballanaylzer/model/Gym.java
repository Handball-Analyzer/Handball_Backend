package com.example.handballanaylzer.model;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String street;
    private Integer plz;
    private Integer housenumber;
    private String location;
    @OneToMany(mappedBy = "gym")
    private Set<ClubGym> clubGym;
    @OneToMany(mappedBy = "gym")
    private Set<Game> games;

    @OneToMany(mappedBy = "gym")
    private Set<Training> trainings;



    public Gym() {
    }

    public Gym(String name, String street, Integer plz, Integer housenumber, String location) {
        this.name = name;
        this.street = street;
        this.plz = plz;
        this.housenumber = housenumber;
        this.location = location;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Set<ClubGym> getClubGym() {
        return clubGym;
    }

    public void setClubGym(Set<ClubGym> clubGym) {
        this.clubGym = clubGym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getPlz() {
        return plz;
    }

    public void setPlz(Integer plz) {
        this.plz = plz;
    }

    public Integer getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(Integer housenumber) {
        this.housenumber = housenumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
