package com.gurjar.chaman.service.hospital;

import com.gurjar.chaman.converter.DtoToEntityConverter;
import com.gurjar.chaman.converter.hospital.HospitalDtoToEntityConverter;
import com.gurjar.chaman.dto.hospital.HospitalDto;
import com.gurjar.chaman.entity.hospital.Hospital;
import com.gurjar.chaman.repository.hospital.HospitalRepository;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
@author: Chaman Gurjar    
@version: 1.0. 09-May-2021;
*/

@Service
public class HospitalServiceImpl implements HospitalService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HospitalServiceImpl.class);

    @Autowired
    private HospitalRepository hospitalRepository;

    DtoToEntityConverter<HospitalDto, Hospital> hospitalDtoToEntityConverter = new HospitalDtoToEntityConverter();

    @Override
    public boolean saveHospitals(HospitalDto hospitalDto) throws Exception {
        validateHospitalDto(hospitalDto);
        Hospital hospital = hospitalDtoToEntityConverter.convert(hospitalDto);
        hospitalRepository.save(hospital);
        return true;
    }

    private void validateHospitalDto(HospitalDto hospitalDto) throws Exception {
        if (hospitalDto == null) {
            LOGGER.error("Empty body is null");
            throw new Exception("Hospital body can not be null");
        }
        if (StringUtils.isEmpty(hospitalDto.getName())){
            LOGGER.error("Hospital name can not be null");
            throw new Exception("Hospital name can not be null");
        }
        validateMobileNumber(hospitalDto.getMobileNumber());
    }


    private void validateMobileNumber(Integer mobileNumber) throws Exception {
        if (mobileNumber == null) {
            LOGGER.error("Mobile Number can not be null");
            throw new Exception("Mobile Number can not be null");
        }
        if (Integer.toString(mobileNumber).length() < 10) {
            LOGGER.error("Mobile number length can not be less then 10");
            throw new Exception("Mobile number length can not be less then 10");
        }
    }
}
