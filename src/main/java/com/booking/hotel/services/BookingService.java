package com.booking.hotel.services;

import com.booking.hotel.entites.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingService {
    public List<Booking> getAllBookings();

    public Booking getBookingById(String booking_id);
    public Booking createNewBooking(Booking booking);
    public Booking updateBooking(Booking booking);
    public void deleteBooking(String booking_id);
}