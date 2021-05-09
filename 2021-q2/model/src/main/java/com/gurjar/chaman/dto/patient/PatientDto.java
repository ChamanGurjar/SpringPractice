package com.gurjar.chaman.dto.patient;

/*
@author: Chaman Gurjar    
@version: 1.0. 09-May-2021;
*/


import javax.persistence.Column;

public class PatientDto {

    private String salutation;
    private String firstName;
    private String lastName;
    private String email;
    private Integer mobileNumber;
    private Integer caretakerContact;
    private Boolean isActive;
    private Long admissionDate;

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

    public Integer getCaretakerContact() {
        return caretakerContact;
    }

    public void setCaretakerContact(Integer caretakerContact) {
        this.caretakerContact = caretakerContact;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Long getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Long admissionDate) {
        this.admissionDate = admissionDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PatientDto{");
        sb.append("salutation='").append(salutation).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", mobileNumber=").append(mobileNumber);
        sb.append(", caretakerContact=").append(caretakerContact);
        sb.append(", isActive=").append(isActive);
        sb.append(", admissionDate=").append(admissionDate);
        sb.append('}');
        return sb.toString();
    }
}
