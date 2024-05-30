package com.example.boat_reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// import com.example.boat_reservation.dto.CreateCustomerDTO;
import com.example.boat_reservation.entity.Customer;
import com.example.boat_reservation.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
  
  @Autowired
  private CustomerService customerService;

  @GetMapping("/get/{id}")
  public Customer getCustomerById(@PathVariable Long id) {
    return customerService.getCustomerById(id);
  }

  @PostMapping("/new")
  public Customer createCustomer(@RequestBody Customer customer) {
    return customerService.createCustomer(customer);
  }

  @DeleteMapping("/delete/{id}")
  public void deleteCustomer(@PathVariable Long id) {
    customerService.deleteCustomer(id);
  }
}
