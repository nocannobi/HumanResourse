package com.dao;

import com.po.Employee;

import java.util.List;

public interface EmployeeDao {
    boolean addEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    boolean deleteEmployee(Employee employee);
    Employee queryEmployeeByName(Employee employee);
    Employee queryEmployeeById(Employee employee);
    List<Employee> queryAllEmployee();
}
