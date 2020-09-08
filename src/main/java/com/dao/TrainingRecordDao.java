package com.dao;

import com.po.Employee;
import com.po.Training;
import com.po.TrainingRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TrainingRecordDao {
    boolean addTrainingRecord(TrainingRecord trainingRecord);
    boolean updateTrainingRecord(TrainingRecord trainingRecord);
    boolean deleteTrainingRecord(TrainingRecord trainingRecord);
    TrainingRecord queryTrainingRecordById(TrainingRecord trainingRecord);
    List<TrainingRecord> queryTrainingRecordByEid(Employee employee);
    List<TrainingRecord> queryTrainingRecordByTid(Training training);
    List<TrainingRecord> queryAllTrainingRecord();
}
