package services;

import doa.BookingDoa;
import pojos.Booking;
import pojos.User;

public class BookingService {
    private final BookingDoa bookingDoa;

    public BookingService() {
        this.bookingDoa = new BookingDoa();
    }

    public void bookCar(String userId, String model){
        Booking model1 = new Booking(userId, model);
        bookingDoa.setBooking(model1);
    }
}
