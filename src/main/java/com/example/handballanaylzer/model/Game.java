package com.example.handballanaylzer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Long gym;
    private LocalDateTime datetime;
    private String opponents;
    private  Integer score_home;
    private Integer score_opponents;



    public Long getGym() {
        return gym;
    }

    public void setGym(Long gym) {
        this.gym = gym;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public String getOpponents() {
        return opponents;
    }

    public void setOpponents(String opponents) {
        this.opponents = opponents;
    }

    public Integer getScore_home() {
        return score_home;
    }

    public void setScore_home(Integer score_home) {
        this.score_home = score_home;
    }

    public Integer getScore_opponents() {
        return score_opponents;
    }

    public void setScore_opponents(Integer score_opponents) {
        this.score_opponents = score_opponents;
    }
}
