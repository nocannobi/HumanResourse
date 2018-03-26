package com.dao;

import com.po.Employee;
import com.po.RewardPunishment;

import java.util.List;

public interface RewardPunishmentDao {

    boolean addRewardPunishment(RewardPunishment rewardPunishment);
    boolean updateRewardPunishment(RewardPunishment rewardPunishment);
    RewardPunishment queryRewardPunishmentById(RewardPunishment rewardPunishment);
    List<RewardPunishment> queryRewardPunishmentByEid(Employee employee);
    List<RewardPunishment> queryAllRewardPunishment();
}
