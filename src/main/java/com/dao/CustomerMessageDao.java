package com.dao;

import com.entity.CustomerMessage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMessageDao {
    boolean addCustomerMessage(CustomerMessage customerMessage);
    boolean deleteCustomerMessage(CustomerMessage customerMessage);
    CustomerMessage queryCustomerMessageById(CustomerMessage customerMessage);
    List<CustomerMessage> queryAllCustomerMessage();
}
