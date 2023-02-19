package com.solvd.citytransportationsystemproject.dao;

import com.solvd.citytransportationsystemproject.IBaseDao;
import com.solvd.citytransportationsystemproject.models.Ticket;

import java.util.List;

public interface ITicketDao extends IBaseDao<Ticket> {
    Ticket getTicketByPassengerId(long passengerId);
    List<Ticket> getAllTickets();
}
