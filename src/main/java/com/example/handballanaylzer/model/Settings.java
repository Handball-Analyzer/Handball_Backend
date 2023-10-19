package com.example.handballanaylzer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "settings")
public class Settings {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private UUID id;
    @OneToOne(mappedBy = "settings")
    @JsonIgnore
    private User user;
    private String language;
    private String color_mode;
    private String theme;
    private String news;

    public Settings( String language, String color_mode, String theme, String news) {
        this.language = language;
        this.color_mode = color_mode;
        this.theme = theme;
        this.news = news;
    }

    public Settings() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getColor_mode() {
        return color_mode;
    }

    public void setColor_mode(String color_mode) {
        this.color_mode = color_mode;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
