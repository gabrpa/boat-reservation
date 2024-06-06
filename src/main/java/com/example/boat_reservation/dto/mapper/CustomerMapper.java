package com.example.boat_reservation.dto.mapper;


import org.mapstruct.Mapper;

import com.example.boat_reservation.dto.res.CustomerDTO;
import com.example.boat_reservation.entity.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
  Customer toEntity(CustomerDTO customer);
  CustomerDTO toDto(Customer customer);
}
