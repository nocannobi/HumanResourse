package com.controller;


import com.entity.Customer;
import com.entity.Recruitment;
import com.entity.Resume;
import com.service.CustomerService;
import com.service.RecruitmentService;
import com.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private ResumeService resumeService;

    @Autowired
    private RecruitmentService recruitmentService;

    @RequestMapping(value = "/customerRegister.view")
    public String register(){
        return "customer/customerRegister";
    }

    @RequestMapping(value = "/customerLogin.view")
    public String login(){
        return "customer/customerLogin";
    }

    @RequestMapping(value = "/customerView.view")
    public String viewPage(@ModelAttribute Customer customer,HttpServletRequest request, HttpServletResponse response, HttpSession session , Model model){

        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return "customer/customerLogin";
        }
        String customerName=null;
        String customerPassword=null;
        for (Cookie cookie : cookies) {
            if ("loginName".equals(cookie.getName())){
                customerName=cookie.getValue();

            }
            if ("customerPassword".equals(cookie.getName())){
                customerPassword=cookie.getValue();
            }
        }
        customer.setCustomerName(customerName);
        customer.setCustomerPassword(customerPassword);
        customer = customerService.queryCustomerByName(customer);
        if (customer == null){
            model.addAttribute("info","登录失败");
            return "customer/customerLogin";
        }
        session.setAttribute("customer",customer);
        model.addAttribute("info","登录成功");
        return "customer/customerView";
    }

    @RequestMapping(value = "/customerLogin.do")
    public String customerLogin(HttpServletResponse response, String isRemember,Customer customer, HttpSession session , Model model){
        customer = customerService.queryCustomerByCustomer(customer);
        if (customer == null){
            model.addAttribute("info","登录失败");
            return "customer/customerLogin";
        }

        if ("on".equals(isRemember)){
            Cookie cookieName=new Cookie("customerName",customer.getCustomerName());
            cookieName.setMaxAge(60*60*24*7);
            cookieName.setPath("/");
            Cookie cookiePassword=new Cookie("customerPassword",customer.getCustomerPassword());
            cookiePassword.setMaxAge(60*60*24*1);
            cookiePassword.setPath("/");
            response.addCookie(cookieName);
            response.addCookie(cookiePassword);
        }

        if(customer != null ){
           session.setAttribute("customer",customer);
           model.addAttribute("info","登录成功");
           return "customer/customerView";
        }

        model.addAttribute("info","登录失败");
        return "customer/customerLogin";
        }


    @RequestMapping(value = "/customerRegister.do")
    public String customerRegister(@ModelAttribute Customer customer, Resume resume, HttpSession session, Model model){
        if(customer == null){
            model.addAttribute("info","注册失败");
            return "customer/customerRegister";
        }
        boolean addCustomer = customerService.addCustomer(customer);

        if(addCustomer){
            session.setAttribute("customer",customer);
            model.addAttribute("info","注册成功");
            customer = (Customer) session.getAttribute("customer");
            resume.setCustomerId(customer.getId());
            boolean addResume = resumeService.addResume(resume);
            if(addResume){
                session.setAttribute("resume",resume);
                return "customer/customerLogin";
            }
        }
        model.addAttribute("info","注册失败");
        return "customer/customerRegister";
    }

    @RequestMapping(value = "/queryRecruitment.view")
    public String queryRecruitment(HttpServletRequest request){
        HttpSession session = request.getSession();
        List<Recruitment> recruitments = recruitmentService.queryAllRecruitment();
        session.setAttribute("recruitments",recruitments);
        return "customer/recruitment";
    }

    @RequestMapping(value = "/checkName.do")
    @ResponseBody
    public String customerName(@ModelAttribute Customer customer){
        customer = customerService.queryCustomerByName(customer);
        if(customer == null){
            return "is_not_exit";
        }else{
            return "is_exit";
        }
    }

    @RequestMapping(value = "/checkPhone.do")
    @ResponseBody
    public String customerPhone(@ModelAttribute Customer customer){
        customer = customerService.queryCustomerByPhone(customer);
        if(customer == null){
            return "is_not_exit";
        }else{
            return "is_exit";
        }
    }

    @RequestMapping(value = "/checkEmail.do")
    @ResponseBody
    public String customerEmail(@ModelAttribute Customer customer){
        customer = customerService.queryCustomerByEmail(customer);
        if(customer == null){
            return "is_not_exit";
        }else{
            return "is_exit";
        }
    }
}
