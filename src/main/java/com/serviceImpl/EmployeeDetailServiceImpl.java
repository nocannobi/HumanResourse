package com.serviceImpl;

import com.dao.EmployeeDetailDao;
import com.po.Employee;
import com.po.EmployeeDetail;
import com.service.EmployeeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDetailServiceImpl implements EmployeeDetailService {

    @Autowired
    private EmployeeDetailDao employeeDetailDao;

    @Override
    public boolean addEmployeeDetail(EmployeeDetail employeeDetail) {
        if(employeeDetail == null){
            return false;
        }
        return employeeDetailDao.addEmployeeDetail(employeeDetail);
    }

    @Override
    public boolean updateEmployeeDetail(EmployeeDetail employeeDetail) {
        if(employeeDetail == null){
            return false;
        }
        return employeeDetailDao.updateEmployeeDetail(employeeDetail);
    }

    @Override
    public EmployeeDetail queryEmployeeDetailById(EmployeeDetail employeeDetail) {
        if(employeeDetail == null){
           return null;
        }
        return employeeDetailDao.queryEmployeeDetailById(employeeDetail);
    }

    @Override
    public EmployeeDetail queryEmployeeDetailByEid(Employee employee) {
        if(employee == null){
            return null;
        }
        return employeeDetailDao.queryEmployeeDetailByEid(employee);
    }
}
