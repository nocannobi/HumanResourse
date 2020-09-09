package com.entity;

import java.sql.Timestamp;

public class AdminMessage extends BaseEntity {
    public static final Integer MESSAGE_IS_VIEW = 1;
    public static final Integer MESSAGE_IS_NOT_VIEW = 0;
    public static final Integer MESSAGE_IS_RECIEVE = 1;
    public static final Integer MESSAGE_IS_NOT_RECIEVE = 0;
    public static final Integer MESSAGE_IS_DELETE = 1;
    public static final Integer MESSAGE_IS_NOT_DELETE = 0;

    private String id;
    private String adminId;
    private String customerId;
    private String employeeId;
    private String messageTheme;
    private String messageContent;
    private Integer messageIsView;
    private Integer messageIsRecieve;
    private Integer messageIsDelete;
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

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getMessageTheme() {
        return messageTheme;
    }

    public void setMessageTheme(String messageTheme) {
        this.messageTheme = messageTheme;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Integer getMessageIsView() {
        return messageIsView;
    }

    public void setMessageIsView(Integer messageIsView) {
        this.messageIsView = messageIsView;
    }

    public Integer getMessageIsRecieve() {
        return messageIsRecieve;
    }

    public void setMessageIsRecieve(Integer messageIsRecieve) {
        this.messageIsRecieve = messageIsRecieve;
    }

    public Integer getMessageIsDelete() {
        return messageIsDelete;
    }

    public void setMessageIsDelete(Integer messageIsDelete) {
        this.messageIsDelete = messageIsDelete;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
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
