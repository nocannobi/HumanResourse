package com.dao;

import com.po.Employee;

public interface AdminDao {
    Employee queryAdminByName(Employee employee);
}
