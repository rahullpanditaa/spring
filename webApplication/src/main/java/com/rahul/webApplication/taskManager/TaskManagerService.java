package com.rahul.webApplication.taskManager;

import com.rahul.webApplication.entities.Todo;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class TaskManagerService {
    private static List<Todo> tasks = new ArrayList<>();
    private static Long tasksCount = 1L;
    static {
        tasks.add(new Todo(tasksCount++,"Raskolnikov", "Literature 101",
                LocalDate.now().plusWeeks(4), false));
        tasks.add(new Todo(tasksCount++,"Raskolnikov", "Socalism",
                LocalDate.now().plusMonths(4), false));
        tasks.add(new Todo(tasksCount++,"Raskolnikov", "Logotherapy",
                LocalDate.now().plusYears(4), false));
    }

    public List<Todo> findByTeacherName(String name) {
        Iterator<Todo> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (!(todo.getName().equalsIgnoreCase(name))) {
                 iterator.remove();
            }
        }
        return tasks;

    }

    public void addTask(String name, String description, LocalDate targetDate, boolean completed) {
        tasks.add(new Todo(tasksCount++, name, description, targetDate, completed));
    }

    public void deleteTaskById(int id) {
        Iterator<Todo> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId().equals(Long.valueOf(id))) {
                iterator.remove();
            }
        }
    }

    public Todo findById(int id) {
        Iterator<Todo> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId().equals(Long.valueOf(id))) {
                return todo;
            }
        }
        return null;
    }

    public void updateTodo(@Valid Todo todo) {
        deleteTaskById(todo.getId().intValue());
        tasks.add(todo);
    }
}