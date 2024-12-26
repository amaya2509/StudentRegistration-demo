package com.example.studentregistration.repository;

import com.example.studentregistration.model.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, Integer> {
}
