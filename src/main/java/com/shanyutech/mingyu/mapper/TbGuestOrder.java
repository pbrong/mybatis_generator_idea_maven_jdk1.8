package com.shanyutech.mingyu.mapper;

import java.math.BigDecimal;
import java.util.Date;

public class TbGuestOrder {
    private Long id;

    private Long guestId;

    private Long orderId;

    private BigDecimal price;

    private String hasPay;

    private String hasCancel;

    private String cancelReason;

    private Date payTime;

    private Date gmtCreate;

    private Date gmtModified;

    public TbGuestOrder(Long id, Long guestId, Long orderId, BigDecimal price, String hasPay, String hasCancel, String cancelReason, Date payTime, Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.guestId = guestId;
        this.orderId = orderId;
        this.price = price;
        this.hasPay = hasPay;
        this.hasCancel = hasCancel;
        this.cancelReason = cancelReason;
        this.payTime = payTime;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public TbGuestOrder() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getHasPay() {
        return hasPay;
    }

    public void setHasPay(String hasPay) {
        this.hasPay = hasPay == null ? null : hasPay.trim();
    }

    public String getHasCancel() {
        return hasCancel;
    }

    public void setHasCancel(String hasCancel) {
        this.hasCancel = hasCancel == null ? null : hasCancel.trim();
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
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