package com.controller;

import com.po.*;
import com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeDetailService employeeDetailService;

    @Autowired
    private TrainingRecordService trainingRecordService;

    @Autowired
    private RewardPunishmentService rewardPunishmentService;

    @Autowired
    private WageService wageService;
    @Autowired
    private JobService jobService;

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "employeeRegister.view")
    public String registerPage(){
        return "employee/employeeRegister";
    }

    @RequestMapping(value = "employeeLogin.view")
    public String loginPage() {
        return "employee/employeeLogin";
    }

    @RequestMapping(value = "employeeView.view")
    public String viewPage(){
        return "employee/employeeView";
    }


    @RequestMapping(value = "send.view")
    public String sendMessagePage(HttpServletRequest request){
        HttpSession session = request.getSession();
        List<Employee> employees = employeeService.queryAllAdmin();
        session.setAttribute("employees",employees);
        return "employee/employeeSendMessage";
    }


    @RequestMapping(value = "department.view")
    public String departmentPage(HttpServletRequest request){
        HttpSession session = request.getSession();
        List<Department> departments = departmentService.queryAllDepartment();
        session.setAttribute("departments",departments);
        return "employee/department";
    }


    @RequestMapping(value = "detailView.view")
    public String detailViewPage(HttpServletRequest request){
        HttpSession session = request.getSession();
        Employee employee = (Employee) session.getAttribute("employee");
        EmployeeDetail employeeDetail = employeeDetailService.queryEmployeeDetailByEid(employee);
        session.setAttribute("employeeDetail",employeeDetail);
        return "employee/employeeDetail";

    }

    @RequestMapping(value = "recordView.view")
    public String recordViewPage(HttpServletRequest request){
        HttpSession session = request.getSession();
        Employee employee = (Employee) session.getAttribute("employee");
        List<TrainingRecord> trainingRecords = trainingRecordService.queryTrainingRecordByEid(employee);
        session.setAttribute("trainingRecords",trainingRecords);
        return "employee/trainingRecord";

    }

    @RequestMapping(value = "rewardView.view")
    public String rewardViewPage(HttpServletRequest request){
        HttpSession session = request.getSession();
        Employee employee = (Employee) session.getAttribute("employee");
        List<RewardPunishment> rewardPunishments = rewardPunishmentService.queryRewardPunishmentByEid(employee);
        session.setAttribute("rewardPunishments",rewardPunishments);
        return "employee/rewardPunishment";

    }

    @RequestMapping(value = "wageView.view")
    public String wageViewPage(HttpServletRequest request){
        HttpSession session = request.getSession();
        Employee employee = (Employee) session.getAttribute("employee");
        List<Wage> wages = wageService.queryWageByEid(employee);
        session.setAttribute("wages",wages);
        return "employee/wage";

    }


    @RequestMapping(value = "employeeRegister.do")
    public String employeeRegister(@ModelAttribute Employee employee, HttpSession session, Model model){
        System.out.println("增加之前："+ employee);
        boolean addEmployee = employeeService.addEmployee(employee);
        if(addEmployee){
            session.setAttribute("employee",employee);
            model.addAttribute("info","增加成功");
            return "employee/employeeLogin";
        }
        model.addAttribute("info","增加失败");
        return "employee/employeeRegister";
    }

    @RequestMapping(value = "employeeLogin.do")
    public String employeeLogin(@ModelAttribute Employee employee,Attendance attendance, HttpSession session, Model model){
        employee = employeeService.queryEmployeeByName(employee);
        if(employee != null){
            session.setAttribute("employee",employee);
            model.addAttribute("info","登录成功");
            return "employee/employeeView";
        }
        model.addAttribute("info", "登录失败");
        return "employee/employeeLogin";
    }

    @RequestMapping(value = "checkEmployeeName.do")
    @ResponseBody
    public String checkEmployee(@ModelAttribute Employee employee){
        employee = employeeService.queryEmployeeByName(employee);
        if(employee == null){
            return "is_not_exit";
        }else{
            return "is_exit";
        }
    }
}
