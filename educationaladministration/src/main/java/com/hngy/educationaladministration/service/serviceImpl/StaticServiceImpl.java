package com.hngy.educationaladministration.service.serviceImpl;

import com.hngy.educationaladministration.Mapper.WorkapprovalMapper;
import com.hngy.educationaladministration.Mapper.WorkapprovaltypeMapper;
import com.hngy.educationaladministration.entity.Workapproval;
import com.hngy.educationaladministration.entity.WorkapprovalWithBLOBs;
import com.hngy.educationaladministration.entity.Workapprovaltype;
import com.hngy.educationaladministration.service.StaticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaticServiceImpl implements StaticService {

    @Autowired
    WorkapprovaltypeMapper workapprovaltypeMapper;

    @Autowired
    WorkapprovalMapper workapprovalMapper;


    @Override
    public List<Workapprovaltype> select_allWorkapprovaltype() {
        return workapprovaltypeMapper.selectByExample(null);
    }

    @Override
    public int insert_workapproval(WorkapprovalWithBLOBs workapprovalWithBLOBs) {
        return workapprovalMapper.insertSelective(workapprovalWithBLOBs);
    }
}
