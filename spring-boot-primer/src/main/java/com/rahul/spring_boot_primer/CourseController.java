package com.rahul.spring_boot_primer;


// create a simple rest api
// get back some data -> Course: id, name, author

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    // need to map a url to this specific method
    // requests to that url will result in call to this method
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(new Course(1, "Learn the electric guitar", "Jimmy Hendrix"),
                             new Course(2, "Learn the piano", "Mozart"));

    }
}
