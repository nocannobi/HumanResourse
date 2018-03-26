package com.po;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Wage extends BaseEntity {
    public static final Integer IS_GIVE = 1;
    public static final Integer IS_NOT_GIVE = 0;
    public static final Integer IS_REVIEW = 1;
    public static final Integer IS_NOT_REVIEW = 0;

    private int id;
     private int employeeId;
     private BigDecimal commission;
     private BigDecimal socialInsurance;
     private BigDecimal rewardPunishmentMoney;
     private BigDecimal allMoney;
     private Integer isGive;
     private String wageMonth;
     private Integer isReview;
     private Timestamp wageCreateTime;
     private Timestamp wageModifiedTime;

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

    public Timestamp getWageCreateTime() {
        return wageCreateTime;
    }

    public void setWageCreateTime(Timestamp wageCreateTime) {
        this.wageCreateTime = wageCreateTime;
    }

    public Timestamp getWageModifiedTime() {
        return wageModifiedTime;
    }

    public void setWageModifiedTime(Timestamp wageModifiedTime) {
        this.wageModifiedTime = wageModifiedTime;
    }

    @Override
    public String toString() {
        return "Wage{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", commission=" + commission +
                ", socialInsurance=" + socialInsurance +
                ", rewardPunishmentMoney=" + rewardPunishmentMoney +
                ", allMoney=" + allMoney +
                ", isGive=" + isGive +
                ", wageMonth='" + wageMonth + '\'' +
                ", isReview=" + isReview +
                ", wageCreateTime=" + wageCreateTime +
                ", wageModifiedTime=" + wageModifiedTime +
                '}';
    }
}
