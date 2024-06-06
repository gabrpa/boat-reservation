package com.example.boat_reservation.dto.res;

import java.util.Date;

import com.example.boat_reservation.entity.Customer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
public class ReservationDTO {
  private Long id;
  private Date reservation_date;
  private String boat;

  @JsonIgnoreProperties(value = "reservations")
  private Customer customer;

}
