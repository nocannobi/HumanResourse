package com.entity;

import java.sql.Timestamp;

public class Customer extends BaseEntity {
    public static final Integer CUSTOMER_IS_NORMAL = 1;
    public static final Integer CUSTOMER_IS_DELETED = 0;

    private String id;
    private String customerName;
    private String customerPassword;
    private String customerEmail;
    private String customerPhone;
    private Integer customerIsNormal;
    private Timestamp customerLoginTime;
    private Timestamp createDate;
    private String creator;
    private Timestamp modifiedDate;
    private String modifier;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public Integer getCustomerIsNormal() {
        return customerIsNormal;
    }

    public void setCustomerIsNormal(Integer customerIsNormal) {
        this.customerIsNormal = customerIsNormal;
    }

    public Timestamp getCustomerLoginTime() {
        return customerLoginTime;
    }

    public void setCustomerLoginTime(Timestamp customerLoginTime) {
        this.customerLoginTime = customerLoginTime;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }
}
