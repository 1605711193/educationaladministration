package com.hngy.educationaladministration.entity;

import java.util.Date;

public class Teacher {
    private Long id;

    private String username;

    private String name;

    private String pwd;

    private String gender;

    private Long idSection;

    private Integer verifyFlag;

    private String politicalstatus;

    private String education;

    private String degree;

    private Date participationdate;

    private String administrativeduty;

    private String technicalposition;

    private String technicalpositiongeted;

    private String duty;

    private String idcardno;

    //    自建类别，方便查询
    private String sectionName;//这个老师 属于那个教研室
    private String institute_name;// 学院

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Long getIdSection() {
        return idSection;
    }

    public void setIdSection(Long idSection) {
        this.idSection = idSection;
    }

    public Integer getVerifyFlag() {
        return verifyFlag;
    }

    public void setVerifyFlag(Integer verifyFlag) {
        this.verifyFlag = verifyFlag;
    }

    public String getPoliticalstatus() {
        return politicalstatus;
    }

    public void setPoliticalstatus(String politicalstatus) {
        this.politicalstatus = politicalstatus == null ? null : politicalstatus.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public Date getParticipationdate() {
        return participationdate;
    }

    public void setParticipationdate(Date participationdate) {
        this.participationdate = participationdate;
    }

    public String getAdministrativeduty() {
        return administrativeduty;
    }

    public void setAdministrativeduty(String administrativeduty) {
        this.administrativeduty = administrativeduty == null ? null : administrativeduty.trim();
    }

    public String getTechnicalposition() {
        return technicalposition;
    }

    public void setTechnicalposition(String technicalposition) {
        this.technicalposition = technicalposition == null ? null : technicalposition.trim();
    }

    public String getTechnicalpositiongeted() {
        return technicalpositiongeted;
    }

    public void setTechnicalpositiongeted(String technicalpositiongeted) {
        this.technicalpositiongeted = technicalpositiongeted == null ? null : technicalpositiongeted.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno == null ? null : idcardno.trim();
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getInstitute_name() {
        return institute_name;
    }

    public void setInstitute_name(String institute_name) {
        this.institute_name = institute_name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", gender='" + gender + '\'' +
                ", idSection=" + idSection +
                ", verifyFlag=" + verifyFlag +
                ", politicalstatus='" + politicalstatus + '\'' +
                ", education='" + education + '\'' +
                ", degree='" + degree + '\'' +
                ", participationdate=" + participationdate +
                ", administrativeduty='" + administrativeduty + '\'' +
                ", technicalposition='" + technicalposition + '\'' +
                ", technicalpositiongeted='" + technicalpositiongeted + '\'' +
                ", duty='" + duty + '\'' +
                ", idcardno='" + idcardno + '\'' +
                ", sectionName='" + sectionName + '\'' +
                ", institute_name='" + institute_name + '\'' +
                '}';
    }
}