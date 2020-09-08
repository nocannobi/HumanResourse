package com.dao;

import com.po.Employee;
import com.po.Wage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WageDao {
    boolean addWage(Wage wage);
    boolean updateWage(Wage wage);
    Wage queryWageById(Wage wage);
    List<Wage> queryWageByEid(Employee employee);
    List<Wage> queryAllWage();

}
