package com.controller;

import com.po.RewardPunishment;
import com.service.RewardPunishmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class RewardPunishmentController {

  @Autowired
  private RewardPunishmentService rewardPunishmentService;

  @RequestMapping(value = "reward.view")
  public String rewardPage(){
      return "admin/rewardPunishment";
  }

  @RequestMapping(value = "rewardView.view")
  public String rewardViewPage(HttpServletRequest request){
      HttpSession session = request.getSession();
      List<RewardPunishment> rewardPunishments = rewardPunishmentService.queryAllRewardPunishment();
      session.setAttribute("rewardPunishments",rewardPunishments);
      return "admin/rewardPunishmentView";
  }

}
