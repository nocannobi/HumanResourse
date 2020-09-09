package com.service;

import com.entity.Resume;

public interface ResumeService {
    boolean addResume(Resume resume);
    boolean updateResume(Resume resume);
    Resume queryResumeByCid(Resume resume);
    Resume queryResumeById(Resume resume);
}
