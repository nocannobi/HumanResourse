package com.dao;

import com.po.Job;

import java.util.List;

public interface JobDao {
    boolean addJob(Job job);
    boolean updateJob(Job job);
    boolean deleteJob(Job job);
    Job queryJobById(Job job);
    List<Job> queryJobByDid(Job job);
    List<Job> queryAllJob();
}
