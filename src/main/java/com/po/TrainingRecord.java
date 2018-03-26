package com.po;

import java.sql.Timestamp;

public class TrainingRecord extends BaseEntity {
    public static final Integer EMPLOYEE_IS_TRAINING = 1;
    public static final Integer EMPLOYEE_IS_NOT_TRAINING = 0;
    public static final Integer RECORD_IS_DELETE = 1;
    public static final Integer RECORD_IS_NOT_DELETE = 0;

    private int id;
    private int trainingId;
    private int employeeId;
    private Integer employeeIsTraining;
    private Integer recordIsDelete;
    private Timestamp createTime;
    private Timestamp modifiedTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(int trainingId) {
        this.trainingId = trainingId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getEmployeeIsTraining() {
        return employeeIsTraining;
    }

    public void setEmployeeIsTraining(Integer employeeIsTraining) {
        this.employeeIsTraining = employeeIsTraining;
    }

    public Integer getRecordIsDelete() {
        return recordIsDelete;
    }

    public void setRecordIsDelete(Integer recordIsDelete) {
        this.recordIsDelete = recordIsDelete;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "TrainingRecord{" +
                "id=" + id +
                ", trainingId=" + trainingId +
                ", employeeId=" + employeeId +
                ", employeeIsTraining=" + employeeIsTraining +
                ", recordIsDelete=" + recordIsDelete +
                ", createTime=" + createTime +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
