package com.controller;

import com.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "Resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

}
