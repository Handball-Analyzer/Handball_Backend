package com.example.handballanaylzer.controller.backoffice;

import com.example.handballanaylzer.dto.backoffice.UserCreateDto;
import com.example.handballanaylzer.expetion.ResourceAlreadyExistsException;
import com.example.handballanaylzer.model.Club;
import com.example.handballanaylzer.model.ClubUser;
import com.example.handballanaylzer.model.Settings;
import com.example.handballanaylzer.model.User;
import com.example.handballanaylzer.repository.ClubRepository;
import com.example.handballanaylzer.repository.ClubUserRepository;
import com.example.handballanaylzer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:5173", maxAge = 3600)
@RestController
public class BackofficeUserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ClubUserRepository clubUserRepository;
    @Autowired
    private ClubRepository clubRepository;

    @GetMapping("/backoffice/user/getAll")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @PatchMapping("/backoffice/user/update")
    public void updateUser(){
    }
    @GetMapping("/backoffice/user/login/{email}")
    public Optional<User> loginUser(@PathVariable String email){
        return  userRepository.findByEmail(email);
    }

    // not ready
    @PatchMapping("/backoffice/user/disableAccount/{id}")
    public ResponseEntity<?> disableAccount(@PathVariable UUID id){
        User user = userRepository.getReferenceById(id);
        System.out.println(user.toString());
        user.setActive(false);
        userRepository.save(user);
        return ResponseEntity.ok("updated");
    }
    @PatchMapping("/backoffice/user/enableAccount/{id}")
    public ResponseEntity<?> enableAccount(@PathVariable UUID id){
        User user = userRepository.getReferenceById(id);
        System.out.println(user.toString());
        user.setActive(true);
        userRepository.save(user);
        return ResponseEntity.ok("Updated");
    }
    @PostMapping("/backoffice/user/create")
    public ResponseEntity<?> createUser(@RequestBody UserCreateDto userCreateDto){
        if(userRepository.existsByEmail(userCreateDto.email())){
            throw new ResourceAlreadyExistsException("User already exists with this email");
        }

        Settings settings = new Settings("EN","Light","Standard",null);
        User newUser = new User(userCreateDto.firstName(), userCreateDto.lastName(), userCreateDto.email(), null, userCreateDto.password(), userCreateDto.role(),settings,Boolean.TRUE);

        userRepository.save(newUser);
        if(userCreateDto.club_id() != null) {
            Club newUserInClub = clubRepository.findById(userCreateDto.club_id()).orElseThrow();
            clubUserRepository.save(new ClubUser(newUser,newUserInClub));

        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
