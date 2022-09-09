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
@Table(name="customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @Column(name="id")
    private String id;
    @Column(name="first_name")
    private String first_name;
    @Column(name="last_name")
    private String last_name;
    @Column(name="email")
    private String email;
    @Column(name="mobile_no")
    private String mobile_no;
    @Column(name="gender")
    private String gender;
    @Column(name="address")
    private String address;
    @Column(name="gov_id_type")
    private String gov_id_type;
    @Column(name="id_no")
    private String id_no;
}
