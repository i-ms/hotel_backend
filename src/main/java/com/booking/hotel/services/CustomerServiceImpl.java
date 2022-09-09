package com.booking.hotel.services;

import com.booking.hotel.dao.CustomerDao;
import com.booking.hotel.entites.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerDao.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerDao.save(customer);
    }

    @Override
    public void deleteCustomer(String customer_id) {
         customerDao.deleteById(customer_id);
    }

    @Override
    public Customer getCustomer(String customer_id) {
        return customerDao.findById(customer_id).get();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerDao.findAll();
    }
}
