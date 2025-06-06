package com.karan.project.ride.rideHailingApp.services;

import com.karan.project.ride.rideHailingApp.dto.DriverDto;
import com.karan.project.ride.rideHailingApp.dto.RiderDto;
import com.karan.project.ride.rideHailingApp.entities.Ride;

public interface RatingService {

    DriverDto rateDriver(Ride ride, Integer rating);
    RiderDto rateRider(Ride ride, Integer rating);

    void createNewRating(Ride ride);
}
