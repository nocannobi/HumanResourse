package com.dao;

import com.entity.Employee;
import com.entity.EmployeeDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeDetailDao {
    boolean addEmployeeDetail(EmployeeDetail employeeDetail);
    boolean updateEmployeeDetail(EmployeeDetail employeeDetail);
    EmployeeDetail queryEmployeeDetailById(EmployeeDetail employeeDetail);
    EmployeeDetail queryEmployeeDetailByEid(Employee employee);
    List<EmployeeDetail> queryAllEmployeeDetail();
}
