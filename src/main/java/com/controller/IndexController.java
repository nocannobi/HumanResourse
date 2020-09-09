package com.controller;

import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "")
    public String indexPage(){
      return "admin/adminLogin";
     /*   return "/customer/customerLogin";*/
       /* return "/customer/resume";*/
      /* return "/admin/adminView";*/
      /* return "/admin/employee";*/
      /* return "/admin/department";*/
     /* return "customer/customerRegister";*/
     /*  return "/admin/recruitment";*/
      /* return "/admin/trainingRecord";*/
    /* return "employee/employeeRegister";*/
    }


}
