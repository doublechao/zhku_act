package com.zhku.bean;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andSNumberIsNull() {
            addCriterion("s_number is null");
            return (Criteria) this;
        }

        public Criteria andSNumberIsNotNull() {
            addCriterion("s_number is not null");
            return (Criteria) this;
        }

        public Criteria andSNumberEqualTo(String value) {
            addCriterion("s_number =", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotEqualTo(String value) {
            addCriterion("s_number <>", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberGreaterThan(String value) {
            addCriterion("s_number >", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberGreaterThanOrEqualTo(String value) {
            addCriterion("s_number >=", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberLessThan(String value) {
            addCriterion("s_number <", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberLessThanOrEqualTo(String value) {
            addCriterion("s_number <=", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberLike(String value) {
            addCriterion("s_number like", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotLike(String value) {
            addCriterion("s_number not like", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberIn(List<String> values) {
            addCriterion("s_number in", values, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotIn(List<String> values) {
            addCriterion("s_number not in", values, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberBetween(String value1, String value2) {
            addCriterion("s_number between", value1, value2, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotBetween(String value1, String value2) {
            addCriterion("s_number not between", value1, value2, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSCampusIsNull() {
            addCriterion("s_campus is null");
            return (Criteria) this;
        }

        public Criteria andSCampusIsNotNull() {
            addCriterion("s_campus is not null");
            return (Criteria) this;
        }

        public Criteria andSCampusEqualTo(Integer value) {
            addCriterion("s_campus =", value, "sCampus");
            return (Criteria) this;
        }

        public Criteria andSCampusNotEqualTo(Integer value) {
            addCriterion("s_campus <>", value, "sCampus");
            return (Criteria) this;
        }

        public Criteria andSCampusGreaterThan(Integer value) {
            addCriterion("s_campus >", value, "sCampus");
            return (Criteria) this;
        }

        public Criteria andSCampusGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_campus >=", value, "sCampus");
            return (Criteria) this;
        }

        public Criteria andSCampusLessThan(Integer value) {
            addCriterion("s_campus <", value, "sCampus");
            return (Criteria) this;
        }

        public Criteria andSCampusLessThanOrEqualTo(Integer value) {
            addCriterion("s_campus <=", value, "sCampus");
            return (Criteria) this;
        }

        public Criteria andSCampusIn(List<Integer> values) {
            addCriterion("s_campus in", values, "sCampus");
            return (Criteria) this;
        }

        public Criteria andSCampusNotIn(List<Integer> values) {
            addCriterion("s_campus not in", values, "sCampus");
            return (Criteria) this;
        }

        public Criteria andSCampusBetween(Integer value1, Integer value2) {
            addCriterion("s_campus between", value1, value2, "sCampus");
            return (Criteria) this;
        }

        public Criteria andSCampusNotBetween(Integer value1, Integer value2) {
            addCriterion("s_campus not between", value1, value2, "sCampus");
            return (Criteria) this;
        }

        public Criteria andSAcademyIsNull() {
            addCriterion("s_academy is null");
            return (Criteria) this;
        }

        public Criteria andSAcademyIsNotNull() {
            addCriterion("s_academy is not null");
            return (Criteria) this;
        }

        public Criteria andSAcademyEqualTo(Integer value) {
            addCriterion("s_academy =", value, "sAcademy");
            return (Criteria) this;
        }

        public Criteria andSAcademyNotEqualTo(Integer value) {
            addCriterion("s_academy <>", value, "sAcademy");
            return (Criteria) this;
        }

        public Criteria andSAcademyGreaterThan(Integer value) {
            addCriterion("s_academy >", value, "sAcademy");
            return (Criteria) this;
        }

        public Criteria andSAcademyGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_academy >=", value, "sAcademy");
            return (Criteria) this;
        }

        public Criteria andSAcademyLessThan(Integer value) {
            addCriterion("s_academy <", value, "sAcademy");
            return (Criteria) this;
        }

        public Criteria andSAcademyLessThanOrEqualTo(Integer value) {
            addCriterion("s_academy <=", value, "sAcademy");
            return (Criteria) this;
        }

        public Criteria andSAcademyIn(List<Integer> values) {
            addCriterion("s_academy in", values, "sAcademy");
            return (Criteria) this;
        }

        public Criteria andSAcademyNotIn(List<Integer> values) {
            addCriterion("s_academy not in", values, "sAcademy");
            return (Criteria) this;
        }

        public Criteria andSAcademyBetween(Integer value1, Integer value2) {
            addCriterion("s_academy between", value1, value2, "sAcademy");
            return (Criteria) this;
        }

        public Criteria andSAcademyNotBetween(Integer value1, Integer value2) {
            addCriterion("s_academy not between", value1, value2, "sAcademy");
            return (Criteria) this;
        }

        public Criteria andSMajorIsNull() {
            addCriterion("s_major is null");
            return (Criteria) this;
        }

        public Criteria andSMajorIsNotNull() {
            addCriterion("s_major is not null");
            return (Criteria) this;
        }

        public Criteria andSMajorEqualTo(Integer value) {
            addCriterion("s_major =", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorNotEqualTo(Integer value) {
            addCriterion("s_major <>", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorGreaterThan(Integer value) {
            addCriterion("s_major >", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_major >=", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorLessThan(Integer value) {
            addCriterion("s_major <", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorLessThanOrEqualTo(Integer value) {
            addCriterion("s_major <=", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorIn(List<Integer> values) {
            addCriterion("s_major in", values, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorNotIn(List<Integer> values) {
            addCriterion("s_major not in", values, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorBetween(Integer value1, Integer value2) {
            addCriterion("s_major between", value1, value2, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorNotBetween(Integer value1, Integer value2) {
            addCriterion("s_major not between", value1, value2, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSClassIsNull() {
            addCriterion("s_class is null");
            return (Criteria) this;
        }

        public Criteria andSClassIsNotNull() {
            addCriterion("s_class is not null");
            return (Criteria) this;
        }

        public Criteria andSClassEqualTo(Integer value) {
            addCriterion("s_class =", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassNotEqualTo(Integer value) {
            addCriterion("s_class <>", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassGreaterThan(Integer value) {
            addCriterion("s_class >", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_class >=", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassLessThan(Integer value) {
            addCriterion("s_class <", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassLessThanOrEqualTo(Integer value) {
            addCriterion("s_class <=", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassIn(List<Integer> values) {
            addCriterion("s_class in", values, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassNotIn(List<Integer> values) {
            addCriterion("s_class not in", values, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassBetween(Integer value1, Integer value2) {
            addCriterion("s_class between", value1, value2, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassNotBetween(Integer value1, Integer value2) {
            addCriterion("s_class not between", value1, value2, "sClass");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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