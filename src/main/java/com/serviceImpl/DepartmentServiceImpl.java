package com.serviceImpl;

import com.dao.DepartmentDao;
import com.entity.Department;
import com.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public boolean addDepartment(Department department) {
        if(department == null){
            return false;
        }
        return departmentDao.addDepartment(department);
    }

    @Override
    public boolean updateDepartment(Department department) {
        if(department == null){
            return false;
        }
        return departmentDao.updateDepartment(department);
    }

    @Override
    public boolean deleteDepartment(Department department) {
        if(department == null){
            return false;
        }
        return departmentDao.deleteDepartment(department);
    }

    @Override
    public Department queryDepartmentById(Department department) {
        if(department == null){
            return null;
        }
        return departmentDao.queryDepartmentById(department);
    }

    @Override
    public Department queryDepartmentByName(String departmentName) {
        System.out.println(departmentName);
        if(departmentName == null){
            return null;
        }
        return departmentDao.queryDepartmentByName(departmentName);
    }

    @Override
    public List<Department> queryAllDepartment() {
        return departmentDao.queryAllDepartment();
    }
}
