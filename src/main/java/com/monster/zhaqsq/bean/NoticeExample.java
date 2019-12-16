package com.monster.zhaqsq.bean;

import java.util.ArrayList;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andNoIdIsNull() {
            addCriterion("no_id is null");
            return (Criteria) this;
        }

        public Criteria andNoIdIsNotNull() {
            addCriterion("no_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoIdEqualTo(Integer value) {
            addCriterion("no_id =", value, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdNotEqualTo(Integer value) {
            addCriterion("no_id <>", value, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdGreaterThan(Integer value) {
            addCriterion("no_id >", value, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("no_id >=", value, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdLessThan(Integer value) {
            addCriterion("no_id <", value, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdLessThanOrEqualTo(Integer value) {
            addCriterion("no_id <=", value, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdIn(List<Integer> values) {
            addCriterion("no_id in", values, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdNotIn(List<Integer> values) {
            addCriterion("no_id not in", values, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdBetween(Integer value1, Integer value2) {
            addCriterion("no_id between", value1, value2, "noId");
            return (Criteria) this;
        }

        public Criteria andNoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("no_id not between", value1, value2, "noId");
            return (Criteria) this;
        }

        public Criteria andComIdIsNull() {
            addCriterion("com_id is null");
            return (Criteria) this;
        }

        public Criteria andComIdIsNotNull() {
            addCriterion("com_id is not null");
            return (Criteria) this;
        }

        public Criteria andComIdEqualTo(Integer value) {
            addCriterion("com_id =", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotEqualTo(Integer value) {
            addCriterion("com_id <>", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThan(Integer value) {
            addCriterion("com_id >", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_id >=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThan(Integer value) {
            addCriterion("com_id <", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThanOrEqualTo(Integer value) {
            addCriterion("com_id <=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdIn(List<Integer> values) {
            addCriterion("com_id in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotIn(List<Integer> values) {
            addCriterion("com_id not in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdBetween(Integer value1, Integer value2) {
            addCriterion("com_id between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotBetween(Integer value1, Integer value2) {
            addCriterion("com_id not between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andNoTitleIsNull() {
            addCriterion("no_title is null");
            return (Criteria) this;
        }

        public Criteria andNoTitleIsNotNull() {
            addCriterion("no_title is not null");
            return (Criteria) this;
        }

        public Criteria andNoTitleEqualTo(String value) {
            addCriterion("no_title =", value, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleNotEqualTo(String value) {
            addCriterion("no_title <>", value, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleGreaterThan(String value) {
            addCriterion("no_title >", value, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("no_title >=", value, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleLessThan(String value) {
            addCriterion("no_title <", value, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleLessThanOrEqualTo(String value) {
            addCriterion("no_title <=", value, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleLike(String value) {
            addCriterion("no_title like", value, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleNotLike(String value) {
            addCriterion("no_title not like", value, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleIn(List<String> values) {
            addCriterion("no_title in", values, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleNotIn(List<String> values) {
            addCriterion("no_title not in", values, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleBetween(String value1, String value2) {
            addCriterion("no_title between", value1, value2, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleNotBetween(String value1, String value2) {
            addCriterion("no_title not between", value1, value2, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoContentIsNull() {
            addCriterion("no_content is null");
            return (Criteria) this;
        }

        public Criteria andNoContentIsNotNull() {
            addCriterion("no_content is not null");
            return (Criteria) this;
        }

        public Criteria andNoContentEqualTo(String value) {
            addCriterion("no_content =", value, "noContent");
            return (Criteria) this;
        }

        public Criteria andNoContentNotEqualTo(String value) {
            addCriterion("no_content <>", value, "noContent");
            return (Criteria) this;
        }

        public Criteria andNoContentGreaterThan(String value) {
            addCriterion("no_content >", value, "noContent");
            return (Criteria) this;
        }

        public Criteria andNoContentGreaterThanOrEqualTo(String value) {
            addCriterion("no_content >=", value, "noContent");
            return (Criteria) this;
        }

        public Criteria andNoContentLessThan(String value) {
            addCriterion("no_content <", value, "noContent");
            return (Criteria) this;
        }

        public Criteria andNoContentLessThanOrEqualTo(String value) {
            addCriterion("no_content <=", value, "noContent");
            return (Criteria) this;
        }

        public Criteria andNoContentLike(String value) {
            addCriterion("no_content like", value, "noContent");
            return (Criteria) this;
        }

        public Criteria andNoContentNotLike(String value) {
            addCriterion("no_content not like", value, "noContent");
            return (Criteria) this;
        }

        public Criteria andNoContentIn(List<String> values) {
            addCriterion("no_content in", values, "noContent");
            return (Criteria) this;
        }

        public Criteria andNoContentNotIn(List<String> values) {
            addCriterion("no_content not in", values, "noContent");
            return (Criteria) this;
        }

        public Criteria andNoContentBetween(String value1, String value2) {
            addCriterion("no_content between", value1, value2, "noContent");
            return (Criteria) this;
        }

        public Criteria andNoContentNotBetween(String value1, String value2) {
            addCriterion("no_content not between", value1, value2, "noContent");
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