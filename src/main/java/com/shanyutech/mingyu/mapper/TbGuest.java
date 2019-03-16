package com.shanyutech.mingyu.mapper;

import java.util.Date;

public class TbGuest {
    private Long guestId;

    private Long guestMobile;

    private String guestName;

    private Integer guestAge;

    private String guestCerid;

    private String guestCity;

    private String guestAddress;

    private String guestProvince;

    private String guestFavor;

    private String guestWx;

    private String guestProfileid;

    private Date gmtCreate;

    private Date gmtModified;

    public TbGuest(Long guestId, Long guestMobile, String guestName, Integer guestAge, String guestCerid, String guestCity, String guestAddress, String guestProvince, String guestFavor, String guestWx, String guestProfileid, Date gmtCreate, Date gmtModified) {
        this.guestId = guestId;
        this.guestMobile = guestMobile;
        this.guestName = guestName;
        this.guestAge = guestAge;
        this.guestCerid = guestCerid;
        this.guestCity = guestCity;
        this.guestAddress = guestAddress;
        this.guestProvince = guestProvince;
        this.guestFavor = guestFavor;
        this.guestWx = guestWx;
        this.guestProfileid = guestProfileid;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public TbGuest() {
        super();
    }

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public Long getGuestMobile() {
        return guestMobile;
    }

    public void setGuestMobile(Long guestMobile) {
        this.guestMobile = guestMobile;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName == null ? null : guestName.trim();
    }

    public Integer getGuestAge() {
        return guestAge;
    }

    public void setGuestAge(Integer guestAge) {
        this.guestAge = guestAge;
    }

    public String getGuestCerid() {
        return guestCerid;
    }

    public void setGuestCerid(String guestCerid) {
        this.guestCerid = guestCerid == null ? null : guestCerid.trim();
    }

    public String getGuestCity() {
        return guestCity;
    }

    public void setGuestCity(String guestCity) {
        this.guestCity = guestCity == null ? null : guestCity.trim();
    }

    public String getGuestAddress() {
        return guestAddress;
    }

    public void setGuestAddress(String guestAddress) {
        this.guestAddress = guestAddress == null ? null : guestAddress.trim();
    }

    public String getGuestProvince() {
        return guestProvince;
    }

    public void setGuestProvince(String guestProvince) {
        this.guestProvince = guestProvince == null ? null : guestProvince.trim();
    }

    public String getGuestFavor() {
        return guestFavor;
    }

    public void setGuestFavor(String guestFavor) {
        this.guestFavor = guestFavor == null ? null : guestFavor.trim();
    }

    public String getGuestWx() {
        return guestWx;
    }

    public void setGuestWx(String guestWx) {
        this.guestWx = guestWx == null ? null : guestWx.trim();
    }

    public String getGuestProfileid() {
        return guestProfileid;
    }

    public void setGuestProfileid(String guestProfileid) {
        this.guestProfileid = guestProfileid == null ? null : guestProfileid.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}