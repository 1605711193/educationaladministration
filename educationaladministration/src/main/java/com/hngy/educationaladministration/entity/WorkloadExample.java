package com.hngy.educationaladministration.entity;

import java.util.ArrayList;
import java.util.List;

public class WorkloadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkloadExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdTeacherIsNull() {
            addCriterion("id_teacher is null");
            return (Criteria) this;
        }

        public Criteria andIdTeacherIsNotNull() {
            addCriterion("id_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andIdTeacherEqualTo(Long value) {
            addCriterion("id_teacher =", value, "idTeacher");
            return (Criteria) this;
        }

        public Criteria andIdTeacherNotEqualTo(Long value) {
            addCriterion("id_teacher <>", value, "idTeacher");
            return (Criteria) this;
        }

        public Criteria andIdTeacherGreaterThan(Long value) {
            addCriterion("id_teacher >", value, "idTeacher");
            return (Criteria) this;
        }

        public Criteria andIdTeacherGreaterThanOrEqualTo(Long value) {
            addCriterion("id_teacher >=", value, "idTeacher");
            return (Criteria) this;
        }

        public Criteria andIdTeacherLessThan(Long value) {
            addCriterion("id_teacher <", value, "idTeacher");
            return (Criteria) this;
        }

        public Criteria andIdTeacherLessThanOrEqualTo(Long value) {
            addCriterion("id_teacher <=", value, "idTeacher");
            return (Criteria) this;
        }

        public Criteria andIdTeacherIn(List<Long> values) {
            addCriterion("id_teacher in", values, "idTeacher");
            return (Criteria) this;
        }

        public Criteria andIdTeacherNotIn(List<Long> values) {
            addCriterion("id_teacher not in", values, "idTeacher");
            return (Criteria) this;
        }

        public Criteria andIdTeacherBetween(Long value1, Long value2) {
            addCriterion("id_teacher between", value1, value2, "idTeacher");
            return (Criteria) this;
        }

        public Criteria andIdTeacherNotBetween(Long value1, Long value2) {
            addCriterion("id_teacher not between", value1, value2, "idTeacher");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(String value) {
            addCriterion("term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(String value) {
            addCriterion("term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(String value) {
            addCriterion("term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(String value) {
            addCriterion("term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(String value) {
            addCriterion("term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(String value) {
            addCriterion("term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLike(String value) {
            addCriterion("term like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotLike(String value) {
            addCriterion("term not like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<String> values) {
            addCriterion("term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<String> values) {
            addCriterion("term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(String value1, String value2) {
            addCriterion("term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(String value1, String value2) {
            addCriterion("term not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andClassesIsNull() {
            addCriterion("classes is null");
            return (Criteria) this;
        }

        public Criteria andClassesIsNotNull() {
            addCriterion("classes is not null");
            return (Criteria) this;
        }

        public Criteria andClassesEqualTo(String value) {
            addCriterion("classes =", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotEqualTo(String value) {
            addCriterion("classes <>", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThan(String value) {
            addCriterion("classes >", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThanOrEqualTo(String value) {
            addCriterion("classes >=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThan(String value) {
            addCriterion("classes <", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThanOrEqualTo(String value) {
            addCriterion("classes <=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLike(String value) {
            addCriterion("classes like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotLike(String value) {
            addCriterion("classes not like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesIn(List<String> values) {
            addCriterion("classes in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotIn(List<String> values) {
            addCriterion("classes not in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesBetween(String value1, String value2) {
            addCriterion("classes between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotBetween(String value1, String value2) {
            addCriterion("classes not between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("courseName is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("courseName is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("courseName =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("courseName <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("courseName >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("courseName >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("courseName <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("courseName <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("courseName like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("courseName not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("courseName in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("courseName not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("courseName between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("courseName not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andClasshourofplanIsNull() {
            addCriterion("classHourOfPlan is null");
            return (Criteria) this;
        }

        public Criteria andClasshourofplanIsNotNull() {
            addCriterion("classHourOfPlan is not null");
            return (Criteria) this;
        }

        public Criteria andClasshourofplanEqualTo(String value) {
            addCriterion("classHourOfPlan =", value, "classhourofplan");
            return (Criteria) this;
        }

        public Criteria andClasshourofplanNotEqualTo(String value) {
            addCriterion("classHourOfPlan <>", value, "classhourofplan");
            return (Criteria) this;
        }

        public Criteria andClasshourofplanGreaterThan(String value) {
            addCriterion("classHourOfPlan >", value, "classhourofplan");
            return (Criteria) this;
        }

        public Criteria andClasshourofplanGreaterThanOrEqualTo(String value) {
            addCriterion("classHourOfPlan >=", value, "classhourofplan");
            return (Criteria) this;
        }

        public Criteria andClasshourofplanLessThan(String value) {
            addCriterion("classHourOfPlan <", value, "classhourofplan");
            return (Criteria) this;
        }

        public Criteria andClasshourofplanLessThanOrEqualTo(String value) {
            addCriterion("classHourOfPlan <=", value, "classhourofplan");
            return (Criteria) this;
        }

        public Criteria andClasshourofplanLike(String value) {
            addCriterion("classHourOfPlan like", value, "classhourofplan");
            return (Criteria) this;
        }

        public Criteria andClasshourofplanNotLike(String value) {
            addCriterion("classHourOfPlan not like", value, "classhourofplan");
            return (Criteria) this;
        }

        public Criteria andClasshourofplanIn(List<String> values) {
            addCriterion("classHourOfPlan in", values, "classhourofplan");
            return (Criteria) this;
        }

        public Criteria andClasshourofplanNotIn(List<String> values) {
            addCriterion("classHourOfPlan not in", values, "classhourofplan");
            return (Criteria) this;
        }

        public Criteria andClasshourofplanBetween(String value1, String value2) {
            addCriterion("classHourOfPlan between", value1, value2, "classhourofplan");
            return (Criteria) this;
        }

        public Criteria andClasshourofplanNotBetween(String value1, String value2) {
            addCriterion("classHourOfPlan not between", value1, value2, "classhourofplan");
            return (Criteria) this;
        }

        public Criteria andJointclassIsNull() {
            addCriterion("jointClass is null");
            return (Criteria) this;
        }

        public Criteria andJointclassIsNotNull() {
            addCriterion("jointClass is not null");
            return (Criteria) this;
        }

        public Criteria andJointclassEqualTo(String value) {
            addCriterion("jointClass =", value, "jointclass");
            return (Criteria) this;
        }

        public Criteria andJointclassNotEqualTo(String value) {
            addCriterion("jointClass <>", value, "jointclass");
            return (Criteria) this;
        }

        public Criteria andJointclassGreaterThan(String value) {
            addCriterion("jointClass >", value, "jointclass");
            return (Criteria) this;
        }

        public Criteria andJointclassGreaterThanOrEqualTo(String value) {
            addCriterion("jointClass >=", value, "jointclass");
            return (Criteria) this;
        }

        public Criteria andJointclassLessThan(String value) {
            addCriterion("jointClass <", value, "jointclass");
            return (Criteria) this;
        }

        public Criteria andJointclassLessThanOrEqualTo(String value) {
            addCriterion("jointClass <=", value, "jointclass");
            return (Criteria) this;
        }

        public Criteria andJointclassLike(String value) {
            addCriterion("jointClass like", value, "jointclass");
            return (Criteria) this;
        }

        public Criteria andJointclassNotLike(String value) {
            addCriterion("jointClass not like", value, "jointclass");
            return (Criteria) this;
        }

        public Criteria andJointclassIn(List<String> values) {
            addCriterion("jointClass in", values, "jointclass");
            return (Criteria) this;
        }

        public Criteria andJointclassNotIn(List<String> values) {
            addCriterion("jointClass not in", values, "jointclass");
            return (Criteria) this;
        }

        public Criteria andJointclassBetween(String value1, String value2) {
            addCriterion("jointClass between", value1, value2, "jointclass");
            return (Criteria) this;
        }

        public Criteria andJointclassNotBetween(String value1, String value2) {
            addCriterion("jointClass not between", value1, value2, "jointclass");
            return (Criteria) this;
        }

        public Criteria andExtracurricularexperimentIsNull() {
            addCriterion("extracurricularExperiment is null");
            return (Criteria) this;
        }

        public Criteria andExtracurricularexperimentIsNotNull() {
            addCriterion("extracurricularExperiment is not null");
            return (Criteria) this;
        }

        public Criteria andExtracurricularexperimentEqualTo(String value) {
            addCriterion("extracurricularExperiment =", value, "extracurricularexperiment");
            return (Criteria) this;
        }

        public Criteria andExtracurricularexperimentNotEqualTo(String value) {
            addCriterion("extracurricularExperiment <>", value, "extracurricularexperiment");
            return (Criteria) this;
        }

        public Criteria andExtracurricularexperimentGreaterThan(String value) {
            addCriterion("extracurricularExperiment >", value, "extracurricularexperiment");
            return (Criteria) this;
        }

        public Criteria andExtracurricularexperimentGreaterThanOrEqualTo(String value) {
            addCriterion("extracurricularExperiment >=", value, "extracurricularexperiment");
            return (Criteria) this;
        }

        public Criteria andExtracurricularexperimentLessThan(String value) {
            addCriterion("extracurricularExperiment <", value, "extracurricularexperiment");
            return (Criteria) this;
        }

        public Criteria andExtracurricularexperimentLessThanOrEqualTo(String value) {
            addCriterion("extracurricularExperiment <=", value, "extracurricularexperiment");
            return (Criteria) this;
        }

        public Criteria andExtracurricularexperimentLike(String value) {
            addCriterion("extracurricularExperiment like", value, "extracurricularexperiment");
            return (Criteria) this;
        }

        public Criteria andExtracurricularexperimentNotLike(String value) {
            addCriterion("extracurricularExperiment not like", value, "extracurricularexperiment");
            return (Criteria) this;
        }

        public Criteria andExtracurricularexperimentIn(List<String> values) {
            addCriterion("extracurricularExperiment in", values, "extracurricularexperiment");
            return (Criteria) this;
        }

        public Criteria andExtracurricularexperimentNotIn(List<String> values) {
            addCriterion("extracurricularExperiment not in", values, "extracurricularexperiment");
            return (Criteria) this;
        }

        public Criteria andExtracurricularexperimentBetween(String value1, String value2) {
            addCriterion("extracurricularExperiment between", value1, value2, "extracurricularexperiment");
            return (Criteria) this;
        }

        public Criteria andExtracurricularexperimentNotBetween(String value1, String value2) {
            addCriterion("extracurricularExperiment not between", value1, value2, "extracurricularexperiment");
            return (Criteria) this;
        }

        public Criteria andSum1IsNull() {
            addCriterion("sum1 is null");
            return (Criteria) this;
        }

        public Criteria andSum1IsNotNull() {
            addCriterion("sum1 is not null");
            return (Criteria) this;
        }

        public Criteria andSum1EqualTo(Float value) {
            addCriterion("sum1 =", value, "sum1");
            return (Criteria) this;
        }

        public Criteria andSum1NotEqualTo(Float value) {
            addCriterion("sum1 <>", value, "sum1");
            return (Criteria) this;
        }

        public Criteria andSum1GreaterThan(Float value) {
            addCriterion("sum1 >", value, "sum1");
            return (Criteria) this;
        }

        public Criteria andSum1GreaterThanOrEqualTo(Float value) {
            addCriterion("sum1 >=", value, "sum1");
            return (Criteria) this;
        }

        public Criteria andSum1LessThan(Float value) {
            addCriterion("sum1 <", value, "sum1");
            return (Criteria) this;
        }

        public Criteria andSum1LessThanOrEqualTo(Float value) {
            addCriterion("sum1 <=", value, "sum1");
            return (Criteria) this;
        }

        public Criteria andSum1In(List<Float> values) {
            addCriterion("sum1 in", values, "sum1");
            return (Criteria) this;
        }

        public Criteria andSum1NotIn(List<Float> values) {
            addCriterion("sum1 not in", values, "sum1");
            return (Criteria) this;
        }

        public Criteria andSum1Between(Float value1, Float value2) {
            addCriterion("sum1 between", value1, value2, "sum1");
            return (Criteria) this;
        }

        public Criteria andSum1NotBetween(Float value1, Float value2) {
            addCriterion("sum1 not between", value1, value2, "sum1");
            return (Criteria) this;
        }

        public Criteria andCoursedesignIsNull() {
            addCriterion("courseDesign is null");
            return (Criteria) this;
        }

        public Criteria andCoursedesignIsNotNull() {
            addCriterion("courseDesign is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedesignEqualTo(String value) {
            addCriterion("courseDesign =", value, "coursedesign");
            return (Criteria) this;
        }

        public Criteria andCoursedesignNotEqualTo(String value) {
            addCriterion("courseDesign <>", value, "coursedesign");
            return (Criteria) this;
        }

        public Criteria andCoursedesignGreaterThan(String value) {
            addCriterion("courseDesign >", value, "coursedesign");
            return (Criteria) this;
        }

        public Criteria andCoursedesignGreaterThanOrEqualTo(String value) {
            addCriterion("courseDesign >=", value, "coursedesign");
            return (Criteria) this;
        }

        public Criteria andCoursedesignLessThan(String value) {
            addCriterion("courseDesign <", value, "coursedesign");
            return (Criteria) this;
        }

        public Criteria andCoursedesignLessThanOrEqualTo(String value) {
            addCriterion("courseDesign <=", value, "coursedesign");
            return (Criteria) this;
        }

        public Criteria andCoursedesignLike(String value) {
            addCriterion("courseDesign like", value, "coursedesign");
            return (Criteria) this;
        }

        public Criteria andCoursedesignNotLike(String value) {
            addCriterion("courseDesign not like", value, "coursedesign");
            return (Criteria) this;
        }

        public Criteria andCoursedesignIn(List<String> values) {
            addCriterion("courseDesign in", values, "coursedesign");
            return (Criteria) this;
        }

        public Criteria andCoursedesignNotIn(List<String> values) {
            addCriterion("courseDesign not in", values, "coursedesign");
            return (Criteria) this;
        }

        public Criteria andCoursedesignBetween(String value1, String value2) {
            addCriterion("courseDesign between", value1, value2, "coursedesign");
            return (Criteria) this;
        }

        public Criteria andCoursedesignNotBetween(String value1, String value2) {
            addCriterion("courseDesign not between", value1, value2, "coursedesign");
            return (Criteria) this;
        }

        public Criteria andOnCampuspracticeIsNull() {
            addCriterion("on_campusPractice is null");
            return (Criteria) this;
        }

        public Criteria andOnCampuspracticeIsNotNull() {
            addCriterion("on_campusPractice is not null");
            return (Criteria) this;
        }

        public Criteria andOnCampuspracticeEqualTo(String value) {
            addCriterion("on_campusPractice =", value, "onCampuspractice");
            return (Criteria) this;
        }

        public Criteria andOnCampuspracticeNotEqualTo(String value) {
            addCriterion("on_campusPractice <>", value, "onCampuspractice");
            return (Criteria) this;
        }

        public Criteria andOnCampuspracticeGreaterThan(String value) {
            addCriterion("on_campusPractice >", value, "onCampuspractice");
            return (Criteria) this;
        }

        public Criteria andOnCampuspracticeGreaterThanOrEqualTo(String value) {
            addCriterion("on_campusPractice >=", value, "onCampuspractice");
            return (Criteria) this;
        }

        public Criteria andOnCampuspracticeLessThan(String value) {
            addCriterion("on_campusPractice <", value, "onCampuspractice");
            return (Criteria) this;
        }

        public Criteria andOnCampuspracticeLessThanOrEqualTo(String value) {
            addCriterion("on_campusPractice <=", value, "onCampuspractice");
            return (Criteria) this;
        }

        public Criteria andOnCampuspracticeLike(String value) {
            addCriterion("on_campusPractice like", value, "onCampuspractice");
            return (Criteria) this;
        }

        public Criteria andOnCampuspracticeNotLike(String value) {
            addCriterion("on_campusPractice not like", value, "onCampuspractice");
            return (Criteria) this;
        }

        public Criteria andOnCampuspracticeIn(List<String> values) {
            addCriterion("on_campusPractice in", values, "onCampuspractice");
            return (Criteria) this;
        }

        public Criteria andOnCampuspracticeNotIn(List<String> values) {
            addCriterion("on_campusPractice not in", values, "onCampuspractice");
            return (Criteria) this;
        }

        public Criteria andOnCampuspracticeBetween(String value1, String value2) {
            addCriterion("on_campusPractice between", value1, value2, "onCampuspractice");
            return (Criteria) this;
        }

        public Criteria andOnCampuspracticeNotBetween(String value1, String value2) {
            addCriterion("on_campusPractice not between", value1, value2, "onCampuspractice");
            return (Criteria) this;
        }

        public Criteria andOffCampustrainingIsNull() {
            addCriterion("off_campusTraining is null");
            return (Criteria) this;
        }

        public Criteria andOffCampustrainingIsNotNull() {
            addCriterion("off_campusTraining is not null");
            return (Criteria) this;
        }

        public Criteria andOffCampustrainingEqualTo(String value) {
            addCriterion("off_campusTraining =", value, "offCampustraining");
            return (Criteria) this;
        }

        public Criteria andOffCampustrainingNotEqualTo(String value) {
            addCriterion("off_campusTraining <>", value, "offCampustraining");
            return (Criteria) this;
        }

        public Criteria andOffCampustrainingGreaterThan(String value) {
            addCriterion("off_campusTraining >", value, "offCampustraining");
            return (Criteria) this;
        }

        public Criteria andOffCampustrainingGreaterThanOrEqualTo(String value) {
            addCriterion("off_campusTraining >=", value, "offCampustraining");
            return (Criteria) this;
        }

        public Criteria andOffCampustrainingLessThan(String value) {
            addCriterion("off_campusTraining <", value, "offCampustraining");
            return (Criteria) this;
        }

        public Criteria andOffCampustrainingLessThanOrEqualTo(String value) {
            addCriterion("off_campusTraining <=", value, "offCampustraining");
            return (Criteria) this;
        }

        public Criteria andOffCampustrainingLike(String value) {
            addCriterion("off_campusTraining like", value, "offCampustraining");
            return (Criteria) this;
        }

        public Criteria andOffCampustrainingNotLike(String value) {
            addCriterion("off_campusTraining not like", value, "offCampustraining");
            return (Criteria) this;
        }

        public Criteria andOffCampustrainingIn(List<String> values) {
            addCriterion("off_campusTraining in", values, "offCampustraining");
            return (Criteria) this;
        }

        public Criteria andOffCampustrainingNotIn(List<String> values) {
            addCriterion("off_campusTraining not in", values, "offCampustraining");
            return (Criteria) this;
        }

        public Criteria andOffCampustrainingBetween(String value1, String value2) {
            addCriterion("off_campusTraining between", value1, value2, "offCampustraining");
            return (Criteria) this;
        }

        public Criteria andOffCampustrainingNotBetween(String value1, String value2) {
            addCriterion("off_campusTraining not between", value1, value2, "offCampustraining");
            return (Criteria) this;
        }

        public Criteria andGraduationpracticeIsNull() {
            addCriterion("GraduationPractice is null");
            return (Criteria) this;
        }

        public Criteria andGraduationpracticeIsNotNull() {
            addCriterion("GraduationPractice is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationpracticeEqualTo(String value) {
            addCriterion("GraduationPractice =", value, "graduationpractice");
            return (Criteria) this;
        }

        public Criteria andGraduationpracticeNotEqualTo(String value) {
            addCriterion("GraduationPractice <>", value, "graduationpractice");
            return (Criteria) this;
        }

        public Criteria andGraduationpracticeGreaterThan(String value) {
            addCriterion("GraduationPractice >", value, "graduationpractice");
            return (Criteria) this;
        }

        public Criteria andGraduationpracticeGreaterThanOrEqualTo(String value) {
            addCriterion("GraduationPractice >=", value, "graduationpractice");
            return (Criteria) this;
        }

        public Criteria andGraduationpracticeLessThan(String value) {
            addCriterion("GraduationPractice <", value, "graduationpractice");
            return (Criteria) this;
        }

        public Criteria andGraduationpracticeLessThanOrEqualTo(String value) {
            addCriterion("GraduationPractice <=", value, "graduationpractice");
            return (Criteria) this;
        }

        public Criteria andGraduationpracticeLike(String value) {
            addCriterion("GraduationPractice like", value, "graduationpractice");
            return (Criteria) this;
        }

        public Criteria andGraduationpracticeNotLike(String value) {
            addCriterion("GraduationPractice not like", value, "graduationpractice");
            return (Criteria) this;
        }

        public Criteria andGraduationpracticeIn(List<String> values) {
            addCriterion("GraduationPractice in", values, "graduationpractice");
            return (Criteria) this;
        }

        public Criteria andGraduationpracticeNotIn(List<String> values) {
            addCriterion("GraduationPractice not in", values, "graduationpractice");
            return (Criteria) this;
        }

        public Criteria andGraduationpracticeBetween(String value1, String value2) {
            addCriterion("GraduationPractice between", value1, value2, "graduationpractice");
            return (Criteria) this;
        }

        public Criteria andGraduationpracticeNotBetween(String value1, String value2) {
            addCriterion("GraduationPractice not between", value1, value2, "graduationpractice");
            return (Criteria) this;
        }

        public Criteria andSum2IsNull() {
            addCriterion("sum2 is null");
            return (Criteria) this;
        }

        public Criteria andSum2IsNotNull() {
            addCriterion("sum2 is not null");
            return (Criteria) this;
        }

        public Criteria andSum2EqualTo(Float value) {
            addCriterion("sum2 =", value, "sum2");
            return (Criteria) this;
        }

        public Criteria andSum2NotEqualTo(Float value) {
            addCriterion("sum2 <>", value, "sum2");
            return (Criteria) this;
        }

        public Criteria andSum2GreaterThan(Float value) {
            addCriterion("sum2 >", value, "sum2");
            return (Criteria) this;
        }

        public Criteria andSum2GreaterThanOrEqualTo(Float value) {
            addCriterion("sum2 >=", value, "sum2");
            return (Criteria) this;
        }

        public Criteria andSum2LessThan(Float value) {
            addCriterion("sum2 <", value, "sum2");
            return (Criteria) this;
        }

        public Criteria andSum2LessThanOrEqualTo(Float value) {
            addCriterion("sum2 <=", value, "sum2");
            return (Criteria) this;
        }

        public Criteria andSum2In(List<Float> values) {
            addCriterion("sum2 in", values, "sum2");
            return (Criteria) this;
        }

        public Criteria andSum2NotIn(List<Float> values) {
            addCriterion("sum2 not in", values, "sum2");
            return (Criteria) this;
        }

        public Criteria andSum2Between(Float value1, Float value2) {
            addCriterion("sum2 between", value1, value2, "sum2");
            return (Criteria) this;
        }

        public Criteria andSum2NotBetween(Float value1, Float value2) {
            addCriterion("sum2 not between", value1, value2, "sum2");
            return (Criteria) this;
        }

        public Criteria andSum1addsum2IsNull() {
            addCriterion("sum1AddSum2 is null");
            return (Criteria) this;
        }

        public Criteria andSum1addsum2IsNotNull() {
            addCriterion("sum1AddSum2 is not null");
            return (Criteria) this;
        }

        public Criteria andSum1addsum2EqualTo(Float value) {
            addCriterion("sum1AddSum2 =", value, "sum1addsum2");
            return (Criteria) this;
        }

        public Criteria andSum1addsum2NotEqualTo(Float value) {
            addCriterion("sum1AddSum2 <>", value, "sum1addsum2");
            return (Criteria) this;
        }

        public Criteria andSum1addsum2GreaterThan(Float value) {
            addCriterion("sum1AddSum2 >", value, "sum1addsum2");
            return (Criteria) this;
        }

        public Criteria andSum1addsum2GreaterThanOrEqualTo(Float value) {
            addCriterion("sum1AddSum2 >=", value, "sum1addsum2");
            return (Criteria) this;
        }

        public Criteria andSum1addsum2LessThan(Float value) {
            addCriterion("sum1AddSum2 <", value, "sum1addsum2");
            return (Criteria) this;
        }

        public Criteria andSum1addsum2LessThanOrEqualTo(Float value) {
            addCriterion("sum1AddSum2 <=", value, "sum1addsum2");
            return (Criteria) this;
        }

        public Criteria andSum1addsum2In(List<Float> values) {
            addCriterion("sum1AddSum2 in", values, "sum1addsum2");
            return (Criteria) this;
        }

        public Criteria andSum1addsum2NotIn(List<Float> values) {
            addCriterion("sum1AddSum2 not in", values, "sum1addsum2");
            return (Criteria) this;
        }

        public Criteria andSum1addsum2Between(Float value1, Float value2) {
            addCriterion("sum1AddSum2 between", value1, value2, "sum1addsum2");
            return (Criteria) this;
        }

        public Criteria andSum1addsum2NotBetween(Float value1, Float value2) {
            addCriterion("sum1AddSum2 not between", value1, value2, "sum1addsum2");
            return (Criteria) this;
        }

        public Criteria andRsrprojectnameIsNull() {
            addCriterion("rsrProjectName is null");
            return (Criteria) this;
        }

        public Criteria andRsrprojectnameIsNotNull() {
            addCriterion("rsrProjectName is not null");
            return (Criteria) this;
        }

        public Criteria andRsrprojectnameEqualTo(String value) {
            addCriterion("rsrProjectName =", value, "rsrprojectname");
            return (Criteria) this;
        }

        public Criteria andRsrprojectnameNotEqualTo(String value) {
            addCriterion("rsrProjectName <>", value, "rsrprojectname");
            return (Criteria) this;
        }

        public Criteria andRsrprojectnameGreaterThan(String value) {
            addCriterion("rsrProjectName >", value, "rsrprojectname");
            return (Criteria) this;
        }

        public Criteria andRsrprojectnameGreaterThanOrEqualTo(String value) {
            addCriterion("rsrProjectName >=", value, "rsrprojectname");
            return (Criteria) this;
        }

        public Criteria andRsrprojectnameLessThan(String value) {
            addCriterion("rsrProjectName <", value, "rsrprojectname");
            return (Criteria) this;
        }

        public Criteria andRsrprojectnameLessThanOrEqualTo(String value) {
            addCriterion("rsrProjectName <=", value, "rsrprojectname");
            return (Criteria) this;
        }

        public Criteria andRsrprojectnameLike(String value) {
            addCriterion("rsrProjectName like", value, "rsrprojectname");
            return (Criteria) this;
        }

        public Criteria andRsrprojectnameNotLike(String value) {
            addCriterion("rsrProjectName not like", value, "rsrprojectname");
            return (Criteria) this;
        }

        public Criteria andRsrprojectnameIn(List<String> values) {
            addCriterion("rsrProjectName in", values, "rsrprojectname");
            return (Criteria) this;
        }

        public Criteria andRsrprojectnameNotIn(List<String> values) {
            addCriterion("rsrProjectName not in", values, "rsrprojectname");
            return (Criteria) this;
        }

        public Criteria andRsrprojectnameBetween(String value1, String value2) {
            addCriterion("rsrProjectName between", value1, value2, "rsrprojectname");
            return (Criteria) this;
        }

        public Criteria andRsrprojectnameNotBetween(String value1, String value2) {
            addCriterion("rsrProjectName not between", value1, value2, "rsrprojectname");
            return (Criteria) this;
        }

        public Criteria andRsrprojectbriefIsNull() {
            addCriterion("rsrProjectBrief is null");
            return (Criteria) this;
        }

        public Criteria andRsrprojectbriefIsNotNull() {
            addCriterion("rsrProjectBrief is not null");
            return (Criteria) this;
        }

        public Criteria andRsrprojectbriefEqualTo(String value) {
            addCriterion("rsrProjectBrief =", value, "rsrprojectbrief");
            return (Criteria) this;
        }

        public Criteria andRsrprojectbriefNotEqualTo(String value) {
            addCriterion("rsrProjectBrief <>", value, "rsrprojectbrief");
            return (Criteria) this;
        }

        public Criteria andRsrprojectbriefGreaterThan(String value) {
            addCriterion("rsrProjectBrief >", value, "rsrprojectbrief");
            return (Criteria) this;
        }

        public Criteria andRsrprojectbriefGreaterThanOrEqualTo(String value) {
            addCriterion("rsrProjectBrief >=", value, "rsrprojectbrief");
            return (Criteria) this;
        }

        public Criteria andRsrprojectbriefLessThan(String value) {
            addCriterion("rsrProjectBrief <", value, "rsrprojectbrief");
            return (Criteria) this;
        }

        public Criteria andRsrprojectbriefLessThanOrEqualTo(String value) {
            addCriterion("rsrProjectBrief <=", value, "rsrprojectbrief");
            return (Criteria) this;
        }

        public Criteria andRsrprojectbriefLike(String value) {
            addCriterion("rsrProjectBrief like", value, "rsrprojectbrief");
            return (Criteria) this;
        }

        public Criteria andRsrprojectbriefNotLike(String value) {
            addCriterion("rsrProjectBrief not like", value, "rsrprojectbrief");
            return (Criteria) this;
        }

        public Criteria andRsrprojectbriefIn(List<String> values) {
            addCriterion("rsrProjectBrief in", values, "rsrprojectbrief");
            return (Criteria) this;
        }

        public Criteria andRsrprojectbriefNotIn(List<String> values) {
            addCriterion("rsrProjectBrief not in", values, "rsrprojectbrief");
            return (Criteria) this;
        }

        public Criteria andRsrprojectbriefBetween(String value1, String value2) {
            addCriterion("rsrProjectBrief between", value1, value2, "rsrprojectbrief");
            return (Criteria) this;
        }

        public Criteria andRsrprojectbriefNotBetween(String value1, String value2) {
            addCriterion("rsrProjectBrief not between", value1, value2, "rsrprojectbrief");
            return (Criteria) this;
        }

        public Criteria andRsrprojectstatusIsNull() {
            addCriterion("rsrProjectStatus is null");
            return (Criteria) this;
        }

        public Criteria andRsrprojectstatusIsNotNull() {
            addCriterion("rsrProjectStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRsrprojectstatusEqualTo(String value) {
            addCriterion("rsrProjectStatus =", value, "rsrprojectstatus");
            return (Criteria) this;
        }

        public Criteria andRsrprojectstatusNotEqualTo(String value) {
            addCriterion("rsrProjectStatus <>", value, "rsrprojectstatus");
            return (Criteria) this;
        }

        public Criteria andRsrprojectstatusGreaterThan(String value) {
            addCriterion("rsrProjectStatus >", value, "rsrprojectstatus");
            return (Criteria) this;
        }

        public Criteria andRsrprojectstatusGreaterThanOrEqualTo(String value) {
            addCriterion("rsrProjectStatus >=", value, "rsrprojectstatus");
            return (Criteria) this;
        }

        public Criteria andRsrprojectstatusLessThan(String value) {
            addCriterion("rsrProjectStatus <", value, "rsrprojectstatus");
            return (Criteria) this;
        }

        public Criteria andRsrprojectstatusLessThanOrEqualTo(String value) {
            addCriterion("rsrProjectStatus <=", value, "rsrprojectstatus");
            return (Criteria) this;
        }

        public Criteria andRsrprojectstatusLike(String value) {
            addCriterion("rsrProjectStatus like", value, "rsrprojectstatus");
            return (Criteria) this;
        }

        public Criteria andRsrprojectstatusNotLike(String value) {
            addCriterion("rsrProjectStatus not like", value, "rsrprojectstatus");
            return (Criteria) this;
        }

        public Criteria andRsrprojectstatusIn(List<String> values) {
            addCriterion("rsrProjectStatus in", values, "rsrprojectstatus");
            return (Criteria) this;
        }

        public Criteria andRsrprojectstatusNotIn(List<String> values) {
            addCriterion("rsrProjectStatus not in", values, "rsrprojectstatus");
            return (Criteria) this;
        }

        public Criteria andRsrprojectstatusBetween(String value1, String value2) {
            addCriterion("rsrProjectStatus between", value1, value2, "rsrprojectstatus");
            return (Criteria) this;
        }

        public Criteria andRsrprojectstatusNotBetween(String value1, String value2) {
            addCriterion("rsrProjectStatus not between", value1, value2, "rsrprojectstatus");
            return (Criteria) this;
        }

        public Criteria andRsrconversionworkloadIsNull() {
            addCriterion("rsrConversionWorkload is null");
            return (Criteria) this;
        }

        public Criteria andRsrconversionworkloadIsNotNull() {
            addCriterion("rsrConversionWorkload is not null");
            return (Criteria) this;
        }

        public Criteria andRsrconversionworkloadEqualTo(String value) {
            addCriterion("rsrConversionWorkload =", value, "rsrconversionworkload");
            return (Criteria) this;
        }

        public Criteria andRsrconversionworkloadNotEqualTo(String value) {
            addCriterion("rsrConversionWorkload <>", value, "rsrconversionworkload");
            return (Criteria) this;
        }

        public Criteria andRsrconversionworkloadGreaterThan(String value) {
            addCriterion("rsrConversionWorkload >", value, "rsrconversionworkload");
            return (Criteria) this;
        }

        public Criteria andRsrconversionworkloadGreaterThanOrEqualTo(String value) {
            addCriterion("rsrConversionWorkload >=", value, "rsrconversionworkload");
            return (Criteria) this;
        }

        public Criteria andRsrconversionworkloadLessThan(String value) {
            addCriterion("rsrConversionWorkload <", value, "rsrconversionworkload");
            return (Criteria) this;
        }

        public Criteria andRsrconversionworkloadLessThanOrEqualTo(String value) {
            addCriterion("rsrConversionWorkload <=", value, "rsrconversionworkload");
            return (Criteria) this;
        }

        public Criteria andRsrconversionworkloadLike(String value) {
            addCriterion("rsrConversionWorkload like", value, "rsrconversionworkload");
            return (Criteria) this;
        }

        public Criteria andRsrconversionworkloadNotLike(String value) {
            addCriterion("rsrConversionWorkload not like", value, "rsrconversionworkload");
            return (Criteria) this;
        }

        public Criteria andRsrconversionworkloadIn(List<String> values) {
            addCriterion("rsrConversionWorkload in", values, "rsrconversionworkload");
            return (Criteria) this;
        }

        public Criteria andRsrconversionworkloadNotIn(List<String> values) {
            addCriterion("rsrConversionWorkload not in", values, "rsrconversionworkload");
            return (Criteria) this;
        }

        public Criteria andRsrconversionworkloadBetween(String value1, String value2) {
            addCriterion("rsrConversionWorkload between", value1, value2, "rsrconversionworkload");
            return (Criteria) this;
        }

        public Criteria andRsrconversionworkloadNotBetween(String value1, String value2) {
            addCriterion("rsrConversionWorkload not between", value1, value2, "rsrconversionworkload");
            return (Criteria) this;
        }

        public Criteria andRsrpprojectleaderIsNull() {
            addCriterion("rsrPProjectLeader is null");
            return (Criteria) this;
        }

        public Criteria andRsrpprojectleaderIsNotNull() {
            addCriterion("rsrPProjectLeader is not null");
            return (Criteria) this;
        }

        public Criteria andRsrpprojectleaderEqualTo(String value) {
            addCriterion("rsrPProjectLeader =", value, "rsrpprojectleader");
            return (Criteria) this;
        }

        public Criteria andRsrpprojectleaderNotEqualTo(String value) {
            addCriterion("rsrPProjectLeader <>", value, "rsrpprojectleader");
            return (Criteria) this;
        }

        public Criteria andRsrpprojectleaderGreaterThan(String value) {
            addCriterion("rsrPProjectLeader >", value, "rsrpprojectleader");
            return (Criteria) this;
        }

        public Criteria andRsrpprojectleaderGreaterThanOrEqualTo(String value) {
            addCriterion("rsrPProjectLeader >=", value, "rsrpprojectleader");
            return (Criteria) this;
        }

        public Criteria andRsrpprojectleaderLessThan(String value) {
            addCriterion("rsrPProjectLeader <", value, "rsrpprojectleader");
            return (Criteria) this;
        }

        public Criteria andRsrpprojectleaderLessThanOrEqualTo(String value) {
            addCriterion("rsrPProjectLeader <=", value, "rsrpprojectleader");
            return (Criteria) this;
        }

        public Criteria andRsrpprojectleaderLike(String value) {
            addCriterion("rsrPProjectLeader like", value, "rsrpprojectleader");
            return (Criteria) this;
        }

        public Criteria andRsrpprojectleaderNotLike(String value) {
            addCriterion("rsrPProjectLeader not like", value, "rsrpprojectleader");
            return (Criteria) this;
        }

        public Criteria andRsrpprojectleaderIn(List<String> values) {
            addCriterion("rsrPProjectLeader in", values, "rsrpprojectleader");
            return (Criteria) this;
        }

        public Criteria andRsrpprojectleaderNotIn(List<String> values) {
            addCriterion("rsrPProjectLeader not in", values, "rsrpprojectleader");
            return (Criteria) this;
        }

        public Criteria andRsrpprojectleaderBetween(String value1, String value2) {
            addCriterion("rsrPProjectLeader between", value1, value2, "rsrpprojectleader");
            return (Criteria) this;
        }

        public Criteria andRsrpprojectleaderNotBetween(String value1, String value2) {
            addCriterion("rsrPProjectLeader not between", value1, value2, "rsrpprojectleader");
            return (Criteria) this;
        }

        public Criteria andRsrworkloadIsNull() {
            addCriterion("rsrWorkload is null");
            return (Criteria) this;
        }

        public Criteria andRsrworkloadIsNotNull() {
            addCriterion("rsrWorkload is not null");
            return (Criteria) this;
        }

        public Criteria andRsrworkloadEqualTo(Float value) {
            addCriterion("rsrWorkload =", value, "rsrworkload");
            return (Criteria) this;
        }

        public Criteria andRsrworkloadNotEqualTo(Float value) {
            addCriterion("rsrWorkload <>", value, "rsrworkload");
            return (Criteria) this;
        }

        public Criteria andRsrworkloadGreaterThan(Float value) {
            addCriterion("rsrWorkload >", value, "rsrworkload");
            return (Criteria) this;
        }

        public Criteria andRsrworkloadGreaterThanOrEqualTo(Float value) {
            addCriterion("rsrWorkload >=", value, "rsrworkload");
            return (Criteria) this;
        }

        public Criteria andRsrworkloadLessThan(Float value) {
            addCriterion("rsrWorkload <", value, "rsrworkload");
            return (Criteria) this;
        }

        public Criteria andRsrworkloadLessThanOrEqualTo(Float value) {
            addCriterion("rsrWorkload <=", value, "rsrworkload");
            return (Criteria) this;
        }

        public Criteria andRsrworkloadIn(List<Float> values) {
            addCriterion("rsrWorkload in", values, "rsrworkload");
            return (Criteria) this;
        }

        public Criteria andRsrworkloadNotIn(List<Float> values) {
            addCriterion("rsrWorkload not in", values, "rsrworkload");
            return (Criteria) this;
        }

        public Criteria andRsrworkloadBetween(Float value1, Float value2) {
            addCriterion("rsrWorkload between", value1, value2, "rsrworkload");
            return (Criteria) this;
        }

        public Criteria andRsrworkloadNotBetween(Float value1, Float value2) {
            addCriterion("rsrWorkload not between", value1, value2, "rsrworkload");
            return (Criteria) this;
        }

        public Criteria andSprojectnameIsNull() {
            addCriterion("sProjectName is null");
            return (Criteria) this;
        }

        public Criteria andSprojectnameIsNotNull() {
            addCriterion("sProjectName is not null");
            return (Criteria) this;
        }

        public Criteria andSprojectnameEqualTo(String value) {
            addCriterion("sProjectName =", value, "sprojectname");
            return (Criteria) this;
        }

        public Criteria andSprojectnameNotEqualTo(String value) {
            addCriterion("sProjectName <>", value, "sprojectname");
            return (Criteria) this;
        }

        public Criteria andSprojectnameGreaterThan(String value) {
            addCriterion("sProjectName >", value, "sprojectname");
            return (Criteria) this;
        }

        public Criteria andSprojectnameGreaterThanOrEqualTo(String value) {
            addCriterion("sProjectName >=", value, "sprojectname");
            return (Criteria) this;
        }

        public Criteria andSprojectnameLessThan(String value) {
            addCriterion("sProjectName <", value, "sprojectname");
            return (Criteria) this;
        }

        public Criteria andSprojectnameLessThanOrEqualTo(String value) {
            addCriterion("sProjectName <=", value, "sprojectname");
            return (Criteria) this;
        }

        public Criteria andSprojectnameLike(String value) {
            addCriterion("sProjectName like", value, "sprojectname");
            return (Criteria) this;
        }

        public Criteria andSprojectnameNotLike(String value) {
            addCriterion("sProjectName not like", value, "sprojectname");
            return (Criteria) this;
        }

        public Criteria andSprojectnameIn(List<String> values) {
            addCriterion("sProjectName in", values, "sprojectname");
            return (Criteria) this;
        }

        public Criteria andSprojectnameNotIn(List<String> values) {
            addCriterion("sProjectName not in", values, "sprojectname");
            return (Criteria) this;
        }

        public Criteria andSprojectnameBetween(String value1, String value2) {
            addCriterion("sProjectName between", value1, value2, "sprojectname");
            return (Criteria) this;
        }

        public Criteria andSprojectnameNotBetween(String value1, String value2) {
            addCriterion("sProjectName not between", value1, value2, "sprojectname");
            return (Criteria) this;
        }

        public Criteria andSprojectbriefIsNull() {
            addCriterion("sProjectBrief is null");
            return (Criteria) this;
        }

        public Criteria andSprojectbriefIsNotNull() {
            addCriterion("sProjectBrief is not null");
            return (Criteria) this;
        }

        public Criteria andSprojectbriefEqualTo(String value) {
            addCriterion("sProjectBrief =", value, "sprojectbrief");
            return (Criteria) this;
        }

        public Criteria andSprojectbriefNotEqualTo(String value) {
            addCriterion("sProjectBrief <>", value, "sprojectbrief");
            return (Criteria) this;
        }

        public Criteria andSprojectbriefGreaterThan(String value) {
            addCriterion("sProjectBrief >", value, "sprojectbrief");
            return (Criteria) this;
        }

        public Criteria andSprojectbriefGreaterThanOrEqualTo(String value) {
            addCriterion("sProjectBrief >=", value, "sprojectbrief");
            return (Criteria) this;
        }

        public Criteria andSprojectbriefLessThan(String value) {
            addCriterion("sProjectBrief <", value, "sprojectbrief");
            return (Criteria) this;
        }

        public Criteria andSprojectbriefLessThanOrEqualTo(String value) {
            addCriterion("sProjectBrief <=", value, "sprojectbrief");
            return (Criteria) this;
        }

        public Criteria andSprojectbriefLike(String value) {
            addCriterion("sProjectBrief like", value, "sprojectbrief");
            return (Criteria) this;
        }

        public Criteria andSprojectbriefNotLike(String value) {
            addCriterion("sProjectBrief not like", value, "sprojectbrief");
            return (Criteria) this;
        }

        public Criteria andSprojectbriefIn(List<String> values) {
            addCriterion("sProjectBrief in", values, "sprojectbrief");
            return (Criteria) this;
        }

        public Criteria andSprojectbriefNotIn(List<String> values) {
            addCriterion("sProjectBrief not in", values, "sprojectbrief");
            return (Criteria) this;
        }

        public Criteria andSprojectbriefBetween(String value1, String value2) {
            addCriterion("sProjectBrief between", value1, value2, "sprojectbrief");
            return (Criteria) this;
        }

        public Criteria andSprojectbriefNotBetween(String value1, String value2) {
            addCriterion("sProjectBrief not between", value1, value2, "sprojectbrief");
            return (Criteria) this;
        }

        public Criteria andSprojectstatusIsNull() {
            addCriterion("sProjectStatus is null");
            return (Criteria) this;
        }

        public Criteria andSprojectstatusIsNotNull() {
            addCriterion("sProjectStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSprojectstatusEqualTo(String value) {
            addCriterion("sProjectStatus =", value, "sprojectstatus");
            return (Criteria) this;
        }

        public Criteria andSprojectstatusNotEqualTo(String value) {
            addCriterion("sProjectStatus <>", value, "sprojectstatus");
            return (Criteria) this;
        }

        public Criteria andSprojectstatusGreaterThan(String value) {
            addCriterion("sProjectStatus >", value, "sprojectstatus");
            return (Criteria) this;
        }

        public Criteria andSprojectstatusGreaterThanOrEqualTo(String value) {
            addCriterion("sProjectStatus >=", value, "sprojectstatus");
            return (Criteria) this;
        }

        public Criteria andSprojectstatusLessThan(String value) {
            addCriterion("sProjectStatus <", value, "sprojectstatus");
            return (Criteria) this;
        }

        public Criteria andSprojectstatusLessThanOrEqualTo(String value) {
            addCriterion("sProjectStatus <=", value, "sprojectstatus");
            return (Criteria) this;
        }

        public Criteria andSprojectstatusLike(String value) {
            addCriterion("sProjectStatus like", value, "sprojectstatus");
            return (Criteria) this;
        }

        public Criteria andSprojectstatusNotLike(String value) {
            addCriterion("sProjectStatus not like", value, "sprojectstatus");
            return (Criteria) this;
        }

        public Criteria andSprojectstatusIn(List<String> values) {
            addCriterion("sProjectStatus in", values, "sprojectstatus");
            return (Criteria) this;
        }

        public Criteria andSprojectstatusNotIn(List<String> values) {
            addCriterion("sProjectStatus not in", values, "sprojectstatus");
            return (Criteria) this;
        }

        public Criteria andSprojectstatusBetween(String value1, String value2) {
            addCriterion("sProjectStatus between", value1, value2, "sprojectstatus");
            return (Criteria) this;
        }

        public Criteria andSprojectstatusNotBetween(String value1, String value2) {
            addCriterion("sProjectStatus not between", value1, value2, "sprojectstatus");
            return (Criteria) this;
        }

        public Criteria andSconversionworkloadIsNull() {
            addCriterion("sConversionWorkload is null");
            return (Criteria) this;
        }

        public Criteria andSconversionworkloadIsNotNull() {
            addCriterion("sConversionWorkload is not null");
            return (Criteria) this;
        }

        public Criteria andSconversionworkloadEqualTo(String value) {
            addCriterion("sConversionWorkload =", value, "sconversionworkload");
            return (Criteria) this;
        }

        public Criteria andSconversionworkloadNotEqualTo(String value) {
            addCriterion("sConversionWorkload <>", value, "sconversionworkload");
            return (Criteria) this;
        }

        public Criteria andSconversionworkloadGreaterThan(String value) {
            addCriterion("sConversionWorkload >", value, "sconversionworkload");
            return (Criteria) this;
        }

        public Criteria andSconversionworkloadGreaterThanOrEqualTo(String value) {
            addCriterion("sConversionWorkload >=", value, "sconversionworkload");
            return (Criteria) this;
        }

        public Criteria andSconversionworkloadLessThan(String value) {
            addCriterion("sConversionWorkload <", value, "sconversionworkload");
            return (Criteria) this;
        }

        public Criteria andSconversionworkloadLessThanOrEqualTo(String value) {
            addCriterion("sConversionWorkload <=", value, "sconversionworkload");
            return (Criteria) this;
        }

        public Criteria andSconversionworkloadLike(String value) {
            addCriterion("sConversionWorkload like", value, "sconversionworkload");
            return (Criteria) this;
        }

        public Criteria andSconversionworkloadNotLike(String value) {
            addCriterion("sConversionWorkload not like", value, "sconversionworkload");
            return (Criteria) this;
        }

        public Criteria andSconversionworkloadIn(List<String> values) {
            addCriterion("sConversionWorkload in", values, "sconversionworkload");
            return (Criteria) this;
        }

        public Criteria andSconversionworkloadNotIn(List<String> values) {
            addCriterion("sConversionWorkload not in", values, "sconversionworkload");
            return (Criteria) this;
        }

        public Criteria andSconversionworkloadBetween(String value1, String value2) {
            addCriterion("sConversionWorkload between", value1, value2, "sconversionworkload");
            return (Criteria) this;
        }

        public Criteria andSconversionworkloadNotBetween(String value1, String value2) {
            addCriterion("sConversionWorkload not between", value1, value2, "sconversionworkload");
            return (Criteria) this;
        }

        public Criteria andSpprojectleaderIsNull() {
            addCriterion("sPProjectLeader is null");
            return (Criteria) this;
        }

        public Criteria andSpprojectleaderIsNotNull() {
            addCriterion("sPProjectLeader is not null");
            return (Criteria) this;
        }

        public Criteria andSpprojectleaderEqualTo(String value) {
            addCriterion("sPProjectLeader =", value, "spprojectleader");
            return (Criteria) this;
        }

        public Criteria andSpprojectleaderNotEqualTo(String value) {
            addCriterion("sPProjectLeader <>", value, "spprojectleader");
            return (Criteria) this;
        }

        public Criteria andSpprojectleaderGreaterThan(String value) {
            addCriterion("sPProjectLeader >", value, "spprojectleader");
            return (Criteria) this;
        }

        public Criteria andSpprojectleaderGreaterThanOrEqualTo(String value) {
            addCriterion("sPProjectLeader >=", value, "spprojectleader");
            return (Criteria) this;
        }

        public Criteria andSpprojectleaderLessThan(String value) {
            addCriterion("sPProjectLeader <", value, "spprojectleader");
            return (Criteria) this;
        }

        public Criteria andSpprojectleaderLessThanOrEqualTo(String value) {
            addCriterion("sPProjectLeader <=", value, "spprojectleader");
            return (Criteria) this;
        }

        public Criteria andSpprojectleaderLike(String value) {
            addCriterion("sPProjectLeader like", value, "spprojectleader");
            return (Criteria) this;
        }

        public Criteria andSpprojectleaderNotLike(String value) {
            addCriterion("sPProjectLeader not like", value, "spprojectleader");
            return (Criteria) this;
        }

        public Criteria andSpprojectleaderIn(List<String> values) {
            addCriterion("sPProjectLeader in", values, "spprojectleader");
            return (Criteria) this;
        }

        public Criteria andSpprojectleaderNotIn(List<String> values) {
            addCriterion("sPProjectLeader not in", values, "spprojectleader");
            return (Criteria) this;
        }

        public Criteria andSpprojectleaderBetween(String value1, String value2) {
            addCriterion("sPProjectLeader between", value1, value2, "spprojectleader");
            return (Criteria) this;
        }

        public Criteria andSpprojectleaderNotBetween(String value1, String value2) {
            addCriterion("sPProjectLeader not between", value1, value2, "spprojectleader");
            return (Criteria) this;
        }

        public Criteria andSectionverifyIsNull() {
            addCriterion("sectionVerify is null");
            return (Criteria) this;
        }

        public Criteria andSectionverifyIsNotNull() {
            addCriterion("sectionVerify is not null");
            return (Criteria) this;
        }

        public Criteria andSectionverifyEqualTo(String value) {
            addCriterion("sectionVerify =", value, "sectionverify");
            return (Criteria) this;
        }

        public Criteria andSectionverifyNotEqualTo(String value) {
            addCriterion("sectionVerify <>", value, "sectionverify");
            return (Criteria) this;
        }

        public Criteria andSectionverifyGreaterThan(String value) {
            addCriterion("sectionVerify >", value, "sectionverify");
            return (Criteria) this;
        }

        public Criteria andSectionverifyGreaterThanOrEqualTo(String value) {
            addCriterion("sectionVerify >=", value, "sectionverify");
            return (Criteria) this;
        }

        public Criteria andSectionverifyLessThan(String value) {
            addCriterion("sectionVerify <", value, "sectionverify");
            return (Criteria) this;
        }

        public Criteria andSectionverifyLessThanOrEqualTo(String value) {
            addCriterion("sectionVerify <=", value, "sectionverify");
            return (Criteria) this;
        }

        public Criteria andSectionverifyLike(String value) {
            addCriterion("sectionVerify like", value, "sectionverify");
            return (Criteria) this;
        }

        public Criteria andSectionverifyNotLike(String value) {
            addCriterion("sectionVerify not like", value, "sectionverify");
            return (Criteria) this;
        }

        public Criteria andSectionverifyIn(List<String> values) {
            addCriterion("sectionVerify in", values, "sectionverify");
            return (Criteria) this;
        }

        public Criteria andSectionverifyNotIn(List<String> values) {
            addCriterion("sectionVerify not in", values, "sectionverify");
            return (Criteria) this;
        }

        public Criteria andSectionverifyBetween(String value1, String value2) {
            addCriterion("sectionVerify between", value1, value2, "sectionverify");
            return (Criteria) this;
        }

        public Criteria andSectionverifyNotBetween(String value1, String value2) {
            addCriterion("sectionVerify not between", value1, value2, "sectionverify");
            return (Criteria) this;
        }

        public Criteria andInstituteverifyIsNull() {
            addCriterion("instituteVerify is null");
            return (Criteria) this;
        }

        public Criteria andInstituteverifyIsNotNull() {
            addCriterion("instituteVerify is not null");
            return (Criteria) this;
        }

        public Criteria andInstituteverifyEqualTo(String value) {
            addCriterion("instituteVerify =", value, "instituteverify");
            return (Criteria) this;
        }

        public Criteria andInstituteverifyNotEqualTo(String value) {
            addCriterion("instituteVerify <>", value, "instituteverify");
            return (Criteria) this;
        }

        public Criteria andInstituteverifyGreaterThan(String value) {
            addCriterion("instituteVerify >", value, "instituteverify");
            return (Criteria) this;
        }

        public Criteria andInstituteverifyGreaterThanOrEqualTo(String value) {
            addCriterion("instituteVerify >=", value, "instituteverify");
            return (Criteria) this;
        }

        public Criteria andInstituteverifyLessThan(String value) {
            addCriterion("instituteVerify <", value, "instituteverify");
            return (Criteria) this;
        }

        public Criteria andInstituteverifyLessThanOrEqualTo(String value) {
            addCriterion("instituteVerify <=", value, "instituteverify");
            return (Criteria) this;
        }

        public Criteria andInstituteverifyLike(String value) {
            addCriterion("instituteVerify like", value, "instituteverify");
            return (Criteria) this;
        }

        public Criteria andInstituteverifyNotLike(String value) {
            addCriterion("instituteVerify not like", value, "instituteverify");
            return (Criteria) this;
        }

        public Criteria andInstituteverifyIn(List<String> values) {
            addCriterion("instituteVerify in", values, "instituteverify");
            return (Criteria) this;
        }

        public Criteria andInstituteverifyNotIn(List<String> values) {
            addCriterion("instituteVerify not in", values, "instituteverify");
            return (Criteria) this;
        }

        public Criteria andInstituteverifyBetween(String value1, String value2) {
            addCriterion("instituteVerify between", value1, value2, "instituteverify");
            return (Criteria) this;
        }

        public Criteria andInstituteverifyNotBetween(String value1, String value2) {
            addCriterion("instituteVerify not between", value1, value2, "instituteverify");
            return (Criteria) this;
        }

        public Criteria andSubsidyworkloadIsNull() {
            addCriterion("subsidyworkload is null");
            return (Criteria) this;
        }

        public Criteria andSubsidyworkloadIsNotNull() {
            addCriterion("subsidyworkload is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidyworkloadEqualTo(Float value) {
            addCriterion("subsidyworkload =", value, "subsidyworkload");
            return (Criteria) this;
        }

        public Criteria andSubsidyworkloadNotEqualTo(Float value) {
            addCriterion("subsidyworkload <>", value, "subsidyworkload");
            return (Criteria) this;
        }

        public Criteria andSubsidyworkloadGreaterThan(Float value) {
            addCriterion("subsidyworkload >", value, "subsidyworkload");
            return (Criteria) this;
        }

        public Criteria andSubsidyworkloadGreaterThanOrEqualTo(Float value) {
            addCriterion("subsidyworkload >=", value, "subsidyworkload");
            return (Criteria) this;
        }

        public Criteria andSubsidyworkloadLessThan(Float value) {
            addCriterion("subsidyworkload <", value, "subsidyworkload");
            return (Criteria) this;
        }

        public Criteria andSubsidyworkloadLessThanOrEqualTo(Float value) {
            addCriterion("subsidyworkload <=", value, "subsidyworkload");
            return (Criteria) this;
        }

        public Criteria andSubsidyworkloadIn(List<Float> values) {
            addCriterion("subsidyworkload in", values, "subsidyworkload");
            return (Criteria) this;
        }

        public Criteria andSubsidyworkloadNotIn(List<Float> values) {
            addCriterion("subsidyworkload not in", values, "subsidyworkload");
            return (Criteria) this;
        }

        public Criteria andSubsidyworkloadBetween(Float value1, Float value2) {
            addCriterion("subsidyworkload between", value1, value2, "subsidyworkload");
            return (Criteria) this;
        }

        public Criteria andSubsidyworkloadNotBetween(Float value1, Float value2) {
            addCriterion("subsidyworkload not between", value1, value2, "subsidyworkload");
            return (Criteria) this;
        }

        public Criteria andTotalsumIsNull() {
            addCriterion("totalSum is null");
            return (Criteria) this;
        }

        public Criteria andTotalsumIsNotNull() {
            addCriterion("totalSum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsumEqualTo(Float value) {
            addCriterion("totalSum =", value, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumNotEqualTo(Float value) {
            addCriterion("totalSum <>", value, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumGreaterThan(Float value) {
            addCriterion("totalSum >", value, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumGreaterThanOrEqualTo(Float value) {
            addCriterion("totalSum >=", value, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumLessThan(Float value) {
            addCriterion("totalSum <", value, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumLessThanOrEqualTo(Float value) {
            addCriterion("totalSum <=", value, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumIn(List<Float> values) {
            addCriterion("totalSum in", values, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumNotIn(List<Float> values) {
            addCriterion("totalSum not in", values, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumBetween(Float value1, Float value2) {
            addCriterion("totalSum between", value1, value2, "totalsum");
            return (Criteria) this;
        }

        public Criteria andTotalsumNotBetween(Float value1, Float value2) {
            addCriterion("totalSum not between", value1, value2, "totalsum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}