package com.service;

import com.entity.Recruitment;

import java.util.List;

public interface RecruitmentService {
    boolean addRecruitment(Recruitment recruitment);
    boolean updateRecruitment(Recruitment recruitment);
    boolean deleteRecruitment(Recruitment recruitment);
    Recruitment queryRecruitmentById(Recruitment recruitment);
    List<Recruitment> queryAllRecruitment();
}
