package com.service;

import com.entity.EmployeeMessage;

import java.util.List;

public interface EmployeeMessageService {
    boolean addEmployeeMessage(EmployeeMessage employeeMessage);
    boolean deleteEmployeeMessage(EmployeeMessage employeeMessage);
    EmployeeMessage  queryEmployeeMessageById(EmployeeMessage employeeMessage);
    List<EmployeeMessage> queryAllEmployeeMessage();
}
