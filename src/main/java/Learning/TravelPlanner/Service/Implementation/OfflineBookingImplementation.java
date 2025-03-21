package Learning.TravelPlanner.Service.Implementation;

import Learning.TravelPlanner.Service.BookingService;

public class OfflineBookingImplementation implements BookingService {
    public OfflineBookingImplementation(){
        System.out.println("Offline bookings");
    }

    @Override
    public void createBooking(){
        System.out.println("Offline booking created");
    }
}
