package com.example.demo.controller;

import com.example.demo.services.StudentProfileService;
import com.example.demo.studentprofile.StudentProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentProfileController {
    private StudentProfileService studentProfileService;

    @Autowired

    public StudentProfileController(StudentProfileService studentProfileService) {
        this.studentProfileService = studentProfileService;
    }

    @PostMapping("/studentprofile/create")
    public String create(StudentProfile studentProfile) {
        studentProfileService.createStudentProfile(studentProfile);
        return "Student profile is successfully stored";
    }

    @GetMapping("/studentprofile/{studentId}")
    public StudentProfile get(@PathVariable Long studentId) {
        return studentProfileService.getStudentProfileById(studentId);
    }
}
