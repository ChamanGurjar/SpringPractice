package com.gurjar.chaman.service.user;

/*
@author: Chaman Gurjar    
@version: 1.0. 06-May-2021;
*/

import com.gurjar.chaman.entity.student.Student;
import com.gurjar.chaman.repository.user.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);
    private static final Integer PAGE_MAX_SIZE = 100;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents(Optional<Integer> pageNumber) {

        Pageable pageable = getPageable(pageNumber);

        List<Student> studentList = getStudentsListFromPageable(pageable);

        if (CollectionUtils.isEmpty(studentList)) {
            logger.info("No students found. Going to create and save 500 new students");
            addStudentsAndSave();
            studentList = getStudentsListFromPageable(pageable);
        }

        return studentList;
    }

    private List<Student> getStudentsListFromPageable(Pageable pageable) {
        Page<Student> allPageableStudents = studentRepository.findAll(pageable);
        logger.info("Total no of pages : {}", allPageableStudents.getTotalPages());
        List<Student> studentList = allPageableStudents.getContent();
        logger.info("Total students fetched : {}", studentList.size());
        return studentList;
    }

    private Pageable getPageable(Optional<Integer> pageNumber) {
        int pageN = pageNumber.orElse(0);
        if (pageN != 0) {
            pageN = pageN -1;  // Because for first page ui person can send page number 1. And in pageable page number starts from 0 like array.
        }
        return PageRequest.of(pageN, PAGE_MAX_SIZE, Sort.by(Sort.Direction.DESC, "id"));
    }


    private void addStudentsAndSave() {
        int i = 0;
        List<Student> students = new ArrayList<>();
        while (i < 500) {
            Student student = new Student();
            student.setSalutation( i % 10 == 0 ? "Mrs" : "Mr");
            student.setFirstName("Student-" + i);
            student.setLastName("LN-" + i);
            student.setEmail("abc"+i+"@yopmail.com");
            student.setMobileNumber(Integer.parseInt("12345"+i));
            student.setCreatedOn(System.currentTimeMillis());
            student.setActive(true);
            students.add(student);
            i++;
        }

        saveStudents(students);
    }

    private void saveStudents(List<Student> students) {
        studentRepository.saveAll(students);
    }


}
