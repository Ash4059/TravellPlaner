package Learning.TravelPlanner.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Learning.TravelPlanner.Entity.Activity;
import Learning.TravelPlanner.Service.ActivityService;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    private final ActivityService activityService;
    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @GetMapping("/all")
    public List<Activity> getAllActivities() {
        return activityService.getAllActivity();
    }

    @PostMapping("/create")
    public ResponseEntity<String> createActivity(@RequestBody Activity activity){
        if (activityService.createActivity(activity)) {
            return ResponseEntity.ok("Activity created successfully");
        }
        return ResponseEntity.badRequest().body("Invalid activity data");
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateActivity(@RequestBody Activity activity){
        if (activityService.updateActivity(activity)) {
            return ResponseEntity.ok("Activity updated successfully");
        }
        return ResponseEntity.badRequest().body("Invalid activity data or activity not found");
    }
    
    @PostMapping("/delete")
    public ResponseEntity<String> deleteActivity(@RequestBody Long id){
        if (activityService.deleteActivity(id)) {
            return ResponseEntity.ok("Activity deleted successfully");
        }
        return ResponseEntity.badRequest().body("Activity not found");
    }
}
