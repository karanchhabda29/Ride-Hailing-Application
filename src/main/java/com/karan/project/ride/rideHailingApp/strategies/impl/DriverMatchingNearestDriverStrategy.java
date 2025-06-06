package com.karan.project.ride.rideHailingApp.strategies.impl;

import com.karan.project.ride.rideHailingApp.entities.Driver;
import com.karan.project.ride.rideHailingApp.entities.RideRequest;
import com.karan.project.ride.rideHailingApp.repositories.DriverRepository;
import com.karan.project.ride.rideHailingApp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearestDrivers(rideRequest.getPickupLocation());
    }
}
