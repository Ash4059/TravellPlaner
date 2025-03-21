package Learning.TravelPlanner.Service.Implementation;

import Learning.TravelPlanner.Service.BookingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("offlineBooking")
public class OfflineBookingImplementation implements BookingService {
    public OfflineBookingImplementation(){
        System.out.println("Offline bookings");
    }
}
