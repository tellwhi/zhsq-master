package com.monster.zhaqsq.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CallListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CallListExample() {
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

        public Criteria andCallIdIsNull() {
            addCriterion("call_id is null");
            return (Criteria) this;
        }

        public Criteria andCallIdIsNotNull() {
            addCriterion("call_id is not null");
            return (Criteria) this;
        }

        public Criteria andCallIdEqualTo(Integer value) {
            addCriterion("call_id =", value, "callId");
            return (Criteria) this;
        }

        public Criteria andCallIdNotEqualTo(Integer value) {
            addCriterion("call_id <>", value, "callId");
            return (Criteria) this;
        }

        public Criteria andCallIdGreaterThan(Integer value) {
            addCriterion("call_id >", value, "callId");
            return (Criteria) this;
        }

        public Criteria andCallIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("call_id >=", value, "callId");
            return (Criteria) this;
        }

        public Criteria andCallIdLessThan(Integer value) {
            addCriterion("call_id <", value, "callId");
            return (Criteria) this;
        }

        public Criteria andCallIdLessThanOrEqualTo(Integer value) {
            addCriterion("call_id <=", value, "callId");
            return (Criteria) this;
        }

        public Criteria andCallIdIn(List<Integer> values) {
            addCriterion("call_id in", values, "callId");
            return (Criteria) this;
        }

        public Criteria andCallIdNotIn(List<Integer> values) {
            addCriterion("call_id not in", values, "callId");
            return (Criteria) this;
        }

        public Criteria andCallIdBetween(Integer value1, Integer value2) {
            addCriterion("call_id between", value1, value2, "callId");
            return (Criteria) this;
        }

        public Criteria andCallIdNotBetween(Integer value1, Integer value2) {
            addCriterion("call_id not between", value1, value2, "callId");
            return (Criteria) this;
        }

        public Criteria andSubIdIsNull() {
            addCriterion("sub_id is null");
            return (Criteria) this;
        }

        public Criteria andSubIdIsNotNull() {
            addCriterion("sub_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubIdEqualTo(Integer value) {
            addCriterion("sub_id =", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotEqualTo(Integer value) {
            addCriterion("sub_id <>", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdGreaterThan(Integer value) {
            addCriterion("sub_id >", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_id >=", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdLessThan(Integer value) {
            addCriterion("sub_id <", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdLessThanOrEqualTo(Integer value) {
            addCriterion("sub_id <=", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdIn(List<Integer> values) {
            addCriterion("sub_id in", values, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotIn(List<Integer> values) {
            addCriterion("sub_id not in", values, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdBetween(Integer value1, Integer value2) {
            addCriterion("sub_id between", value1, value2, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_id not between", value1, value2, "subId");
            return (Criteria) this;
        }

        public Criteria andSubTimeIsNull() {
            addCriterion("sub_time is null");
            return (Criteria) this;
        }

        public Criteria andSubTimeIsNotNull() {
            addCriterion("sub_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubTimeEqualTo(Date value) {
            addCriterion("sub_time =", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeNotEqualTo(Date value) {
            addCriterion("sub_time <>", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeGreaterThan(Date value) {
            addCriterion("sub_time >", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sub_time >=", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeLessThan(Date value) {
            addCriterion("sub_time <", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeLessThanOrEqualTo(Date value) {
            addCriterion("sub_time <=", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeIn(List<Date> values) {
            addCriterion("sub_time in", values, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeNotIn(List<Date> values) {
            addCriterion("sub_time not in", values, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeBetween(Date value1, Date value2) {
            addCriterion("sub_time between", value1, value2, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeNotBetween(Date value1, Date value2) {
            addCriterion("sub_time not between", value1, value2, "subTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCallTitleIsNull() {
            addCriterion("call_title is null");
            return (Criteria) this;
        }

        public Criteria andCallTitleIsNotNull() {
            addCriterion("call_title is not null");
            return (Criteria) this;
        }

        public Criteria andCallTitleEqualTo(String value) {
            addCriterion("call_title =", value, "callTitle");
            return (Criteria) this;
        }

        public Criteria andCallTitleNotEqualTo(String value) {
            addCriterion("call_title <>", value, "callTitle");
            return (Criteria) this;
        }

        public Criteria andCallTitleGreaterThan(String value) {
            addCriterion("call_title >", value, "callTitle");
            return (Criteria) this;
        }

        public Criteria andCallTitleGreaterThanOrEqualTo(String value) {
            addCriterion("call_title >=", value, "callTitle");
            return (Criteria) this;
        }

        public Criteria andCallTitleLessThan(String value) {
            addCriterion("call_title <", value, "callTitle");
            return (Criteria) this;
        }

        public Criteria andCallTitleLessThanOrEqualTo(String value) {
            addCriterion("call_title <=", value, "callTitle");
            return (Criteria) this;
        }

        public Criteria andCallTitleLike(String value) {
            addCriterion("call_title like", value, "callTitle");
            return (Criteria) this;
        }

        public Criteria andCallTitleNotLike(String value) {
            addCriterion("call_title not like", value, "callTitle");
            return (Criteria) this;
        }

        public Criteria andCallTitleIn(List<String> values) {
            addCriterion("call_title in", values, "callTitle");
            return (Criteria) this;
        }

        public Criteria andCallTitleNotIn(List<String> values) {
            addCriterion("call_title not in", values, "callTitle");
            return (Criteria) this;
        }

        public Criteria andCallTitleBetween(String value1, String value2) {
            addCriterion("call_title between", value1, value2, "callTitle");
            return (Criteria) this;
        }

        public Criteria andCallTitleNotBetween(String value1, String value2) {
            addCriterion("call_title not between", value1, value2, "callTitle");
            return (Criteria) this;
        }

        public Criteria andCallDespIsNull() {
            addCriterion("call_desp is null");
            return (Criteria) this;
        }

        public Criteria andCallDespIsNotNull() {
            addCriterion("call_desp is not null");
            return (Criteria) this;
        }

        public Criteria andCallDespEqualTo(String value) {
            addCriterion("call_desp =", value, "callDesp");
            return (Criteria) this;
        }

        public Criteria andCallDespNotEqualTo(String value) {
            addCriterion("call_desp <>", value, "callDesp");
            return (Criteria) this;
        }

        public Criteria andCallDespGreaterThan(String value) {
            addCriterion("call_desp >", value, "callDesp");
            return (Criteria) this;
        }

        public Criteria andCallDespGreaterThanOrEqualTo(String value) {
            addCriterion("call_desp >=", value, "callDesp");
            return (Criteria) this;
        }

        public Criteria andCallDespLessThan(String value) {
            addCriterion("call_desp <", value, "callDesp");
            return (Criteria) this;
        }

        public Criteria andCallDespLessThanOrEqualTo(String value) {
            addCriterion("call_desp <=", value, "callDesp");
            return (Criteria) this;
        }

        public Criteria andCallDespLike(String value) {
            addCriterion("call_desp like", value, "callDesp");
            return (Criteria) this;
        }

        public Criteria andCallDespNotLike(String value) {
            addCriterion("call_desp not like", value, "callDesp");
            return (Criteria) this;
        }

        public Criteria andCallDespIn(List<String> values) {
            addCriterion("call_desp in", values, "callDesp");
            return (Criteria) this;
        }

        public Criteria andCallDespNotIn(List<String> values) {
            addCriterion("call_desp not in", values, "callDesp");
            return (Criteria) this;
        }

        public Criteria andCallDespBetween(String value1, String value2) {
            addCriterion("call_desp between", value1, value2, "callDesp");
            return (Criteria) this;
        }

        public Criteria andCallDespNotBetween(String value1, String value2) {
            addCriterion("call_desp not between", value1, value2, "callDesp");
            return (Criteria) this;
        }

        public Criteria andCallMoneyIsNull() {
            addCriterion("call_money is null");
            return (Criteria) this;
        }

        public Criteria andCallMoneyIsNotNull() {
            addCriterion("call_money is not null");
            return (Criteria) this;
        }

        public Criteria andCallMoneyEqualTo(Integer value) {
            addCriterion("call_money =", value, "callMoney");
            return (Criteria) this;
        }

        public Criteria andCallMoneyNotEqualTo(Integer value) {
            addCriterion("call_money <>", value, "callMoney");
            return (Criteria) this;
        }

        public Criteria andCallMoneyGreaterThan(Integer value) {
            addCriterion("call_money >", value, "callMoney");
            return (Criteria) this;
        }

        public Criteria andCallMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("call_money >=", value, "callMoney");
            return (Criteria) this;
        }

        public Criteria andCallMoneyLessThan(Integer value) {
            addCriterion("call_money <", value, "callMoney");
            return (Criteria) this;
        }

        public Criteria andCallMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("call_money <=", value, "callMoney");
            return (Criteria) this;
        }

        public Criteria andCallMoneyIn(List<Integer> values) {
            addCriterion("call_money in", values, "callMoney");
            return (Criteria) this;
        }

        public Criteria andCallMoneyNotIn(List<Integer> values) {
            addCriterion("call_money not in", values, "callMoney");
            return (Criteria) this;
        }

        public Criteria andCallMoneyBetween(Integer value1, Integer value2) {
            addCriterion("call_money between", value1, value2, "callMoney");
            return (Criteria) this;
        }

        public Criteria andCallMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("call_money not between", value1, value2, "callMoney");
            return (Criteria) this;
        }

        public Criteria andCallNowIsNull() {
            addCriterion("call_now is null");
            return (Criteria) this;
        }

        public Criteria andCallNowIsNotNull() {
            addCriterion("call_now is not null");
            return (Criteria) this;
        }

        public Criteria andCallNowEqualTo(String value) {
            addCriterion("call_now =", value, "callNow");
            return (Criteria) this;
        }

        public Criteria andCallNowNotEqualTo(String value) {
            addCriterion("call_now <>", value, "callNow");
            return (Criteria) this;
        }

        public Criteria andCallNowGreaterThan(String value) {
            addCriterion("call_now >", value, "callNow");
            return (Criteria) this;
        }

        public Criteria andCallNowGreaterThanOrEqualTo(String value) {
            addCriterion("call_now >=", value, "callNow");
            return (Criteria) this;
        }

        public Criteria andCallNowLessThan(String value) {
            addCriterion("call_now <", value, "callNow");
            return (Criteria) this;
        }

        public Criteria andCallNowLessThanOrEqualTo(String value) {
            addCriterion("call_now <=", value, "callNow");
            return (Criteria) this;
        }

        public Criteria andCallNowLike(String value) {
            addCriterion("call_now like", value, "callNow");
            return (Criteria) this;
        }

        public Criteria andCallNowNotLike(String value) {
            addCriterion("call_now not like", value, "callNow");
            return (Criteria) this;
        }

        public Criteria andCallNowIn(List<String> values) {
            addCriterion("call_now in", values, "callNow");
            return (Criteria) this;
        }

        public Criteria andCallNowNotIn(List<String> values) {
            addCriterion("call_now not in", values, "callNow");
            return (Criteria) this;
        }

        public Criteria andCallNowBetween(String value1, String value2) {
            addCriterion("call_now between", value1, value2, "callNow");
            return (Criteria) this;
        }

        public Criteria andCallNowNotBetween(String value1, String value2) {
            addCriterion("call_now not between", value1, value2, "callNow");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNull() {
            addCriterion("rec_id is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("rec_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(Integer value) {
            addCriterion("rec_id =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(Integer value) {
            addCriterion("rec_id <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(Integer value) {
            addCriterion("rec_id >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_id >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(Integer value) {
            addCriterion("rec_id <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(Integer value) {
            addCriterion("rec_id <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<Integer> values) {
            addCriterion("rec_id in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<Integer> values) {
            addCriterion("rec_id not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(Integer value1, Integer value2) {
            addCriterion("rec_id between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_id not between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andSubNameIsNull() {
            addCriterion("sub_name is null");
            return (Criteria) this;
        }

        public Criteria andSubNameIsNotNull() {
            addCriterion("sub_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubNameEqualTo(String value) {
            addCriterion("sub_name =", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotEqualTo(String value) {
            addCriterion("sub_name <>", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThan(String value) {
            addCriterion("sub_name >", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_name >=", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLessThan(String value) {
            addCriterion("sub_name <", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLessThanOrEqualTo(String value) {
            addCriterion("sub_name <=", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLike(String value) {
            addCriterion("sub_name like", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotLike(String value) {
            addCriterion("sub_name not like", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameIn(List<String> values) {
            addCriterion("sub_name in", values, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotIn(List<String> values) {
            addCriterion("sub_name not in", values, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameBetween(String value1, String value2) {
            addCriterion("sub_name between", value1, value2, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotBetween(String value1, String value2) {
            addCriterion("sub_name not between", value1, value2, "subName");
            return (Criteria) this;
        }

        public Criteria andRecNameIsNull() {
            addCriterion("rec_name is null");
            return (Criteria) this;
        }

        public Criteria andRecNameIsNotNull() {
            addCriterion("rec_name is not null");
            return (Criteria) this;
        }

        public Criteria andRecNameEqualTo(String value) {
            addCriterion("rec_name =", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotEqualTo(String value) {
            addCriterion("rec_name <>", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameGreaterThan(String value) {
            addCriterion("rec_name >", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameGreaterThanOrEqualTo(String value) {
            addCriterion("rec_name >=", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameLessThan(String value) {
            addCriterion("rec_name <", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameLessThanOrEqualTo(String value) {
            addCriterion("rec_name <=", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameLike(String value) {
            addCriterion("rec_name like", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotLike(String value) {
            addCriterion("rec_name not like", value, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameIn(List<String> values) {
            addCriterion("rec_name in", values, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotIn(List<String> values) {
            addCriterion("rec_name not in", values, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameBetween(String value1, String value2) {
            addCriterion("rec_name between", value1, value2, "recName");
            return (Criteria) this;
        }

        public Criteria andRecNameNotBetween(String value1, String value2) {
            addCriterion("rec_name not between", value1, value2, "recName");
            return (Criteria) this;
        }

        public Criteria andCallAddressIsNull() {
            addCriterion("call_address is null");
            return (Criteria) this;
        }

        public Criteria andCallAddressIsNotNull() {
            addCriterion("call_address is not null");
            return (Criteria) this;
        }

        public Criteria andCallAddressEqualTo(String value) {
            addCriterion("call_address =", value, "callAddress");
            return (Criteria) this;
        }

        public Criteria andCallAddressNotEqualTo(String value) {
            addCriterion("call_address <>", value, "callAddress");
            return (Criteria) this;
        }

        public Criteria andCallAddressGreaterThan(String value) {
            addCriterion("call_address >", value, "callAddress");
            return (Criteria) this;
        }

        public Criteria andCallAddressGreaterThanOrEqualTo(String value) {
            addCriterion("call_address >=", value, "callAddress");
            return (Criteria) this;
        }

        public Criteria andCallAddressLessThan(String value) {
            addCriterion("call_address <", value, "callAddress");
            return (Criteria) this;
        }

        public Criteria andCallAddressLessThanOrEqualTo(String value) {
            addCriterion("call_address <=", value, "callAddress");
            return (Criteria) this;
        }

        public Criteria andCallAddressLike(String value) {
            addCriterion("call_address like", value, "callAddress");
            return (Criteria) this;
        }

        public Criteria andCallAddressNotLike(String value) {
            addCriterion("call_address not like", value, "callAddress");
            return (Criteria) this;
        }

        public Criteria andCallAddressIn(List<String> values) {
            addCriterion("call_address in", values, "callAddress");
            return (Criteria) this;
        }

        public Criteria andCallAddressNotIn(List<String> values) {
            addCriterion("call_address not in", values, "callAddress");
            return (Criteria) this;
        }

        public Criteria andCallAddressBetween(String value1, String value2) {
            addCriterion("call_address between", value1, value2, "callAddress");
            return (Criteria) this;
        }

        public Criteria andCallAddressNotBetween(String value1, String value2) {
            addCriterion("call_address not between", value1, value2, "callAddress");
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