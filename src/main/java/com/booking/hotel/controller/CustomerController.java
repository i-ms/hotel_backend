package com.booking.hotel.controller;


import com.booking.hotel.entites.Customer;
import com.booking.hotel.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/api/customer/create")
    public Customer createCustomer(@RequestBody Customer customer){
        return this.customerService.createCustomer(customer);
    }

    @PutMapping("/api/customer/update")
    public Customer updateCustomer(@RequestBody Customer customer){
        return this.customerService.updateCustomer(customer);
    }

    @DeleteMapping("/api/customer/delete/{customer_id}")
    public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable String customer_id){
        try{
            this.customerService.deleteCustomer(customer_id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/customer/get/{customer_id}")
    public Customer getCustomer(@PathVariable String customer_id){
        return this.customerService.getCustomer(customer_id);
    }

    @GetMapping("/api/customer/get_all")
    public List<Customer> getAllCustomer(){
        return this.customerService.getAllCustomers();
    }

}
