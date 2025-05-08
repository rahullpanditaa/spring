package com.rahul.jpa_hibernate.course;

import com.rahul.jpa_hibernate.course.jdbc.CourseJdbcRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("jdbc")
// run method of a bean that implements this interface should run at the startup of a spring application
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    private CourseJdbcRepository jdbcRepository;

    // automatically autowired, no need for @Autowired annotation
    public CourseJdbcCommandLineRunner(CourseJdbcRepository jdbcRepository) {
        this.jdbcRepository = jdbcRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        jdbcRepository.insert(new Course(1L, "Philosophy", "Bertrand Russell"));
        jdbcRepository.insert(new Course(2L, "Literature", "Sylvia Plath"));
        jdbcRepository.insert(new Course(3L, "Morality", "Raskolnikov"));

        jdbcRepository.deleteById(1L);

        System.out.println(jdbcRepository.findById(2L));

    }
}
