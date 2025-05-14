package com.rahul.restfulWebServices.socialMedia;

import com.rahul.restfulWebServices.socialMedia.repositories.UserRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository repository) {
        this.userRepository = repository;
    }

    
}
