package com.booking.hotel.dao;

import com.booking.hotel.entites.Customer;
import com.booking.hotel.entites.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, String> {

}