package com.example.handballanaylzer.controller.backoffice;

import com.example.handballanaylzer.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5173", maxAge = 3600)
@RestController
public class BackofficeClubController {
    
    @Autowired
    ClubRepository clubRepository;
    
    @GetMapping("/backoffice/allClubNames")
    public List<Object> getAllClubNames(){
        return clubRepository.getAllClubNames();
    }
}
