package com.service;

import com.entity.Attendance;
import com.entity.Employee;

import java.util.List;

public interface AttendanceService {
    boolean addAttendance(Attendance attendance);
    boolean updateAttendance(Attendance attendance);
    Attendance queryAttendanceById(Attendance attendance);
    List<Attendance> queryAttendanceByEid(Employee employee);
    List<Attendance> queryAllAttendance();
}
