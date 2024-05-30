package com.example.boat_reservation.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boat_reservation.entity.Reservation;
import com.example.boat_reservation.repository.ReservationRepository;

import jakarta.transaction.Transactional;

@Service
public class ReservationService {
  
  @Autowired
  private ReservationRepository reservationRepository;

  @Autowired
  private CustomerService customerService;

  public Reservation getReservationById(Long id) {
    return reservationRepository.findById(id).orElse(null);
  }

  public List<Reservation> getAllReservation() {
    return reservationRepository.findAll();
  }

  @Transactional
  public Reservation createReservation(Reservation reservation, Long customerId) throws Exception {
    var c = customerService.getCustomerById(customerId);
    if (c == null) {
      throw new Exception("Customer ID " + customerId + " Not found");
    }
    else {
      reservation.setCustomer(c);
      return reservationRepository.save(reservation);
    }
  }

  public void deleteReservation(Long id) {
    reservationRepository.deleteById(id);
  }
}
