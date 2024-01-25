package com.example.CarTaxiBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.CarTaxiBooking.Entities.Passenger;
@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Integer> {

	@Query(value =  "select * from Passenger where Id =?" , nativeQuery = true)
	Passenger findById(int id);
 

 }
