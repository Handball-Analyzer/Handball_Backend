package com.example.handballanaylzer.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "actionTyp_id", nullable = false)
    private ActionTyp actionTyp;

    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    public Action(ActionTyp actionTyp, LocalDateTime timestamp, User user, Game game) {
        this.actionTyp = actionTyp;
        this.timestamp = timestamp;
        this.user = user;
        this.game = game;
    }

    public Action() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ActionTyp getActionTyp() {
        return actionTyp;
    }

    public void setActionTyp(ActionTyp actionTyp) {
        this.actionTyp = actionTyp;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
