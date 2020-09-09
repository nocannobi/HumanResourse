package com.dao;

import com.entity.Resume;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResumeDao {
    boolean addResume(Resume resume);
    boolean updateResume(Resume resume);
    Resume queryResumeByCid(Resume resume);
    Resume queryResumeById(Resume resume);
}
