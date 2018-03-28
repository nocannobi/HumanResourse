package com.dao;

import com.po.Recruitment;

import java.util.List;

public interface RecruitmentDao {
    boolean addRecruitment(Recruitment recruitment);
    boolean updateRecruitment(Recruitment recruitment);
    boolean deleteRecruitment(Recruitment recruitment);
    Recruitment queryRecruitmentById(Recruitment recruitment);
    List<Recruitment> queryAllRecruitment();
}
