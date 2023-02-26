package com.solvd.citytransportationsystemproject.services;

import com.solvd.citytransportationsystemproject.dao.IVehicleDao;
import com.solvd.citytransportationsystemproject.models.Vehicle;

import java.util.List;

public class VehicleService {
    private final IVehicleDao vehicleDao;

    public VehicleService(IVehicleDao vehicleDao) {
        this.vehicleDao = vehicleDao;
    }

    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleDao.createEntity(vehicle);
    }

    public Vehicle getVehicleById(long id) {
        return vehicleDao.getEntityById(id);
    }

    public void updateVehicle(Vehicle vehicle) {
        vehicleDao.updateEntity(vehicle);
    }

    public void deleteVehicle(long id) {
        vehicleDao.deleteEntity(id);
    }

    public Vehicle getVehicleByDriverId(long driverId) {
        return vehicleDao.getVehicleByDriverId(driverId);
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleDao.getAllVehicles();
    }
}
