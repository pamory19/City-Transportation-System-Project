package com.solvd.citytransportationsystemproject.services;

import com.solvd.citytransportationsystemproject.dao.ITicketDao;
import com.solvd.citytransportationsystemproject.dao.mysql.TicketDao;
import com.solvd.citytransportationsystemproject.models.Ticket;
import java.util.List;

public class TicketService {
    private final ITicketDao ticketDao;

    public TicketService() {
        ticketDao = new TicketDao();
    }

    public Ticket createTicket(Ticket ticket) {
        return ticketDao.createEntity(ticket);
    }

    public Ticket getTicketById(long id) {
        return ticketDao.getEntityById(id);
    }

    public void updateTicket(Ticket ticket) {
        ticketDao.updateEntity(ticket);
    }

    public void deleteTicket(long id) {
        ticketDao.deleteEntity(id);
    }

    public Ticket getTicketByPassengerId(long passengerId) {
        return ticketDao.getTicketByPassengerId(passengerId);
    }

    public List<Ticket> getAllTickets() {
        return ticketDao.getAllTickets();
    }
}
