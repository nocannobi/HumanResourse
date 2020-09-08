package com.dao;

import com.po.Employee;
import com.po.Job;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeDao {
    boolean addEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    boolean deleteEmployee(Employee employee);
    Employee queryEmployeeByName(Employee employee);
    Employee queryEmployeeByEmployee(Employee employee);
    Employee queryAdminByName(Employee employee);
    Employee queryEmployeeById(Employee employee);
    List<Employee> queryAllEmployeeByDetail();
    List<Employee> queryAllEmployee();
    List<Employee> queryAllAdmin();
    List<Employee> queryEmployeeByJid(Job job);
}
