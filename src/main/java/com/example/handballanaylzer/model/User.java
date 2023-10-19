package com.example.handballanaylzer.model;


import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.util.Set;
import java.util.UUID;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String firstname;
    private String lastname;
    private String email;
    private String gender;
    private String password;

    private String role;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "settings_id", referencedColumnName = "id")
    private Settings settings;
    private Boolean active;

    @OneToMany(mappedBy = "user")
    Set<ClubUser> clubUsers;

    @OneToMany(mappedBy = "user")
    private Set<Action> actions;

    @OneToMany(mappedBy = "user")
    private Set<ConversationMember> conversationMembers;

    @OneToMany(mappedBy = "user")
    private Set<ChatMessage> chatMessages;


    public User(String firstname, String lastname, String email, String gender, String password, String role, Settings settings, Boolean active) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.password = password;
        this.role = role;
        this.settings = settings;
        this.active = active;
    }

    public User() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", settings=" + settings +
                ", active=" + active +
                ", clubUsers=" + clubUsers +
                '}';
    }
}
