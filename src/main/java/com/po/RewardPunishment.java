package com.po;

import java.sql.Timestamp;

public class RewardPunishment extends BaseEntity {
    public static final Integer IS_REWARD = 0;
    public static final Integer IS_PUNISHMENT = 1;

    private int id;
    private int employeeId;
    private String rewardPunishmentContent;
    private String rewardPunishmentConn;
    private Integer isRewardPunishment;
    private Timestamp createTime;
    private Timestamp modifiedTime;

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

    public String getRewardPunishmentContent() {
        return rewardPunishmentContent;
    }

    public void setRewardPunishmentContent(String rewardPunishmentContent) {
        this.rewardPunishmentContent = rewardPunishmentContent;
    }

    public String getRewardPunishmentConn() {
        return rewardPunishmentConn;
    }

    public void setRewardPunishmentConn(String rewardPunishmentConn) {
        this.rewardPunishmentConn = rewardPunishmentConn;
    }

    public Integer getIsRewardPunishment() {
        return isRewardPunishment;
    }

    public void setIsRewardPunishment(Integer isRewardPunishment) {
        this.isRewardPunishment = isRewardPunishment;
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
        return "RewardPunishment{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", rewardPunishmentContent='" + rewardPunishmentContent + '\'' +
                ", rewardPunishmentConn='" + rewardPunishmentConn + '\'' +
                ", isRewardPunishment=" + isRewardPunishment +
                ", createTime=" + createTime +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
