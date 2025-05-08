package com.rahul.jpa_hibernate.course;

import org.springframework.stereotype.Component;


public class Course {
    private Long id;
    private String name;
    private String author;

    public Course(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course ID: " + id +  "; Course name: " + name + "; Course author: " + author;
    }
}
