package com.po;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Recruitment extends BaseEntity{
    public static final Integer RECRUITMENT_IS_DELETE = 1;
    public static final Integer RECRUITMENT_IS_NOT_DELETE = 0;

    private int id;
    private int adminId;
    private String company;
    private String department;
    private String job;
    private String jobNumber;
    private BigDecimal salary;
    private String jobContent;
    private String companyAddress;
    private Integer recruitmentIsDelete;
    private Timestamp recruitmentCreateTime;
    private Timestamp recruitmentModifiedTime;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getRecruitmentIsDelete() {
        return recruitmentIsDelete;
    }

    public void setRecruitmentIsDelete(Integer recruitmentIsDelete) {
        this.recruitmentIsDelete = recruitmentIsDelete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getJobContent() {
        return jobContent;
    }

    public void setJobContent(String jobContent) {
        this.jobContent = jobContent;
    }

    public Timestamp getRecruitmentCreateTime() {
        return recruitmentCreateTime;
    }

    public void setRecruitmentCreateTime(Timestamp recruitmentCreateTime) {
        this.recruitmentCreateTime = recruitmentCreateTime;
    }

    public Timestamp getRecruitmentModifiedTime() {
        return recruitmentModifiedTime;
    }

    public void setRecruitmentModifiedTime(Timestamp recruitmentModifiedTime) {
        this.recruitmentModifiedTime = recruitmentModifiedTime;
    }

    @Override
    public String toString() {
        return "Recruitment{" +
                "id=" + id +
                ", adminId=" + adminId +
                ", company='" + company + '\'' +
                ", department='" + department + '\'' +
                ", job='" + job + '\'' +
                ", jobNumber='" + jobNumber + '\'' +
                ", salary=" + salary +
                ", jobContent='" + jobContent + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", recruitmentIsDelete=" + recruitmentIsDelete +
                ", recruitmentCreateTime=" + recruitmentCreateTime +
                ", recruitmentModifiedTime=" + recruitmentModifiedTime +
                '}';
    }
}
