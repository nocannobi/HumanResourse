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

    private String id;
    private String customerId;
    private String resumeId;
    private String recruitmentId;
    private Integer isInterview;
    private Integer isPassInterview;
    private Integer isView;
    private Timestamp createTime;
    private Timestamp modifiedTime;
    private String creator;
    private String modifier;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getResumeId() {
        return resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    public String getRecruitmentId() {
        return recruitmentId;
    }

    public void setRecruitmentId(String recruitmentId) {
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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }
}
