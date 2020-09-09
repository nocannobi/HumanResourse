package com.entity;

import java.sql.Timestamp;

public class TrainingRecord extends BaseEntity {
    public static final Integer EMPLOYEE_IS_TRAINING = 1;
    public static final Integer EMPLOYEE_IS_NOT_TRAINING = 0;
    public static final Integer RECORD_IS_DELETE = 1;
    public static final Integer RECORD_IS_NOT_DELETE = 0;

    private String id;
    private String trainingId;
    private String employeeId;
    private Integer employeeIsTraining;
    private Integer recordIsDelete;
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

    public String getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(String trainingId) {
        this.trainingId = trainingId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
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
