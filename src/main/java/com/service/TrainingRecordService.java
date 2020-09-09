package com.service;

import com.entity.Employee;
import com.entity.Training;
import com.entity.TrainingRecord;

import java.util.List;

public interface TrainingRecordService {
    boolean addTrainingRecord(TrainingRecord trainingRecord);
    boolean updateTrainingRecord(TrainingRecord trainingRecord);
    boolean deleteTrainingRecord(TrainingRecord trainingRecord);
    TrainingRecord queryTrainingRecordById(TrainingRecord trainingRecord);
    List<TrainingRecord> queryTrainingRecordByEid(Employee employee);
    List<TrainingRecord> queryTrainingRecordByTid(Training training);
    List<TrainingRecord> queryAllTrainingRecord();
}
