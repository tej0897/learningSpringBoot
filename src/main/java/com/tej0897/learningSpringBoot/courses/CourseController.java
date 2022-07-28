package com.tej0897.learningSpringBoot.courses;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Courses> getCourseDetail(){
        return Arrays.asList(new Courses(1,"Programming in Java","Tejas Kumar S"));
    }
}
