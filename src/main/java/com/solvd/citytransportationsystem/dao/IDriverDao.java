package com.solvd.citytransportationsystemproject.dao;

import com.solvd.citytransportationsystemproject.models.Driver;

import java.util.List;

public interface IDriverDao extends IBaseDao<Driver> {
    Driver getDriverByPersonId(long personId);
    List<Driver> getAllDrivers();
}
