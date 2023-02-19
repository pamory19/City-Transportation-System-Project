package com.solvd.citytransportationsystemproject.service;

import com.solvd.citytransportationsystemproject.dao.ITrainDao;
import com.solvd.citytransportationsystemproject.dao.mysql.TrainDao;
import com.solvd.citytransportationsystemproject.models.Train;
import java.util.List;

public class TrainService {

    private final ITrainDao trainDao;

    public TrainService() {
        this.trainDao = new TrainDao();
    }

    public Train createTrain(Train train) {
        return trainDao.createEntity(train);
    }

    public Train getTrainById(long id) {
        return trainDao.getEntityById(id);
    }

    public void updateTrain(Train train) {
        trainDao.updateEntity(train);
    }

    public void deleteTrain(long id) {
        trainDao.deleteEntity(id);
    }

    public Train getTrainByTrainHeadcode(String trainHeadcode) {
        return trainDao.getTrainByTrainHeadcode(trainHeadcode);
    }

    public List<Train> getAllTrains() {
        return trainDao.getAllTrains();
    }
}
