package com.controller;

import com.entity.Employee;
import com.entity.RewardPunishment;
import com.service.EmployeeService;
import com.service.RewardPunishmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class RewardPunishmentController {

  @Autowired
  private RewardPunishmentService rewardPunishmentService;

  @Autowired
  private EmployeeService employeeService;

  @RequestMapping(value = "/reward.view")
  public String rewardPage(HttpServletRequest request){
      HttpSession session = request.getSession();
      List<Employee> employees = employeeService.queryAllEmployee();
      System.out.println(employees);
      session.setAttribute("employees",employees);
      return "admin/rewardPunishment";
  }

  @RequestMapping(value = "/rewardView.view")
  public String rewardViewPage(HttpServletRequest request){
      HttpSession session = request.getSession();
      List<RewardPunishment> rewardPunishments = rewardPunishmentService.queryAllRewardPunishment();
      session.setAttribute("rewardPunishments",rewardPunishments);
      return "admin/rewardPunishmentView";
  }

  @RequestMapping(value = "/addReward.do")
  public String addReward(@ModelAttribute RewardPunishment rewardPunishment,HttpSession session, Model model){
      System.out.println("增加之前："+ rewardPunishment);
      boolean addRewardPunishment = rewardPunishmentService.addRewardPunishment(rewardPunishment);
      if(addRewardPunishment){
          session.setAttribute("rewardPunishment",rewardPunishment);
          model.addAttribute("info","增加成功");
          return "admin/rewardPunishment";
      }
      model.addAttribute("info","增加失败");
      return "admin/rewardPunishment";
  }

}
