package com.controller;

import com.entity.AdminMessage;
import com.entity.Employee;
import com.service.AdminMessageService;
import com.service.EmployeeMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeMessageController {

    @Autowired
    private EmployeeMessageService employeeMessageService;

    @Autowired
    private AdminMessageService adminMessageService;

    @RequestMapping(value = "/addMessage.do")
    public String addMessage(@ModelAttribute AdminMessage adminMessage, HttpSession session, Model model){
        Employee employee =(Employee) session.getAttribute("employee");
        int id = employee.getId();
        adminMessage.setEmployeeId(id);
        boolean addAdminMessage = adminMessageService.addAdminMessage(adminMessage);
        if(addAdminMessage){
            session.setAttribute("addAdminMessage",addAdminMessage);
            model.addAttribute("info","发送成功");
        }
        model.addAttribute("info","发送失败");
        return "employee/employeeView";
    }


}
