package com.entity;

import java.sql.Timestamp;

public class Employee extends BaseEntity{
    public static final Integer EMPLOYEE_IS_ADMIN = 1;
    public static final Integer EMPLOYEE_IS_NOT_ADMIN = 0;
    public static final Integer DETAIL_IS_WRITE = 1;
    public static final Integer DETAIL_IS_NOT_WRITE = 0;

    private String id;
    private String jobId;
    private String EmployeeName;
    private String EmployeePassword;
    private Integer employeeIsAdmin;
    private Integer detailIsWrite;
    private Timestamp loginDate;
    private Timestamp createDate;
    private String creator;
    private Timestamp modifiedDate;
    private String modifier;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
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

    public Integer getEmployeeIsAdmin() {
        return employeeIsAdmin;
    }

    public void setEmployeeIsAdmin(Integer employeeIsAdmin) {
        this.employeeIsAdmin = employeeIsAdmin;
    }

    public Integer getDetailIsWrite() {
        return detailIsWrite;
    }

    public void setDetailIsWrite(Integer detailIsWrite) {
        this.detailIsWrite = detailIsWrite;
    }

    public Timestamp getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Timestamp loginDate) {
        this.loginDate = loginDate;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }
}
