package com.gurjar.chaman.controller.patient;

/*
@author: Chaman Gurjar    
@version: 1.0. 09-May-2021;
*/

import com.gurjar.chaman.service.patient.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

}
