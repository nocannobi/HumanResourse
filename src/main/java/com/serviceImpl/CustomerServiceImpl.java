package com.serviceImpl;

import com.dao.CustomerDao;
import com.po.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "CustomerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public boolean addCustomer(Customer customer) {
        if(customer == null){
            return false;
        }
        return customerDao.addCustomer(customer);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        if(customer == null){
            return false;
        }
        return customerDao.updateCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(Customer customer) {
        if(customer == null){
            return false;
        }
        return customerDao.deleteCustomer(customer);
    }

    @Override
    public Customer queryCustomerByName(Customer customer) {
        if(customer == null){
           return null;
        }
        return customerDao.queryCustomerByName(customer);
    }

    @Override
    public Customer queryCustomerById(Customer customer) {
        if(customer == null){
           return null;
        }
        return customerDao.queryCustomerById(customer);
    }

    @Override
    public List<Customer> queryAllCustomer() {
        return queryAllCustomer();
    }
}
