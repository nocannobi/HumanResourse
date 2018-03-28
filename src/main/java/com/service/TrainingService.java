package com.service;

import com.po.Training;
import com.po.TrainingRecord;

import java.util.List;

public interface TrainingService {
    boolean addTraining(Training training);
    boolean updateTraining(Training training);
    boolean deleteTraining(Training training);
    Training queryTrainingById(Training training);
    Training queryTrainingByName(String trainingName);
    List<Training> queryAllTraining();
}
