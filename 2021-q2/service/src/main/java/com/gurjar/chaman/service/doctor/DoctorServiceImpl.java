package com.gurjar.chaman.service.doctor;

import com.gurjar.chaman.repository.doctor.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
@author: Chaman Gurjar    
@version: 1.0. 09-May-2021;
*/


@Service
public class DoctorServiceImpl implements  DoctorService{

    @Autowired
    private DoctorRepository doctorRepository;

}
