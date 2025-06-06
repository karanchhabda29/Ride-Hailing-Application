package com.karan.project.ride.rideHailingApp.repositories;

import com.karan.project.ride.rideHailingApp.entities.Driver;
import com.karan.project.ride.rideHailingApp.entities.Ride;
import com.karan.project.ride.rideHailingApp.entities.Rider;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {
    Page<Ride> findByRider(Rider rider, Pageable pageRequest);

    Page<Ride> findByDriver(Driver driver, Pageable pageRequest);
}
