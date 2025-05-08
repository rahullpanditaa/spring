package com.rahul.jpa_hibernate.course.jpa;

import com.rahul.jpa_hibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    // need an entity manager to manage entities
//    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course) {
        // insert a row
        entityManager.merge(course);
    }

    public Course findById(Long id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(Long id) {
        entityManager.remove(entityManager.find(Course.class, id));
    }
}
