package com.rahul.fullStackRestAPI.todoApp.controllers;

import com.rahul.fullStackRestAPI.todoApp.entities.Todo;
import com.rahul.fullStackRestAPI.todoApp.repositories.TodoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

//     returns an optional todos, since possible to not find a match in database
    @GetMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Todo> retrieveTodo(@PathVariable String username, @PathVariable Integer id) {
        Optional<Todo> todo = todoRepository.findById(id);

        if (todo.isPresent()) {
            return ResponseEntity.ok(todo.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping("/users/{username}/todos")
    public void createTodoForGivenUser(@PathVariable String username, @RequestBody Todo todo) {
        todoRepository.save(todo);
    }

    @DeleteMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteATodo(@PathVariable String username, @PathVariable Integer id) {
        todoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
