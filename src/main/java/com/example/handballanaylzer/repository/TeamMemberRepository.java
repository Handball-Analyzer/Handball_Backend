package com.example.handballanaylzer.repository;

import com.example.handballanaylzer.model.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TeamMemberRepository extends JpaRepository<TeamMember, UUID> {
}
