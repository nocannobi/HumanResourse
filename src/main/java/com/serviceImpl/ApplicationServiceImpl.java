package com.serviceImpl;

import com.dao.ApplicationDao;
import com.po.Application;
import com.po.Customer;
import com.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationDao applicationDao;

    @Override
    public boolean addApplication(Application application) {
        if(application == null){
           return false;
        }
        return applicationDao.addApplication(application);
    }

    @Override
    public boolean updateApplication(Application application) {
        if(application == null){
            return false;
        }
        return applicationDao.updateApplication(application);
    }

    @Override
    public Application queryApplicationById(Application application) {
        if(application == null){
            return null;
        }
        return applicationDao.queryApplicationById(application);
    }

    @Override
    public List<Application> queryApplicationByCid(Customer customer) {
        if(customer == null){
            return null;
        }
        return applicationDao.queryApplicationByCid(customer);
    }

    @Override
    public List<Application> queryAllApplication() {
        return applicationDao.queryAllApplication();
    }
}
