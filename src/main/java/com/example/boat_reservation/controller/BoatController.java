package com.example.boat_reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.boat_reservation.entity.Boat;
import com.example.boat_reservation.service.BoatService;

@RestController("/boat")
public class BoatController {

  @Autowired
  private BoatService boatService;

  @GetMapping("/get/{id}")
  public Boat getBoatById(@PathVariable Long id) {
    return boatService.getBoatById(id);
  }

  @GetMapping("/gel/all")
  public List<Boat> getAllBoat() {
    return boatService.getAllBoat();
  }

  @PostMapping("/new")
  public Boat createBoat(@RequestBody Boat boat) {
    return boatService.createBoat(boat);
  }

  @DeleteMapping("/delete/{id}")
  public void deleteBoat(@PathVariable Long id) {
    boatService.deleteBoat(id);
  }
  
}
