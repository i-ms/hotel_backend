package com.booking.hotel.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
    private String check_in;
    @Column(name="check_out")
    private String check_out;
}
