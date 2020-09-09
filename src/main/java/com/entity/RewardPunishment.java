package com.entity;

import java.sql.Timestamp;

public class RewardPunishment extends BaseEntity {
    public static final Integer IS_REWARD = 0;
    public static final Integer IS_PUNISHMENT = 1;

    private String id;
    private String employeeId;
    private String rewardPunishmentContent;
    private String rewardPunishmentConn;
    private Integer isRewardPunishment;
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
