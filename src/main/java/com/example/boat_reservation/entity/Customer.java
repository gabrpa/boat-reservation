package com.example.boat_reservation.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Data
@NoArgsConstructor

@AllArgsConstructor
@Table(name = "customer")
public class Customer {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nickname;
  private Date birthday;
  private String country;

  @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private Set<Reservation> reservations = new HashSet<>();

}
