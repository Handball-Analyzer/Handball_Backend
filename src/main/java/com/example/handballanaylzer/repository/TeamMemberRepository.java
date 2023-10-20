package com.example.handballanaylzer.repository;

import com.example.handballanaylzer.model.TeamMember;
import com.example.handballanaylzer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TeamMemberRepository extends JpaRepository<TeamMember, UUID> {

    List<TeamMember> findAllByUserId(UUID UserID);
}
