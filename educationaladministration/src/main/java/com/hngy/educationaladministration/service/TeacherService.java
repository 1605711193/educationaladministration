package com.hngy.educationaladministration.service;

import com.hngy.educationaladministration.entity.Teacher;

public interface TeacherService {

    Teacher selectTeacher(String username);//以用户登入id查询

    int teacherDL(String name, String pwd);// 教师登入

}
