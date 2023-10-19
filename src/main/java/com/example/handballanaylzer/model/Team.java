package com.example.handballanaylzer.model;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String gender;
    private String age_group;
    private Integer number;
    private String season;
    @ManyToOne()
    @JoinColumn(name = "club_id", nullable = false)
    private Club club;

    @OneToMany(mappedBy = "team")
    private Set<TeamMember> teamMembers;

    @OneToMany(mappedBy = "team")
    private Set<Game> games;
    @OneToMany(mappedBy = "team")
    private Set<Training> trainings;

    @OneToMany(mappedBy = "team")
    private Set<UsedFeature> usedFeatures;

    public Team(String gender, String age_group, Integer number,String season, Club club) {
        this.gender = gender;
        this.age_group = age_group;
        this.number = number;
        this.season = season;
        this.club = club;
    }

    public Team() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge_group() {
        return age_group;
    }

    public void setAge_group(String age_group) {
        this.age_group = age_group;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Club getClub_id() {
        return club;
    }

    public void setClub_id(Club club_id) {
        this.club = club_id;
    }
}
