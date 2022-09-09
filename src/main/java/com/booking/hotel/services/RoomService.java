package com.booking.hotel.services;

import com.booking.hotel.entites.Room;

import java.util.List;

public interface RoomService {
    public Room createNewRoom(Room room);
    public Room updateRoom(Room room);
    public List<Room> getAllRooms();
    public Room getRoom(String room_id);
    public void deleteRoom(String room_id);
}
