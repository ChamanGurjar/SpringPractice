package com.gurjar.chaman.service.hospital;
import com.gurjar.chaman.repository.hospital.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
@author: Chaman Gurjar    
@version: 1.0. 09-May-2021;
*/



@Service
public class HospitalServiceImpl {

    @Autowired
    private HospitalRepository hospitalRepository;
}
