package com.dao;

import com.po.EmployeeMessage;

import java.util.List;

public interface EmployeeMessageDao {
    boolean addEmployeeMessage(EmployeeMessage employeeMessage);
    boolean deleteEmployeeMessage(EmployeeMessage employeeMessage);
    EmployeeMessage  queryEmployeeMessageById(EmployeeMessage employeeMessage);
    List<EmployeeMessage> queryAllEmployeeMessage();
}
