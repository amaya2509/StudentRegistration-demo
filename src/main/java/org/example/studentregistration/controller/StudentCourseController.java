package com.example.studentregistration.controller;

import com.example.studentregistration.model.StudentCourse;
import com.example.studentregistration.service.StudentCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student-courses")
public class StudentCourseController {

    @Autowired
    private StudentCourseService studentCourseService;

    @GetMapping
    public List<StudentCourse> getAllStudentCourses() {
        return studentCourseService.getAllStudentCourses();
    }

    @PostMapping
    public StudentCourse enrollStudentInCourse(@RequestBody StudentCourse studentCourse) {
        return studentCourseService.saveStudentCourse(studentCourse);
    }
}
