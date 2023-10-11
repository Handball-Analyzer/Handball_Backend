package com.example.handballanaylzer.controller.backoffice;

import com.example.handballanaylzer.model.User;
import com.example.handballanaylzer.repository.ChatMessageRepository;
import com.example.handballanaylzer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackofficeMessageController {
    @Autowired
    ChatMessageRepository chatMessageRepository;
    @Autowired
    UserRepository userRepository;




}
