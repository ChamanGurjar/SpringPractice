package com.gurjar.chaman.entity.student;

/*
@author: Chaman Gurjar    
@version: 1.0. 06-May-2021;
*/

import com.gurjar.chaman.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Student extends BaseEntity {

    private String salutation;
    private String firstName;
    private String lastName;
    private String email;
    private Integer mobileNumber;

    @Column(name = "is_active")
    private Boolean isActive;

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("salutation='").append(salutation).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", mobileNumber=").append(mobileNumber);
        sb.append(", isActive=").append(isActive);
        sb.append('}');
        return sb.toString();
    }
}
