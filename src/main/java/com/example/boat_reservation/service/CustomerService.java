package com.example.boat_reservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boat_reservation.dto.CreateCustomerDTO;
import com.example.boat_reservation.entity.Customer;
import com.example.boat_reservation.entity.Reservation;
import com.example.boat_reservation.repository.CustomerRepository;


@Service
public class CustomerService {
  
  @Autowired
  private CustomerRepository customerRepository;

  public Customer getCustomerById(Long id) {
    return customerRepository.findById(id).orElse(null);
  }

  public Customer createCustomer(Customer customer) {
    return customerRepository.save(customer);
  }

  public Customer updateCustomer(Long id, Customer customer) throws Exception {
    var c = getCustomerById(id);
    if (c == null) {
      throw new Exception("Customer ID " + id + " Not found");
    } 
    else {
      return customerRepository.save(customer);
    }
  }

  public void deleteCustomer(Long id) {
    customerRepository.deleteById(id);
  }
  
}
