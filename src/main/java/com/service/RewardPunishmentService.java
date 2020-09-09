package com.service;

import com.entity.Employee;
import com.entity.RewardPunishment;

import java.util.List;

public interface RewardPunishmentService {
    boolean addRewardPunishment(RewardPunishment rewardPunishment);
    boolean updateRewardPunishment(RewardPunishment rewardPunishment);
    RewardPunishment queryRewardPunishmentById(RewardPunishment rewardPunishment);
    List<RewardPunishment> queryRewardPunishmentByEid(Employee employee);
    List<RewardPunishment> queryAllRewardPunishment();
}
