package com.geekster.mapping.practice.controller;

import com.geekster.mapping.practice.model.Student;
import com.geekster.mapping.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping(value = "/add")
    public String addNewStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "added..";
    }
}
