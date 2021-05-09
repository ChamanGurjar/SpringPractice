package com.gurjar.chaman.converter.hospital;

import com.gurjar.chaman.converter.DtoToEntityConverter;
import com.gurjar.chaman.dto.hospital.HospitalDto;
import com.gurjar.chaman.entity.hospital.Hospital;

/*
@author: Chaman Gurjar    
@version: 1.0. 09-May-2021;
*/



public class HospitalDtoToEntityConverter implements DtoToEntityConverter<HospitalDto, Hospital> {

    @Override
    public Hospital convert(HospitalDto hospitalDto) {
        Hospital hospital = new Hospital();
        hospital.setName(hospitalDto.getName());
        hospital.setBranch(hospitalDto.getBranch());
        hospital.setLocation(hospitalDto.getLocation());
        hospital.setMobileNumber(hospitalDto.getMobileNumber());
        hospital.setActive(true);
        hospital.setCreatedOn(System.currentTimeMillis());
        return hospital;
    }
}
