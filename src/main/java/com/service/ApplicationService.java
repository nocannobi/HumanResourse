package com.service;

import com.entity.Application;
import com.entity.Customer;

import java.util.List;

public interface ApplicationService {
    boolean addApplication(Application application);
    boolean updateApplication(Application application);
    Application queryApplicationById(Application application);
    List<Application> queryApplicationByCid(Customer customer);
    List<Application> queryAllApplication();
}
