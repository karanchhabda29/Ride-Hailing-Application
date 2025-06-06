package com.karan.project.ride.rideHailingApp.services;

import com.karan.project.ride.rideHailingApp.dto.DriverDto;
import com.karan.project.ride.rideHailingApp.dto.SignupDto;
import com.karan.project.ride.rideHailingApp.dto.UserDto;

public interface AuthService {

    String[] login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId, String vehicleId);

    String refreshToken(String refreshToken);
}
