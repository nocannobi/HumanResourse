package com.serviceImpl;

import com.po.Employee;
import com.po.EmployeeDetail;
import com.service.EmployeeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "EmployeeDetail")
public class EmployeeDetailServiceImpl implements EmployeeDetailService {

    @Autowired
    private EmployeeDetailService employeeDetailService;

    @Override
    public boolean addEmployeeDetail(EmployeeDetail employeeDetail) {
        if(employeeDetail == null){
            return false;
        }
        return employeeDetailService.addEmployeeDetail(employeeDetail);
    }

    @Override
    public boolean updateEmployeeDetail(EmployeeDetail employeeDetail) {
        if(employeeDetail == null){
            return false;
        }
        return employeeDetailService.updateEmployeeDetail(employeeDetail);
    }

    @Override
    public EmployeeDetail queryEmployeeDetailById(EmployeeDetail employeeDetail) {
        if(employeeDetail == null){
           return null;
        }
        return employeeDetailService.queryEmployeeDetailById(employeeDetail);
    }

    @Override
    public EmployeeDetail queryEmployeeDetailByEid(Employee employee) {
        if(employee == null){
            return null;
        }
        return employeeDetailService.queryEmployeeDetailByEid(employee);
    }
}
