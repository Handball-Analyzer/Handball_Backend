package com.example.handballanaylzer.controller.backoffice;

import com.example.handballanaylzer.expetion.ResourceAlreadyExistsException;
import com.example.handballanaylzer.model.Club;
import com.example.handballanaylzer.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:5173", maxAge = 3600)
@RestController
public class BackofficeClubController {
    
    @Autowired
    ClubRepository clubRepository;
    
    @GetMapping("/backoffice/club/getAll")
    public List<Club> getAllClubNames(){
        return clubRepository.findAll();
    }

    @PatchMapping("/backoffice/club/updateOfficial/{id}")
    public ResponseEntity<?> updateOfficial(@PathVariable UUID id){
        return ResponseEntity.ok("updated");
    }

    @PostMapping("/backoffice/club/create")
    public ResponseEntity<?> createCLub(@RequestBody Club club){
        if(clubRepository.existsByName(club.getName())){
            throw new ResourceAlreadyExistsException("Club already exists with this Name");
        }
        clubRepository.save(club);
        return ResponseEntity.ok("Created");
    }

}

