package com.shanyutech.mingyu.mapper;

import java.util.Date;

public class TbOrder {
    private Long orderId;

    private String orderNo;

    private Date gmtCreate;

    private Date gmtModified;

    public TbOrder(Long orderId, String orderNo, Date gmtCreate, Date gmtModified) {
        this.orderId = orderId;
        this.orderNo = orderNo;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public TbOrder() {
        super();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
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