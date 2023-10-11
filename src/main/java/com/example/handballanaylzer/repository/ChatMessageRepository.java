package com.example.handballanaylzer.repository;

import com.example.handballanaylzer.model.ChatMessage;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ChatMessageRepository extends CrudRepository<ChatMessage, UUID> {
}
