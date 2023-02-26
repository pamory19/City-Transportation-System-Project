package com.solvd.citytransportationsystemproject.dao;

import com.solvd.citytransportationsystemproject.models.VehicleMaintenance;

import java.util.List;

public interface IVehicleMaintenance extends IBaseDao<VehicleMaintenance> {
    VehicleMaintenance getVehicleMaintenanceByType(String type);
    List<VehicleMaintenance> getAllVehicleMaintenances();
}
