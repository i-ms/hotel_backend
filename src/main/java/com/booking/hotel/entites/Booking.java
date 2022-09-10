package com.booking.hotel.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name="bookings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    @Id
    @Column(name="id")
    private String id;
    @Column(name="user_id")
    private String user_id;
    @Column(name="room_id")
    private String room_id;
    @Column(name="check_in")
    private LocalDate check_in;
    @Column(name="check_out")
    private LocalDate check_out;
}
