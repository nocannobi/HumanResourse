package com.controller;

import com.po.Department;
import com.po.Employee;
import com.po.Job;
import com.service.DepartmentService;
import com.service.EmployeeService;
import com.service.JobService;
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
@RequestMapping(value = "/admin")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private JobService jobService;

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "department.view")
    public String departmentPage(){
       return "admin/department";
    }

    @RequestMapping(value = "department.do")
    public String addDepartment(@ModelAttribute Department department,Job job, String departmentName, HttpSession session, Model model) {
        Department department2 = departmentService.queryDepartmentByName(departmentName);
        if (department2 != null) {
            job.setDepartmentId(department2.getId());
            boolean addJob = jobService.addJob(job);
            if (addJob) {
                session.setAttribute("job", job);
                model.addAttribute("info", "添加成功");
                return "admin/department";
            }
        }
            boolean addDepartment = departmentService.addDepartment(department);
            if (addDepartment) {
                session.setAttribute("department", department);
                model.addAttribute("info", "添加成功");
                department = (Department) session.getAttribute("department");
                job.setDepartmentId(department.getId());
                boolean addJob1 = jobService.addJob(job);
                if (addJob1) {
                    session.setAttribute("job", job);
                    model.addAttribute("info", "添加成功");
                    return "admin/department";
                } else {
                    model.addAttribute("info", "添加失败");
                    return "admin/department";
                }
            }
            model.addAttribute("info", "添加失败");
            return "admin/department";
        }

    @RequestMapping(value = "/admin/selectEmployee.do")
    public @ResponseBody List<Employee> queryEmployee(@ModelAttribute Employee employee, String jobName, HttpServletRequest request){
        HttpSession session = request.getSession();
        List<Employee> employees = new ArrayList<>();
        Job job = jobService.queryJobByName(jobName);
        employees = employeeService.queryEmployeeByJid(job);
        if(employees.size() > 0){
            System.out.println("查询之后：" + employees);
            session.setAttribute("employees",employees);
            return employees;
        }
        return null;
    }

    @RequestMapping(value = "departmentDetail.view")
    public String departmentDetailPage(HttpServletRequest request){
        HttpSession session = request.getSession();
        List<Department> departments = departmentService.queryAllDepartment();
        session.setAttribute("departments",departments);
        return "admin/departmentView";
    }


}
