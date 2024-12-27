package com.example.studentregistration.service;

import com.example.studentregistration.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
}
