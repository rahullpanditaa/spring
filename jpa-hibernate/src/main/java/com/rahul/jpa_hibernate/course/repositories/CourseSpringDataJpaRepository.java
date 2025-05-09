package com.rahul.jpa_hibernate.course.repositories;

import com.rahul.jpa_hibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// entity managed, type of id field
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);
    List<Course> findByName(String courseName);
}
