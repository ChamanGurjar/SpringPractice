package com.gurjar.chaman.dto.hospital;

/*
@author: Chaman Gurjar    
@version: 1.0. 09-May-2021;
*/

import com.gurjar.chaman.dto.BaseDto;

public class HospitalDto extends BaseDto {

    private String name;
    private String branch;
    private String location;
    private Integer mobileNumber;
    private Boolean isActive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
        final StringBuilder sb = new StringBuilder("HospitalDto{");
        sb.append("name='").append(name).append('\'');
        sb.append(", branch='").append(branch).append('\'');
        sb.append(", location='").append(location).append('\'');
        sb.append(", mobileNumber=").append(mobileNumber);
        sb.append(", isActive=").append(isActive);
        sb.append('}');
        return sb.toString();
    }
}
