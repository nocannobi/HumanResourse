package com.serviceImpl;

import com.dao.EmployeeDao;
import com.po.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public boolean addEmployee(Employee employee) {
        if(employee == null){
            return false;
        }
        return employeeDao.addEmployee(employee);
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        if(employee == null) {
            return false;
        }
        return employeeDao.updateEmployee(employee);
    }

    @Override
    public boolean deleteEmployee(Employee employee) {
        if(employee == null){
            return false;
        }
        return employeeDao.deleteEmployee(employee);
    }

    @Override
    public Employee queryEmployeeByName(Employee employee) {
        if(employee == null){
            return null;
        }
        return employeeDao.queryEmployeeByName(employee);
    }

    @Override
    public Employee queryEmployeeById(Employee employee) {
        if(employee == null){
          return null;
        }
        return employeeDao.queryEmployeeById(employee);
    }

    @Override
    public List<Employee> queryAllEmployee() {
        return employeeDao.queryAllEmployee();
    }
}
