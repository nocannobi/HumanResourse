package com.controller;

import com.entity.Department;
import com.entity.EmployeeDetail;
import com.entity.Training;
import com.entity.TrainingRecord;
import com.service.DepartmentService;
import com.service.EmployeeDetailService;
import com.service.TrainingRecordService;
import com.service.TrainingService;
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
public class TrainingController {

    @Autowired
    private TrainingService trainingService;

    @Autowired
    private TrainingRecordService trainingRecordService;

    @Autowired
    private EmployeeDetailService employeeDetailService;

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/training.view")
    public String trainingPage(){
        return "admin/training";
    }

    @RequestMapping(value = "/trainingRecord.view")
    public String trainingRecordPage(HttpServletRequest request){
        HttpSession session = request.getSession();
        List<Training> trainings = trainingService.queryAllTraining();
        session.setAttribute("trainings",trainings);
        return "admin/trainingRecord";
    }

    @RequestMapping(value = "/employeeTrainingRecord.view")
    public String employeeTrainingRecordPage(HttpServletRequest request){
        HttpSession session = request.getSession();
        List<TrainingRecord> trainingRecords = trainingRecordService.queryAllTrainingRecord();
        List<EmployeeDetail> employeeDetails = employeeDetailService.queryAllEmployeeDetail();
        List<Department> departments = departmentService.queryAllDepartment();
        session.setAttribute("departments",departments);
        session.setAttribute("trainingRecords",trainingRecords);
        session.setAttribute("employeeDetails", employeeDetails);
        return "admin/employeeTrainingRecord";
    }

    @RequestMapping(value = "/addEmployee.do")
    public String addTrainingRecord(@ModelAttribute TrainingRecord trainingRecord,String trainingName, Model model,HttpSession session){
        Training training = trainingService.queryTrainingByName(trainingName);
        trainingRecord.setTrainingId(training.getId());
        boolean addTrainingRecord = trainingRecordService.addTrainingRecord(trainingRecord);
        if(addTrainingRecord){
           session.setAttribute("trainingRecord", trainingRecord);
           model.addAttribute("info","增加成功");
           return "admin/employeeTrainingRecord";
        }
        model.addAttribute("info","增加失败");
        return "admin/employeeTrainingRecord";
    }


    @RequestMapping(value = "/addTraining.do")
    public String addTraining(@ModelAttribute Training training , HttpSession session, Model model){
        System.out.println("增加之前：" + training);
        boolean addTraining = trainingService.addTraining(training);
        System.out.println("增加之后：" + training);
        if(addTraining){
          session.setAttribute("training",training);
          model.addAttribute("info","增加成功");
          return "admin/training";
        }
        model.addAttribute("info","增加失败");
        return "admin/training";
    }
}
