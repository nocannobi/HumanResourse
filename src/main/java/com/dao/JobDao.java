package com.dao;

import com.po.Job;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JobDao {
    boolean addJob(Job job);
    boolean updateJob(Job job);
    boolean deleteJob(Job job);
    Job queryJobById(Job job);
    Job queryJobByName(String jobName);
    List<Job> queryJobByDid(Job job);
    List<Job> queryAllJob();
}
