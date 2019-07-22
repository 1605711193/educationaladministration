package com.hngy.educationaladministration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticController {

    @GetMapping("/upload")
    public String uploadWork(){
        return "teacher/workapproval/upload";
    }
}
