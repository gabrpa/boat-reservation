package com.example.boat_reservation.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boat_reservation.entity.Reservation;
import com.example.boat_reservation.repository.ReservationRepository;

@Service
public class ReservationService {
  
  @Autowired
  private ReservationRepository reservationRepository;

  public Reservation getReservationById(Long id) {
    return reservationRepository.findById(id).orElse(null);
  }

  public List<Reservation> getAllReservation() {
    return reservationRepository.findAll();
  }

  public Reservation createReservation(Reservation reservation) {
    return reservationRepository.save(reservation);
  }

  public void deleteReservation(Long id) {
    reservationRepository.deleteById(id);
  }
}
