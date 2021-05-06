package com.gurjar.chaman.service.user;

/*
@author: Chaman Gurjar    
@version: 1.0. 06-May-2021;
*/

import com.gurjar.chaman.dto.StudentDto;
import com.gurjar.chaman.repository.user.StudentRepository;

public class StudentServiceImpl implements StudentService {

    private StudentDto studentDto;

    private StudentRepository studentRepository;


    @Override
    public boolean isData() {
        return false;
    }
}
