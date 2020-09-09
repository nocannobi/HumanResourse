package com.service;

import com.entity.Training;

import java.util.List;

public interface TrainingService {
    boolean addTraining(Training training);
    boolean updateTraining(Training training);
    boolean deleteTraining(Training training);
    Training queryTrainingById(Training training);
    Training queryTrainingByName(String trainingName);
    List<Training> queryAllTraining();
}
