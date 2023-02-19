package com.solvd.citytransportationsystemproject.dao;

import com.solvd.citytransportationsystemproject.models.Passenger;

import java.util.List;

public interface IPassengerDao extends IBaseDao<Passenger> {
    Passenger getPassengerByPersonId(long personId);
    List<Passenger> getAllPassengers();
}
