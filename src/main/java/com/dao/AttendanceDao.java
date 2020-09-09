package com.dao;

import com.entity.Attendance;
import com.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AttendanceDao {
    boolean addAttendance(Attendance attendance);
    boolean updateAttendance(Attendance attendance);
    Attendance queryAttendanceById(Attendance attendance);
    List<Attendance> queryAttendanceByEid(Employee employee);
    List<Attendance> queryAllAttendance();
}
