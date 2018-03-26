package com.po;

import java.sql.Timestamp;

public class Training extends BaseEntity {
    public static final Integer TRAINING_IS_DELETE = 1;
    public static final Integer TRAINING_IS_NOT_DELETE = 0;

    private int id;
    private String trainingName;
    private String trainingTime;
    private String trainingLocation;
    private String trainingContent;
    private Integer trainingIsDelete;
    private Timestamp trainingCreateTime;
    private Timestamp trainingModifiedTime;

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrainingContent() {
        return trainingContent;
    }

    public void setTrainingContent(String trainingContent) {
        this.trainingContent = trainingContent;
    }

    public String getTrainingTime() {
        return trainingTime;
    }

    public void setTrainingTime(String trainingTime) {
        this.trainingTime = trainingTime;
    }

    public String getTrainingLocation() {
        return trainingLocation;
    }

    public void setTrainingLocation(String trainingLocation) {
        this.trainingLocation = trainingLocation;
    }

    public Integer getTrainingIsDelete() {
        return trainingIsDelete;
    }

    public void setTrainingIsDelete(Integer trainingIsDelete) {
        this.trainingIsDelete = trainingIsDelete;
    }

    public Timestamp getTrainingCreateTime() {
        return trainingCreateTime;
    }

    public void setTrainingCreateTime(Timestamp trainingCreateTime) {
        this.trainingCreateTime = trainingCreateTime;
    }

    public Timestamp getTrainingModifiedTime() {
        return trainingModifiedTime;
    }

    public void setTrainingModifiedTime(Timestamp trainingModifiedTime) {
        this.trainingModifiedTime = trainingModifiedTime;
    }

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", trainingName='" + trainingName + '\'' +
                ", trainingTime='" + trainingTime + '\'' +
                ", trainingLocation='" + trainingLocation + '\'' +
                ", trainingContent='" + trainingContent + '\'' +
                ", trainingIsDelete=" + trainingIsDelete +
                ", trainingCreateTime=" + trainingCreateTime +
                ", trainingModifiedTime=" + trainingModifiedTime +
                '}';
    }
}
