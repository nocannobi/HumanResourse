package com.po;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Employee extends BaseEntity{
    public static final Integer EMPLOYEE_IS_WORK = 1;
    public static final Integer EMPLOYEE_IS_NOT_WORK = 0;
    public static final Integer JOB_FULL_TIME = 1;
    public static final Integer JOB_INTERNSHIP = 0;
    public static final Integer EMPLOYEE_IS_RETIRED = 0;
    public static final Integer EMPLOYEE_IS_NOT_RETIRED = 1;
    public static final Integer EMPLOYEE_IS_ADMIN = 1;
    public static final Integer EMPLOYEE_IS_NOT_ADMIN = 0;
    public static final Integer DETAIL_IS_WRITE = 1;
    public static final Integer DETAIL_IS_NOT_WRITE = 0;

    private int id;
    private int jobId;
    private String EmployeeName;
    private String EmployeePassword;
    private BigDecimal basicWage;
    private Integer employeeIsAdmin;
    private Integer employeeIsWork;
    private Integer jobState;
    private Integer detailIsWrite;
    private Timestamp employeeLoginTime;
    private Timestamp employeeCreateTime;
    private Timestamp employeeModifiedTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeePassword() {
        return EmployeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        EmployeePassword = employeePassword;
    }

    public BigDecimal getBasicWage() {
        return basicWage;
    }

    public void setBasicWage(BigDecimal basicWage) {
        this.basicWage = basicWage;
    }

    public Integer getEmployeeIsWork() {
        return employeeIsWork;
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

    public Integer getDetailIsWrite() {
        return detailIsWrite;
    }

    public void setDetailIsWrite(Integer detailIsWrite) {
        this.detailIsWrite = detailIsWrite;
    }

    public Timestamp getEmployeeLoginTime() {
        return employeeLoginTime;
    }

    public void setEmployeeLoginTime(Timestamp employeeLoginTime) {
        this.employeeLoginTime = employeeLoginTime;
    }

    public Timestamp getEmployeeCreateTime() {
        return employeeCreateTime;
    }

    public void setEmployeeCreateTime(Timestamp employeeCreateTime) {
        this.employeeCreateTime = employeeCreateTime;
    }

    public Timestamp getEmployeeModifiedTime() {
        return employeeModifiedTime;
    }

    public void setEmployeeModifiedTime(Timestamp employeeModifiedTime) {
        this.employeeModifiedTime = employeeModifiedTime;
    }

    public Integer getEmployeeIsAdmin() {
        return employeeIsAdmin;
    }

    public void setEmployeeIsAdmin(Integer employeeIsAdmin) {
        this.employeeIsAdmin = employeeIsAdmin;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", jobId=" + jobId +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", EmployeePassword='" + EmployeePassword + '\'' +
                ", basicWage=" + basicWage +
                ", employeeIsAdmin=" + employeeIsAdmin +
                ", employeeIsWork=" + employeeIsWork +
                ", jobState=" + jobState +
                ", detailIsWrite=" + detailIsWrite +
                ", employeeLoginTime=" + employeeLoginTime +
                ", employeeCreateTime=" + employeeCreateTime +
                ", employeeModifiedTime=" + employeeModifiedTime +
                '}';
    }
}
