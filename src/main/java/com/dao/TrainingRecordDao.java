package com.dao;

import com.entity.Employee;
import com.entity.Training;
import com.entity.TrainingRecord;
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
