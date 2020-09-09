package com.serviceImpl;

import com.dao.EmployeeDetailDao;
import com.entity.Employee;
import com.entity.EmployeeDetail;
import com.service.EmployeeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<EmployeeDetail> queryAllEmployeeDetail() {
        return employeeDetailDao.queryAllEmployeeDetail();
    }
}
