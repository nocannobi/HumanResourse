package com.serviceImpl;

import com.dao.AdminMessageDao;
import com.po.AdminMessage;
import com.service.AdminMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminMessageServiceImpl implements AdminMessageService {

    @Autowired
    private AdminMessageDao adminMessageDao;

    @Override
    public boolean addAdminMessage(AdminMessage adminMessage) {
        if(adminMessage == null){
            return false;
        }
        return adminMessageDao.addAdminMessage(adminMessage);
    }

    @Override
    public boolean deleteAdminMessage(AdminMessage adminMessage) {
        if(adminMessage == null){
            return false;
        }
        return adminMessageDao.deleteAdminMessage(adminMessage);
    }

    @Override
    public AdminMessage queryAdminMessageById(AdminMessage adminMessage) {
        if(adminMessage == null){
            return null;
        }
        return adminMessageDao.queryAdminMessageById(adminMessage);
    }

    @Override
    public List<AdminMessage> queryAllAdminMessage() {
        return adminMessageDao.queryAllAdminMessage();
    }
}
