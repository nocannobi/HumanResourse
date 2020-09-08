package com.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan("com.*")
@MapperScan("com.dao")
public class App {

    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public String home(){
        return "Hello World";
    }
}
