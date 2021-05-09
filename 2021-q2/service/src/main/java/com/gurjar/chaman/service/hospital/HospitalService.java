package com.gurjar.chaman.service.hospital;

/*
@author: Chaman Gurjar    
@version: 1.0. 09-May-2021;
*/

import com.gurjar.chaman.dto.hospital.HospitalDto;

public interface HospitalService {

    boolean saveHospitals(HospitalDto hospitalDto) throws Exception;
}
