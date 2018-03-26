package com.controller;

import com.po.Wage;
import com.service.WageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class wageController {
    @Autowired
    private WageService wageService;

    @RequestMapping(value = "wage.view")
    public String wagePage(){
        return "admin/wage";
    }

    @RequestMapping(value = "wageView.view")
    public String wagePage(HttpServletRequest request){
        HttpSession session = request.getSession();
        List<Wage> wages = wageService.queryAllWage();
        session.setAttribute("wages",wages);
        return "admin/wageView";
    }



}
