package com.gurjar.chaman.controller.student;
import com.gurjar.chaman.entity.student.Student;
import com.gurjar.chaman.service.user.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/*
@author: Chaman Gurjar    
@version: 1.0. 06-May-2021;
*/

@RestController
@RequestMapping("/student/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "getStudents/{pageNumber}")
    private List<Student> getAllStudents(@PathVariable Optional<Integer> pageNumber) {
        return studentService.getAllStudents(pageNumber);
    }

}
