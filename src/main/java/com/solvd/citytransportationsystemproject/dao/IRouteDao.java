package com.solvd.citytransportationsystemproject.dao;

import com.solvd.citytransportationsystemproject.IBaseDao;
import com.solvd.citytransportationsystemproject.models.Route;

import java.util.List;

public interface IRouteDao extends IBaseDao<Route> {
    Route getRouteByName(String name);
    Route getRouteByVehicleId(long vehicleId);
    List<Route> getAllRoutes();
}
