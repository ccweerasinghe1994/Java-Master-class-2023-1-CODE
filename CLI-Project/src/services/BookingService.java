package services;

import doa.BookingDoa;
import doa.CarDoa;
import pojos.Booking;

public class BookingService {
    private final BookingDoa bookingDoa;

    private final CarDoa carDoa;

    public BookingService() {
        this.carDoa = new CarDoa();
        this.bookingDoa = new BookingDoa();
    }

    public void bookCar(String userId, String model) {
        Booking model1 = new Booking(userId, model);
        carDoa.setCarBooked(model);
        bookingDoa.setBooking(model1);
    }

    public void printBookingsByUser() {
        bookingDoa.printBookingsByUser();
    }
}
