package com.example.boat_reservation.dto.mapper;

import org.mapstruct.Mapper;

import com.example.boat_reservation.dto.res.ReservationDTO;
import com.example.boat_reservation.entity.Reservation;


@Mapper(componentModel = "spring")
public interface ReservationMapper {
  Reservation toEntity(ReservationDTO reservationDTO);
  ReservationDTO toDto(Reservation reservation);
}
