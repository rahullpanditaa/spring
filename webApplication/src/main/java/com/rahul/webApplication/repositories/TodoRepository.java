package com.rahul.webApplication.repositories;

import com.rahul.webApplication.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByName(String name);
}
