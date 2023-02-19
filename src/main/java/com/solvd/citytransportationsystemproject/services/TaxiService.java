package com.solvd.citytransportationsystemproject.services;

import com.solvd.citytransportationsystemproject.dao.ITaxiDao;
import com.solvd.citytransportationsystemproject.dao.mysql.TaxiDao;
import com.solvd.citytransportationsystemproject.models.Taxi;

import java.util.List;

public class TaxiService {
    private ITaxiDao taxiDao = new TaxiDao();

    public TaxiService() {
        taxiDao = new TaxiDao();
    }

    public Taxi createTaxi(Taxi taxi) {
        return taxiDao.createEntity(taxi);
    }

    public Taxi getTaxiById(long id) {
        return taxiDao.getEntityById(id);
    }

    public void updateTaxi(Taxi taxi) {
        taxiDao.updateEntity(taxi);
    }

    public void deleteTaxi(long id) {
        taxiDao.deleteEntity(id);
    }

    public Taxi getTaxiByVehicleId(long vehicleId) {
        return taxiDao.getTaxiByVehicleId(vehicleId);
    }

    public List<Taxi> getAllTaxis() {
        return taxiDao.getAllTaxis();
    }
}
