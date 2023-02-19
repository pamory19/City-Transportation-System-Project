package com.solvd.citytransportationsystemproject.dao;

import com.solvd.citytransportationsystemproject.models.Station;

import java.util.List;

public interface IStationDao extends IBaseDao<Station> {
    Station getStationByType(String type);
    List<Station> getAllStations();
}
