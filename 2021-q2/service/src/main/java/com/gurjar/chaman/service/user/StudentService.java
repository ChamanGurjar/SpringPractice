package com.gurjar.chaman.service.user;

/*
@author: Chaman Gurjar    
@version: 1.0. 06-May-2021;
*/

import com.gurjar.chaman.entity.student.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAllStudents(Optional<Integer> pageNumber);
}
