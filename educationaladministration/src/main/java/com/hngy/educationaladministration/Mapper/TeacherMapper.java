package com.hngy.educationaladministration.Mapper;


import com.hngy.educationaladministration.entity.Teacher;
import com.hngy.educationaladministration.entity.TeacherExample;
import com.hngy.educationaladministration.entity.TeacherWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    long countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TeacherWithBLOBs record);

    int insertSelective(TeacherWithBLOBs record);

    List<TeacherWithBLOBs> selectByExampleWithBLOBs(TeacherExample example);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectTeacherInfo(String username);

    TeacherWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TeacherWithBLOBs record, @Param("example") TeacherExample example);

    int updateByExampleWithBLOBs(@Param("record") TeacherWithBLOBs record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(TeacherWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TeacherWithBLOBs record);

    int updateByPrimaryKey(Teacher record);
}