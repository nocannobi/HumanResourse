package com.dao;

import com.po.Attendance;
import com.po.Employee;

import java.util.List;

public interface AttendanceDao {
    boolean addAttendance(Attendance attendance);
    boolean updateAttendance(Attendance attendance);
    Attendance queryAttendanceById(Attendance attendance);
    List<Attendance> queryAttendanceByEid(Employee employee);
    List<Attendance> queryAllAttendance();
}
