package com.example.handballanaylzer.controller.backoffice;

import com.example.handballanaylzer.model.Club;
import com.example.handballanaylzer.model.ClubUser;
import com.example.handballanaylzer.model.User;
import com.example.handballanaylzer.repository.ClubRepository;
import com.example.handballanaylzer.repository.ClubUserRepository;
import com.example.handballanaylzer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class BackofficeClubUserController {
    @Autowired
    ClubUserRepository clubUserRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ClubRepository clubRepository;

    @GetMapping("/backoffice/clubUser/getAllClubUser")
    public List<ClubUser> getAllClubUser(){
        return clubUserRepository.findAll();
    }

    @GetMapping("/backoffice/clubUser/getALlClubsByUserID/{user_id}")
    public List<ClubUser> getAllClubsByUserID(@PathVariable UUID user_id){
        return clubUserRepository.findAllByUserId(user_id);
    }
    @GetMapping("/backoffice/clubUser/getALlClubsByClubID/{club_id}")
    public List<ClubUser> getAllClubsByClubID(@PathVariable UUID club_id){
        return clubUserRepository.findAllByClubId(club_id);
    }
    @PostMapping("/backoffice/clubUser/create")
    public ResponseEntity.BodyBuilder createClubUser(@RequestBody UUID club_id, UUID user_id){
        User user = userRepository.findById(user_id).orElseThrow();
        Club club = clubRepository.findById(club_id).orElseThrow();
        clubUserRepository.save(new ClubUser(user,club));
        return ResponseEntity.status(HttpStatus.FORBIDDEN);
    }



}
