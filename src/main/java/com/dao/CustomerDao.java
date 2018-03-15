package com.dao;

import com.po.Customer;

import java.util.List;

public interface CustomerDao{
    boolean addCustomer(Customer customer);
    boolean updateCustomer(Customer customer);
    boolean deleteCustomer(Customer customer);
    Customer queryCustomerByName(Customer customer);
    Customer queryCustomerById(Customer customer);
    List<Customer> queryAllCustomer();
}
