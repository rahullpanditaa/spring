package com.rahul.webApplication.taskManager;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskManagerService {
    private static List<Todo> tasks = new ArrayList<>();
    static {
        tasks.add(new Todo(1L,"Sylvia Plath", "Literature 101",
                LocalDate.now().plusWeeks(4), false));
        tasks.add(new Todo(2L,"Porfiry Petrovich", "Socalism",
                LocalDate.now().plusMonths(4), false));
        tasks.add(new Todo(3L,"Viktor Frankl", "Logotherapy",
                LocalDate.now().plusYears(4), false));
    }

    public List<Todo> findByTeacherName(String name) {
        return tasks;

    }
}
