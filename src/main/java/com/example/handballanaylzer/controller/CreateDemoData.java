package com.example.handballanaylzer.controller;

import com.example.handballanaylzer.model.*;
import com.example.handballanaylzer.repository.*;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CreateDemoData {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ClubRepository clubRepository;
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    ClubUserRepository clubUserRepository;
    @Autowired
    ActionTypRepository actionTypRepository;
    @Autowired
    TeamMemberRepository teamMemberRepository;
    @Autowired
    GymRepository gymRepository;


    @PostMapping("/createDemoData")
    public void createDemoData(){

        ActionTyp penalty = new ActionTyp("Penalty","7 Meter");
        ActionTyp yellowCard = new ActionTyp("Yellow card" , "Gelbe Karte");
        ActionTyp redCard = new ActionTyp("Red card", "Rote Karte");
        ActionTyp blueCard = new ActionTyp("Blue card", "Blaue Karte");
        ActionTyp goal = new ActionTyp("Goal","Tor");
        ActionTyp goalAgainst = new ActionTyp("Goal against","Gegentor");
        ActionTyp save = new ActionTyp("Save","Gehlaten");
        ActionTyp Miscat = new ActionTyp("Miscat", "Fehlwurf");
        List<ActionTyp> actionTyps = List.of(penalty,yellowCard,redCard,blueCard,goal,goalAgainst,save,Miscat);
        actionTypRepository.saveAll(actionTyps);


        Club clubWN = new Club("VFL Waiblingen","Beinsteiner Str.",71532,160,"Waiblingen");
        Club clubSchmoeff = new Club("HC Schmiden/Oeffingen","Fellbacher Str.",70736,12,"Fellbach");
        clubRepository.save(clubSchmoeff);
        clubRepository.save(clubWN);

        Settings standard_settings = new  Settings("EN","light","standard","Null");
        User my_user = new User("Marcel","Bulling","marcel_bulling@gmx.de","m","asdf","Admin",standard_settings,Boolean.TRUE);
        User user = new User("Harald","Müller","harald.müller@test.de","m","asdf","Trainer",null,Boolean.TRUE);
        User user1 = new User("Tom", "Walter","tom.walter@test.de","m","asdfg","Trainer",null,Boolean.FALSE);
        User user2 = new User("Marie","Mayer","marie.mayer@test.de","f","asdfg","Trainer",null,Boolean.TRUE);
        List<User> userList = List.of(my_user,user,user1,user2);
        userRepository.saveAll(userList);


        ClubUser wnPlayer1 = new ClubUser(my_user,clubWN);
        ClubUser schmoeffPlayer1 = new ClubUser(user,clubSchmoeff);
        clubUserRepository.save(wnPlayer1);
        clubUserRepository.save(schmoeffPlayer1);


        Team team_ma1WN = new Team("m","A",1,"20/21",clubWN);
        Team team_mb2WN = new Team("m","B",2,"19/20",clubWN);
        Team team_wC1WN = new Team("w","C",1,"20/21",clubWN);
        Team team_mZSch = new Team("m","Z",1,"20/21",clubSchmoeff);
        Team team_gF1Sch = new Team("g","F",1,"21/22",clubSchmoeff);
        List<Team> teamList = List.of(team_gF1Sch,team_ma1WN,team_mb2WN,team_wC1WN,team_mZSch);
        teamRepository.saveAll(teamList);

        TeamMember teamMember1 = new TeamMember(team_ma1WN,my_user);
        TeamMember teamMember2 = new TeamMember(team_ma1WN,user);
        List<TeamMember> teamMemberList = List.of(teamMember1,teamMember2);
        teamMemberRepository.saveAll(teamMemberList);

        Gym rundsporthalle = new Gym("Rundsporthalle","Beinsteinerstr.",71723,160,"Waiblingen");
        Gym SporthalleSchulzentrum = new Gym("Sporthalle beim Schulzentrum","Schmidenerstr.",70736,12,"Fellbach");

        List<Gym> gymList = List.of(rundsporthalle,SporthalleSchulzentrum);
        gymRepository.saveAll(gymList);


    }

}
