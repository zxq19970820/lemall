package com.zzzl.lemall.domain;

import java.util.ArrayList;
import java.util.List;

public class PropertyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PropertyExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andPropIdIsNull() {
            addCriterion("prop_id is null");
            return (Criteria) this;
        }

        public Criteria andPropIdIsNotNull() {
            addCriterion("prop_id is not null");
            return (Criteria) this;
        }

        public Criteria andPropIdEqualTo(Integer value) {
            addCriterion("prop_id =", value, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdNotEqualTo(Integer value) {
            addCriterion("prop_id <>", value, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdGreaterThan(Integer value) {
            addCriterion("prop_id >", value, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prop_id >=", value, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdLessThan(Integer value) {
            addCriterion("prop_id <", value, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdLessThanOrEqualTo(Integer value) {
            addCriterion("prop_id <=", value, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdIn(List<Integer> values) {
            addCriterion("prop_id in", values, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdNotIn(List<Integer> values) {
            addCriterion("prop_id not in", values, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdBetween(Integer value1, Integer value2) {
            addCriterion("prop_id between", value1, value2, "propId");
            return (Criteria) this;
        }

        public Criteria andPropIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prop_id not between", value1, value2, "propId");
            return (Criteria) this;
        }

        public Criteria andPropNameIsNull() {
            addCriterion("prop_name is null");
            return (Criteria) this;
        }

        public Criteria andPropNameIsNotNull() {
            addCriterion("prop_name is not null");
            return (Criteria) this;
        }

        public Criteria andPropNameEqualTo(String value) {
            addCriterion("prop_name =", value, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameNotEqualTo(String value) {
            addCriterion("prop_name <>", value, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameGreaterThan(String value) {
            addCriterion("prop_name >", value, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameGreaterThanOrEqualTo(String value) {
            addCriterion("prop_name >=", value, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameLessThan(String value) {
            addCriterion("prop_name <", value, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameLessThanOrEqualTo(String value) {
            addCriterion("prop_name <=", value, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameLike(String value) {
            addCriterion("prop_name like", value, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameNotLike(String value) {
            addCriterion("prop_name not like", value, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameIn(List<String> values) {
            addCriterion("prop_name in", values, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameNotIn(List<String> values) {
            addCriterion("prop_name not in", values, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameBetween(String value1, String value2) {
            addCriterion("prop_name between", value1, value2, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameNotBetween(String value1, String value2) {
            addCriterion("prop_name not between", value1, value2, "propName");
            return (Criteria) this;
        }

        public Criteria andGIdIsNull() {
            addCriterion("g_id is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("g_id is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(Integer value) {
            addCriterion("g_id =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(Integer value) {
            addCriterion("g_id <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(Integer value) {
            addCriterion("g_id >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_id >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(Integer value) {
            addCriterion("g_id <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(Integer value) {
            addCriterion("g_id <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<Integer> values) {
            addCriterion("g_id in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<Integer> values) {
            addCriterion("g_id not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(Integer value1, Integer value2) {
            addCriterion("g_id between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(Integer value1, Integer value2) {
            addCriterion("g_id not between", value1, value2, "gId");
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