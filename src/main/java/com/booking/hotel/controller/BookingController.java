package com.booking.hotel.controller;

import com.booking.hotel.entites.Booking;
import com.booking.hotel.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/api/booking/view_all")
    public List<Booking> getAllBookings(){
        return this.bookingService.getAllBookings();
    }

    @GetMapping("/api/booking/view/{booking_id}")
    public Booking getBookingById(@PathVariable String booking_id){
        return this.bookingService.getBookingById(booking_id);
    }

    @PostMapping("/api/booking/create")
    public Booking createNewBooking(@RequestBody Booking booking){
        return this.bookingService.createNewBooking(booking);
    }

    @PutMapping("/api/booking/update")
    public Booking updateBooking(@RequestBody Booking booking){
        return this.bookingService.updateBooking(booking);
    }

    @DeleteMapping("/api/booking/delete/{booking_id}")
    public ResponseEntity<HttpStatus> deleteBooking(@PathVariable String booking_id){
        try{
            this.bookingService.deleteBooking(booking_id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
