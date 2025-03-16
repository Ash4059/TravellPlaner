package Learning.TravelPlanner.Service;

import Learning.TravelPlanner.Entity.Activity;

import java.util.List;

public interface ActivityService {
    List<Activity> getAllActivity();
    boolean createActivity(Activity activity);
    boolean updateActivity(Activity activity);
    boolean deleteActivity(long id);
}
