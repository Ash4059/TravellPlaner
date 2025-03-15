package Learning.TravelPlanner.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime createTime;
    private Date journeyDate;
    private Time journeyTime;
    private String From;
    private String Destination;

    public Ticket() {}
    public Ticket(long id, LocalDateTime createTime, Date journeyDate, Time journeyTime, String From, String Destination){
        this.id = id;
        this.createTime = createTime;
        this.journeyDate = journeyDate;
        this.journeyTime = journeyTime;
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

    public void setCreateTime(LocalDateTime createTime){
        this.createTime = createTime;
    }

    public Date getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(Date journeyDate){
        this.journeyDate = journeyDate;
    }

    public Time getJourneyTime() {
        return journeyTime;
    }

    public void setJourneyTime(Time journeyTime){
        this.journeyTime = journeyTime;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from){
        this.From = from;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination){
        this.Destination = destination;
    }
}
