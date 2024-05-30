package com.example.boat_reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.boat_reservation.entity.Boat;

public interface BoatRepository extends JpaRepository<Boat, Long> {
  
}
