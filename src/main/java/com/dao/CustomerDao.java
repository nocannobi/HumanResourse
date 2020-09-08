package com.dao;

import com.po.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerDao{
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
