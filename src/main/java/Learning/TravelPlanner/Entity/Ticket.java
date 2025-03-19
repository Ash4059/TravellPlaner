package Learning.TravelPlanner.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime createTime;
    private Date journeyDate;
    private Time journeyTime;
    private String passengerName;
    private String From;
    private String Destination;

    public Ticket() {}
    public Ticket(long id, LocalDateTime createTime, Date journeyDate, Time journeyTime, String passengerName, String From, String Destination){
        this.id = id;
        this.createTime = createTime;
        this.journeyDate = journeyDate;
        this.journeyTime = journeyTime;
        this.passengerName = passengerName;
        this.From = From;
        this.Destination = Destination;
    }

    // getters and setters
    public long getId() {
        return id;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public Date getJourneyDate() {
        return journeyDate;
    }

    public String getPassengerName(){
        return passengerName;
    }

    public void setPassengerName(String name){
        this.passengerName = name;
    }

    public Time getJourneyTime() {
        return journeyTime;
    }

    public String getFrom() {
        return From;
    }

    public String getDestination() {
        return Destination;
    }
}
