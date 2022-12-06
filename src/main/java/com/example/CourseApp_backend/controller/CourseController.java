package com.example.CourseApp_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CourseController {

    @PostMapping("/add")
    public String AddCourse(){
        return "courses added";
    }


}
