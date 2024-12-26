package com.example.studentregistration.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    @Column(nullable = false)
    private String courseName;

    @Lob
    private String description;

    // Getters and setters
}
