package com.monster.zhaqsq.bean;

import java.util.ArrayList;
import java.util.List;

public class UserBasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserBasicExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberIsNull() {
            addCriterion("user_phonenumber is null");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberIsNotNull() {
            addCriterion("user_phonenumber is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberEqualTo(String value) {
            addCriterion("user_phonenumber =", value, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberNotEqualTo(String value) {
            addCriterion("user_phonenumber <>", value, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberGreaterThan(String value) {
            addCriterion("user_phonenumber >", value, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_phonenumber >=", value, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberLessThan(String value) {
            addCriterion("user_phonenumber <", value, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("user_phonenumber <=", value, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberLike(String value) {
            addCriterion("user_phonenumber like", value, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberNotLike(String value) {
            addCriterion("user_phonenumber not like", value, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberIn(List<String> values) {
            addCriterion("user_phonenumber in", values, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberNotIn(List<String> values) {
            addCriterion("user_phonenumber not in", values, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberBetween(String value1, String value2) {
            addCriterion("user_phonenumber between", value1, value2, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserPhonenumberNotBetween(String value1, String value2) {
            addCriterion("user_phonenumber not between", value1, value2, "userPhonenumber");
            return (Criteria) this;
        }

        public Criteria andUserDeptIsNull() {
            addCriterion("user_dept is null");
            return (Criteria) this;
        }

        public Criteria andUserDeptIsNotNull() {
            addCriterion("user_dept is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeptEqualTo(String value) {
            addCriterion("user_dept =", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptNotEqualTo(String value) {
            addCriterion("user_dept <>", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptGreaterThan(String value) {
            addCriterion("user_dept >", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptGreaterThanOrEqualTo(String value) {
            addCriterion("user_dept >=", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptLessThan(String value) {
            addCriterion("user_dept <", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptLessThanOrEqualTo(String value) {
            addCriterion("user_dept <=", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptLike(String value) {
            addCriterion("user_dept like", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptNotLike(String value) {
            addCriterion("user_dept not like", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptIn(List<String> values) {
            addCriterion("user_dept in", values, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptNotIn(List<String> values) {
            addCriterion("user_dept not in", values, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptBetween(String value1, String value2) {
            addCriterion("user_dept between", value1, value2, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptNotBetween(String value1, String value2) {
            addCriterion("user_dept not between", value1, value2, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserDespIsNull() {
            addCriterion("user_desp is null");
            return (Criteria) this;
        }

        public Criteria andUserDespIsNotNull() {
            addCriterion("user_desp is not null");
            return (Criteria) this;
        }

        public Criteria andUserDespEqualTo(String value) {
            addCriterion("user_desp =", value, "userDesp");
            return (Criteria) this;
        }

        public Criteria andUserDespNotEqualTo(String value) {
            addCriterion("user_desp <>", value, "userDesp");
            return (Criteria) this;
        }

        public Criteria andUserDespGreaterThan(String value) {
            addCriterion("user_desp >", value, "userDesp");
            return (Criteria) this;
        }

        public Criteria andUserDespGreaterThanOrEqualTo(String value) {
            addCriterion("user_desp >=", value, "userDesp");
            return (Criteria) this;
        }

        public Criteria andUserDespLessThan(String value) {
            addCriterion("user_desp <", value, "userDesp");
            return (Criteria) this;
        }

        public Criteria andUserDespLessThanOrEqualTo(String value) {
            addCriterion("user_desp <=", value, "userDesp");
            return (Criteria) this;
        }

        public Criteria andUserDespLike(String value) {
            addCriterion("user_desp like", value, "userDesp");
            return (Criteria) this;
        }

        public Criteria andUserDespNotLike(String value) {
            addCriterion("user_desp not like", value, "userDesp");
            return (Criteria) this;
        }

        public Criteria andUserDespIn(List<String> values) {
            addCriterion("user_desp in", values, "userDesp");
            return (Criteria) this;
        }

        public Criteria andUserDespNotIn(List<String> values) {
            addCriterion("user_desp not in", values, "userDesp");
            return (Criteria) this;
        }

        public Criteria andUserDespBetween(String value1, String value2) {
            addCriterion("user_desp between", value1, value2, "userDesp");
            return (Criteria) this;
        }

        public Criteria andUserDespNotBetween(String value1, String value2) {
            addCriterion("user_desp not between", value1, value2, "userDesp");
            return (Criteria) this;
        }

        public Criteria andUserNamecheckIsNull() {
            addCriterion("user_namecheck is null");
            return (Criteria) this;
        }

        public Criteria andUserNamecheckIsNotNull() {
            addCriterion("user_namecheck is not null");
            return (Criteria) this;
        }

        public Criteria andUserNamecheckEqualTo(String value) {
            addCriterion("user_namecheck =", value, "userNamecheck");
            return (Criteria) this;
        }

        public Criteria andUserNamecheckNotEqualTo(String value) {
            addCriterion("user_namecheck <>", value, "userNamecheck");
            return (Criteria) this;
        }

        public Criteria andUserNamecheckGreaterThan(String value) {
            addCriterion("user_namecheck >", value, "userNamecheck");
            return (Criteria) this;
        }

        public Criteria andUserNamecheckGreaterThanOrEqualTo(String value) {
            addCriterion("user_namecheck >=", value, "userNamecheck");
            return (Criteria) this;
        }

        public Criteria andUserNamecheckLessThan(String value) {
            addCriterion("user_namecheck <", value, "userNamecheck");
            return (Criteria) this;
        }

        public Criteria andUserNamecheckLessThanOrEqualTo(String value) {
            addCriterion("user_namecheck <=", value, "userNamecheck");
            return (Criteria) this;
        }

        public Criteria andUserNamecheckLike(String value) {
            addCriterion("user_namecheck like", value, "userNamecheck");
            return (Criteria) this;
        }

        public Criteria andUserNamecheckNotLike(String value) {
            addCriterion("user_namecheck not like", value, "userNamecheck");
            return (Criteria) this;
        }

        public Criteria andUserNamecheckIn(List<String> values) {
            addCriterion("user_namecheck in", values, "userNamecheck");
            return (Criteria) this;
        }

        public Criteria andUserNamecheckNotIn(List<String> values) {
            addCriterion("user_namecheck not in", values, "userNamecheck");
            return (Criteria) this;
        }

        public Criteria andUserNamecheckBetween(String value1, String value2) {
            addCriterion("user_namecheck between", value1, value2, "userNamecheck");
            return (Criteria) this;
        }

        public Criteria andUserNamecheckNotBetween(String value1, String value2) {
            addCriterion("user_namecheck not between", value1, value2, "userNamecheck");
            return (Criteria) this;
        }

        public Criteria andUserCreditlevelIsNull() {
            addCriterion("user_creditlevel is null");
            return (Criteria) this;
        }

        public Criteria andUserCreditlevelIsNotNull() {
            addCriterion("user_creditlevel is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreditlevelEqualTo(Integer value) {
            addCriterion("user_creditlevel =", value, "userCreditlevel");
            return (Criteria) this;
        }

        public Criteria andUserCreditlevelNotEqualTo(Integer value) {
            addCriterion("user_creditlevel <>", value, "userCreditlevel");
            return (Criteria) this;
        }

        public Criteria andUserCreditlevelGreaterThan(Integer value) {
            addCriterion("user_creditlevel >", value, "userCreditlevel");
            return (Criteria) this;
        }

        public Criteria andUserCreditlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_creditlevel >=", value, "userCreditlevel");
            return (Criteria) this;
        }

        public Criteria andUserCreditlevelLessThan(Integer value) {
            addCriterion("user_creditlevel <", value, "userCreditlevel");
            return (Criteria) this;
        }

        public Criteria andUserCreditlevelLessThanOrEqualTo(Integer value) {
            addCriterion("user_creditlevel <=", value, "userCreditlevel");
            return (Criteria) this;
        }

        public Criteria andUserCreditlevelIn(List<Integer> values) {
            addCriterion("user_creditlevel in", values, "userCreditlevel");
            return (Criteria) this;
        }

        public Criteria andUserCreditlevelNotIn(List<Integer> values) {
            addCriterion("user_creditlevel not in", values, "userCreditlevel");
            return (Criteria) this;
        }

        public Criteria andUserCreditlevelBetween(Integer value1, Integer value2) {
            addCriterion("user_creditlevel between", value1, value2, "userCreditlevel");
            return (Criteria) this;
        }

        public Criteria andUserCreditlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("user_creditlevel not between", value1, value2, "userCreditlevel");
            return (Criteria) this;
        }

        public Criteria andUserMessagelevelIsNull() {
            addCriterion("user_messagelevel is null");
            return (Criteria) this;
        }

        public Criteria andUserMessagelevelIsNotNull() {
            addCriterion("user_messagelevel is not null");
            return (Criteria) this;
        }

        public Criteria andUserMessagelevelEqualTo(String value) {
            addCriterion("user_messagelevel =", value, "userMessagelevel");
            return (Criteria) this;
        }

        public Criteria andUserMessagelevelNotEqualTo(String value) {
            addCriterion("user_messagelevel <>", value, "userMessagelevel");
            return (Criteria) this;
        }

        public Criteria andUserMessagelevelGreaterThan(String value) {
            addCriterion("user_messagelevel >", value, "userMessagelevel");
            return (Criteria) this;
        }

        public Criteria andUserMessagelevelGreaterThanOrEqualTo(String value) {
            addCriterion("user_messagelevel >=", value, "userMessagelevel");
            return (Criteria) this;
        }

        public Criteria andUserMessagelevelLessThan(String value) {
            addCriterion("user_messagelevel <", value, "userMessagelevel");
            return (Criteria) this;
        }

        public Criteria andUserMessagelevelLessThanOrEqualTo(String value) {
            addCriterion("user_messagelevel <=", value, "userMessagelevel");
            return (Criteria) this;
        }

        public Criteria andUserMessagelevelLike(String value) {
            addCriterion("user_messagelevel like", value, "userMessagelevel");
            return (Criteria) this;
        }

        public Criteria andUserMessagelevelNotLike(String value) {
            addCriterion("user_messagelevel not like", value, "userMessagelevel");
            return (Criteria) this;
        }

        public Criteria andUserMessagelevelIn(List<String> values) {
            addCriterion("user_messagelevel in", values, "userMessagelevel");
            return (Criteria) this;
        }

        public Criteria andUserMessagelevelNotIn(List<String> values) {
            addCriterion("user_messagelevel not in", values, "userMessagelevel");
            return (Criteria) this;
        }

        public Criteria andUserMessagelevelBetween(String value1, String value2) {
            addCriterion("user_messagelevel between", value1, value2, "userMessagelevel");
            return (Criteria) this;
        }

        public Criteria andUserMessagelevelNotBetween(String value1, String value2) {
            addCriterion("user_messagelevel not between", value1, value2, "userMessagelevel");
            return (Criteria) this;
        }

        public Criteria andUserPointIsNull() {
            addCriterion("user_point is null");
            return (Criteria) this;
        }

        public Criteria andUserPointIsNotNull() {
            addCriterion("user_point is not null");
            return (Criteria) this;
        }

        public Criteria andUserPointEqualTo(Integer value) {
            addCriterion("user_point =", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointNotEqualTo(Integer value) {
            addCriterion("user_point <>", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointGreaterThan(Integer value) {
            addCriterion("user_point >", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_point >=", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointLessThan(Integer value) {
            addCriterion("user_point <", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointLessThanOrEqualTo(Integer value) {
            addCriterion("user_point <=", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointIn(List<Integer> values) {
            addCriterion("user_point in", values, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointNotIn(List<Integer> values) {
            addCriterion("user_point not in", values, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointBetween(Integer value1, Integer value2) {
            addCriterion("user_point between", value1, value2, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointNotBetween(Integer value1, Integer value2) {
            addCriterion("user_point not between", value1, value2, "userPoint");
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