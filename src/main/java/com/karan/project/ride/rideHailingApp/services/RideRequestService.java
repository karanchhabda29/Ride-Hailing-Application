package com.karan.project.ride.rideHailingApp.services;

import com.karan.project.ride.rideHailingApp.entities.RideRequest;

public interface RideRequestService {

    RideRequest findRideRequestById(Long rideRequestId);

    void update(RideRequest rideRequest);
}
