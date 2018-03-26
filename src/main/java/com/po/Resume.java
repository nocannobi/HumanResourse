package com.po;

import java.sql.Timestamp;

public class Resume extends BaseEntity{
    private int id;
    private int customerId;
    private int recruitmentId;
    private String realName;
    private String headImage;
    private String idCard;
    private String sex;
    private String birth;
    private String nation;
    private String address;
    private String phone;
    private String email;
    private String graduation;
    private String education;
    private String personalEvaluation;
    private String workExperience;
    private Timestamp resumeCreateTime;
    private Timestamp resumeModifiedTime;

    public int getRecruitmentId() {
        return recruitmentId;
    }

    public void setRecruitmentId(int recruitmentId) {
        this.recruitmentId = recruitmentId;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPersonalEvaluation() {
        return personalEvaluation;
    }

    public void setPersonalEvaluation(String personalEvaluation) {
        this.personalEvaluation = personalEvaluation;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public Timestamp getResumeCreateTime() {
        return resumeCreateTime;
    }

    public void setResumeCreateTime(Timestamp resumeCreateTime) {
        this.resumeCreateTime = resumeCreateTime;
    }

    public Timestamp getResumeModifiedTime() {
        return resumeModifiedTime;
    }

    public void setResumeModifiedTime(Timestamp resumeModifiedTime) {
        this.resumeModifiedTime = resumeModifiedTime;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", recruitmentId=" + recruitmentId +
                ", realName='" + realName + '\'' +
                ", headImage='" + headImage + '\'' +
                ", idCard='" + idCard + '\'' +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                ", nation='" + nation + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", graduation='" + graduation + '\'' +
                ", education='" + education + '\'' +
                ", personalEvaluation='" + personalEvaluation + '\'' +
                ", workExperience='" + workExperience + '\'' +
                ", resumeCreateTime=" + resumeCreateTime +
                ", resumeModifiedTime=" + resumeModifiedTime +
                '}';
    }
}
