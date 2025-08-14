package com.example.demo.services;

import com.example.demo.studentprofile.StudentProfile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
@Service
public class StudentProfileService {
    HashMap<Long, StudentProfile> map = new HashMap<>();

    public void createStudentProfile(StudentProfile studentProfile) {
        map.put(studentProfile.getStudentId(), studentProfile);

    }
    public void updateStudentProfile(StudentProfile studentProfile) {
        map.put(studentProfile.getStudentId(), studentProfile);
    }

    public void delete( Long studentId ) {
        map.remove(studentId);
    }
        public StudentProfile getStudentProfileById(Long studentId) {
            return map.get(studentId);

            }
        }

