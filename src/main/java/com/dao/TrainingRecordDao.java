package com.dao;

import com.po.Employee;
import com.po.Training;
import com.po.TrainingRecord;

import java.util.List;

public interface TrainingRecordDao {
    boolean addTrainingRecord(TrainingRecord trainingRecord);
    boolean updateTrainingRecord(TrainingRecord trainingRecord);
    boolean deleteTrainingRecord(TrainingRecord trainingRecord);
    TrainingRecord queryTrainingRecordById(TrainingRecord trainingRecord);
    List<TrainingRecord> queryTrainingRecordByEid(Employee employee);
    List<TrainingRecord> queryTrainingRecordByTid(Training training);
    List<TrainingRecord> queryAllTrainingRecord();
}
