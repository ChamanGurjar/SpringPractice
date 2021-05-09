package com.gurjar.chaman.converter.hospital;

import com.gurjar.chaman.converter.EntityToDtoConverter;
import com.gurjar.chaman.dto.hospital.HospitalDto;
import com.gurjar.chaman.entity.hospital.Hospital;

/*
@author: Chaman Gurjar    
@version: 1.0. 09-May-2021;
*/


public class HospitalEntityToDtoConverter implements EntityToDtoConverter<Hospital, HospitalDto> {

    @Override
    public HospitalDto convert(Hospital hospital) {
        HospitalDto hospitalDto = new HospitalDto();
        hospitalDto.setName(hospital.getName());
        hospitalDto.setBranch(hospital.getBranch());
        hospitalDto.setLocation(hospital.getLocation());
        hospitalDto.setMobileNumber(hospital.getMobileNumber());
        hospitalDto.setActive(true);
        hospitalDto.setCreatedOn(hospital.getCreatedOn());
        hospitalDto.setModifiedOn(hospital.getModifiedOn());
        return hospitalDto;
    }


}
