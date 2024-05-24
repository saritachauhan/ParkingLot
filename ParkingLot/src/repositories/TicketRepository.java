package repositories;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import models.Gate;
import models.ParkingLot;
import models.Ticket;


public class TicketRepository {
    private Map<Long, Ticket> tickets = new TreeMap<>();
    private long lastSavedId = 0L;

    public Ticket save(Ticket ticket) {
        ticket.setId(lastSavedId + 1);
        lastSavedId += 1;
        tickets.put(lastSavedId, ticket);
        return ticket;
    }
}
