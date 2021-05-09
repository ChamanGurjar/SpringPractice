package com.gurjar.chaman.dto.doctor;

/*
@author: Chaman Gurjar    
@version: 1.0. 09-May-2021;
*/

public class DoctorDto {

    private static final int HOSPITAL_NUMBER = 1234-56789;

    private String salutation;
    private String firstName;
    private String lastName;
    private String email;
    private Integer mobileNumber;
    private Boolean isActive;
    private String address;

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
        return HOSPITAL_NUMBER;
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

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DoctorDto{");
        sb.append("salutation='").append(salutation).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", mobileNumber=").append(mobileNumber);
        sb.append(", isActive=").append(isActive);
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
