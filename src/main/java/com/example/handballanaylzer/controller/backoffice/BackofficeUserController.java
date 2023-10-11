package com.example.handballanaylzer.controller.backoffice;

import com.example.handballanaylzer.model.User;
import com.example.handballanaylzer.repository.UserRepository;
import com.fasterxml.jackson.databind.JsonSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:5173", maxAge = 3600)
@RestController
public class BackofficeUserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/backoffice/allUser")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @PatchMapping("/backoffice/updateUser")
    public void updateUser(){
    }
    @GetMapping("/backoffice/login/{email}")
    public Optional<User> loginUser(@PathVariable String email){
        return  userRepository.findByEmail(email);
    }
}