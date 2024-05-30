package com.example.boat_reservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boat_reservation.entity.Boat;
import com.example.boat_reservation.repository.BoatRepository;

@Service
public class BoatService {
  
  @Autowired
  private BoatRepository boatRepository;

  public Boat getBoatById(Long id) {
    return boatRepository.findById(id).orElse(null);
  }

  public List<Boat> getAllBoat() {
    return boatRepository.findAll();
  }

  public Boat createBoat(Boat boat) {
    return boatRepository.save(boat);
  }

  public void deleteBoat(Long id) {
    boatRepository.deleteById(id);
  }

  
}
