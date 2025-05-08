package com.rahul.jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static final String INSERT_QUERY = """
            INSERT INTO courses (id,name,author)
            VALUES (1,'Physics','Chintu'); 
            """;

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
