package com.karan.project.ride.rideHailingApp.services;

import com.karan.project.ride.rideHailingApp.entities.Payment;
import com.karan.project.ride.rideHailingApp.entities.Ride;
import com.karan.project.ride.rideHailingApp.entities.enums.PaymentStatus;

public interface PaymentService {

    void processPayment(Ride ride);

    Payment createNewPayment(Ride ride);

    void updatePaymentStatus(Payment payment, PaymentStatus status);
}
