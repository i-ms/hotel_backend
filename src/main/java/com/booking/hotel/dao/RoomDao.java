package com.booking.hotel.dao;

import com.booking.hotel.entites.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomDao extends JpaRepository<Room, String> {

}