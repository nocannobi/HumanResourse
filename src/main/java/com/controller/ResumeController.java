package com.controller;

import com.po.Resume;
import com.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "Resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @RequestMapping(value = "/resume.view")
    public String resumePage(){
        return "customer/resume";
    }

    @RequestMapping(value = "/customerView.view")
    public String viewPage(){
        return "customer/customerView";
    }

    @RequestMapping(value = "/customer/resume.do")
    public String addResume(@ModelAttribute Resume resume, HttpSession session, Model model){
        boolean addResume = resumeService.addResume(resume);
        if(addResume){
            session.setAttribute("resume", resume);
            model.addAttribute("info","提交成功");
            return "customer/customerView";
        }
        model.addAttribute("info","提交失败");
        return "customer/resume";
    }
}
