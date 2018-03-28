package com.dao;

import com.po.Training;

import java.util.List;

public interface TrainingDao {
    boolean addTraining(Training training);
    boolean updateTraining(Training training);
    boolean deleteTraining(Training training);
    Training queryTrainingById(Training training);
    Training queryTrainingByName(String trainingName);
    List<Training> queryAllTraining();

}
