package com.booking.hotel.services;

import com.booking.hotel.dao.RoomDao;
import com.booking.hotel.entites.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService{

    @Autowired
    private RoomDao roomDao;

    @Override
    public Room createNewRoom(Room room) {
        return this.roomDao.save(room);
    }

    @Override
    public Room updateRoom(Room room) {
        return this.roomDao.save(room);
    }

    @Override
    public List<Room> getAllRooms() {
        return this.roomDao.findAll();
    }

    @Override
    public Room getRoom(String room_id) {
        return this.roomDao.findById(room_id).get();
    }

    @Override
    public void deleteRoom(String room_id) {
        this.roomDao.deleteById(room_id);
    }
}
