package com.rahul.webApplication.taskManager;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskManagerService {
    private static List<Todo> tasks = new ArrayList<>();
    private static Long tasksCount = 0L;
    static {
        tasks.add(new Todo(tasksCount++,"Sylvia Plath", "Literature 101",
                LocalDate.now().plusWeeks(4), false));
        tasks.add(new Todo(tasksCount++,"Porfiry Petrovich", "Socalism",
                LocalDate.now().plusMonths(4), false));
        tasks.add(new Todo(tasksCount++,"Viktor Frankl", "Logotherapy",
                LocalDate.now().plusYears(4), false));
    }

    public List<Todo> findByTeacherName(String name) {
        return tasks;

    }

    public void addTask(String name, String description, LocalDate targetDate, boolean completed) {
        tasks.add(new Todo(tasksCount++, name, description, targetDate, completed));
    }
}