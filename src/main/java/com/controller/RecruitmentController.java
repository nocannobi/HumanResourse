package com.controller;

import com.po.Department;
import com.po.Employee;
import com.po.Job;
import com.po.Recruitment;
import com.service.DepartmentService;
import com.service.JobService;
import com.service.RecruitmentService;
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
public class RecruitmentController {
    @Autowired
    private RecruitmentService recruitmentService;

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private JobService jobService;

    @RequestMapping(value = "queryRecruitment.view")
    public String queryRecruitment(@ModelAttribute Recruitment recruitment,HttpSession session,String id){
        recruitment.setId(Integer.valueOf(id));
        System.out.println("查询："+recruitment);
        recruitment = recruitmentService.queryRecruitmentById(recruitment);
        session.setAttribute("recruitment",recruitment);
        return "admin/recruitmentDetail";
    }

    @RequestMapping(value = "recruitmentView.view")
    public String recruitmentViewPage(HttpServletRequest request){
        HttpSession session = request.getSession();
        List<Recruitment> recruitments = recruitmentService.queryAllRecruitment();
        System.out.println(recruitments);
        if(recruitments.size()>0){
            session.setAttribute("recruitments",recruitments);
            return "/admin/recruitmentView";
        }
        return "/admin/recruitmentView";
    }

    @RequestMapping(value = "recruitment.view")
    public String recruitmentPage(HttpServletRequest request ){
        HttpSession session = request.getSession();
        List<Department> departments = departmentService.queryAllDepartment();
        System.out.println(departments);
        if(departments.size() > 0){
            session.setAttribute("departments",departments);
        }else {
            return null;
        }
        return "admin/recruitment";
    }

    @RequestMapping(value = "selectJob.do")
    public @ResponseBody List<Job> queryDepartment(@ModelAttribute Job job, String departmentName, HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        List<Job> jobs = new ArrayList<>();
        Department department = departmentService.queryDepartmentByName(departmentName);
        if(department == null){
            return null;
        }else {
            job.setDepartmentId(department.getId());
            jobs = jobService.queryJobByDid(job);
            session.setAttribute("jobs", jobs);
        }
         return jobs;
    }



    @RequestMapping(value = "recruitment.do")
    public String addRecruitment(@ModelAttribute Recruitment recruitment, HttpSession session, Model model){
        System.out.println("----"+recruitment);
        boolean addRecruitment = recruitmentService.addRecruitment(recruitment);
        if(addRecruitment){
            session.setAttribute("recruitment",recruitment);
            model.addAttribute("info", "添加成功");
           return "admin/recruitment" ;
        }
        model.addAttribute("info","添加失败");
        return "admin/recruitment";
    }

}
