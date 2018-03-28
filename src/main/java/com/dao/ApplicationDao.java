package com.dao;

import com.po.Application;
import com.po.Customer;

import java.util.List;

public interface ApplicationDao {
    boolean addApplication(Application application);
    boolean updateApplication(Application application);
    Application queryApplicationById(Application application);
    List<Application> queryApplicationByCid(Customer customer);
    List<Application> queryAllApplication();
}
