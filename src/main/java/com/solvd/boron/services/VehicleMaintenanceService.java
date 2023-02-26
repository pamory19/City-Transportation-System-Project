package com.solvd.citytransportationsystemproject.services;

import com.solvd.citytransportationsystemproject.dao.IVehicleMaintenance;
import com.solvd.citytransportationsystemproject.dao.mysql.VehicleMaintenanceDao;
import com.solvd.citytransportationsystemproject.models.VehicleMaintenance;

import java.util.List;

public class VehicleMaintenanceService {
    private final IVehicleMaintenance vehicleMaintenanceDao;

    public VehicleMaintenanceService() {
        this.vehicleMaintenanceDao = new VehicleMaintenanceDao();
    }

    public VehicleMaintenance createVehicleMaintenance(VehicleMaintenance vehicleMaintenance) {
        return vehicleMaintenanceDao.createEntity(vehicleMaintenance);
    }

    public VehicleMaintenance getVehicleMaintenanceById(long id) {
        return vehicleMaintenanceDao.getEntityById(id);
    }

    public void updateVehicleMaintenance(VehicleMaintenance vehicleMaintenance) {
        vehicleMaintenanceDao.updateEntity(vehicleMaintenance);
    }

    public void deleteVehicleMaintenance(long id) {
        vehicleMaintenanceDao.deleteEntity(id);
    }

    public VehicleMaintenance getVehicleMaintenanceByType(String type) {
        return vehicleMaintenanceDao.getVehicleMaintenanceByType(type);
    }

    public List<VehicleMaintenance> getAllVehicleMaintenances() {
        return vehicleMaintenanceDao.getAllVehicleMaintenances();
    }
}
