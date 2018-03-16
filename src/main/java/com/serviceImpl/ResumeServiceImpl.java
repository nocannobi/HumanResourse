package com.serviceImpl;

import com.dao.ResumeDao;
import com.po.Customer;
import com.po.Resume;
import com.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeDao resumeDao;

    @Override
    public boolean addResume(Resume resume) {
        if(resume == null){
           return false;
        }
        return resumeDao.addResume(resume);
    }

    @Override
    public boolean updateResume(Resume resume) {
        if (resume == null){
            return false;
        }
        return resumeDao.updateResume(resume);
    }

    @Override
    public Resume queryResumeByCid(Customer customer) {
        if(customer == null){
           return null;
        }
        return resumeDao.queryResumeByCid(customer);
    }

    @Override
    public Resume queryResumeById(Resume resume) {
        if(resume == null){
            return null;
        }
        return resumeDao.queryResumeById(resume);
    }
}
