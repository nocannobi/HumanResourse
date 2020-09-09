package com.dao;

import com.entity.Training;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TrainingDao {
    boolean addTraining(Training training);
    boolean updateTraining(Training training);
    boolean deleteTraining(Training training);
    Training queryTrainingById(Training training);
    Training queryTrainingByName(String trainingName);
    List<Training> queryAllTraining();

}
