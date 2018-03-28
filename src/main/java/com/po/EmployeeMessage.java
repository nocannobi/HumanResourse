package com.po;

import java.sql.Timestamp;

public class EmployeeMessage extends BaseEntity {
    public static final Integer MESSAGE_IS_VIEW = 1;
    public static final Integer MESSAGE_IS_NOT_VIEW = 0;
    public static final Integer MESSAGE_IS_RECIEVE = 1;
    public static final Integer MESSAGE_IS_NOT_RECIEVE = 0;
    public static final Integer MESSAGE_IS_DELETE = 1;
    public static final Integer MESSAGE_IS_NOT_DELETE = 0;

    private int id;
    private int employeeId;
    private int adminId;
    private String messageTheme;
    private String messageContent;
    private Integer messageIsView;
    private Integer messageIsRecieve;
    private Integer messageIsDelete;
    private Timestamp messageCreateTime;
    private Timestamp messageModifiedTime;


    public Integer getMessageIsDelete() {
        return messageIsDelete;
    }

    public void setMessageIsDelete(Integer messageIsDelete) {
        this.messageIsDelete = messageIsDelete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
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

    public Timestamp getMessageCreateTime() {
        return messageCreateTime;
    }

    public void setMessageCreateTime(Timestamp messageCreateTime) {
        this.messageCreateTime = messageCreateTime;
    }

    public Timestamp getMessageModifiedTime() {
        return messageModifiedTime;
    }

    public void setMessageModifiedTime(Timestamp messageModifiedTime) {
        this.messageModifiedTime = messageModifiedTime;
    }

    @Override
    public String toString() {
        return "EmployeeMessage{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", adminId=" + adminId +
                ", messageTheme='" + messageTheme + '\'' +
                ", messageContent='" + messageContent + '\'' +
                ", messageIsView=" + messageIsView +
                ", messageIsRecieve=" + messageIsRecieve +
                ", messageIsDelete=" + messageIsDelete +
                ", messageCreateTime=" + messageCreateTime +
                ", messageModifiedTime=" + messageModifiedTime +
                '}';
    }
}
