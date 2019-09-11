package com.monster.zhaqsq.bean;

import java.util.ArrayList;
import java.util.List;

public class RequestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RequestExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rId is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rId is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rId =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rId <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rId >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rId >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rId <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rId <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rId in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rId not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rId between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rId not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andNotifytypeIsNull() {
            addCriterion("notifyType is null");
            return (Criteria) this;
        }

        public Criteria andNotifytypeIsNotNull() {
            addCriterion("notifyType is not null");
            return (Criteria) this;
        }

        public Criteria andNotifytypeEqualTo(String value) {
            addCriterion("notifyType =", value, "notifytype");
            return (Criteria) this;
        }

        public Criteria andNotifytypeNotEqualTo(String value) {
            addCriterion("notifyType <>", value, "notifytype");
            return (Criteria) this;
        }

        public Criteria andNotifytypeGreaterThan(String value) {
            addCriterion("notifyType >", value, "notifytype");
            return (Criteria) this;
        }

        public Criteria andNotifytypeGreaterThanOrEqualTo(String value) {
            addCriterion("notifyType >=", value, "notifytype");
            return (Criteria) this;
        }

        public Criteria andNotifytypeLessThan(String value) {
            addCriterion("notifyType <", value, "notifytype");
            return (Criteria) this;
        }

        public Criteria andNotifytypeLessThanOrEqualTo(String value) {
            addCriterion("notifyType <=", value, "notifytype");
            return (Criteria) this;
        }

        public Criteria andNotifytypeLike(String value) {
            addCriterion("notifyType like", value, "notifytype");
            return (Criteria) this;
        }

        public Criteria andNotifytypeNotLike(String value) {
            addCriterion("notifyType not like", value, "notifytype");
            return (Criteria) this;
        }

        public Criteria andNotifytypeIn(List<String> values) {
            addCriterion("notifyType in", values, "notifytype");
            return (Criteria) this;
        }

        public Criteria andNotifytypeNotIn(List<String> values) {
            addCriterion("notifyType not in", values, "notifytype");
            return (Criteria) this;
        }

        public Criteria andNotifytypeBetween(String value1, String value2) {
            addCriterion("notifyType between", value1, value2, "notifytype");
            return (Criteria) this;
        }

        public Criteria andNotifytypeNotBetween(String value1, String value2) {
            addCriterion("notifyType not between", value1, value2, "notifytype");
            return (Criteria) this;
        }

        public Criteria andRequestidIsNull() {
            addCriterion("requestId is null");
            return (Criteria) this;
        }

        public Criteria andRequestidIsNotNull() {
            addCriterion("requestId is not null");
            return (Criteria) this;
        }

        public Criteria andRequestidEqualTo(String value) {
            addCriterion("requestId =", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotEqualTo(String value) {
            addCriterion("requestId <>", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidGreaterThan(String value) {
            addCriterion("requestId >", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidGreaterThanOrEqualTo(String value) {
            addCriterion("requestId >=", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLessThan(String value) {
            addCriterion("requestId <", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLessThanOrEqualTo(String value) {
            addCriterion("requestId <=", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLike(String value) {
            addCriterion("requestId like", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotLike(String value) {
            addCriterion("requestId not like", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidIn(List<String> values) {
            addCriterion("requestId in", values, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotIn(List<String> values) {
            addCriterion("requestId not in", values, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidBetween(String value1, String value2) {
            addCriterion("requestId between", value1, value2, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotBetween(String value1, String value2) {
            addCriterion("requestId not between", value1, value2, "requestid");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNull() {
            addCriterion("deviceId is null");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNotNull() {
            addCriterion("deviceId is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceidEqualTo(String value) {
            addCriterion("deviceId =", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotEqualTo(String value) {
            addCriterion("deviceId <>", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThan(String value) {
            addCriterion("deviceId >", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThanOrEqualTo(String value) {
            addCriterion("deviceId >=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThan(String value) {
            addCriterion("deviceId <", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThanOrEqualTo(String value) {
            addCriterion("deviceId <=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLike(String value) {
            addCriterion("deviceId like", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotLike(String value) {
            addCriterion("deviceId not like", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidIn(List<String> values) {
            addCriterion("deviceId in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotIn(List<String> values) {
            addCriterion("deviceId not in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidBetween(String value1, String value2) {
            addCriterion("deviceId between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotBetween(String value1, String value2) {
            addCriterion("deviceId not between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andGatewayidIsNull() {
            addCriterion("gatewayId is null");
            return (Criteria) this;
        }

        public Criteria andGatewayidIsNotNull() {
            addCriterion("gatewayId is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayidEqualTo(String value) {
            addCriterion("gatewayId =", value, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidNotEqualTo(String value) {
            addCriterion("gatewayId <>", value, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidGreaterThan(String value) {
            addCriterion("gatewayId >", value, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidGreaterThanOrEqualTo(String value) {
            addCriterion("gatewayId >=", value, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidLessThan(String value) {
            addCriterion("gatewayId <", value, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidLessThanOrEqualTo(String value) {
            addCriterion("gatewayId <=", value, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidLike(String value) {
            addCriterion("gatewayId like", value, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidNotLike(String value) {
            addCriterion("gatewayId not like", value, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidIn(List<String> values) {
            addCriterion("gatewayId in", values, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidNotIn(List<String> values) {
            addCriterion("gatewayId not in", values, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidBetween(String value1, String value2) {
            addCriterion("gatewayId between", value1, value2, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andGatewayidNotBetween(String value1, String value2) {
            addCriterion("gatewayId not between", value1, value2, "gatewayid");
            return (Criteria) this;
        }

        public Criteria andServiceidIsNull() {
            addCriterion("serviceId is null");
            return (Criteria) this;
        }

        public Criteria andServiceidIsNotNull() {
            addCriterion("serviceId is not null");
            return (Criteria) this;
        }

        public Criteria andServiceidEqualTo(String value) {
            addCriterion("serviceId =", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotEqualTo(String value) {
            addCriterion("serviceId <>", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThan(String value) {
            addCriterion("serviceId >", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThanOrEqualTo(String value) {
            addCriterion("serviceId >=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThan(String value) {
            addCriterion("serviceId <", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThanOrEqualTo(String value) {
            addCriterion("serviceId <=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLike(String value) {
            addCriterion("serviceId like", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotLike(String value) {
            addCriterion("serviceId not like", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidIn(List<String> values) {
            addCriterion("serviceId in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotIn(List<String> values) {
            addCriterion("serviceId not in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidBetween(String value1, String value2) {
            addCriterion("serviceId between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotBetween(String value1, String value2) {
            addCriterion("serviceId not between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServicetypeIsNull() {
            addCriterion("serviceType is null");
            return (Criteria) this;
        }

        public Criteria andServicetypeIsNotNull() {
            addCriterion("serviceType is not null");
            return (Criteria) this;
        }

        public Criteria andServicetypeEqualTo(String value) {
            addCriterion("serviceType =", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotEqualTo(String value) {
            addCriterion("serviceType <>", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeGreaterThan(String value) {
            addCriterion("serviceType >", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeGreaterThanOrEqualTo(String value) {
            addCriterion("serviceType >=", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeLessThan(String value) {
            addCriterion("serviceType <", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeLessThanOrEqualTo(String value) {
            addCriterion("serviceType <=", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeLike(String value) {
            addCriterion("serviceType like", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotLike(String value) {
            addCriterion("serviceType not like", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeIn(List<String> values) {
            addCriterion("serviceType in", values, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotIn(List<String> values) {
            addCriterion("serviceType not in", values, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeBetween(String value1, String value2) {
            addCriterion("serviceType between", value1, value2, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotBetween(String value1, String value2) {
            addCriterion("serviceType not between", value1, value2, "servicetype");
            return (Criteria) this;
        }

        public Criteria andDevicenumberIsNull() {
            addCriterion("deviceNumber is null");
            return (Criteria) this;
        }

        public Criteria andDevicenumberIsNotNull() {
            addCriterion("deviceNumber is not null");
            return (Criteria) this;
        }

        public Criteria andDevicenumberEqualTo(String value) {
            addCriterion("deviceNumber =", value, "devicenumber");
            return (Criteria) this;
        }

        public Criteria andDevicenumberNotEqualTo(String value) {
            addCriterion("deviceNumber <>", value, "devicenumber");
            return (Criteria) this;
        }

        public Criteria andDevicenumberGreaterThan(String value) {
            addCriterion("deviceNumber >", value, "devicenumber");
            return (Criteria) this;
        }

        public Criteria andDevicenumberGreaterThanOrEqualTo(String value) {
            addCriterion("deviceNumber >=", value, "devicenumber");
            return (Criteria) this;
        }

        public Criteria andDevicenumberLessThan(String value) {
            addCriterion("deviceNumber <", value, "devicenumber");
            return (Criteria) this;
        }

        public Criteria andDevicenumberLessThanOrEqualTo(String value) {
            addCriterion("deviceNumber <=", value, "devicenumber");
            return (Criteria) this;
        }

        public Criteria andDevicenumberLike(String value) {
            addCriterion("deviceNumber like", value, "devicenumber");
            return (Criteria) this;
        }

        public Criteria andDevicenumberNotLike(String value) {
            addCriterion("deviceNumber not like", value, "devicenumber");
            return (Criteria) this;
        }

        public Criteria andDevicenumberIn(List<String> values) {
            addCriterion("deviceNumber in", values, "devicenumber");
            return (Criteria) this;
        }

        public Criteria andDevicenumberNotIn(List<String> values) {
            addCriterion("deviceNumber not in", values, "devicenumber");
            return (Criteria) this;
        }

        public Criteria andDevicenumberBetween(String value1, String value2) {
            addCriterion("deviceNumber between", value1, value2, "devicenumber");
            return (Criteria) this;
        }

        public Criteria andDevicenumberNotBetween(String value1, String value2) {
            addCriterion("deviceNumber not between", value1, value2, "devicenumber");
            return (Criteria) this;
        }

        public Criteria andDimensionIsNull() {
            addCriterion("dimension is null");
            return (Criteria) this;
        }

        public Criteria andDimensionIsNotNull() {
            addCriterion("dimension is not null");
            return (Criteria) this;
        }

        public Criteria andDimensionEqualTo(String value) {
            addCriterion("dimension =", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionNotEqualTo(String value) {
            addCriterion("dimension <>", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionGreaterThan(String value) {
            addCriterion("dimension >", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionGreaterThanOrEqualTo(String value) {
            addCriterion("dimension >=", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionLessThan(String value) {
            addCriterion("dimension <", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionLessThanOrEqualTo(String value) {
            addCriterion("dimension <=", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionLike(String value) {
            addCriterion("dimension like", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionNotLike(String value) {
            addCriterion("dimension not like", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionIn(List<String> values) {
            addCriterion("dimension in", values, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionNotIn(List<String> values) {
            addCriterion("dimension not in", values, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionBetween(String value1, String value2) {
            addCriterion("dimension between", value1, value2, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionNotBetween(String value1, String value2) {
            addCriterion("dimension not between", value1, value2, "dimension");
            return (Criteria) this;
        }

        public Criteria andNsflagIsNull() {
            addCriterion("NSFlag is null");
            return (Criteria) this;
        }

        public Criteria andNsflagIsNotNull() {
            addCriterion("NSFlag is not null");
            return (Criteria) this;
        }

        public Criteria andNsflagEqualTo(String value) {
            addCriterion("NSFlag =", value, "nsflag");
            return (Criteria) this;
        }

        public Criteria andNsflagNotEqualTo(String value) {
            addCriterion("NSFlag <>", value, "nsflag");
            return (Criteria) this;
        }

        public Criteria andNsflagGreaterThan(String value) {
            addCriterion("NSFlag >", value, "nsflag");
            return (Criteria) this;
        }

        public Criteria andNsflagGreaterThanOrEqualTo(String value) {
            addCriterion("NSFlag >=", value, "nsflag");
            return (Criteria) this;
        }

        public Criteria andNsflagLessThan(String value) {
            addCriterion("NSFlag <", value, "nsflag");
            return (Criteria) this;
        }

        public Criteria andNsflagLessThanOrEqualTo(String value) {
            addCriterion("NSFlag <=", value, "nsflag");
            return (Criteria) this;
        }

        public Criteria andNsflagLike(String value) {
            addCriterion("NSFlag like", value, "nsflag");
            return (Criteria) this;
        }

        public Criteria andNsflagNotLike(String value) {
            addCriterion("NSFlag not like", value, "nsflag");
            return (Criteria) this;
        }

        public Criteria andNsflagIn(List<String> values) {
            addCriterion("NSFlag in", values, "nsflag");
            return (Criteria) this;
        }

        public Criteria andNsflagNotIn(List<String> values) {
            addCriterion("NSFlag not in", values, "nsflag");
            return (Criteria) this;
        }

        public Criteria andNsflagBetween(String value1, String value2) {
            addCriterion("NSFlag between", value1, value2, "nsflag");
            return (Criteria) this;
        }

        public Criteria andNsflagNotBetween(String value1, String value2) {
            addCriterion("NSFlag not between", value1, value2, "nsflag");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andWeflagIsNull() {
            addCriterion("WEFlag is null");
            return (Criteria) this;
        }

        public Criteria andWeflagIsNotNull() {
            addCriterion("WEFlag is not null");
            return (Criteria) this;
        }

        public Criteria andWeflagEqualTo(String value) {
            addCriterion("WEFlag =", value, "weflag");
            return (Criteria) this;
        }

        public Criteria andWeflagNotEqualTo(String value) {
            addCriterion("WEFlag <>", value, "weflag");
            return (Criteria) this;
        }

        public Criteria andWeflagGreaterThan(String value) {
            addCriterion("WEFlag >", value, "weflag");
            return (Criteria) this;
        }

        public Criteria andWeflagGreaterThanOrEqualTo(String value) {
            addCriterion("WEFlag >=", value, "weflag");
            return (Criteria) this;
        }

        public Criteria andWeflagLessThan(String value) {
            addCriterion("WEFlag <", value, "weflag");
            return (Criteria) this;
        }

        public Criteria andWeflagLessThanOrEqualTo(String value) {
            addCriterion("WEFlag <=", value, "weflag");
            return (Criteria) this;
        }

        public Criteria andWeflagLike(String value) {
            addCriterion("WEFlag like", value, "weflag");
            return (Criteria) this;
        }

        public Criteria andWeflagNotLike(String value) {
            addCriterion("WEFlag not like", value, "weflag");
            return (Criteria) this;
        }

        public Criteria andWeflagIn(List<String> values) {
            addCriterion("WEFlag in", values, "weflag");
            return (Criteria) this;
        }

        public Criteria andWeflagNotIn(List<String> values) {
            addCriterion("WEFlag not in", values, "weflag");
            return (Criteria) this;
        }

        public Criteria andWeflagBetween(String value1, String value2) {
            addCriterion("WEFlag between", value1, value2, "weflag");
            return (Criteria) this;
        }

        public Criteria andWeflagNotBetween(String value1, String value2) {
            addCriterion("WEFlag not between", value1, value2, "weflag");
            return (Criteria) this;
        }

        public Criteria andEventtimeIsNull() {
            addCriterion("eventTime is null");
            return (Criteria) this;
        }

        public Criteria andEventtimeIsNotNull() {
            addCriterion("eventTime is not null");
            return (Criteria) this;
        }

        public Criteria andEventtimeEqualTo(String value) {
            addCriterion("eventTime =", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeNotEqualTo(String value) {
            addCriterion("eventTime <>", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeGreaterThan(String value) {
            addCriterion("eventTime >", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeGreaterThanOrEqualTo(String value) {
            addCriterion("eventTime >=", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeLessThan(String value) {
            addCriterion("eventTime <", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeLessThanOrEqualTo(String value) {
            addCriterion("eventTime <=", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeLike(String value) {
            addCriterion("eventTime like", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeNotLike(String value) {
            addCriterion("eventTime not like", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeIn(List<String> values) {
            addCriterion("eventTime in", values, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeNotIn(List<String> values) {
            addCriterion("eventTime not in", values, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeBetween(String value1, String value2) {
            addCriterion("eventTime between", value1, value2, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeNotBetween(String value1, String value2) {
            addCriterion("eventTime not between", value1, value2, "eventtime");
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