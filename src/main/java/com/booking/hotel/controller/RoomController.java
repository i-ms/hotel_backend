package com.booking.hotel.controller;


import com.booking.hotel.entites.Room;
import com.booking.hotel.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping("/api/room/create")
    public Room createRoom(@RequestBody Room room){
        return this.roomService.createNewRoom(room);
    }

    @PutMapping("/api/room/update")
    public Room updateRoom(@RequestBody Room room){
       return this.roomService.updateRoom(room);
    }

    @GetMapping("/api/room/get_all")
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }

    @GetMapping("/api/room/get/{room_id}")
    public Room getRoom(@PathVariable String room_id){
       return this.roomService.getRoom(room_id);
    }

    @DeleteMapping("/api/room/{room_id}")
    public ResponseEntity<HttpStatus> deleteRoom(@PathVariable String room_id){
        try{
            this.roomService.deleteRoom(room_id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
