package com.example.boat_reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.boat_reservation.entity.Reservation;
import com.example.boat_reservation.service.ReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

  @Autowired
  ReservationService reservationService;
  
  @GetMapping("/get/{id}")
  public Reservation getReservationById(@PathVariable Long id) {
    return reservationService.getReservationById(id);
  }

  @GetMapping("/get/all")
  public List<Reservation> getAllReservation() {
    return reservationService.getAllReservation();
  }

  @PostMapping("/new")
  public Reservation createReservation(@RequestBody Reservation reservation) {
    return reservationService.createReservation(reservation);
  }

  @DeleteMapping("/delete/{id}")
  public void deleteReservation(@PathVariable Long id) {
    reservationService.deleteReservation(id);
  }
}