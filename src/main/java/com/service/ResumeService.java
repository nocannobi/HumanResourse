package com.service;

import com.po.Customer;
import com.po.Resume;

public interface ResumeService {
    boolean addResume(Resume resume);
    boolean updateResume(Resume resume);
    Resume queryResumeByCid(Customer customer);
    Resume queryResumeById(Resume resume);
}
