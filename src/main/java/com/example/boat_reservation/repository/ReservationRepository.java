package com.example.boat_reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.boat_reservation.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
