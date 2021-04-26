package com.example.consumeapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentsService studentService;

    @Autowired
    public StudentController(StudentsService discenteService) {
        studentService = discenteService;
    }

    @GetMapping
    public String showResponse() throws IOException, InterruptedException {
        return studentService.getResponse();
    }
}