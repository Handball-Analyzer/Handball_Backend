package com.example.handballanaylzer.repository;

import com.example.handballanaylzer.model.Action;
import com.example.handballanaylzer.model.ClubUser;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.UUID;

public interface ClubUserRepository extends JpaRepository<ClubUser, UUID> {


    List<ClubUser> findAllByUserId(UUID user_id);

    List<ClubUser> findAllByClubId(UUID club_id);
}
