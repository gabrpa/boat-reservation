package com.example.boat_reservation.entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reservation")
public class Reservation {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Date reservation_date;
  private String boat;

  @ManyToOne
  @JoinColumn(name = "customer_id", referencedColumnName = "id")
  private Customer customer;

}
