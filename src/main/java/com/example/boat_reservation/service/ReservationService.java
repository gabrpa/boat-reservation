package com.example.boat_reservation.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boat_reservation.dto.mapper.ReservationMapper;
import com.example.boat_reservation.dto.res.ReservationDTO;
import com.example.boat_reservation.entity.Reservation;
import com.example.boat_reservation.repository.ReservationRepository;

@Service
public class ReservationService {

  @Autowired
  private CustomerService customerService;
  
  @Autowired
  private ReservationRepository reservationRepository;

  @Autowired
  private ReservationMapper reservationMapper;

  public Reservation getReservationById(Long id) {
    return reservationRepository.findById(id).orElse(null);
  }

  public List<Reservation> getAllReservation() {
    return reservationRepository.findAll();
  }

  public ReservationDTO createReservation(ReservationDTO reservation, Long customerId) throws Exception {
    var c = customerService.getCustomerById(customerId);
    if (c == null) {
      throw new Exception("Customer ID " + customerId + " Not found");
    }
    else {
      var r = Reservation.builder()
      .boat(reservation.getBoat())
      .reservation_date(reservation.getReservation_date())
      .customer(c).build();
      return reservationMapper.toDto(reservationRepository.save(r));
    }
  }

  public void deleteReservation(Long id) {
    reservationRepository.deleteById(id);
  }
}
