package com.service;

import com.entity.AdminMessage;

import java.util.List;

public interface AdminMessageService {
    boolean addAdminMessage(AdminMessage adminMessage);
    boolean deleteAdminMessage(AdminMessage adminMessage);
    AdminMessage  queryAdminMessageById(AdminMessage adminMessage);
    List<AdminMessage> queryAllAdminMessage();
}
