package com.gurjar.chaman.service.patient;
import com.gurjar.chaman.repository.patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
@author: Chaman Gurjar    
@version: 1.0. 09-May-2021;
*/



@Service
public class PatientServiceImpl {

    @Autowired
    private PatientRepository patientRepository;
}
