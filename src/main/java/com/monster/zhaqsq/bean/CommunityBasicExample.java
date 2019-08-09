package com.monster.zhaqsq.bean;

import java.util.ArrayList;
import java.util.List;

public class CommunityBasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommunityBasicExample() {
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

        public Criteria andComTitleIsNull() {
            addCriterion("com_title is null");
            return (Criteria) this;
        }

        public Criteria andComTitleIsNotNull() {
            addCriterion("com_title is not null");
            return (Criteria) this;
        }

        public Criteria andComTitleEqualTo(String value) {
            addCriterion("com_title =", value, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleNotEqualTo(String value) {
            addCriterion("com_title <>", value, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleGreaterThan(String value) {
            addCriterion("com_title >", value, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleGreaterThanOrEqualTo(String value) {
            addCriterion("com_title >=", value, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleLessThan(String value) {
            addCriterion("com_title <", value, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleLessThanOrEqualTo(String value) {
            addCriterion("com_title <=", value, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleLike(String value) {
            addCriterion("com_title like", value, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleNotLike(String value) {
            addCriterion("com_title not like", value, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleIn(List<String> values) {
            addCriterion("com_title in", values, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleNotIn(List<String> values) {
            addCriterion("com_title not in", values, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleBetween(String value1, String value2) {
            addCriterion("com_title between", value1, value2, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleNotBetween(String value1, String value2) {
            addCriterion("com_title not between", value1, value2, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComCategoryIsNull() {
            addCriterion("com_category is null");
            return (Criteria) this;
        }

        public Criteria andComCategoryIsNotNull() {
            addCriterion("com_category is not null");
            return (Criteria) this;
        }

        public Criteria andComCategoryEqualTo(String value) {
            addCriterion("com_category =", value, "comCategory");
            return (Criteria) this;
        }

        public Criteria andComCategoryNotEqualTo(String value) {
            addCriterion("com_category <>", value, "comCategory");
            return (Criteria) this;
        }

        public Criteria andComCategoryGreaterThan(String value) {
            addCriterion("com_category >", value, "comCategory");
            return (Criteria) this;
        }

        public Criteria andComCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("com_category >=", value, "comCategory");
            return (Criteria) this;
        }

        public Criteria andComCategoryLessThan(String value) {
            addCriterion("com_category <", value, "comCategory");
            return (Criteria) this;
        }

        public Criteria andComCategoryLessThanOrEqualTo(String value) {
            addCriterion("com_category <=", value, "comCategory");
            return (Criteria) this;
        }

        public Criteria andComCategoryLike(String value) {
            addCriterion("com_category like", value, "comCategory");
            return (Criteria) this;
        }

        public Criteria andComCategoryNotLike(String value) {
            addCriterion("com_category not like", value, "comCategory");
            return (Criteria) this;
        }

        public Criteria andComCategoryIn(List<String> values) {
            addCriterion("com_category in", values, "comCategory");
            return (Criteria) this;
        }

        public Criteria andComCategoryNotIn(List<String> values) {
            addCriterion("com_category not in", values, "comCategory");
            return (Criteria) this;
        }

        public Criteria andComCategoryBetween(String value1, String value2) {
            addCriterion("com_category between", value1, value2, "comCategory");
            return (Criteria) this;
        }

        public Criteria andComCategoryNotBetween(String value1, String value2) {
            addCriterion("com_category not between", value1, value2, "comCategory");
            return (Criteria) this;
        }

        public Criteria andComNumberIsNull() {
            addCriterion("com_number is null");
            return (Criteria) this;
        }

        public Criteria andComNumberIsNotNull() {
            addCriterion("com_number is not null");
            return (Criteria) this;
        }

        public Criteria andComNumberEqualTo(Integer value) {
            addCriterion("com_number =", value, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberNotEqualTo(Integer value) {
            addCriterion("com_number <>", value, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberGreaterThan(Integer value) {
            addCriterion("com_number >", value, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_number >=", value, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberLessThan(Integer value) {
            addCriterion("com_number <", value, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberLessThanOrEqualTo(Integer value) {
            addCriterion("com_number <=", value, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberIn(List<Integer> values) {
            addCriterion("com_number in", values, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberNotIn(List<Integer> values) {
            addCriterion("com_number not in", values, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberBetween(Integer value1, Integer value2) {
            addCriterion("com_number between", value1, value2, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("com_number not between", value1, value2, "comNumber");
            return (Criteria) this;
        }

        public Criteria andComDespIsNull() {
            addCriterion("com_desp is null");
            return (Criteria) this;
        }

        public Criteria andComDespIsNotNull() {
            addCriterion("com_desp is not null");
            return (Criteria) this;
        }

        public Criteria andComDespEqualTo(String value) {
            addCriterion("com_desp =", value, "comDesp");
            return (Criteria) this;
        }

        public Criteria andComDespNotEqualTo(String value) {
            addCriterion("com_desp <>", value, "comDesp");
            return (Criteria) this;
        }

        public Criteria andComDespGreaterThan(String value) {
            addCriterion("com_desp >", value, "comDesp");
            return (Criteria) this;
        }

        public Criteria andComDespGreaterThanOrEqualTo(String value) {
            addCriterion("com_desp >=", value, "comDesp");
            return (Criteria) this;
        }

        public Criteria andComDespLessThan(String value) {
            addCriterion("com_desp <", value, "comDesp");
            return (Criteria) this;
        }

        public Criteria andComDespLessThanOrEqualTo(String value) {
            addCriterion("com_desp <=", value, "comDesp");
            return (Criteria) this;
        }

        public Criteria andComDespLike(String value) {
            addCriterion("com_desp like", value, "comDesp");
            return (Criteria) this;
        }

        public Criteria andComDespNotLike(String value) {
            addCriterion("com_desp not like", value, "comDesp");
            return (Criteria) this;
        }

        public Criteria andComDespIn(List<String> values) {
            addCriterion("com_desp in", values, "comDesp");
            return (Criteria) this;
        }

        public Criteria andComDespNotIn(List<String> values) {
            addCriterion("com_desp not in", values, "comDesp");
            return (Criteria) this;
        }

        public Criteria andComDespBetween(String value1, String value2) {
            addCriterion("com_desp between", value1, value2, "comDesp");
            return (Criteria) this;
        }

        public Criteria andComDespNotBetween(String value1, String value2) {
            addCriterion("com_desp not between", value1, value2, "comDesp");
            return (Criteria) this;
        }

        public Criteria andComAddressIsNull() {
            addCriterion("com_address is null");
            return (Criteria) this;
        }

        public Criteria andComAddressIsNotNull() {
            addCriterion("com_address is not null");
            return (Criteria) this;
        }

        public Criteria andComAddressEqualTo(String value) {
            addCriterion("com_address =", value, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressNotEqualTo(String value) {
            addCriterion("com_address <>", value, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressGreaterThan(String value) {
            addCriterion("com_address >", value, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressGreaterThanOrEqualTo(String value) {
            addCriterion("com_address >=", value, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressLessThan(String value) {
            addCriterion("com_address <", value, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressLessThanOrEqualTo(String value) {
            addCriterion("com_address <=", value, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressLike(String value) {
            addCriterion("com_address like", value, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressNotLike(String value) {
            addCriterion("com_address not like", value, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressIn(List<String> values) {
            addCriterion("com_address in", values, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressNotIn(List<String> values) {
            addCriterion("com_address not in", values, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressBetween(String value1, String value2) {
            addCriterion("com_address between", value1, value2, "comAddress");
            return (Criteria) this;
        }

        public Criteria andComAddressNotBetween(String value1, String value2) {
            addCriterion("com_address not between", value1, value2, "comAddress");
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