package com.dao;

import com.entity.AdminMessage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMessageDao {
    boolean addAdminMessage(AdminMessage adminMessage);
    boolean deleteAdminMessage(AdminMessage adminMessage);
    AdminMessage  queryAdminMessageById(AdminMessage adminMessage);
    List<AdminMessage> queryAllAdminMessage();
}
