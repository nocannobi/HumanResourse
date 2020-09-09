package com.serviceImpl;

import com.dao.WageDao;
import com.entity.Employee;
import com.entity.Wage;
import com.service.WageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WageServiceImpl implements WageService{

    @Autowired
    private WageDao wageDao;

    @Override
    public boolean addWage(Wage wage) {
        if(wage == null){
          return false;
        }
        return wageDao.addWage(wage);
    }

    @Override
    public boolean updateWage(Wage wage) {
        if(wage == null){
            return false;
        }
        return wageDao.updateWage(wage);
    }

    @Override
    public Wage queryWageById(Wage wage) {
        if(wage == null){
            return null;
        }
        return wageDao.queryWageById(wage);
    }

    @Override
    public List<Wage> queryWageByEid(Employee employee) {
        if(employee == null){
            return null;
        }
        return wageDao.queryWageByEid(employee);
    }

    @Override
    public List<Wage> queryAllWage() {
        return wageDao.queryAllWage();
    }
}
