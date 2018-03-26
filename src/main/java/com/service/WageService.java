package com.service;

import com.po.Employee;
import com.po.Wage;

import java.util.List;

public interface WageService {
    boolean addWage(Wage wage);
    boolean updateWage(Wage wage);
    Wage queryWageById(Wage wage);
    List<Wage> queryWageByEid(Employee employee);
    List<Wage> queryAllWage();
}
