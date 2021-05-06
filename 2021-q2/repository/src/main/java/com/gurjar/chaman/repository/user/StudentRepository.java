package com.gurjar.chaman.repository.user;

import com.gurjar.chaman.entity.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/*
@author: Chaman Gurjar    
@version: 1.0. 06-May-2021;
*/

public interface StudentRepository extends JpaRepository<Student, Long> {

}
