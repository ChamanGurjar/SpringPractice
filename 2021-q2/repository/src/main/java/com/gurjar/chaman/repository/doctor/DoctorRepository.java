package com.gurjar.chaman.repository.doctor;

import com.gurjar.chaman.entity.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
@author: Chaman Gurjar    
@version: 1.0. 09-May-2021;
*/

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
