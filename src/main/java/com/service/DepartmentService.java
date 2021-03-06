package com.service;

import com.entity.Department;

import java.util.List;

public interface DepartmentService {
    boolean addDepartment(Department department);
    boolean updateDepartment(Department department);
    boolean deleteDepartment(Department department);
    Department queryDepartmentById(Department department);
    Department queryDepartmentByName(String departmentName);
    List<Department> queryAllDepartment();
}
