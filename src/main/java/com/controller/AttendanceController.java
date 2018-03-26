package com.controller;

import com.po.Attendance;
import com.po.Employee;
import com.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;

@Controller
@RequestMapping(value = "/employee")
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;

    @RequestMapping(value = "attendance.view")
    public String attendancePage(){
        return "employee/attendance";
    }

    @RequestMapping(value = "addAttendance.do")
    public String addAttendance(@ModelAttribute Attendance attendance, HttpSession session, Model model){
        System.out.println("55:" + attendance);
        Object employee = session.getAttribute("employee");
        if(employee instanceof Employee){
            int id = ((Employee) employee).getId();
            attendance.setEmployeeId(id);
            boolean addAttendance = attendanceService.updateAttendance(attendance);
            if(addAttendance){
                session.setAttribute("attendance",attendance);
                attendance = (Attendance) session.getAttribute("attendance");
                Timestamp punchWorkTime = attendance.getPunchWorkTime();
                /*Timestamp workTime = attendance.getWorkTime();*/
                String s = punchWorkTime.toString();
                model.addAttribute("info","签到成功");
                return "employee/employeeView";
            }
            model.addAttribute("info","签到失败");
            return "employee/employeeView";
        }
        return "employee/employeeView";
    }
}
