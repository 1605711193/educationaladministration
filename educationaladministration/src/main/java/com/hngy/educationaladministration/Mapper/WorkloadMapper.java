package com.hngy.educationaladministration.Mapper;

import com.hngy.educationaladministration.entity.Workload;
import com.hngy.educationaladministration.entity.WorkloadExample;
import com.hngy.educationaladministration.entity.WorkloadWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkloadMapper {
    long countByExample(WorkloadExample example);

    int deleteByExample(WorkloadExample example);

    int insert(WorkloadWithBLOBs record);

    int insertSelective(WorkloadWithBLOBs record);

    List<WorkloadWithBLOBs> selectByExampleWithBLOBs(WorkloadExample example);

    List<Workload> selectByExample(WorkloadExample example);

    int updateByExampleSelective(@Param("record") WorkloadWithBLOBs record, @Param("example") WorkloadExample example);

    int updateByExampleWithBLOBs(@Param("record") WorkloadWithBLOBs record, @Param("example") WorkloadExample example);

    int updateByExample(@Param("record") Workload record, @Param("example") WorkloadExample example);
}