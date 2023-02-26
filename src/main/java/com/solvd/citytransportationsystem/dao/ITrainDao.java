package com.solvd.citytransportationsystemproject.dao;

import com.solvd.citytransportationsystemproject.models.Train;

import java.util.List;

public interface ITrainDao extends IBaseDao<Train> {
    Train getTrainByTrainHeadcode(String trainHeadcode);
    List<Train> getAllTrains();
}
