package com.dao;

import com.po.Employee;
import com.po.EmployeeDetail;

import java.util.List;

public interface EmployeeDetailDao {
    boolean addEmployeeDetail(EmployeeDetail employeeDetail);
    boolean updateEmployeeDetail(EmployeeDetail employeeDetail);
    EmployeeDetail queryEmployeeDetailById(EmployeeDetail employeeDetail);
    EmployeeDetail queryEmployeeDetailByEid(Employee employee);
    List<EmployeeDetail> queryAllEmployeeDetail();
}
