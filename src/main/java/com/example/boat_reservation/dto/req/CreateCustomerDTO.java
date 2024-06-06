package com.example.boat_reservation.dto.req;

import java.util.Date;
import java.util.List;

import com.example.boat_reservation.entity.Reservation;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateCustomerDTO {
  @NotEmpty
  private String nickname;

  @NotNull
  private Date birthday;

  @NotEmpty
  private String country;

  @JsonIgnore
  private List<Reservation> reservations;
}