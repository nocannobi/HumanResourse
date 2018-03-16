package com.controller;

import com.po.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employeeRegister.view")
    public String registerPage(){
        return "employee/employeeRegister";
    }

    @RequestMapping(value = "/employeeLogin.view")
    public String loginPage() {
        return "employee/employeeLogin";
    }

    @RequestMapping(value = "/employee/employeeRegister.do")
    public String employeeRegister(@ModelAttribute Employee employee, HttpSession session, Model model){
        System.out.println("增加前："+ employee);
        boolean addEmployee = employeeService.addEmployee(employee);
        System.out.println("增加后："+ employee);
        if(addEmployee){
            session.setAttribute("employee",employee);
            model.addAttribute("info","增加成功");
            return "employee/employeeLogin";
        }
        model.addAttribute("info","增加失败");
        return "employee/employeeRegister";
    }

    @RequestMapping(value = "/employee/employeeLogin.do")
    public String employeeLogin(@ModelAttribute Employee employee, HttpSession session, Model model){
        System.out.println("查询前" + employee);
        employee = employeeService.queryEmployeeByName(employee);
        System.out.println("查询后"+ employee);
        if(employee != null){
            session.setAttribute("employee", employee);
            model.addAttribute("info", "登录成功");
            return "employee/employeeView";
        }
        model.addAttribute("info", "登录失败");
        return "employee/employeeLogin";
    }
}
