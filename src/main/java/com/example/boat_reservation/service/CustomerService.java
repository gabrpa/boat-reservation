package com.example.boat_reservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boat_reservation.dto.mapper.CreateCustomerMapper;
import com.example.boat_reservation.dto.mapper.CustomerMapper;
import com.example.boat_reservation.dto.mapper.UpdateCustomerMapper;
import com.example.boat_reservation.dto.req.CreateCustomerDTO;
import com.example.boat_reservation.dto.req.UpdateCustomerDTO;
import com.example.boat_reservation.dto.res.CustomerDTO;
import com.example.boat_reservation.entity.Customer;
import com.example.boat_reservation.repository.CustomerRepository;

@Service
public class CustomerService {
  
  @Autowired
  private CustomerRepository customerRepository;

  @Autowired
  private CustomerMapper customerMapper;

  @Autowired
  private CreateCustomerMapper createCustomerMapper;

  @Autowired
  private UpdateCustomerMapper updateCustomerMapper;


  public Customer getCustomerById(Long id) {
    var c = customerRepository.findById(id).orElse(null);
    return c;
  }

  public CustomerDTO createCustomer(CreateCustomerDTO customer) {
    var c = createCustomerMapper.toEntity(customer);
    return customerMapper.toDto(customerRepository.save(c));
  }

  public CustomerDTO updateCustomer(Long id, UpdateCustomerDTO updateCustomer) throws Exception {
    var c = getCustomerById(id);
    if (c == null) {
      throw new Exception("Customer ID " + id + " Not found");
    } 
      var cEntity = updateCustomerMapper.toEntity(updateCustomer);
      c.setNickname(cEntity.getNickname() != null ? cEntity.getNickname() : c.getNickname());
      c.setBirthday(cEntity.getBirthday() != null ? cEntity.getBirthday() : c.getBirthday());
      c.setCountry(cEntity.getCountry() != null ? cEntity.getCountry() : c.getCountry());
      return customerMapper.toDto(customerRepository.save(c));
  }

  public void deleteCustomer(Long id) throws Exception {
    var c = getCustomerById(id);
    if (c == null) {
      throw new Exception("Customer ID " + id + " Not found");
    }
    customerRepository.deleteById(c.getId());
  }
  
}
