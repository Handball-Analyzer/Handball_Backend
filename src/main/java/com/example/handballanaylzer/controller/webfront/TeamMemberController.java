package com.example.handballanaylzer.controller.webfront;

import com.example.handballanaylzer.model.Team;
import com.example.handballanaylzer.model.TeamMember;
import com.example.handballanaylzer.model.User;
import com.example.handballanaylzer.repository.TeamMemberRepository;
import com.example.handballanaylzer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class TeamMemberController {
    @Autowired
    TeamMemberRepository teamMemberRepository;
    @Autowired
    UserRepository userRepository;

    @GetMapping("/teamMember/allTeamsByUser/{userEmail}")
    public ResponseEntity<List<TeamMember>> getAllTeamsbyUserID(@PathVariable String userEmail){

        User user = userRepository.findByEmail(userEmail).orElseThrow();

        List<TeamMember> UserInTeams = teamMemberRepository.findAllByUserId(user.getId());
        return ResponseEntity.ok(UserInTeams);


    }
}
