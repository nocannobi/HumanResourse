package com.serviceImpl;

import com.dao.TrainingRecordDao;
import com.entity.Employee;
import com.entity.Training;
import com.entity.TrainingRecord;
import com.service.TrainingRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingRecordServiceImpl implements TrainingRecordService {

    @Autowired
    private TrainingRecordDao trainingRecordDao;

    @Override
    public boolean addTrainingRecord(TrainingRecord trainingRecord) {
        if(trainingRecord == null){
            return false;
        }
        return trainingRecordDao.addTrainingRecord(trainingRecord) ;
    }

    @Override
    public boolean updateTrainingRecord(TrainingRecord trainingRecord) {
        if(trainingRecord == null){
            return false;
        }
        return trainingRecordDao.updateTrainingRecord(trainingRecord);
    }

    @Override
    public boolean deleteTrainingRecord(TrainingRecord trainingRecord) {
        if(trainingRecord == null){
            return false;
        }
        return trainingRecordDao.deleteTrainingRecord(trainingRecord);
    }

    @Override
    public TrainingRecord queryTrainingRecordById(TrainingRecord trainingRecord) {
        if(trainingRecord == null){
            return null;
        }
        return trainingRecordDao.queryTrainingRecordById(trainingRecord);
    }

    @Override
    public List<TrainingRecord> queryTrainingRecordByEid(Employee employee) {
        if(employee == null){
            return null;
        }
        return trainingRecordDao.queryTrainingRecordByEid(employee);
    }

    @Override
    public List<TrainingRecord> queryTrainingRecordByTid(Training training) {
        if (training == null){
            return null;
        }
        return trainingRecordDao.queryTrainingRecordByTid(training);
    }

    @Override
    public List<TrainingRecord> queryAllTrainingRecord() {
        return trainingRecordDao.queryAllTrainingRecord();
    }
}
