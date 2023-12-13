package com.example.CarTaxiBooking.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.CarTaxiBooking.Entities.Payment;
@Repository
	public interface PaymentRepo extends JpaRepository<Payment, Integer> {
	@Query(value =  "select * from Payment where passengerId =?" , nativeQuery = true)
		Payment findById(int passengerId);
}


