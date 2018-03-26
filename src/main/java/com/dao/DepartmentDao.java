package com.dao;

import com.po.Department;

import java.util.List;

public interface DepartmentDao {
    boolean addDepartment(Department department);
    boolean updateDepartment(Department department);
    boolean deleteDepartment(Department department);
    Department queryDepartmentById(Department department);
    Department queryDepartmentByName(String departmentName);
    List<Department> queryAllDepartment();
}
