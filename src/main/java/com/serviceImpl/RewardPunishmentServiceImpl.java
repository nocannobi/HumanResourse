package com.serviceImpl;

import com.dao.RewardPunishmentDao;
import com.po.Employee;
import com.po.RewardPunishment;
import com.service.RewardPunishmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RewardPunishmentServiceImpl implements RewardPunishmentService {

    @Autowired
    private RewardPunishmentDao rewardPunishmentDao;

    @Override
    public boolean addRewardPunishment(RewardPunishment rewardPunishment) {
        if(rewardPunishment == null){
            return false;
        }
        return rewardPunishmentDao.addRewardPunishment(rewardPunishment);
    }

    @Override
    public boolean updateRewardPunishment(RewardPunishment rewardPunishment) {
        if(rewardPunishment == null){
            return false;
        }
        return rewardPunishmentDao.updateRewardPunishment(rewardPunishment);
    }

    @Override
    public RewardPunishment queryRewardPunishmentById(RewardPunishment rewardPunishment) {
        if(rewardPunishment == null){
            return null;
        }
        return rewardPunishmentDao.queryRewardPunishmentById(rewardPunishment);
    }

    @Override
    public List<RewardPunishment> queryRewardPunishmentByEid(Employee employee) {
        if(employee == null){
            return null;
        }
        return rewardPunishmentDao.queryRewardPunishmentByEid(employee);
    }

    @Override
    public List<RewardPunishment> queryAllRewardPunishment() {
        return rewardPunishmentDao.queryAllRewardPunishment();
    }
}
