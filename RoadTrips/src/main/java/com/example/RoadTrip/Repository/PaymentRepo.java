package com.example.RoadTrip.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.RoadTripEntities.Payment;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
	public interface PaymentRepo extends JpaRepository<Payment, Integer> {
	@Query(value =  "select * from Payment where passengerId =?" , nativeQuery = true)
		Payment findById(int passengerId);
}


