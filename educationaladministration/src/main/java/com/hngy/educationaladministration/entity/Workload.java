package com.hngy.educationaladministration.entity;

public class Workload {
    private Long id;

    private Long idTeacher;

    private String year;

    private String term;

    private String classes;

    private String coursename;

    private String classhourofplan;

    private String jointclass;

    private String extracurricularexperiment;

    private Float sum1;

    private String coursedesign;

    private String onCampuspractice;

    private String offCampustraining;

    private String graduationpractice;

    private Float sum2;

    private Float sum1addsum2;

    private String rsrprojectname;

    private String rsrprojectbrief;

    private String rsrprojectstatus;

    private String rsrconversionworkload;

    private String rsrpprojectleader;

    private Float rsrworkload;

    private String sprojectname;

    private String sprojectbrief;

    private String sprojectstatus;

    private String sconversionworkload;

    private String spprojectleader;

    private String sectionverify;

    private String instituteverify;

    private Float subsidyworkload;

    private Float totalsum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Long idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getClasshourofplan() {
        return classhourofplan;
    }

    public void setClasshourofplan(String classhourofplan) {
        this.classhourofplan = classhourofplan == null ? null : classhourofplan.trim();
    }

    public String getJointclass() {
        return jointclass;
    }

    public void setJointclass(String jointclass) {
        this.jointclass = jointclass == null ? null : jointclass.trim();
    }

    public String getExtracurricularexperiment() {
        return extracurricularexperiment;
    }

    public void setExtracurricularexperiment(String extracurricularexperiment) {
        this.extracurricularexperiment = extracurricularexperiment == null ? null : extracurricularexperiment.trim();
    }

    public Float getSum1() {
        return sum1;
    }

    public void setSum1(Float sum1) {
        this.sum1 = sum1;
    }

    public String getCoursedesign() {
        return coursedesign;
    }

    public void setCoursedesign(String coursedesign) {
        this.coursedesign = coursedesign == null ? null : coursedesign.trim();
    }

    public String getOnCampuspractice() {
        return onCampuspractice;
    }

    public void setOnCampuspractice(String onCampuspractice) {
        this.onCampuspractice = onCampuspractice == null ? null : onCampuspractice.trim();
    }

    public String getOffCampustraining() {
        return offCampustraining;
    }

    public void setOffCampustraining(String offCampustraining) {
        this.offCampustraining = offCampustraining == null ? null : offCampustraining.trim();
    }

    public String getGraduationpractice() {
        return graduationpractice;
    }

    public void setGraduationpractice(String graduationpractice) {
        this.graduationpractice = graduationpractice == null ? null : graduationpractice.trim();
    }

    public Float getSum2() {
        return sum2;
    }

    public void setSum2(Float sum2) {
        this.sum2 = sum2;
    }

    public Float getSum1addsum2() {
        return sum1addsum2;
    }

    public void setSum1addsum2(Float sum1addsum2) {
        this.sum1addsum2 = sum1addsum2;
    }

    public String getRsrprojectname() {
        return rsrprojectname;
    }

    public void setRsrprojectname(String rsrprojectname) {
        this.rsrprojectname = rsrprojectname == null ? null : rsrprojectname.trim();
    }

    public String getRsrprojectbrief() {
        return rsrprojectbrief;
    }

    public void setRsrprojectbrief(String rsrprojectbrief) {
        this.rsrprojectbrief = rsrprojectbrief == null ? null : rsrprojectbrief.trim();
    }

    public String getRsrprojectstatus() {
        return rsrprojectstatus;
    }

    public void setRsrprojectstatus(String rsrprojectstatus) {
        this.rsrprojectstatus = rsrprojectstatus == null ? null : rsrprojectstatus.trim();
    }

    public String getRsrconversionworkload() {
        return rsrconversionworkload;
    }

    public void setRsrconversionworkload(String rsrconversionworkload) {
        this.rsrconversionworkload = rsrconversionworkload == null ? null : rsrconversionworkload.trim();
    }

    public String getRsrpprojectleader() {
        return rsrpprojectleader;
    }

    public void setRsrpprojectleader(String rsrpprojectleader) {
        this.rsrpprojectleader = rsrpprojectleader == null ? null : rsrpprojectleader.trim();
    }

    public Float getRsrworkload() {
        return rsrworkload;
    }

    public void setRsrworkload(Float rsrworkload) {
        this.rsrworkload = rsrworkload;
    }

    public String getSprojectname() {
        return sprojectname;
    }

    public void setSprojectname(String sprojectname) {
        this.sprojectname = sprojectname == null ? null : sprojectname.trim();
    }

    public String getSprojectbrief() {
        return sprojectbrief;
    }

    public void setSprojectbrief(String sprojectbrief) {
        this.sprojectbrief = sprojectbrief == null ? null : sprojectbrief.trim();
    }

    public String getSprojectstatus() {
        return sprojectstatus;
    }

    public void setSprojectstatus(String sprojectstatus) {
        this.sprojectstatus = sprojectstatus == null ? null : sprojectstatus.trim();
    }

    public String getSconversionworkload() {
        return sconversionworkload;
    }

    public void setSconversionworkload(String sconversionworkload) {
        this.sconversionworkload = sconversionworkload == null ? null : sconversionworkload.trim();
    }

    public String getSpprojectleader() {
        return spprojectleader;
    }

    public void setSpprojectleader(String spprojectleader) {
        this.spprojectleader = spprojectleader == null ? null : spprojectleader.trim();
    }

    public String getSectionverify() {
        return sectionverify;
    }

    public void setSectionverify(String sectionverify) {
        this.sectionverify = sectionverify == null ? null : sectionverify.trim();
    }

    public String getInstituteverify() {
        return instituteverify;
    }

    public void setInstituteverify(String instituteverify) {
        this.instituteverify = instituteverify == null ? null : instituteverify.trim();
    }

    public Float getSubsidyworkload() {
        return subsidyworkload;
    }

    public void setSubsidyworkload(Float subsidyworkload) {
        this.subsidyworkload = subsidyworkload;
    }

    public Float getTotalsum() {
        return totalsum;
    }

    public void setTotalsum(Float totalsum) {
        this.totalsum = totalsum;
    }
}