package com.controller;

import com.entity.CustomerMessage;
import com.entity.Employee;
import com.entity.EmployeeMessage;
import com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/admin")
public class AdminMessageController {
   @Autowired
   private AdminMessageService adminMessageService;

   @Autowired
   private EmployeeMessageService employeeMessageService;

   @Autowired
    private CustomerMessageService customerMessageService;

   @Autowired
   private CustomerService customerService;

   @Autowired
   private EmployeeService employeeService;


   @RequestMapping(value = "/addMessage2.view")
    public String addMessagePage(){
       return "admin/adminSendMessage";
   }

   @RequestMapping(value = "/addMessage1.do")
   public String addMessage(@ModelAttribute CustomerMessage customerMessage, EmployeeMessage employeeMessage,String id,String people, HttpSession session, Model model){
       Employee admin = (Employee) session.getAttribute("employee");
       int adminId = admin.getId();
       if(people.equals("customer")){
           customerMessage.setAdminId(adminId);
           customerMessage.setCustomerId(Integer.valueOf(id));
            boolean addCustomerMessage = customerMessageService.addCustomerMessage(customerMessage);
            if(addCustomerMessage){
               session.setAttribute("customerMessage",customerMessage);
               model.addAttribute("info","发送成功");
               return "admin/adminView";
            }
            model.addAttribute("info","发送失败");
            return "admin/adminView";
        }
        if(people.equals("employee")){
           employeeMessage.setAdminId(adminId);
           employeeMessage.setEmployeeId(Integer.valueOf(id));
            boolean addEmployeeMessage = employeeMessageService.addEmployeeMessage(employeeMessage);
            if(addEmployeeMessage){
               session.setAttribute("employeeMessage",employeeMessage);
                model.addAttribute("info","发送成功");
                return "admin/adminView";
            }
            model.addAttribute("info","发送失败");
            return "admin/adminView";
        }
       model.addAttribute("info","发送失败");
       return "admin/adminView";
   }




}
