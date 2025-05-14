package com.rahul.restfulWebServices.socialMedia;

import com.rahul.restfulWebServices.socialMedia.entities.User;
import com.rahul.restfulWebServices.socialMedia.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository repository) {
        this.userRepository = repository;
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public User save(User user) {
        return userRepository.save(user);
    }

    @GetMapping("/users/{id}")
    public User findOne(@PathVariable Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with given id: " + id));
    }
}
