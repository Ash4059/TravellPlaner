package Learning.TravelPlanner.Service;

import Learning.TravelPlanner.Entity.Ticket;

public interface TicketService {
    boolean createTicket(Ticket ticket);
    boolean cancelTicket(Ticket ticket);
    boolean updateTicket(Ticket ticket);
    Ticket findTicketById(long id);
}
