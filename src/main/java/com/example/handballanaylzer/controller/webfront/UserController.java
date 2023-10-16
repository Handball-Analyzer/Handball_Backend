package com.example.handballanaylzer.controller.webfront;

import com.example.handballanaylzer.model.User;
import com.example.handballanaylzer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("login/{email}")
    public Optional<User> loginUser(@PathVariable String email){
        return  userRepository.findByEmail(email);
    }


}
