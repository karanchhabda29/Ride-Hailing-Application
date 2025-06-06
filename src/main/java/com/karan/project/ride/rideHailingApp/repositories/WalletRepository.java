package com.karan.project.ride.rideHailingApp.repositories;

import com.karan.project.ride.rideHailingApp.entities.User;
import com.karan.project.ride.rideHailingApp.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
    Optional<Wallet> findByUser(User user);
}
