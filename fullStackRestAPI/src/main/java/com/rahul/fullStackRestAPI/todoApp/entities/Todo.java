package com.rahul.fullStackRestAPI.todoApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
public class Todo {

    @Id
    private Integer id;

    private String username;
    private String courseDescription;
    private LocalDate targetDate;
    private Boolean done;

    public Todo() {}

    public Todo(Integer id, String username, String courseDescription, LocalDate targetDate, Boolean done) {
        this.id = id;
        this.username = username;
        this.courseDescription = courseDescription;
        this.targetDate = targetDate;
        this.done = done;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                ", targetDate=" + targetDate +
                ", done=" + done +
                '}';
    }
}
