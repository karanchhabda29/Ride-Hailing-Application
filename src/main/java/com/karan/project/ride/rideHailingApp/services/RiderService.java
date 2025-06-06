package com.karan.project.ride.rideHailingApp.services;

import com.karan.project.ride.rideHailingApp.dto.DriverDto;
import com.karan.project.ride.rideHailingApp.dto.RideDto;
import com.karan.project.ride.rideHailingApp.dto.RideRequestDto;
import com.karan.project.ride.rideHailingApp.dto.RiderDto;
import com.karan.project.ride.rideHailingApp.entities.Rider;
import com.karan.project.ride.rideHailingApp.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
