package com.serviceImpl;

import com.dao.JobDao;
import com.po.Job;
import com.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    private JobDao jobDao;

    @Override
    public boolean addJob(Job job) {
        System.out.println("service:"+job);
        if(job == null){
            return false;
        }
        return jobDao.addJob(job);
    }

    @Override
    public boolean updateJob(Job job) {
        if(job == null){
            return false;
        }
        return jobDao.updateJob(job);
    }

    @Override
    public boolean deleteJob(Job job) {
        if(job == null){
            return false;
        }
        return jobDao.deleteJob(job);
    }

    @Override
    public Job queryJobById(Job job) {
        if(job == null){
            return null;
        }
        return jobDao.queryJobById(job);
    }

    @Override
    public List<Job> queryJobByDid(Job job) {
        if(job == null){
            return null;
        }
        return jobDao.queryJobByDid(job);
    }

    @Override
    public List<Job> queryAllJob() {
        return jobDao.queryAllJob();
    }
}
