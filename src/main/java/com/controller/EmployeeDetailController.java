package com.controller;

import com.po.EmployeeDetail;
import com.service.EmployeeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "EmployeeDetail")
public class EmployeeDetailController {

    @Autowired
    private EmployeeDetailService employeeDetailService;

    @RequestMapping(value = "/employeeDetail.view")
    public String employeeDetailPage(){
      return "employee/employeeDetail" ;
    }


}
