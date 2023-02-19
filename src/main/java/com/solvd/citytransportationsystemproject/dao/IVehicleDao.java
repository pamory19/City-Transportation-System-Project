package com.solvd.citytransportationsystemproject.dao;

import com.solvd.citytransportationsystemproject.IBaseDao;
import com.solvd.citytransportationsystemproject.models.Vehicle;

import java.util.List;

public interface IVehicleDao extends IBaseDao<Vehicle> {
    Vehicle getVehicleByDriverId(long driverId);
    List<Vehicle> getAllVehicles();
}
