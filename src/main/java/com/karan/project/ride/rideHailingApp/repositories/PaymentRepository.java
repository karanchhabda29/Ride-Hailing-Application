package com.karan.project.ride.rideHailingApp.repositories;

import com.karan.project.ride.rideHailingApp.entities.Payment;
import com.karan.project.ride.rideHailingApp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Optional<Payment> findByRide(Ride ride);
}
