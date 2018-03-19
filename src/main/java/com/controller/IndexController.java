package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "")
    public String indexPage(){
       /* return "/customer/resume";*/
      /* return "/admin/adminView";*/
      /* return "/admin/employee";*/
       return "/admin/recruitment";
      /* return "/admin/trainingRecord";*/
   /*  return "/employee/employeeRegister";*/
    }
}
