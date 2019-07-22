package com.hngy.educationaladministration.service.serviceImpl;

import com.hngy.educationaladministration.Mapper.TeacherMapper;
import com.hngy.educationaladministration.entity.Teacher;
import com.hngy.educationaladministration.entity.TeacherExample;
import com.hngy.educationaladministration.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public int teacherDL(String name, String pwd) {
        Teacher teacher = selectTeacher(name);
        if(teacher == null){
            return 300;//账号错误
        }else if(teacher != null && teacher.getPwd().equals(pwd)){
            return 200;//账号密码正确
        }else{
            return 100;//密码错误
        }
    }

    @Override
    public Teacher selectTeacher(String username) {
        return teacherMapper.selectTeacherInfo(username);
    }
}

