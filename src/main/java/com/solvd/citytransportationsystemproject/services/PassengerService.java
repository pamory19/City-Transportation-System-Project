package com.solvd.citytransportationsystemproject.services;

import com.solvd.citytransportationsystemproject.dao.IPassengerDao;
import com.solvd.citytransportationsystemproject.dao.mysql.PassengerDao;
import com.solvd.citytransportationsystemproject.models.Passenger;

import java.util.List;

public class PassengerService {
    private IPassengerDao passengerDao;

    public PassengerService() {
        this.passengerDao = new PassengerDao();
    }

    public Passenger createPassenger(Passenger passenger) {
        return passengerDao.createEntity(passenger);
    }

    public Passenger getPassengerById(long id) {
        return passengerDao.getEntityById(id);
    }

    public void updatePassenger(Passenger passenger) {
        passengerDao.updateEntity(passenger);
    }

    public void deletePassenger(long id) {
        passengerDao.deleteEntity(id);
    }

    public Passenger getPassengerByPersonId(long personId) {
        return passengerDao.getPassengerByPersonId(personId);
    }

    public List<Passenger> getAllPassengers() {
        return passengerDao.getAllPassengers();
    }
}
