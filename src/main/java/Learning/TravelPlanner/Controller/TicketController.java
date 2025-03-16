package Learning.TravelPlanner.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Learning.TravelPlanner.Entity.Ticket;
import Learning.TravelPlanner.Service.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable Long id){
        Ticket ticket = ticketService.findTicketById(id);
        if(ticket == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ticket);
    }
    
    @PostMapping("/create")
    public ResponseEntity<String> createTicket(@RequestBody Ticket ticket){
        if(ticketService.createTicket(ticket)){
            return ResponseEntity.ok("Ticket created successfully");
        } else {
            return ResponseEntity.status(400).body("Invalid ticket details");
        }
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateTicket(@RequestBody Ticket ticket){
        if(ticketService.updateTicket(ticket)){
            return ResponseEntity.ok("Ticket updated successfully");
        } else {
            return ResponseEntity.status(400).body("Invalid ticket details or ticket not found");
        }
    }
    
    @PostMapping("/cancel")
    public ResponseEntity<String> cancelTicket(@RequestBody Ticket ticket){
        if(ticketService.cancelTicket(ticket)){
            return ResponseEntity.ok("Ticket canceled successfully");
        } else {
            return ResponseEntity.status(400).body("Invalid ticket details or ticket not found");
        }
    }
}
