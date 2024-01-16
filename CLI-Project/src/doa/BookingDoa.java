package doa;

import pojos.Booking;

public class BookingDoa {
    private static Booking[] bookings;
    private static final int MAX_BOOKINGS = 10000;

    static {
        bookings = new Booking[MAX_BOOKINGS];
    }

    public void setBooking(Booking booking) {
        bookings = new Booking[bookings.length + 1];
        bookings[bookings.length - 1] = booking;
        printBooking(booking);
    }
    private void printBooking(Booking booking){
        System.out.println("Booking Details");
        System.out.println("User Id: "+ booking.getUserId());
        System.out.println("Car Model: "+booking.getCarModel());
    }

}
