package com.rahul.restfulWebServices.socialMedia.controllers;

import com.rahul.restfulWebServices.socialMedia.entities.Post;
import com.rahul.restfulWebServices.socialMedia.entities.User;
import com.rahul.restfulWebServices.socialMedia.exceptions.UserNotFoundException;
import com.rahul.restfulWebServices.socialMedia.repositories.PostRepository;
import com.rahul.restfulWebServices.socialMedia.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class PostController {

    private PostRepository postRepository;
    private UserRepository userRepository;

    public PostController(PostRepository repository, UserRepository repository2) {
        this.postRepository = repository;
        this.userRepository = repository2;
    }

    @GetMapping("/users/{id}/posts")
    public List<Post> retrieveAllPostsOfGivenUser(@PathVariable Integer id) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));

        return user.getPosts();
    }

    @PostMapping("/users/{id}/posts")
    public ResponseEntity<Post> createPostForAUser(@RequestBody Post post, @PathVariable Integer id) {
        Post newPost = postRepository.save(post);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}/posts").buildAndExpand(newPost.getId()).toUri();

        return ResponseEntity.created(location).build();
    }
}
