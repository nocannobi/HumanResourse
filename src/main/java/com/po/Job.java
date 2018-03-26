package com.po;

import java.sql.Timestamp;

public class Job extends BaseEntity {

    public static final Integer JOB_IS_DELETE = 1;
    public static final Integer JOB_IS_NOT_DELETE = 0;

    private int id;
    private int departmentId;
    private String jobName;
    private Integer jobIsDelete;
    private Timestamp jobCreateTime;
    private Timestamp jobModifiedTime;

    public Integer getJobIsDelete() {
        return jobIsDelete;
    }

    public void setJobIsDelete(Integer jobIsDelete) {
        this.jobIsDelete = jobIsDelete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Timestamp getJobCreateTime() {
        return jobCreateTime;
    }

    public void setJobCreateTime(Timestamp jobCreateTime) {
        this.jobCreateTime = jobCreateTime;
    }

    public Timestamp getJobModifiedTime() {
        return jobModifiedTime;
    }

    public void setJobModifiedTime(Timestamp jobModifiedTime) {
        this.jobModifiedTime = jobModifiedTime;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", departmentId=" + departmentId +
                ", jobName='" + jobName + '\'' +
                ", jobIsDelete=" + jobIsDelete +
                ", jobCreateTime=" + jobCreateTime +
                ", jobModifiedTime=" + jobModifiedTime +
                '}';
    }
}
