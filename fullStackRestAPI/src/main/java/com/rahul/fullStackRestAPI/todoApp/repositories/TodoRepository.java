package com.rahul.fullStackRestAPI.todoApp.repositories;

import com.rahul.fullStackRestAPI.todoApp.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

    List<Todo> findByUsername(String username);

    Optional<Todo> findByUsernameAndId(String username, Integer id);
}
