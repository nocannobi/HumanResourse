package com.service;

import com.entity.Job;

import java.util.List;

public interface JobService {
    boolean addJob(Job job);
    boolean updateJob(Job job);
    boolean deleteJob(Job job);
    Job queryJobById(Job job);
    Job queryJobByName(String jobName);
    List<Job> queryJobByDid(Job job);
    List<Job> queryAllJob();
}
