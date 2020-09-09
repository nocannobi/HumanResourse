package com.service;

import com.entity.Customer;

import java.util.List;

public interface CustomerService {
    boolean addCustomer(Customer customer);
    boolean updateCustomer(Customer customer);
    boolean deleteCustomer(Customer customer);
    Customer queryCustomerByName(Customer customer);
    Customer queryCustomerByCustomer(Customer customer);
    Customer queryCustomerByPhone2(Customer customer);
    Customer queryCustomerByEmail2(Customer customer);
    Customer queryCustomerByPhone(Customer customer);
    Customer queryCustomerByEmail(Customer customer);
    Customer queryCustomerById(Customer customer);
    List<Customer> queryAllCustomer();
}
