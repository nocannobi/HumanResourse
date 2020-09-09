package com.entity;

import java.sql.Timestamp;

public class Attendance extends BaseEntity{
    /*0 即迟到又早退
    * 1 正常
    * 2 迟到
    * 3 早退
    * 4 请假*/
    public static final Integer EMPLOYEE_IS_LATE_AND_LEAVE_EARLY = 0;
    public static final Integer EMPLOYEE_IS_NORMAL = 1;
    public static final Integer EMPLOYEE_IS_LATE = 2;
    public static final Integer EMPLOYEE_IS_LEAVE_EARLY = 3;
    public static final Integer EMPLOYEE_IS_REST = 4;

    private String id;
    private String employeeId;
    private Timestamp workTime;
    private Timestamp offTime;
    private Timestamp punchWorkTime;
    private Timestamp punchOffTime;
    private Integer employeeState;
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

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Timestamp getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Timestamp workTime) {
        this.workTime = workTime;
    }

    public Timestamp getOffTime() {
        return offTime;
    }

    public void setOffTime(Timestamp offTime) {
        this.offTime = offTime;
    }

    public Timestamp getPunchWorkTime() {
        return punchWorkTime;
    }

    public void setPunchWorkTime(Timestamp punchWorkTime) {
        this.punchWorkTime = punchWorkTime;
    }

    public Timestamp getPunchOffTime() {
        return punchOffTime;
    }

    public void setPunchOffTime(Timestamp punchOffTime) {
        this.punchOffTime = punchOffTime;
    }

    public Integer getEmployeeState() {
        return employeeState;
    }

    public void setEmployeeState(Integer employeeState) {
        this.employeeState = employeeState;
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
