package com.example.boat_reservation.dto.req;

import java.util.Date;

import com.example.boat_reservation.dto.res.CustomerDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class CreateReservationDTO {
  @JsonIgnore
  private Long id;

  private Date reservation_date;
  private String boat;

  private CustomerDTO customer;
}
