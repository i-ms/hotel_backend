package com.booking.hotel.services;

import com.booking.hotel.entites.Customer;

import java.util.List;

public interface CustomerService {
    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public void deleteCustomer(String customer_id);
    public Customer getCustomer(String customer_id);
    public List<Customer> getAllCustomers();
}
