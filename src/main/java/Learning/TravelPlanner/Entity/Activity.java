package Learning.TravelPlanner.Entity;

import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Time startTime;
    private Time endTime;
    private double cost;

    public Activity(){}
    public Activity(Long id, String name, Time startTime, Time endTime, double cost){
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time oTime){
        this.startTime = oTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time oTime){
        this.endTime = oTime;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
