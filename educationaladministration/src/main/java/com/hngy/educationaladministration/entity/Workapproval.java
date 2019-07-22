package com.hngy.educationaladministration.entity;

import java.util.Date;

public class Workapproval {
    private Long id;

    private Long idType;

    private Long idTeacher;

    private String worktitle;

    private Date beginDate;

    private Date endDate;

    private String location;

    private String member;

    private Integer appovalflag;

    private Date sumbitdate;

    private Date appovaldate;

    private Long idSubadmin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdType() {
        return idType;
    }

    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public Long getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Long idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getWorktitle() {
        return worktitle;
    }

    public void setWorktitle(String worktitle) {
        this.worktitle = worktitle == null ? null : worktitle.trim();
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member == null ? null : member.trim();
    }

    public Integer getAppovalflag() {
        return appovalflag;
    }

    public void setAppovalflag(Integer appovalflag) {
        this.appovalflag = appovalflag;
    }

    public Date getSumbitdate() {
        return sumbitdate;
    }

    public void setSumbitdate(Date sumbitdate) {
        this.sumbitdate = sumbitdate;
    }

    public Date getAppovaldate() {
        return appovaldate;
    }

    public void setAppovaldate(Date appovaldate) {
        this.appovaldate = appovaldate;
    }

    public Long getIdSubadmin() {
        return idSubadmin;
    }

    public void setIdSubadmin(Long idSubadmin) {
        this.idSubadmin = idSubadmin;
    }
}