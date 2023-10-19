package com.example.handballanaylzer.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class ConversationMember {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "conversation_id")
    private Conversation conversation;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private User user;



}
