package com.dao;

import com.entity.Recruitment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecruitmentDao {
    boolean addRecruitment(Recruitment recruitment);
    boolean updateRecruitment(Recruitment recruitment);
    boolean deleteRecruitment(Recruitment recruitment);
    Recruitment queryRecruitmentById(Recruitment recruitment);
    List<Recruitment> queryAllRecruitment();
}
