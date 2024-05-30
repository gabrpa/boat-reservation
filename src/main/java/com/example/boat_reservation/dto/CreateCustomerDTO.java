package com.example.boat_reservation.dto;

import java.util.Date;

import jakarta.validation.constraints.NotEmpty;

public class CreateCustomerDTO {

  @NotEmpty
  private String nickname;

  @NotEmpty
  private Date birthday;

  @NotEmpty
  private String country;
}