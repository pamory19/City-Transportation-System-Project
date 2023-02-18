package com.solvd.citytransportationsystemproject.dao;

import com.solvd.citytransportationsystemproject.IBaseDao;
import com.solvd.citytransportationsystemproject.models.AccidentReport;

import java.sql.Date;
import java.util.List;

public interface IAccidentReportDao extends IBaseDao<AccidentReport> {
    AccidentReport getAccidentReportByDate(Date date);
    AccidentReport getAccidentReportByVehicleId(long vehicleId);
    List<AccidentReport> getAllAccidentReports();
}
