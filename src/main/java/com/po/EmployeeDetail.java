package com.po;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class EmployeeDetail extends BaseEntity{
    public static final Integer EMPLOYEE_IS_WORK = 1;
    public static final Integer EMPLOYEE_IS_NOT_WORK = 0;
    public static final Integer JOB_FULL_TIME = 1;
    public static final Integer JOB_INTERNSHIP = 0;

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
    private String employeeDepartment;
    private String employeeJob;
    private Integer employeeIsWork;
    private Integer jobState;
    private BigDecimal basicWage;
    private Timestamp employeeDetailCreateTime;
    private Timestamp employeeDetailModifiedTime;

    public static Integer getEmployeeIsWork() {
        return EMPLOYEE_IS_WORK;
    }

    public void setEmployeeIsWork(Integer employeeIsWork) {
        this.employeeIsWork = employeeIsWork;
    }

    public Integer getJobState() {
        return jobState;
    }

    public void setJobState(Integer jobState) {
        this.jobState = jobState;
    }

    public BigDecimal getBasicWage() {
        return basicWage;
    }

    public void setBasicWage(BigDecimal basicWage) {
        this.basicWage = basicWage;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public String getEmployeeJob() {
        return employeeJob;
    }

    public void setEmployeeJob(String employeeJob) {
        this.employeeJob = employeeJob;
    }

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
                ", employeeDepartment='" + employeeDepartment + '\'' +
                ", employeeJob='" + employeeJob + '\'' +
                ", employeeIsWork=" + employeeIsWork +
                ", jobState=" + jobState +
                ", basicWage=" + basicWage +
                ", employeeDetailCreateTime=" + employeeDetailCreateTime +
                ", employeeDetailModifiedTime=" + employeeDetailModifiedTime +
                '}';
    }
}
