package com.shanyutech.mingyu.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbGuestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbGuestExample() {
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

        public Criteria andGuestIdIsNull() {
            addCriterion("guest_id is null");
            return (Criteria) this;
        }

        public Criteria andGuestIdIsNotNull() {
            addCriterion("guest_id is not null");
            return (Criteria) this;
        }

        public Criteria andGuestIdEqualTo(Long value) {
            addCriterion("guest_id =", value, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdNotEqualTo(Long value) {
            addCriterion("guest_id <>", value, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdGreaterThan(Long value) {
            addCriterion("guest_id >", value, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdGreaterThanOrEqualTo(Long value) {
            addCriterion("guest_id >=", value, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdLessThan(Long value) {
            addCriterion("guest_id <", value, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdLessThanOrEqualTo(Long value) {
            addCriterion("guest_id <=", value, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdIn(List<Long> values) {
            addCriterion("guest_id in", values, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdNotIn(List<Long> values) {
            addCriterion("guest_id not in", values, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdBetween(Long value1, Long value2) {
            addCriterion("guest_id between", value1, value2, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdNotBetween(Long value1, Long value2) {
            addCriterion("guest_id not between", value1, value2, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestMobileIsNull() {
            addCriterion("guest_mobile is null");
            return (Criteria) this;
        }

        public Criteria andGuestMobileIsNotNull() {
            addCriterion("guest_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andGuestMobileEqualTo(Long value) {
            addCriterion("guest_mobile =", value, "guestMobile");
            return (Criteria) this;
        }

        public Criteria andGuestMobileNotEqualTo(Long value) {
            addCriterion("guest_mobile <>", value, "guestMobile");
            return (Criteria) this;
        }

        public Criteria andGuestMobileGreaterThan(Long value) {
            addCriterion("guest_mobile >", value, "guestMobile");
            return (Criteria) this;
        }

        public Criteria andGuestMobileGreaterThanOrEqualTo(Long value) {
            addCriterion("guest_mobile >=", value, "guestMobile");
            return (Criteria) this;
        }

        public Criteria andGuestMobileLessThan(Long value) {
            addCriterion("guest_mobile <", value, "guestMobile");
            return (Criteria) this;
        }

        public Criteria andGuestMobileLessThanOrEqualTo(Long value) {
            addCriterion("guest_mobile <=", value, "guestMobile");
            return (Criteria) this;
        }

        public Criteria andGuestMobileIn(List<Long> values) {
            addCriterion("guest_mobile in", values, "guestMobile");
            return (Criteria) this;
        }

        public Criteria andGuestMobileNotIn(List<Long> values) {
            addCriterion("guest_mobile not in", values, "guestMobile");
            return (Criteria) this;
        }

        public Criteria andGuestMobileBetween(Long value1, Long value2) {
            addCriterion("guest_mobile between", value1, value2, "guestMobile");
            return (Criteria) this;
        }

        public Criteria andGuestMobileNotBetween(Long value1, Long value2) {
            addCriterion("guest_mobile not between", value1, value2, "guestMobile");
            return (Criteria) this;
        }

        public Criteria andGuestNameIsNull() {
            addCriterion("guest_name is null");
            return (Criteria) this;
        }

        public Criteria andGuestNameIsNotNull() {
            addCriterion("guest_name is not null");
            return (Criteria) this;
        }

        public Criteria andGuestNameEqualTo(String value) {
            addCriterion("guest_name =", value, "guestName");
            return (Criteria) this;
        }

        public Criteria andGuestNameNotEqualTo(String value) {
            addCriterion("guest_name <>", value, "guestName");
            return (Criteria) this;
        }

        public Criteria andGuestNameGreaterThan(String value) {
            addCriterion("guest_name >", value, "guestName");
            return (Criteria) this;
        }

        public Criteria andGuestNameGreaterThanOrEqualTo(String value) {
            addCriterion("guest_name >=", value, "guestName");
            return (Criteria) this;
        }

        public Criteria andGuestNameLessThan(String value) {
            addCriterion("guest_name <", value, "guestName");
            return (Criteria) this;
        }

        public Criteria andGuestNameLessThanOrEqualTo(String value) {
            addCriterion("guest_name <=", value, "guestName");
            return (Criteria) this;
        }

        public Criteria andGuestNameLike(String value) {
            addCriterion("guest_name like", value, "guestName");
            return (Criteria) this;
        }

        public Criteria andGuestNameNotLike(String value) {
            addCriterion("guest_name not like", value, "guestName");
            return (Criteria) this;
        }

        public Criteria andGuestNameIn(List<String> values) {
            addCriterion("guest_name in", values, "guestName");
            return (Criteria) this;
        }

        public Criteria andGuestNameNotIn(List<String> values) {
            addCriterion("guest_name not in", values, "guestName");
            return (Criteria) this;
        }

        public Criteria andGuestNameBetween(String value1, String value2) {
            addCriterion("guest_name between", value1, value2, "guestName");
            return (Criteria) this;
        }

        public Criteria andGuestNameNotBetween(String value1, String value2) {
            addCriterion("guest_name not between", value1, value2, "guestName");
            return (Criteria) this;
        }

        public Criteria andGuestAgeIsNull() {
            addCriterion("guest_age is null");
            return (Criteria) this;
        }

        public Criteria andGuestAgeIsNotNull() {
            addCriterion("guest_age is not null");
            return (Criteria) this;
        }

        public Criteria andGuestAgeEqualTo(Integer value) {
            addCriterion("guest_age =", value, "guestAge");
            return (Criteria) this;
        }

        public Criteria andGuestAgeNotEqualTo(Integer value) {
            addCriterion("guest_age <>", value, "guestAge");
            return (Criteria) this;
        }

        public Criteria andGuestAgeGreaterThan(Integer value) {
            addCriterion("guest_age >", value, "guestAge");
            return (Criteria) this;
        }

        public Criteria andGuestAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("guest_age >=", value, "guestAge");
            return (Criteria) this;
        }

        public Criteria andGuestAgeLessThan(Integer value) {
            addCriterion("guest_age <", value, "guestAge");
            return (Criteria) this;
        }

        public Criteria andGuestAgeLessThanOrEqualTo(Integer value) {
            addCriterion("guest_age <=", value, "guestAge");
            return (Criteria) this;
        }

        public Criteria andGuestAgeIn(List<Integer> values) {
            addCriterion("guest_age in", values, "guestAge");
            return (Criteria) this;
        }

        public Criteria andGuestAgeNotIn(List<Integer> values) {
            addCriterion("guest_age not in", values, "guestAge");
            return (Criteria) this;
        }

        public Criteria andGuestAgeBetween(Integer value1, Integer value2) {
            addCriterion("guest_age between", value1, value2, "guestAge");
            return (Criteria) this;
        }

        public Criteria andGuestAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("guest_age not between", value1, value2, "guestAge");
            return (Criteria) this;
        }

        public Criteria andGuestCeridIsNull() {
            addCriterion("guest_cerId is null");
            return (Criteria) this;
        }

        public Criteria andGuestCeridIsNotNull() {
            addCriterion("guest_cerId is not null");
            return (Criteria) this;
        }

        public Criteria andGuestCeridEqualTo(String value) {
            addCriterion("guest_cerId =", value, "guestCerid");
            return (Criteria) this;
        }

        public Criteria andGuestCeridNotEqualTo(String value) {
            addCriterion("guest_cerId <>", value, "guestCerid");
            return (Criteria) this;
        }

        public Criteria andGuestCeridGreaterThan(String value) {
            addCriterion("guest_cerId >", value, "guestCerid");
            return (Criteria) this;
        }

        public Criteria andGuestCeridGreaterThanOrEqualTo(String value) {
            addCriterion("guest_cerId >=", value, "guestCerid");
            return (Criteria) this;
        }

        public Criteria andGuestCeridLessThan(String value) {
            addCriterion("guest_cerId <", value, "guestCerid");
            return (Criteria) this;
        }

        public Criteria andGuestCeridLessThanOrEqualTo(String value) {
            addCriterion("guest_cerId <=", value, "guestCerid");
            return (Criteria) this;
        }

        public Criteria andGuestCeridLike(String value) {
            addCriterion("guest_cerId like", value, "guestCerid");
            return (Criteria) this;
        }

        public Criteria andGuestCeridNotLike(String value) {
            addCriterion("guest_cerId not like", value, "guestCerid");
            return (Criteria) this;
        }

        public Criteria andGuestCeridIn(List<String> values) {
            addCriterion("guest_cerId in", values, "guestCerid");
            return (Criteria) this;
        }

        public Criteria andGuestCeridNotIn(List<String> values) {
            addCriterion("guest_cerId not in", values, "guestCerid");
            return (Criteria) this;
        }

        public Criteria andGuestCeridBetween(String value1, String value2) {
            addCriterion("guest_cerId between", value1, value2, "guestCerid");
            return (Criteria) this;
        }

        public Criteria andGuestCeridNotBetween(String value1, String value2) {
            addCriterion("guest_cerId not between", value1, value2, "guestCerid");
            return (Criteria) this;
        }

        public Criteria andGuestCityIsNull() {
            addCriterion("guest_city is null");
            return (Criteria) this;
        }

        public Criteria andGuestCityIsNotNull() {
            addCriterion("guest_city is not null");
            return (Criteria) this;
        }

        public Criteria andGuestCityEqualTo(String value) {
            addCriterion("guest_city =", value, "guestCity");
            return (Criteria) this;
        }

        public Criteria andGuestCityNotEqualTo(String value) {
            addCriterion("guest_city <>", value, "guestCity");
            return (Criteria) this;
        }

        public Criteria andGuestCityGreaterThan(String value) {
            addCriterion("guest_city >", value, "guestCity");
            return (Criteria) this;
        }

        public Criteria andGuestCityGreaterThanOrEqualTo(String value) {
            addCriterion("guest_city >=", value, "guestCity");
            return (Criteria) this;
        }

        public Criteria andGuestCityLessThan(String value) {
            addCriterion("guest_city <", value, "guestCity");
            return (Criteria) this;
        }

        public Criteria andGuestCityLessThanOrEqualTo(String value) {
            addCriterion("guest_city <=", value, "guestCity");
            return (Criteria) this;
        }

        public Criteria andGuestCityLike(String value) {
            addCriterion("guest_city like", value, "guestCity");
            return (Criteria) this;
        }

        public Criteria andGuestCityNotLike(String value) {
            addCriterion("guest_city not like", value, "guestCity");
            return (Criteria) this;
        }

        public Criteria andGuestCityIn(List<String> values) {
            addCriterion("guest_city in", values, "guestCity");
            return (Criteria) this;
        }

        public Criteria andGuestCityNotIn(List<String> values) {
            addCriterion("guest_city not in", values, "guestCity");
            return (Criteria) this;
        }

        public Criteria andGuestCityBetween(String value1, String value2) {
            addCriterion("guest_city between", value1, value2, "guestCity");
            return (Criteria) this;
        }

        public Criteria andGuestCityNotBetween(String value1, String value2) {
            addCriterion("guest_city not between", value1, value2, "guestCity");
            return (Criteria) this;
        }

        public Criteria andGuestAddressIsNull() {
            addCriterion("guest_address is null");
            return (Criteria) this;
        }

        public Criteria andGuestAddressIsNotNull() {
            addCriterion("guest_address is not null");
            return (Criteria) this;
        }

        public Criteria andGuestAddressEqualTo(String value) {
            addCriterion("guest_address =", value, "guestAddress");
            return (Criteria) this;
        }

        public Criteria andGuestAddressNotEqualTo(String value) {
            addCriterion("guest_address <>", value, "guestAddress");
            return (Criteria) this;
        }

        public Criteria andGuestAddressGreaterThan(String value) {
            addCriterion("guest_address >", value, "guestAddress");
            return (Criteria) this;
        }

        public Criteria andGuestAddressGreaterThanOrEqualTo(String value) {
            addCriterion("guest_address >=", value, "guestAddress");
            return (Criteria) this;
        }

        public Criteria andGuestAddressLessThan(String value) {
            addCriterion("guest_address <", value, "guestAddress");
            return (Criteria) this;
        }

        public Criteria andGuestAddressLessThanOrEqualTo(String value) {
            addCriterion("guest_address <=", value, "guestAddress");
            return (Criteria) this;
        }

        public Criteria andGuestAddressLike(String value) {
            addCriterion("guest_address like", value, "guestAddress");
            return (Criteria) this;
        }

        public Criteria andGuestAddressNotLike(String value) {
            addCriterion("guest_address not like", value, "guestAddress");
            return (Criteria) this;
        }

        public Criteria andGuestAddressIn(List<String> values) {
            addCriterion("guest_address in", values, "guestAddress");
            return (Criteria) this;
        }

        public Criteria andGuestAddressNotIn(List<String> values) {
            addCriterion("guest_address not in", values, "guestAddress");
            return (Criteria) this;
        }

        public Criteria andGuestAddressBetween(String value1, String value2) {
            addCriterion("guest_address between", value1, value2, "guestAddress");
            return (Criteria) this;
        }

        public Criteria andGuestAddressNotBetween(String value1, String value2) {
            addCriterion("guest_address not between", value1, value2, "guestAddress");
            return (Criteria) this;
        }

        public Criteria andGuestProvinceIsNull() {
            addCriterion("guest_province is null");
            return (Criteria) this;
        }

        public Criteria andGuestProvinceIsNotNull() {
            addCriterion("guest_province is not null");
            return (Criteria) this;
        }

        public Criteria andGuestProvinceEqualTo(String value) {
            addCriterion("guest_province =", value, "guestProvince");
            return (Criteria) this;
        }

        public Criteria andGuestProvinceNotEqualTo(String value) {
            addCriterion("guest_province <>", value, "guestProvince");
            return (Criteria) this;
        }

        public Criteria andGuestProvinceGreaterThan(String value) {
            addCriterion("guest_province >", value, "guestProvince");
            return (Criteria) this;
        }

        public Criteria andGuestProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("guest_province >=", value, "guestProvince");
            return (Criteria) this;
        }

        public Criteria andGuestProvinceLessThan(String value) {
            addCriterion("guest_province <", value, "guestProvince");
            return (Criteria) this;
        }

        public Criteria andGuestProvinceLessThanOrEqualTo(String value) {
            addCriterion("guest_province <=", value, "guestProvince");
            return (Criteria) this;
        }

        public Criteria andGuestProvinceLike(String value) {
            addCriterion("guest_province like", value, "guestProvince");
            return (Criteria) this;
        }

        public Criteria andGuestProvinceNotLike(String value) {
            addCriterion("guest_province not like", value, "guestProvince");
            return (Criteria) this;
        }

        public Criteria andGuestProvinceIn(List<String> values) {
            addCriterion("guest_province in", values, "guestProvince");
            return (Criteria) this;
        }

        public Criteria andGuestProvinceNotIn(List<String> values) {
            addCriterion("guest_province not in", values, "guestProvince");
            return (Criteria) this;
        }

        public Criteria andGuestProvinceBetween(String value1, String value2) {
            addCriterion("guest_province between", value1, value2, "guestProvince");
            return (Criteria) this;
        }

        public Criteria andGuestProvinceNotBetween(String value1, String value2) {
            addCriterion("guest_province not between", value1, value2, "guestProvince");
            return (Criteria) this;
        }

        public Criteria andGuestFavorIsNull() {
            addCriterion("guest_favor is null");
            return (Criteria) this;
        }

        public Criteria andGuestFavorIsNotNull() {
            addCriterion("guest_favor is not null");
            return (Criteria) this;
        }

        public Criteria andGuestFavorEqualTo(String value) {
            addCriterion("guest_favor =", value, "guestFavor");
            return (Criteria) this;
        }

        public Criteria andGuestFavorNotEqualTo(String value) {
            addCriterion("guest_favor <>", value, "guestFavor");
            return (Criteria) this;
        }

        public Criteria andGuestFavorGreaterThan(String value) {
            addCriterion("guest_favor >", value, "guestFavor");
            return (Criteria) this;
        }

        public Criteria andGuestFavorGreaterThanOrEqualTo(String value) {
            addCriterion("guest_favor >=", value, "guestFavor");
            return (Criteria) this;
        }

        public Criteria andGuestFavorLessThan(String value) {
            addCriterion("guest_favor <", value, "guestFavor");
            return (Criteria) this;
        }

        public Criteria andGuestFavorLessThanOrEqualTo(String value) {
            addCriterion("guest_favor <=", value, "guestFavor");
            return (Criteria) this;
        }

        public Criteria andGuestFavorLike(String value) {
            addCriterion("guest_favor like", value, "guestFavor");
            return (Criteria) this;
        }

        public Criteria andGuestFavorNotLike(String value) {
            addCriterion("guest_favor not like", value, "guestFavor");
            return (Criteria) this;
        }

        public Criteria andGuestFavorIn(List<String> values) {
            addCriterion("guest_favor in", values, "guestFavor");
            return (Criteria) this;
        }

        public Criteria andGuestFavorNotIn(List<String> values) {
            addCriterion("guest_favor not in", values, "guestFavor");
            return (Criteria) this;
        }

        public Criteria andGuestFavorBetween(String value1, String value2) {
            addCriterion("guest_favor between", value1, value2, "guestFavor");
            return (Criteria) this;
        }

        public Criteria andGuestFavorNotBetween(String value1, String value2) {
            addCriterion("guest_favor not between", value1, value2, "guestFavor");
            return (Criteria) this;
        }

        public Criteria andGuestWxIsNull() {
            addCriterion("guest_wx is null");
            return (Criteria) this;
        }

        public Criteria andGuestWxIsNotNull() {
            addCriterion("guest_wx is not null");
            return (Criteria) this;
        }

        public Criteria andGuestWxEqualTo(String value) {
            addCriterion("guest_wx =", value, "guestWx");
            return (Criteria) this;
        }

        public Criteria andGuestWxNotEqualTo(String value) {
            addCriterion("guest_wx <>", value, "guestWx");
            return (Criteria) this;
        }

        public Criteria andGuestWxGreaterThan(String value) {
            addCriterion("guest_wx >", value, "guestWx");
            return (Criteria) this;
        }

        public Criteria andGuestWxGreaterThanOrEqualTo(String value) {
            addCriterion("guest_wx >=", value, "guestWx");
            return (Criteria) this;
        }

        public Criteria andGuestWxLessThan(String value) {
            addCriterion("guest_wx <", value, "guestWx");
            return (Criteria) this;
        }

        public Criteria andGuestWxLessThanOrEqualTo(String value) {
            addCriterion("guest_wx <=", value, "guestWx");
            return (Criteria) this;
        }

        public Criteria andGuestWxLike(String value) {
            addCriterion("guest_wx like", value, "guestWx");
            return (Criteria) this;
        }

        public Criteria andGuestWxNotLike(String value) {
            addCriterion("guest_wx not like", value, "guestWx");
            return (Criteria) this;
        }

        public Criteria andGuestWxIn(List<String> values) {
            addCriterion("guest_wx in", values, "guestWx");
            return (Criteria) this;
        }

        public Criteria andGuestWxNotIn(List<String> values) {
            addCriterion("guest_wx not in", values, "guestWx");
            return (Criteria) this;
        }

        public Criteria andGuestWxBetween(String value1, String value2) {
            addCriterion("guest_wx between", value1, value2, "guestWx");
            return (Criteria) this;
        }

        public Criteria andGuestWxNotBetween(String value1, String value2) {
            addCriterion("guest_wx not between", value1, value2, "guestWx");
            return (Criteria) this;
        }

        public Criteria andGuestProfileidIsNull() {
            addCriterion("guest_profileId is null");
            return (Criteria) this;
        }

        public Criteria andGuestProfileidIsNotNull() {
            addCriterion("guest_profileId is not null");
            return (Criteria) this;
        }

        public Criteria andGuestProfileidEqualTo(String value) {
            addCriterion("guest_profileId =", value, "guestProfileid");
            return (Criteria) this;
        }

        public Criteria andGuestProfileidNotEqualTo(String value) {
            addCriterion("guest_profileId <>", value, "guestProfileid");
            return (Criteria) this;
        }

        public Criteria andGuestProfileidGreaterThan(String value) {
            addCriterion("guest_profileId >", value, "guestProfileid");
            return (Criteria) this;
        }

        public Criteria andGuestProfileidGreaterThanOrEqualTo(String value) {
            addCriterion("guest_profileId >=", value, "guestProfileid");
            return (Criteria) this;
        }

        public Criteria andGuestProfileidLessThan(String value) {
            addCriterion("guest_profileId <", value, "guestProfileid");
            return (Criteria) this;
        }

        public Criteria andGuestProfileidLessThanOrEqualTo(String value) {
            addCriterion("guest_profileId <=", value, "guestProfileid");
            return (Criteria) this;
        }

        public Criteria andGuestProfileidLike(String value) {
            addCriterion("guest_profileId like", value, "guestProfileid");
            return (Criteria) this;
        }

        public Criteria andGuestProfileidNotLike(String value) {
            addCriterion("guest_profileId not like", value, "guestProfileid");
            return (Criteria) this;
        }

        public Criteria andGuestProfileidIn(List<String> values) {
            addCriterion("guest_profileId in", values, "guestProfileid");
            return (Criteria) this;
        }

        public Criteria andGuestProfileidNotIn(List<String> values) {
            addCriterion("guest_profileId not in", values, "guestProfileid");
            return (Criteria) this;
        }

        public Criteria andGuestProfileidBetween(String value1, String value2) {
            addCriterion("guest_profileId between", value1, value2, "guestProfileid");
            return (Criteria) this;
        }

        public Criteria andGuestProfileidNotBetween(String value1, String value2) {
            addCriterion("guest_profileId not between", value1, value2, "guestProfileid");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
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