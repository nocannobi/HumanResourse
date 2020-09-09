package com.service;


import com.entity.Employee;
import com.entity.Job;

import java.util.List;

public interface EmployeeService {

    boolean addEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    boolean deleteEmployee(Employee employee);
    Employee queryEmployeeByEmployee(Employee employee);
    Employee queryEmployeeByName(Employee employee);
    Employee queryAdminByName(Employee employee);
    Employee queryEmployeeById(Employee employee);
    List<Employee> queryAllEmployeeByDetail();
    List<Employee> queryAllEmployee();
    List<Employee> queryAllAdmin();
    List<Employee> queryEmployeeByJid(Job job);

}
