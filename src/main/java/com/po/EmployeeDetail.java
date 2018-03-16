package com.po;

import java.sql.Timestamp;

public class EmployeeDetail {
    private int id;
    private int employeeId;
    private String employeeRealName;
    private String headImage;
    private Integer employeeAge;
    private String employeeSex;
    private String employeeIdCard;
    private String employeeEmail;
    private String employeePhone;
    private String employeeAddress;
    private Timestamp employeeDetailCreateTime;
    private Timestamp employeeDetailModifiedTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeRealName() {
        return employeeRealName;
    }

    public void setEmployeeRealName(String employeeRealName) {
        this.employeeRealName = employeeRealName;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public Integer getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(Integer employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Timestamp getEmployeeDetailCreateTime() {
        return employeeDetailCreateTime;
    }

    public void setEmployeeDetailCreateTime(Timestamp employeeDetailCreateTime) {
        this.employeeDetailCreateTime = employeeDetailCreateTime;
    }

    public Timestamp getEmployeeDetailModifiedTime() {
        return employeeDetailModifiedTime;
    }

    public void setEmployeeDetailModifiedTime(Timestamp employeeDetailModifiedTime) {
        this.employeeDetailModifiedTime = employeeDetailModifiedTime;
    }

    @Override
    public String toString() {
        return "EmployeeDetail{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", employeeRealName='" + employeeRealName + '\'' +
                ", headImage='" + headImage + '\'' +
                ", employeeAge=" + employeeAge +
                ", employeeSex='" + employeeSex + '\'' +
                ", employeeIdCard='" + employeeIdCard + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeePhone='" + employeePhone + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeDetailCreateTime=" + employeeDetailCreateTime +
                ", employeeDetailModifiedTime=" + employeeDetailModifiedTime +
                '}';
    }
}
