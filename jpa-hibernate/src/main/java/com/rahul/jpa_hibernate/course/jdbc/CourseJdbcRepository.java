package com.rahul.jpa_hibernate.course.jdbc;

import com.rahul.jpa_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
// classes with this annotations are DAO
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static final String INSERT_QUERY = """
            INSERT INTO courses (id,name,author)
            VALUES (?,?,?); 
            """;
    private static final String DELETE_QUERY = """
            DELETE FROM courses
            WHERE id=?
            """;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(Long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }
}
