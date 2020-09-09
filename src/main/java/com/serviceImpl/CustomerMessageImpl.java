package com.serviceImpl;

import com.dao.CustomerMessageDao;
import com.entity.CustomerMessage;
import com.service.CustomerMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerMessageImpl implements CustomerMessageService {

    @Autowired
    private CustomerMessageDao customerMessageDao;

    @Override
    public boolean addCustomerMessage(CustomerMessage customerMessage) {
        if(customerMessage == null){
            return false;
        }
        return customerMessageDao.addCustomerMessage(customerMessage);
    }

    @Override
    public boolean deleteCustomerMessage(CustomerMessage customerMessage) {
        if(customerMessage == null){
            return false;
        }
        return customerMessageDao.deleteCustomerMessage(customerMessage);
    }

    @Override
    public CustomerMessage queryCustomerMessageById(CustomerMessage customerMessage) {
        if(customerMessage == null){
            return null;
        }
        return customerMessageDao.queryCustomerMessageById(customerMessage);
    }

    @Override
    public List<CustomerMessage> queryAllCustomerMessage() {
        return customerMessageDao.queryAllCustomerMessage();
    }
}
