package com.example.handballanaylzer.controller;

import com.example.handballanaylzer.model.Club;
import com.example.handballanaylzer.model.User;
import com.example.handballanaylzer.repository.ClubRepository;
import com.example.handballanaylzer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateDemoData {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ClubRepository clubRepository;

    @PostMapping("/createDemoData")
    public void createDemoData(){
        User my_user = new User("Marcel","Bulling","marcel_bulling@gmx.de","m","asdf",null,"Admin",null,Boolean.TRUE);
        User user = new User("Harald","Müller","harald.müller@test.de","m","asdf", null,"Trainer",null,Boolean.TRUE);
        User user1 = new User("Tom", "Walter","tom.walter@test.de","m","asdfg",null,"Trainer",null,Boolean.FALSE);
        User user2 = new User("Marie","Mayer","marie.mayer@test.de","f","asdfg",null,"Trainer",null,Boolean.TRUE);
        userRepository.save(my_user);
        userRepository.save(user);
        userRepository.save(user1);
        userRepository.save(user2);
        Club clubWN = new Club("VFL Waiblingen","Beinsteiner Str.",71532,160,"Waiblingen");
        Club clubSchmoeff = new Club("HC Schmiden/Oeffingen","Fellbacher Str.",70736,12,"Fellbach");
        clubRepository.save(clubSchmoeff);
        clubRepository.save(clubWN);
    }

}
