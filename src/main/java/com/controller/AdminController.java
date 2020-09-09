package com.controller;

import com.entity.Attendance;
import com.entity.Customer;
import com.entity.Employee;
import com.entity.EmployeeDetail;
import com.service.AttendanceService;
import com.service.CustomerService;
import com.service.EmployeeDetailService;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private EmployeeDetailService employeeDetailService;

    @Autowired
    private AttendanceService attendanceService;

    @RequestMapping(value = "/adminView.view")
    public String adminViewPage(){
       // return "admin/adminView";
        return "admin/adminView";
    }

    @RequestMapping(value = "attendance.view")
    public String attendancePage(HttpServletRequest request){
        HttpSession session = request.getSession();
        List<Attendance> attendances = attendanceService.queryAllAttendance();
        session.setAttribute("attendances",attendances);
        return "admin/attendance";
    }

    @RequestMapping(value = "adminLogin.do")
    public String adminLogin(@ModelAttribute Employee employee, HttpSession session, Model model){
        employee.setEmployeeIsAdmin(1);
        employee = employeeService.queryAdminByName(employee);
        if(employee != null){
           session.setAttribute("employee", employee);
           return "admin/adminView";
        }
        model.addAttribute("info","登录失败");
        return "admin/adminLogin";
    }

     @RequestMapping(value = "employee.view")
     public String employeePage(HttpServletRequest request){
        HttpSession session = request.getSession();
         List<EmployeeDetail> employeeDetails = employeeDetailService.queryAllEmployeeDetail();
         session.setAttribute("employeeDetails",employeeDetails);
         return "admin/employeeView";
     }

     @RequestMapping(value = "selectPeople.do")
     public @ResponseBody <T> List people(String people, HttpServletRequest request){
        HttpSession session = request.getSession();
        if(people.equals("customer")){
            List<Customer> customers = customerService.queryAllCustomer();
            session.setAttribute("customers",customers);
            return customers;
        }
        if(people.equals("employee")){
            List<Employee> employees = employeeService.queryAllEmployee();
            session.setAttribute("employees",employees);
            return employees;
        }
        return null;
     }

}
