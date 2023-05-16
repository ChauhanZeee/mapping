package com.geekster.mapping.practice.service;

import com.geekster.mapping.practice.model.Student;
import com.geekster.mapping.practice.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public void addStudent(Student student) {
        studentRepo.save(student);
    }
}
