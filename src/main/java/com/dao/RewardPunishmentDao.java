package com.dao;

import com.entity.Employee;
import com.entity.RewardPunishment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RewardPunishmentDao {

    boolean addRewardPunishment(RewardPunishment rewardPunishment);
    boolean updateRewardPunishment(RewardPunishment rewardPunishment);
    RewardPunishment queryRewardPunishmentById(RewardPunishment rewardPunishment);
    List<RewardPunishment> queryRewardPunishmentByEid(Employee employee);
    List<RewardPunishment> queryAllRewardPunishment();
}
