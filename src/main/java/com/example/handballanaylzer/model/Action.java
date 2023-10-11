package com.example.handballanaylzer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Long action_list_id;
    private Long user_id;
    private Long game_id;
    private LocalDateTime timestamp;

    public Long getEvent_list_id() {
        return action_list_id;
    }

    public void setEvent_list_id(Long action_list_id) {
        this.action_list_id = action_list_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getGame_id() {
        return game_id;
    }

    public void setGame_id(Long game_id) {
        this.game_id = game_id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
