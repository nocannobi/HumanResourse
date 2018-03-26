package com.po;

import java.sql.Timestamp;

public class Review extends BaseEntity {
    private int id;
    private int employeeId;
    private String reviewTheme;
    private String reviewContent;
    private Timestamp reviewCreateTime;
    private Timestamp reviewModifiedTime;

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

    public String getReviewTheme() {
        return reviewTheme;
    }

    public void setReviewTheme(String reviewTheme) {
        this.reviewTheme = reviewTheme;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public Timestamp getReviewCreateTime() {
        return reviewCreateTime;
    }

    public void setReviewCreateTime(Timestamp reviewCreateTime) {
        this.reviewCreateTime = reviewCreateTime;
    }

    public Timestamp getReviewModifiedTime() {
        return reviewModifiedTime;
    }

    public void setReviewModifiedTime(Timestamp reviewModifiedTime) {
        this.reviewModifiedTime = reviewModifiedTime;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", reviewTheme='" + reviewTheme + '\'' +
                ", reviewContent='" + reviewContent + '\'' +
                ", reviewCreateTime=" + reviewCreateTime +
                ", reviewModifiedTime=" + reviewModifiedTime +
                '}';
    }
}
