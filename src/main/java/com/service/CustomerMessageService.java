package com.service;

import com.entity.CustomerMessage;

import java.util.List;

public interface CustomerMessageService {
    boolean addCustomerMessage(CustomerMessage customerMessage);
    boolean deleteCustomerMessage(CustomerMessage customerMessage);
    CustomerMessage queryCustomerMessageById(CustomerMessage customerMessage);
    List<CustomerMessage> queryAllCustomerMessage();
}
