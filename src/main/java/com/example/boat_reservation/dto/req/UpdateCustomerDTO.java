package com.example.boat_reservation.dto.req;

import java.util.Date;
import java.util.List;

import com.example.boat_reservation.entity.Reservation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class UpdateCustomerDTO {
  @JsonIgnore
  private Long id;

  private String nickname;

  private Date birthday;

  private String country;

  @JsonIgnore
  private List<Reservation> reservations;
}
