package com.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Wage extends BaseEntity {
    public static final Integer IS_GIVE = 1;
    public static final Integer IS_NOT_GIVE = 0;
    public static final Integer IS_REVIEW = 1;
    public static final Integer IS_NOT_REVIEW = 0;

     private String id;
     private String employeeId;
     private BigDecimal commission;
     private BigDecimal socialInsurance;
     private BigDecimal rewardPunishmentMoney;
     private BigDecimal allMoney;
     private Integer isGive;
     private String wageMonth;
     private Integer isReview;
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

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public BigDecimal getSocialInsurance() {
        return socialInsurance;
    }

    public void setSocialInsurance(BigDecimal socialInsurance) {
        this.socialInsurance = socialInsurance;
    }

    public BigDecimal getRewardPunishmentMoney() {
        return rewardPunishmentMoney;
    }

    public void setRewardPunishmentMoney(BigDecimal rewardPunishmentMoney) {
        this.rewardPunishmentMoney = rewardPunishmentMoney;
    }

    public BigDecimal getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(BigDecimal allMoney) {
        this.allMoney = allMoney;
    }

    public Integer getIsGive() {
        return isGive;
    }

    public void setIsGive(Integer isGive) {
        this.isGive = isGive;
    }

    public String getWageMonth() {
        return wageMonth;
    }

    public void setWageMonth(String wageMonth) {
        this.wageMonth = wageMonth;
    }

    public Integer getIsReview() {
        return isReview;
    }

    public void setIsReview(Integer isReview) {
        this.isReview = isReview;
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
