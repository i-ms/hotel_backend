package com.booking.hotel.services;

import com.booking.hotel.dao.BookingDao;
import com.booking.hotel.entites.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    private BookingDao bookingDao;

    @Override
    public List<Booking> getAllBookings() {
        return this.bookingDao.findAll();
    }

    @Override
    public Booking getBookingById(String booking_id) {
        return this.bookingDao.findById(booking_id).get();
    }

    @Override
    public Booking createNewBooking(Booking booking) {
        return this.bookingDao.save(booking);
    }

    @Override
    public Booking updateBooking(Booking booking) {
        return this.bookingDao.save(booking);
    }

    @Override
    public void deleteBooking(String booking_id) {
        this.bookingDao.deleteById(booking_id);
    }
}

