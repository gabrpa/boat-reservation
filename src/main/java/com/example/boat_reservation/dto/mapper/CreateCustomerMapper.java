package com.example.boat_reservation.dto.mapper;

import org.mapstruct.Mapper;

import com.example.boat_reservation.dto.req.CreateCustomerDTO;
import com.example.boat_reservation.entity.Customer;

@Mapper(componentModel = "spring")
public interface CreateCustomerMapper {
  Customer toEntity(CreateCustomerDTO createCustomerDTO);
  CreateCustomerDTO toDto(Customer customer);
}
