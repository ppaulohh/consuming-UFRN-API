package com.example.consumeapi.Student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class StudentController {
    private final StudentsService studentService;

    @Autowired
    public StudentController(StudentsService discenteService) {
        studentService = discenteService;
    }

    @GetMapping("/json")
    public String showResponse() throws IOException, InterruptedException {
        return studentService.getResponse();
    }
    @GetMapping("/students")
    public List<Records> getStudents() throws IOException, InterruptedException {
        return studentService.mapping();
    }

}