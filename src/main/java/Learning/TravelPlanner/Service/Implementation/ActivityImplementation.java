package Learning.TravelPlanner.Service.Implementation;

import java.util.*;

import Learning.TravelPlanner.Entity.Ticket;
import Learning.TravelPlanner.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Learning.TravelPlanner.Entity.Activity;
import Learning.TravelPlanner.Service.ActivityService;

@Service
public class ActivityImplementation implements ActivityService {

    List<Activity> activities;
//    Spring create object using empty parameter contructor if present. If two constructor are present with
//    different parameter then whatever bean is called we need to add @Autowired to the constructor
//    User user;
//    Ticket ticket;

//    @Autowired
//    public ActivityImplementation(User user){
//        this.user = user;
//        activities = new ArrayList<>();
//        System.out.println("User object is initialized");
//    }
//
//    public ActivityImplementation(Ticket ticket){
//        this.ticket = ticket;
//        activities = new ArrayList<>();
//        System.out.println("Ticket object is initialized");
//    }

    public ActivityImplementation(){
        activities = new ArrayList<>();
    }

    // Implement methods here
    @Override
    public List<Activity> getAllActivity(){
        return activities;
    }

    @Override
    public boolean createActivity(Activity activity){
        boolean bActivityCreated = false;
        if(activity!=null){
            activities.add(activity);
            bActivityCreated = true;
        }
        return bActivityCreated;
    }

    @Override
    public boolean updateActivity(Activity activity){
        long id = activity.getId();
        for(Activity active : activities){
            if(active.getId().equals(id)){
                boolean result = activities.remove(active);
                activities.add(activity);
                return result;
            }
        }
        return false;
    }

    @Override
    public boolean deleteActivity(long id){
        for(Activity activity : activities){
            if(activity.getId().equals(id)){
                return activities.remove(activity);
            }
        }
        return false;
    }

}
