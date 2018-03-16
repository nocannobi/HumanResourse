package com.controller;


import com.po.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customerRegister.view")
    public String register(){
        return "customer/customerRegister";
    }

    @RequestMapping(value = "/customerLogin.view")
    public String login(){
        return "customer/customerLogin";
    }

    @RequestMapping(value = "/customerView.view")
    public String viewPage(){
        return "customer/customerView";
    }

    @RequestMapping(value = "/customerLogin.do")
    public String customerLogin(@ModelAttribute Customer customer, HttpSession session , Model model){
        System.out.println("增加之前：" + customer);
        customer = customerService.queryCustomerByName(customer);
        System.out.println("增加之后："+ customer);
        if(customer != null){
           session.setAttribute("customer",customer);
           model.addAttribute("info","登录成功");
           return "customer/customerView";
        }
        model.addAttribute("info","登录失败");
        return "customer/customerLogin";
    }

    @RequestMapping(value = "/customerRegister.do")
    public String customerRegister(@ModelAttribute Customer customer, HttpSession session, Model model){
        System.out.println("增加之前："+ customer);
        boolean addCustomer = customerService.addCustomer(customer);
        System.out.println("增加之后："+ customer);
        if(addCustomer){
            session.setAttribute("customer",customer);
            model.addAttribute("info","注册成功");
            return "customer/customerLogin";
        }
        model.addAttribute("info","注册失败");
        return "customer/customerRegister";
    }
}
