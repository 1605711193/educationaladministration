package com.hngy.educationaladministration.service;

import com.hngy.educationaladministration.entity.WorkapprovalWithBLOBs;
import com.hngy.educationaladministration.entity.Workapprovaltype;

import java.util.List;

public interface StaticService {

    List<Workapprovaltype> select_allWorkapprovaltype();//查询出差类型

    int insert_workapproval(WorkapprovalWithBLOBs workapprovalWithBLOBs);

}
