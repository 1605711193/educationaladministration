package com.hngy.educationaladministration.Mapper;

import com.hngy.educationaladministration.entity.Workapprovaldata;
import com.hngy.educationaladministration.entity.WorkapprovaldataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkapprovaldataMapper {
    long countByExample(WorkapprovaldataExample example);

    int deleteByExample(WorkapprovaldataExample example);

    int insert(Workapprovaldata record);

    int insertSelective(Workapprovaldata record);

    List<Workapprovaldata> selectByExampleWithBLOBs(WorkapprovaldataExample example);

    List<Workapprovaldata> selectByExample(WorkapprovaldataExample example);

    int updateByExampleSelective(@Param("record") Workapprovaldata record, @Param("example") WorkapprovaldataExample example);

    int updateByExampleWithBLOBs(@Param("record") Workapprovaldata record, @Param("example") WorkapprovaldataExample example);

    int updateByExample(@Param("record") Workapprovaldata record, @Param("example") WorkapprovaldataExample example);
}