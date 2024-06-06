package com.example.boat_reservation.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.example.boat_reservation.dto.req.UpdateCustomerDTO;
import com.example.boat_reservation.entity.Customer;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )
public interface UpdateCustomerMapper {
  Customer toEntity(UpdateCustomerDTO customer);
  UpdateCustomerDTO toDto(Customer customer);
}
