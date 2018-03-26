package com.controller;

import com.po.Department;
import com.po.Job;
import com.service.DepartmentService;
import com.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/admin")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private JobService jobService;

    @RequestMapping(value = "department.view")
    public String departmentPage(){
       return "admin/department";
    }

    @RequestMapping(value = "department.do")
    public String addDepartment(@ModelAttribute Department department,Job job, String departmentName, HttpSession session, Model model) {
        System.out.println("1"+department);
        Department department2 = departmentService.queryDepartmentByName(departmentName);
        System.out.println("2"+department2);
        if (department2 != null) {
            System.out.println("1"+job);
            job.setDepartmentId(department2.getId());
            System.out.println("2"+job);
            boolean addJob = jobService.addJob(job);
            if (addJob) {
                session.setAttribute("job", job);
                model.addAttribute("info", "添加成功");
                return "admin/department";
            }
        }
        System.out.println("3" + department);
            boolean addDepartment = departmentService.addDepartment(department);
        System.out.println("4" + department);
            if (addDepartment) {
                session.setAttribute("department", department);
                model.addAttribute("info", "添加成功");
                department = (Department) session.getAttribute("department");
                job.setDepartmentId(department.getId());
                System.out.println("3"+job);
                boolean addJob1 = jobService.addJob(job);
                System.out.println("4"+job);
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

}
