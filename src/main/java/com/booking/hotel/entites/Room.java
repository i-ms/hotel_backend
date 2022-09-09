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
@Table(name="room")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    @Column(name="id")
    private String id;
    @Column(name="room_number")
    private String number;
    @Column(name="room_type")
    private String type;
    @Column(name="room_price")
    private float price;

}
