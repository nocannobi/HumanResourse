package com.serviceImpl;

import com.dao.RecruitmentDao;
import com.po.Recruitment;
import com.service.RecruitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecruitmentServiceImpl implements RecruitmentService {

    @Autowired
    private RecruitmentDao recruitmentDao;

    @Override
    public boolean addRecruitment(Recruitment recruitment) {
        if(recruitment == null){
            return  false;
        }
        return recruitmentDao.addRecruitment(recruitment);
    }

    @Override
    public boolean updateRecruitment(Recruitment recruitment) {
        if(recruitment == null){
            return false;
        }
        return recruitmentDao.updateRecruitment(recruitment);
    }

    @Override
    public boolean deleteRecruitment(Recruitment recruitment) {
        if(recruitment == null){
            return false;
        }
        return recruitmentDao.deleteRecruitment(recruitment);
    }

    @Override
    public Recruitment queryRecruitment(Recruitment recruitment) {
        if(recruitment == null){
            return null;
        }
        return recruitmentDao.queryRecruitment(recruitment);
    }

    @Override
    public List<Recruitment> queryAllRecruitment() {
        return recruitmentDao.queryAllRecruitment();
    }
}
