package Learning.TravelPlanner.Controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Learning.TravelPlanner.Entity.User;
import Learning.TravelPlanner.Service.BookingService;
import Learning.TravelPlanner.Service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    private BookingService onlineBookingService;
    private BookingService offlineBookingService;
    public UserController(UserService userService, @Qualifier("onlineBooking") BookingService onlineBookingService, @Qualifier("offlineBooking") BookingService offlineBookingService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<User> getUser(){
        return ResponseEntity.ok(userService.getUser());
    }


    @PostMapping
    public ResponseEntity<String> updateUser(@RequestBody User user){
        boolean bUpdateUser = userService.updateUser(user);
        if(bUpdateUser){
            return ResponseEntity.ok("User updated successfully");
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User not found or invalid");
        }
    }

    // Industry standard methods
    @PostMapping("/book")
    public ResponseEntity<String> book(@RequestParam boolean isOnlineOrder){
        if(isOnlineOrder){
            onlineBookingService.createBooking();
        } else {
            offlineBookingService.createBooking();
        }
        return ResponseEntity.ok( "Booking successful");
    }

}
