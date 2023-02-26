package com.solvd.citytransportationsystemproject.services;

import com.solvd.citytransportationsystemproject.dao.IStationDao;
import com.solvd.citytransportationsystemproject.dao.mysql.StationDao;
import com.solvd.citytransportationsystemproject.models.Station;

import java.util.List;

public class StationService {
    private final IStationDao stationDao;

    public StationService() {
        stationDao = new StationDao();
    }

    public Station getStationById(long id){
        return stationDao.getEntityById(id);
    }

    public List<Station> getAllStations(){
        return stationDao.getAllStations();
    }

    public Station getStationByType(String type){
        return stationDao.getStationByType(type);
    }

    public Station createStation(Station station){
        return stationDao.createEntity(station);
    }

    public void updateStation(Station station){
        stationDao.updateEntity(station);
    }

    public void deleteStationById(long id){
        stationDao.deleteEntity(id);
    }
}