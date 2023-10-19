package com.example.handballanaylzer.repository;

import com.example.handballanaylzer.model.ActionTyp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ActionTypRepository extends JpaRepository<ActionTyp, UUID> {
}
