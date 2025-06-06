package com.karan.project.ride.rideHailingApp.strategies.impl;

import com.karan.project.ride.rideHailingApp.entities.Driver;
import com.karan.project.ride.rideHailingApp.entities.RideRequest;
import com.karan.project.ride.rideHailingApp.repositories.DriverRepository;
import com.karan.project.ride.rideHailingApp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional()
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearbyTopRatedDrivers(rideRequest.getPickupLocation());
    }
}
