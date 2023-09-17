package com.example.handballanaylzer.controller.backoffice;

import com.example.handballanaylzer.model.User;
import com.example.handballanaylzer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BackofficeAccountController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/backofficeAllUser")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @PatchMapping("/backofficeUpdateUser")
    public void updateUser(){
    }
}
