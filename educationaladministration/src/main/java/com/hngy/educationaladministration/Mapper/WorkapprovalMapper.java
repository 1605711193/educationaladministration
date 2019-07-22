package com.hngy.educationaladministration.Mapper;

import com.hngy.educationaladministration.entity.Workapproval;
import com.hngy.educationaladministration.entity.WorkapprovalExample;
import com.hngy.educationaladministration.entity.WorkapprovalWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WorkapprovalMapper {
    long countByExample(WorkapprovalExample example);

    int deleteByExample(WorkapprovalExample example);

    int insert(WorkapprovalWithBLOBs record);

    int insertSelective(WorkapprovalWithBLOBs record);

    List<WorkapprovalWithBLOBs> selectByExampleWithBLOBs(WorkapprovalExample example);

    List<Workapproval> selectByExample(WorkapprovalExample example);

    int updateByExampleSelective(@Param("record") WorkapprovalWithBLOBs record, @Param("example") WorkapprovalExample example);

    int updateByExampleWithBLOBs(@Param("record") WorkapprovalWithBLOBs record, @Param("example") WorkapprovalExample example);

    int updateByExample(@Param("record") Workapproval record, @Param("example") WorkapprovalExample example);
}