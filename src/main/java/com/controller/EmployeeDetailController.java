package com.controller;

import com.po.Department;
import com.po.Employee;
import com.po.EmployeeDetail;
import com.po.Job;
import com.service.DepartmentService;
import com.service.EmployeeDetailService;
import com.service.EmployeeService;
import com.service.JobService;
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
public class EmployeeDetailController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmployeeDetailService employeeDetailService;

    @Autowired
    private JobService jobService;

    @RequestMapping(value = "employeeDetail.view")
    public String employeeDetailPage(HttpServletRequest request){
      HttpSession session = request.getSession();
        List<Employee> employees = employeeService.queryAllEmployeeByDetail();
        List<Department> departments = departmentService.queryAllDepartment();
        if(departments.size() > 0){
            session.setAttribute("departments",departments);
        }else {
            return null;
        }
        if(employees.size() > 0 ){
            session.setAttribute("employees",employees);
            return "admin/employeeDetail";
        }
        return "admin/employeeView";
    }

    @RequestMapping(value = "update.do")
    public String updateDetail(@ModelAttribute EmployeeDetail employeeDetail,Employee employee, Job job, HttpSession session, Model model){
        System.out.println("添加之前："+ employeeDetail);
        boolean addEmployeeDetail = employeeDetailService.addEmployeeDetail(employeeDetail);
        System.out.println("添加之后："+ employeeDetail);
        String employeeJob = employeeDetail.getEmployeeJob();
        int employeeId = employeeDetail.getEmployeeId();
        job = jobService.queryJobByName(employeeJob);
        employee.setId(employeeId);
        employee.setJobId(job.getId());
        employee.setDetailIsWrite(1);
        employeeService.updateEmployee(employee);
        if(addEmployeeDetail){
            session.setAttribute("employeeDetail",employeeDetail);
            model.addAttribute("info","保存成功");
            return "admin/adminView";
        }
        model.addAttribute("info", "保存失败");
        return "admin/employeeDetail";


    }

}
