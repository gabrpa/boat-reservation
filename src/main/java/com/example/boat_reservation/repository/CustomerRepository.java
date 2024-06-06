package com.example.boat_reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.boat_reservation.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
