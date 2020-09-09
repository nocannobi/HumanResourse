package com.dao;

import com.entity.Application;
import com.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApplicationDao {
    boolean addApplication(Application application);
    boolean updateApplication(Application application);
    Application queryApplicationById(Application application);
    List<Application> queryApplicationByCid(Customer customer);
    List<Application> queryAllApplication();
}
