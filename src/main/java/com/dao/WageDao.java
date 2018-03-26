package com.dao;

import com.po.Employee;
import com.po.Wage;

import java.util.List;

public interface WageDao {
    boolean addWage(Wage wage);
    boolean updateWage(Wage wage);
    Wage queryWageById(Wage wage);
    List<Wage> queryWageByEid(Employee employee);
    List<Wage> queryAllWage();

}
