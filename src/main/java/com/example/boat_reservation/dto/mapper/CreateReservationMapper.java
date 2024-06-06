package com.example.boat_reservation.dto.mapper;

import org.mapstruct.Mapper;

import com.example.boat_reservation.dto.req.CreateReservationDTO;
import com.example.boat_reservation.entity.Reservation;

@Mapper(componentModel = "spring")
public interface CreateReservationMapper {
  Reservation toEntity(CreateReservationDTO createReservationDTO);
  CreateReservationDTO toDto(Reservation reservation);
}