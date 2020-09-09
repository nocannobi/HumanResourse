package com.controller;

import com.entity.Employee;
import com.entity.Wage;
import com.service.EmployeeService;
import com.service.WageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class wageController {
    @Autowired
    private WageService wageService;

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/wage.view")
    public String wagePage(HttpServletRequest request){
        HttpSession session = request.getSession();
        List<Employee> employees = employeeService.queryAllEmployee();
        session.setAttribute("employees",employees);
        return "admin/wage";
    }

    @RequestMapping(value = "/wageView.view")
    public String wageViewPage(HttpServletRequest request){
        HttpSession session = request.getSession();
        List<Wage> wages = wageService.queryAllWage();
        session.setAttribute("wages",wages);
        return "admin/wageView";
    }

    @RequestMapping(value = "/addWage.do")
    public String addWage(@ModelAttribute Wage wage, HttpSession session, Model model){

        boolean addWage = wageService.addWage(wage);

        return "";
    }



}
