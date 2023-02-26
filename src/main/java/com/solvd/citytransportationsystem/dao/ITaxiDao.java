package com.solvd.citytransportationsystemproject.dao;

import com.solvd.citytransportationsystemproject.models.Taxi;

import java.util.List;

public interface ITaxiDao extends IBaseDao<Taxi> {
    Taxi getTaxiByVehicleId(long vehicleId);
    List<Taxi> getAllTaxis();
}
