package Learning.TravelPlanner.Service.Implementation;

import Learning.TravelPlanner.Service.BookingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Qualifier("onlineBooking")
@Component
public class OnlineBookingImplementation implements BookingService {
    public OnlineBookingImplementation(){
        System.out.println("Online Booking");
    }
}
