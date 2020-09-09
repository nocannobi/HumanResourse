package com.controller;

import com.entity.Customer;
import com.entity.Resume;
import com.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/customer")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @RequestMapping(value = "/resume.view")
    public String resumePage(){
        return "customer/resume";
    }


    @RequestMapping(value = "/resumeView.view")
    public String resumeViewPage(@ModelAttribute Resume resume, Model model,HttpSession session){
        Object customer = session.getAttribute("customer");
        System.out.println("1:" + customer);
        if(customer instanceof Customer){
            resume.setCustomerId(((Customer) customer).getId());
        }
        System.out.println("2:" + resume);
        resume = resumeService.queryResumeByCid(resume);
        if(resume == null){
            model.addAttribute("info","查询失败");
            return "customer/customerView";
        }
        session.setAttribute("resume",resume);
        return "customer/resumeView";
    }


    @RequestMapping(value = "/resume.do")
    public String addResume(@ModelAttribute Resume resume, String province,String city ,String country, String street,HttpSession session, Model model){
        String address = province + ","+ city +","+ country +","+ street;
        resume.setAddress(address);
       /* Object customer = session.getAttribute("customer");*/
        System.out.println("1"+resume);
        boolean updateResume = resumeService.updateResume(resume);
        System.out.println("2" + resume);
        if(updateResume){
            session.setAttribute("resume", resume);
            model.addAttribute("info","提交成功");
            return "customer/customerView";
        }
        model.addAttribute("info","提交失败");
        return "customer/resume";
    }


}
