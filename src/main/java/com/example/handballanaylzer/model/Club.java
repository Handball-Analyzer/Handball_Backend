package com.example.handballanaylzer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String street;
    private Integer plz;
    private Integer housenumber;
    private String location;
    @OneToMany(mappedBy ="club")
    @JsonIgnore
    private Set<Team> teams;

    @OneToMany(mappedBy = "club")
    @JsonIgnore
    private Set<ClubUser> clubuser;

    @OneToMany(mappedBy = "club")
    @JsonIgnore
    private Set<ClubGym>  clubgym;


    public Club( String name, String street, Integer plz, Integer housenumber, String location){
        this.name = name;
        this.street = street;
        this.plz = plz;
        this.housenumber = housenumber;
        this.location = location;
    }

    public Club() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "Club{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", plz=" + plz +
                ", housenumber=" + housenumber +
                ", location='" + location + '\'' +
                ", teams=" + teams +
                '}';
    }
}

