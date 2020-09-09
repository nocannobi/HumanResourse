package com.dao;

import com.entity.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentDao {
    boolean addDepartment(Department department);
    boolean updateDepartment(Department department);
    boolean deleteDepartment(Department department);
    Department queryDepartmentById(Department department);
    Department queryDepartmentByName(String departmentName);
    List<Department> queryAllDepartment();
}
