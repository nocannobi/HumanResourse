package com.service;

import com.po.Recruitment;

import java.util.List;

public interface RecruitmentService {
    boolean addRecruitment(Recruitment recruitment);
    boolean updateRecruitment(Recruitment recruitment);
    boolean deleteRecruitment(Recruitment recruitment);
    Recruitment queryRecruitment(Recruitment recruitment);
    List<Recruitment> queryAllRecruitment();
}
