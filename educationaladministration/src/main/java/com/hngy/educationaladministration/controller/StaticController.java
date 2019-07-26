package com.hngy.educationaladministration.controller;

import com.hngy.educationaladministration.entity.*;
import com.hngy.educationaladministration.service.StaticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class StaticController {

    @Autowired
    StaticService staticService;

    @GetMapping("/upload")
    public String uploadWork() {
        return "teacher/workapproval/upload";
    }

    //查询出差类型
    @GetMapping("/work_type")
    @ResponseBody
    public Msg fun1() {
        List<Workapprovaltype> list = staticService.select_allWorkapprovaltype();
        return Msg.success().add("workInfo", list);
    }

    //提交出差申请
    @PostMapping("/upload_work")
    @ResponseBody
    public Msg fun2(String idType, String worktitle, String beginDate, String endDate, String location,
                    String member, HttpSession httpSession) throws ParseException {
        //获取教师信息
        Teacher teacher = (Teacher) httpSession.getAttribute("teacherInfo");

        //字符串转换为时间
        Date currentTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       Date start = sdf.parse(beginDate);
       Date end = sdf.parse(endDate);
        System.out.println(currentTime);

        WorkapprovalWithBLOBs workapprovalWithBLOBs = new WorkapprovalWithBLOBs();
        workapprovalWithBLOBs.setIdType(Long.parseLong(idType));
        workapprovalWithBLOBs.setIdTeacher(teacher.getId());
        workapprovalWithBLOBs.setWorktitle(worktitle);
        workapprovalWithBLOBs.setBeginDate(start);
        workapprovalWithBLOBs.setEndDate(end);
        workapprovalWithBLOBs.setLocation(location);
        workapprovalWithBLOBs.setMember(member);
        workapprovalWithBLOBs.setWorkcontent("待定");
        workapprovalWithBLOBs.setAppovalflag(0);
        workapprovalWithBLOBs.setSumbitdate(currentTime);


        System.out.println(idType + " " + worktitle + " " + beginDate + " " + endDate + " " + location + " " + member);
        return Msg.success();
    }


}
