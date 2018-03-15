package com.po;

import java.sql.Timestamp;

public class Admin {
    private int id;
    private String adminName;
    private String adminPassword;
    private Timestamp adminLoginTime;
    private Timestamp adminCreateTime;
    private Timestamp adminModifiedTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Timestamp getAdminLoginTime() {
        return adminLoginTime;
    }

    public void setAdminLoginTime(Timestamp adminLoginTime) {
        this.adminLoginTime = adminLoginTime;
    }

    public Timestamp getAdminCreateTime() {
        return adminCreateTime;
    }

    public void setAdminCreateTime(Timestamp adminCreateTime) {
        this.adminCreateTime = adminCreateTime;
    }

    public Timestamp getAdminModifiedTime() {
        return adminModifiedTime;
    }

    public void setAdminModifiedTime(Timestamp adminModifiedTime) {
        this.adminModifiedTime = adminModifiedTime;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", adminName='" + adminName + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminLoginTime=" + adminLoginTime +
                ", adminCreateTime=" + adminCreateTime +
                ", adminModifiedTime=" + adminModifiedTime +
                '}';
    }
}
