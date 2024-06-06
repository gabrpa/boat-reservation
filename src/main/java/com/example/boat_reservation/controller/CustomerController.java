package com.example.boat_reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.example.boat_reservation.dto.req.CreateCustomerDTO;
import com.example.boat_reservation.dto.req.UpdateCustomerDTO;
import com.example.boat_reservation.dto.res.CustomerDTO;
import com.example.boat_reservation.entity.Customer;
import com.example.boat_reservation.service.CustomerService;

import jakarta.validation.Valid;

@RestController
@Validated
@RequestMapping("/customer")
public class CustomerController {
  
  @Autowired
  private CustomerService customerService;

  @GetMapping("/get/{id}")
  public Customer getCustomerById(@PathVariable Long id) {
    return customerService.getCustomerById(id);
  }

  @PostMapping("/new")
  public CustomerDTO createCustomer(@Valid @RequestBody CreateCustomerDTO customer) {
    return customerService.createCustomer(customer);
  }

  @PutMapping("/edit/{id}")
  public CustomerDTO updateCustomer(@PathVariable Long id, @RequestBody UpdateCustomerDTO customer) throws Exception {
    return customerService.updateCustomer(id, customer);
  }

  @DeleteMapping("/delete/{id}")
  public void deleteCustomer(@PathVariable Long id) throws Exception {
    customerService.deleteCustomer(id);
  }
}
