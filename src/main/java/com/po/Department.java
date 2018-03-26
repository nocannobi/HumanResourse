package com.po;

import java.sql.Timestamp;

public class Department extends BaseEntity{

    public static final Integer DEPARTMENT_IS_DELETE = 1;
    public static final Integer DEPARTMENT_IS_NOT_DELETE = 0;

    private int id;
    private String departmentName;
    private Integer departmentIsDelete;
    private Timestamp departmentCreateTime;
    private Timestamp departmentModifiedTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Timestamp getDepartmentCreateTime() {
        return departmentCreateTime;
    }

    public void setDepartmentCreateTime(Timestamp departmentCreateTime) {
        this.departmentCreateTime = departmentCreateTime;
    }

    public Timestamp getDepartmentModifiedTime() {
        return departmentModifiedTime;
    }

    public void setDepartmentModifiedTime(Timestamp departmentModifiedTime) {
        this.departmentModifiedTime = departmentModifiedTime;
    }

    public Integer getDepartmentIsDelete() {
        return departmentIsDelete;
    }

    public void setDepartmentIsDelete(Integer departmentIsDelete) {
        this.departmentIsDelete = departmentIsDelete;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", departmentIsDelete=" + departmentIsDelete +
                ", departmentCreateTime=" + departmentCreateTime +
                ", departmentModifiedTime=" + departmentModifiedTime +
                '}';
    }
}
