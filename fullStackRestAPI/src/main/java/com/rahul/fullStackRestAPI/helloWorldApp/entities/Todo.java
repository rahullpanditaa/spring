package com.rahul.fullStackRestAPI.helloWorldApp.entities;

import java.time.LocalDate;

public class Todo {

    private int id;
    private String username;
    private String taskDescription;
    private LocalDate targetDate;
    private boolean done;

    public Todo() {}

    public Todo(int id, String username, String taskDescription, LocalDate targetDate, boolean done) {
        this.id = id;
        this.username = username;
        this.taskDescription = taskDescription;
        this.targetDate = targetDate;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", targetDate=" + targetDate +
                ", done=" + done +
                '}';
    }
}
