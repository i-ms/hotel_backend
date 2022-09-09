package com.booking.hotel.dao;

import com.booking.hotel.entites.Booking;
import com.booking.hotel.entites.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDao extends JpaRepository<Booking, String> {

}
