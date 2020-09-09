package com.entity;

import java.sql.Timestamp;

public class Department extends BaseEntity{

    public static final Integer DEPARTMENT_IS_DELETE = 1;
    public static final Integer DEPARTMENT_IS_NOT_DELETE = 0;

    private String id;
    private String departmentName;
    private Integer departmentIsDelete;
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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getDepartmentIsDelete() {
        return departmentIsDelete;
    }

    public void setDepartmentIsDelete(Integer departmentIsDelete) {
        this.departmentIsDelete = departmentIsDelete;
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
