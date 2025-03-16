package Learning.TravelPlanner.Service.Implementation;

import java.util.*;

import org.springframework.stereotype.Service;

import Learning.TravelPlanner.Entity.Ticket;
import Learning.TravelPlanner.Service.TicketService;

@Service
public class TicketImplementation implements TicketService {

    List<Ticket> tickets;

    public TicketImplementation() {
        this.tickets = new ArrayList<>();
    }

    @Override
    public boolean createTicket(Ticket ticket){
        if(tickets != null){
            this.tickets.add(ticket);
            return true;
        }
        return false;   
    }

    @Override
    public boolean cancelTicket(Ticket ticket){
        return tickets.remove(ticket);
    }

    @Override
    public boolean updateTicket(Ticket ticket){
        for(Ticket t: tickets){
            if(t.getId() == ticket.getId()){
                t.setPassengerName(ticket.getPassengerName());
                return true;
            }
        }
        return false;
    }

    @Override
    public Ticket findTicketById(long id){
        for(Ticket t: tickets){
            if(t.getId() == id){
                return t;
            }
        }
        return null;
    }
}
