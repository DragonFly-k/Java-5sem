package com.example.controller;

import com.example.entity.Course;
import com.example.entity.User;
import com.example.repository.CourseRepository;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
 public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private DataSource dataSource;

    @GetMapping("/test")
    public Iterable<User> getTest(@RequestParam(defaultValue = "main") String client

        return userRepository.findAll();
}

    @GetMapping("/GetAllCourses")
    public Iterable<Course> getAllCourses(Model model){
        var test = courseRepository.findAll();
        return courseRepository.findAll();
    }
}