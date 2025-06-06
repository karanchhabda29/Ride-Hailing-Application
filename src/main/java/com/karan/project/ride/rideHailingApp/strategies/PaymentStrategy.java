package com.karan.project.ride.rideHailingApp.strategies;

import com.karan.project.ride.rideHailingApp.entities.Payment;

public interface PaymentStrategy {
    Double PLATFORM_COMMISSION = 0.3;
    void processPayment(Payment payment);

}
