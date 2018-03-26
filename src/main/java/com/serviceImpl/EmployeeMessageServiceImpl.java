package com.serviceImpl;

import com.dao.EmployeeMessageDao;
import com.po.EmployeeMessage;
import com.service.EmployeeMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeMessageServiceImpl implements EmployeeMessageService {

    @Autowired
    private EmployeeMessageDao employeeMessageDao;

    @Override
    public boolean addEmployeeMessage(EmployeeMessage employeeMessage) {
        if(employeeMessage == null){
            return false;
        }
        return employeeMessageDao.addEmployeeMessage(employeeMessage);
    }

    @Override
    public boolean deleteEmployeeMessage(EmployeeMessage employeeMessage) {
        if(employeeMessage == null){
            return false;
        }
        return employeeMessageDao.deleteEmployeeMessage(employeeMessage);
    }

    @Override
    public EmployeeMessage queryEmployeeMessageById(EmployeeMessage employeeMessage) {
        if(employeeMessage == null){
            return null;
        }
        return employeeMessageDao.queryEmployeeMessageById(employeeMessage);
    }

    @Override
    public List<EmployeeMessage> queryAllEmployeeMessage() {
        return employeeMessageDao.queryAllEmployeeMessage();
    }
}
