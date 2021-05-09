package com.gurjar.chaman.repository.patient;

import com.gurjar.chaman.entity.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/*
@author: Chaman Gurjar    
@version: 1.0. 09-May-2021;
*/


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
