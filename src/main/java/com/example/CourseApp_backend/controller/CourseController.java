package com.example.CourseApp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;

@RestController

public class CourseController {

    @PostMapping("/add")
    public String AddCourse(){
        return "courses added";
    }
    @GetMapping("/view")
    public String ViewCourses(){
        return "view courses";
    }




}
