package com.example.handballanaylzer.model;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String title;

    @OneToMany(mappedBy = "conversation")
    private Set<ConversationMember> conversationMembers;

    @OneToMany(mappedBy = "conversation")
    private Set<ChatMessage> chatMessages;

    public Conversation() {
    }

    public Conversation(String title) {
        this.title = title;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<ConversationMember> getConversationMembers() {
        return conversationMembers;
    }

    public void setConversationMembers(Set<ConversationMember> conversationMembers) {
        this.conversationMembers = conversationMembers;
    }

    public Set<ChatMessage> getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(Set<ChatMessage> chatMessages) {
        this.chatMessages = chatMessages;
    }
}
