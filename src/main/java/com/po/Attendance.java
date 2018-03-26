package com.po;

import org.omg.PortableInterceptor.INACTIVE;

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

    private int id;
    private int employeeId;
    private Timestamp workTime;
    private Timestamp offTime;
    private Timestamp punchWorkTime;
    private Timestamp punchOffTime;
    private Integer employeeState;
    private Timestamp attendanceCreateTime;
    private Timestamp attendanceModifiedTime;

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

    public Timestamp getAttendanceCreateTime() {
        return attendanceCreateTime;
    }

    public void setAttendanceCreateTime(Timestamp attendanceCreateTime) {
        this.attendanceCreateTime = attendanceCreateTime;
    }

    public Timestamp getAttendanceModifiedTime() {
        return attendanceModifiedTime;
    }

    public void setAttendanceModifiedTime(Timestamp attendanceModifiedTime) {
        this.attendanceModifiedTime = attendanceModifiedTime;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", workTime=" + workTime +
                ", offTime=" + offTime +
                ", punchWorkTime=" + punchWorkTime +
                ", punchOffTime=" + punchOffTime +
                ", employeeState=" + employeeState +
                ", attendanceCreateTime=" + attendanceCreateTime +
                ", attendanceModifiedTime=" + attendanceModifiedTime +
                '}';
    }
}
