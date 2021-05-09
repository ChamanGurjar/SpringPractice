package com.gurjar.chaman.controller.hospital;

/*
@author: Chaman Gurjar    
@version: 1.0. 09-May-2021;
*/

import com.gurjar.chaman.dto.hospital.HospitalDto;
import com.gurjar.chaman.service.hospital.HospitalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital/")
public class HospitalController {

    private static final Logger logger = LoggerFactory.getLogger(HospitalController.class);

    @Autowired
    private HospitalService hospitalService;


    @PostMapping("save")
    private ResponseEntity<Boolean> saveHospital(@RequestBody HospitalDto hospitalDto) throws Exception {
        logger.info("Save Hospital call received with data : {}", hospitalDto);
        boolean response = hospitalService.saveHospitals(hospitalDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
