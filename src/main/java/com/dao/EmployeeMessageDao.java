package com.dao;

import com.po.EmployeeMessage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMessageDao {
    boolean addEmployeeMessage(EmployeeMessage employeeMessage);
    boolean deleteEmployeeMessage(EmployeeMessage employeeMessage);
    EmployeeMessage  queryEmployeeMessageById(EmployeeMessage employeeMessage);
    List<EmployeeMessage> queryAllEmployeeMessage();
}
