package com.karan.project.ride.rideHailingApp.strategies;

import com.karan.project.ride.rideHailingApp.entities.RideRequest;

public interface RideFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER = 10;

    double calculateFare(RideRequest rideRequest);

}
