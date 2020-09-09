package com.serviceImpl;

import com.dao.TrainingDao;
import com.entity.Training;
import com.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService {

    @Autowired
    private TrainingDao trainingDao;

    @Override
    public boolean addTraining(Training training) {
        if(training == null){
            return false;
        }
        return trainingDao.addTraining(training);
    }

    @Override
    public boolean updateTraining(Training training) {
        if(training == null){
           return false;
        }
        return trainingDao.updateTraining(training);
    }

    @Override
    public boolean deleteTraining(Training training) {
        if(training == null){
            return false;
        }
        return trainingDao.deleteTraining(training);
    }

    @Override
    public Training queryTrainingById(Training training) {
        if(training == null){
            return null;
        }
        return trainingDao.queryTrainingById(training);
    }

    @Override
    public Training queryTrainingByName(String trainingName) {
        if(trainingName == null){
            return null;
        }
        return trainingDao.queryTrainingByName(trainingName);
    }


    @Override
    public List<Training> queryAllTraining() {
        return trainingDao.queryAllTraining();
    }
}
