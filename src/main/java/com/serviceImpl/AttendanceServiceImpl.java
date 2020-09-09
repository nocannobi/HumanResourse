package com.serviceImpl;

import com.dao.AttendanceDao;
import com.entity.Attendance;
import com.entity.Employee;
import com.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceDao attendanceDao;

    @Override
    public boolean addAttendance(Attendance attendance) {
        if(attendance == null){
            return false;
        }
        return attendanceDao.addAttendance(attendance);
    }

    @Override
    public boolean updateAttendance(Attendance attendance) {
        if(attendance == null){
            return false;
        }
        return attendanceDao.updateAttendance(attendance);
    }

    @Override
    public Attendance queryAttendanceById(Attendance attendance) {
        if(attendance == null){
            return null;
        }
        return attendanceDao.queryAttendanceById(attendance);
    }

    @Override
    public List<Attendance> queryAttendanceByEid(Employee employee) {
        if(employee == null){
            return null;
        }
        return attendanceDao.queryAttendanceByEid(employee);
    }

    @Override
    public List<Attendance> queryAllAttendance() {
        return attendanceDao.queryAllAttendance();
    }
}
