package com.solvd.citytransportationsystemproject.services;

import com.solvd.citytransportationsystemproject.dao.IAccidentReportDao;
import com.solvd.citytransportationsystemproject.dao.mysql.AccidentReportDao;
import com.solvd.citytransportationsystemproject.models.AccidentReport;

import java.sql.Date;
import java.util.List;

public class AccidentReportService {
    private IAccidentReportDao accidentReportDao;

    public AccidentReportService() {
        this.accidentReportDao = new AccidentReportDao();
    }

    public AccidentReport createAccidentReport(AccidentReport accidentReport) {
        return accidentReportDao.createEntity(accidentReport);
    }

    public AccidentReport getAccidentReportById(long id) {
        return accidentReportDao.getEntityById(id);
    }

    public void updateAccidentReport(AccidentReport accidentReport) {
        accidentReportDao.updateEntity(accidentReport);
    }

    public void deleteAccidentReport(long id) {
        accidentReportDao.deleteEntity(id);
    }

    public AccidentReport getAccidentReportByDate(Date date) {
        return accidentReportDao.getAccidentReportByDate(date);
    }

    public AccidentReport getAccidentReportByVehicleId(long vehicleId) {
        return accidentReportDao.getAccidentReportByVehicleId(vehicleId);
    }

    public List<AccidentReport> getAllAccidentReports() {
        return accidentReportDao.getAllAccidentReports();
    }
}
