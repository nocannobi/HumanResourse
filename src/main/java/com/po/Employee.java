package com.po;

import java.sql.Timestamp;

public class Employee extends BaseEntity{
    public static final Integer EMPLOYEE_IS_ADMIN = 1;
    public static final Integer EMPLOYEE_IS_NOT_ADMIN = 0;
    public static final Integer DETAIL_IS_WRITE = 1;
    public static final Integer DETAIL_IS_NOT_WRITE = 0;

    private int id;
    private int jobId;
    private String EmployeeName;
    private String EmployeePassword;
    private Integer employeeIsAdmin;
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
                ", employeeIsAdmin=" + employeeIsAdmin +
                ", detailIsWrite=" + detailIsWrite +
                ", employeeLoginTime=" + employeeLoginTime +
                ", employeeCreateTime=" + employeeCreateTime +
                ", employeeModifiedTime=" + employeeModifiedTime +
                '}';
    }
}
