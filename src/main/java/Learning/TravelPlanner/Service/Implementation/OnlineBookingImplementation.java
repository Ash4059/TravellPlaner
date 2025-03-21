package Learning.TravelPlanner.Service.Implementation;

import Learning.TravelPlanner.Service.BookingService;

//@Primary
public class OnlineBookingImplementation implements BookingService {
    public OnlineBookingImplementation(){
        System.out.println("Online Booking");
    }

    @Override
    public void  createBooking(){
        System.out.println("online booking created");
    }
}
