package com.rahul.jpa_hibernate.course;

import com.rahul.jpa_hibernate.course.repositories.CourseSpringDataJpaRepository;
import com.rahul.jpa_hibernate.course.repositories.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
//@Profile("jpa")
public class CourseJpaCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJpaRepository jpaRepository;

    @Autowired
    private CourseSpringDataJpaRepository jpaRepository;

    @Override
    public void run(String... args) throws Exception {
        // spring data jpa -> use save instead of insert used in jpa
        jpaRepository.save(new Course(1L, "Philosophy", "Bertrand Russell"));
        jpaRepository.save(new Course(2L, "Literature", "Sylvia Plath"));
        jpaRepository.save(new Course(3L, "Morality", "Raskolnikov"));

        jpaRepository.deleteById(1L);

        System.out.println(jpaRepository.findById(2L));

        System.out.println(jpaRepository.findAll());
        System.out.println(jpaRepository.count());
    }
}
