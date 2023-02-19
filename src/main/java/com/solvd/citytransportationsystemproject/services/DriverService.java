package com.solvd.citytransportationsystemproject.services;

import com.solvd.citytransportationsystemproject.dao.mysql.DriverDao;
import com.solvd.citytransportationsystemproject.dao.IDriverDao;
import com.solvd.citytransportationsystemproject.models.Driver;

import java.util.List;

public class DriverService {

    private final IDriverDao driverDao;

    public DriverService(IDriverDao driverDao) {
        this.driverDao = driverDao;
    }

    public Driver createDriver(Driver driver) {
        return driverDao.createEntity(driver);
    }

    public Driver getDriverById(long id) {
        return driverDao.getEntityById(id);
    }

    public void updateDriver(Driver driver) {
        driverDao.updateEntity(driver);
    }

    public void deleteDriver(long id) {
        driverDao.deleteEntity(id);
    }

    public Driver getDriverByPersonId(long personId) {
        return driverDao.getDriverByPersonId(personId);
    }

    public List<Driver> getAllDrivers() {
        return driverDao.getAllDrivers();
    }
}
