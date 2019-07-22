package com.hngy.educationaladministration.controller;

import com.hngy.educationaladministration.entity.Msg;
import com.hngy.educationaladministration.entity.Teacher;
import com.hngy.educationaladministration.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @RequestMapping(value = {"","/loginPage"})
    public String loginPage(){
        return "teacher/login";
    }

    @GetMapping("/index")
    public String homePage(){
        return "teacher/teacherInfo/teacherIndex";
    }

    @GetMapping("/login")
    @ResponseBody
    public Msg login(String name, String pwd, HttpSession httpSession){
        System.out.println(name+" "+pwd);
        int flag = teacherService.teacherDL(name, pwd);
        System.out.println(flag);
        if(flag == 200){
            httpSession.setAttribute("teacherInfo", teacherService.selectTeacher(name));
        }
        return Msg.success().add("info", flag);
    }

}
