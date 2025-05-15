package com.rahul.restfulWebServices.socialMedia;

import com.rahul.restfulWebServices.socialMedia.entities.User;
import com.rahul.restfulWebServices.socialMedia.exceptions.UserNotFoundException;
import com.rahul.restfulWebServices.socialMedia.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository repository) {
        this.userRepository = repository;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        User savedUser = userRepository.save(user);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).body(savedUser);
    }

    @GetMapping("/users/{id}")
    public EntityModel<User> findUser(@PathVariable Integer id) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found with given id: " + id));

        EntityModel<User> resource = EntityModel.of(user);

        // adding link to all users endpoint
        resource.add(linkTo(methodOn(this.getClass()).retrieveAllUsers()).withRel("all-users"));

        return resource;
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userRepository.deleteById(id);
    }
}
