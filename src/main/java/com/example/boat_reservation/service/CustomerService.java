package com.example.boat_reservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boat_reservation.dto.CreateCustomerDTO;
import com.example.boat_reservation.entity.Customer;
import com.example.boat_reservation.repository.CustomerRepository;

import jakarta.transaction.Transactional;

@Service
public class CustomerService {
  
  @Autowired
  private CustomerRepository customerRepository;

  public Customer getCustomerById(Long id) {
    return customerRepository.findById(id).orElse(null);
  }

  public Customer createCustomer(CreateCustomerDTO customer) {
    return customerRepository.save(customer);
  }

  @Transactional
  public Customer updateCustomer(Long id, Customer customer) {
    // var c = customerRepository.getReferenceById(id);
    return customer;
  }

  public void deleteCustomer(Long id) {
    customerRepository.deleteById(id);
  }
  
}
