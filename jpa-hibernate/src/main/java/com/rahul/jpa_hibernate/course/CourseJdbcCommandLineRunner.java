package com.rahul.jpa_hibernate.course;

import com.rahul.jpa_hibernate.course.jdbc.CourseJdbcRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
// run method of a bean that implements this interface should run at the startup of a spring application
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    private CourseJdbcRepository jdbcRepository;

    // automatically autowired, no need for @Autowired annotation
    public CourseJdbcCommandLineRunner(CourseJdbcRepository jdbcRepository) {
        this.jdbcRepository = jdbcRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        jdbcRepository.insert();

    }
}
