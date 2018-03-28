package com.po;

import org.omg.PortableInterceptor.INACTIVE;

import java.sql.Timestamp;

public class Application extends BaseEntity {
    public static final Integer IS_INTERVIEW = 1;
    public static final Integer IS_NOT_INTERVIEW = 0;
    public static final Integer IS_PASS_INTERVIEW = 1;
    public static final Integer IS_NOT_PASS_INTERVIEW = 0;
    public static final Integer IS_VIEW = 1;
    public static final Integer IS_NOT_VIEW = 0;

    private int id;
    private int customerId;
    private int resumeId;
    private int recruitmentId;
    private Integer isInterview;
    private Integer isPassInterview;
    private Integer isView;
    private Timestamp applicationCreateTime;
    private Timestamp applicationModifiedTime;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResumeId() {
        return resumeId;
    }

    public void setResumeId(int resumeId) {
        this.resumeId = resumeId;
    }

    public int getRecruitmentId() {
        return recruitmentId;
    }

    public void setRecruitmentId(int recruitmentId) {
        this.recruitmentId = recruitmentId;
    }

    public Integer getIsInterview() {
        return isInterview;
    }

    public void setIsInterview(Integer isInterview) {
        this.isInterview = isInterview;
    }

    public Integer getIsPassInterview() {
        return isPassInterview;
    }

    public void setIsPassInterview(Integer isPassInterview) {
        this.isPassInterview = isPassInterview;
    }

    public Integer getIsView() {
        return isView;
    }

    public void setIsView(Integer isView) {
        this.isView = isView;
    }

    public Timestamp getApplicationCreateTime() {
        return applicationCreateTime;
    }

    public void setApplicationCreateTime(Timestamp applicationCreateTime) {
        this.applicationCreateTime = applicationCreateTime;
    }

    public Timestamp getApplicationModifiedTime() {
        return applicationModifiedTime;
    }

    public void setApplicationModifiedTime(Timestamp applcationModifiedTime) {
        this.applicationModifiedTime = applcationModifiedTime;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", resumeId=" + resumeId +
                ", recruitmentId=" + recruitmentId +
                ", isInterview=" + isInterview +
                ", isPassInterview=" + isPassInterview +
                ", isView=" + isView +
                ", applicationCreateTime=" + applicationCreateTime +
                ", applicationModifiedTime=" + applicationModifiedTime +
                '}';
    }
}
