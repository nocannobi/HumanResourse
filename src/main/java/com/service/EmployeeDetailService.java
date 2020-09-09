package com.service;

import com.entity.Employee;
import com.entity.EmployeeDetail;

import java.util.List;

public interface EmployeeDetailService {
    boolean addEmployeeDetail(EmployeeDetail employeeDetail);
    boolean updateEmployeeDetail(EmployeeDetail employeeDetail);
    EmployeeDetail queryEmployeeDetailById(EmployeeDetail employeeDetail);
    EmployeeDetail queryEmployeeDetailByEid(Employee employee);
    List<EmployeeDetail> queryAllEmployeeDetail();
}
