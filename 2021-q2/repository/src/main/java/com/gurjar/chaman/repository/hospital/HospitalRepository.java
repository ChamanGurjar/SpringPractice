package com.gurjar.chaman.repository.hospital;
import com.gurjar.chaman.entity.hospital.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
@author: Chaman Gurjar    
@version: 1.0. 09-May-2021;
*/


@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {

}
