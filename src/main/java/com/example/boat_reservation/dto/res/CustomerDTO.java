package com.example.boat_reservation.dto.res;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class CustomerDTO {
  private Long id;
  private String nickname;
  private Date birthday;
  private String country;
  private List<ReservationDTO> reservations;
}
