package com.rahul.jpa_hibernate.course;

import com.rahul.jpa_hibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("jpa")
public class CourseJpaCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJpaRepository jpaRepository;

    @Override
    public void run(String... args) throws Exception {
        jpaRepository.insert(new Course(1L, "Philosophy", "Bertrand Russell"));
        jpaRepository.insert(new Course(2L, "Literature", "Sylvia Plath"));
        jpaRepository.insert(new Course(3L, "Morality", "Raskolnikov"));

        jpaRepository.deleteById(1L);

        System.out.println(jpaRepository.findById(2L));
    }
}
