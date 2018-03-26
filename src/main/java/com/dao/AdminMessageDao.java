package com.dao;

import com.po.AdminMessage;

import java.util.List;

public interface AdminMessageDao {
    boolean addAdminMessage(AdminMessage adminMessage);
    boolean deleteAdminMessage(AdminMessage adminMessage);
    AdminMessage  queryAdminMessageById(AdminMessage adminMessage);
    List<AdminMessage> queryAllAdminMessage();
}
