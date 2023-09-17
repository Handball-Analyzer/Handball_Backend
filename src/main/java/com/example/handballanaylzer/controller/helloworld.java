package com.example.handballanaylzer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {
    @GetMapping("/hallo")
    public String helloWorld(){
        return "Hello World";
    }
}
