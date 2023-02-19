package com.solvd.citytransportationsystemproject.services;

import com.solvd.citytransportationsystemproject.dao.IRouteDao;
import com.solvd.citytransportationsystemproject.models.Route;

import java.util.List;

public class RouteService {
    private final IRouteDao routeDao;

    public RouteService(IRouteDao routeDao) {
        this.routeDao = routeDao;
    }

    public Route createRoute(Route route) {
        return routeDao.createEntity(route);
    }

    public Route getRouteById(long id) {
        return routeDao.getEntityById(id);
    }

    public void updateRoute(Route route) {
        routeDao.updateEntity(route);
    }

    public void deleteRouteById(long id) {
        routeDao.deleteEntity(id);
    }

    public Route getRouteByName(String name) {
        return routeDao.getRouteByName(name);
    }

    public Route getRouteByVehicleId(long vehicleId) {
        return routeDao.getRouteByVehicleId(vehicleId);
    }

    public List<Route> getAllRoutes() {
        return routeDao.getAllRoutes();
    }
}
