package com.dao;

import com.po.CustomerMessage;

import java.util.List;

public interface CustomerMessageDao {
    boolean addCustomerMessage(CustomerMessage customerMessage);
    boolean deleteCustomerMessage(CustomerMessage customerMessage);
    CustomerMessage queryCustomerMessageById(CustomerMessage customerMessage);
    List<CustomerMessage> queryAllCustomerMessage();
}
