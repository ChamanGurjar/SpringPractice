package com.gurjar.chaman.controller.hospital;

/*
@author: Chaman Gurjar    
@version: 1.0. 09-May-2021;
*/

import com.gurjar.chaman.service.hospital.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital/")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

}
