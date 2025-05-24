package com.rahul.fullStackRestAPI.todoApp.controllers;

import com.rahul.fullStackRestAPI.todoApp.entities.Todo;
import com.rahul.fullStackRestAPI.todoApp.repositories.TodoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    private TodoRepository todoRepository;

    public TodoController(TodoRepository repository) {
        this.todoRepository = repository;
    }

    @GetMapping("/users/{username}/todos")
    public List<Todo> getAllTodosOfGivenUsername(@PathVariable String username) {
        return todoRepository.findByUsername(username);
    }

//    @GetMapping("/users/{username}/todos/{id}")
//    public ResponseEntity<Todo> retrieveTodoByIdOfGivenUser(@PathVariable String username, @PathVariable Integer id) {
//        return todoRepository.findByUsernameAndId(username, id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
//    }
//
    @PostMapping("/users/{username}/todos")
    public void createTodoForGivenUser(@PathVariable String username, @RequestBody Todo todo) {
        todoRepository.save(todo);
    }
}
