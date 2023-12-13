package com.example.CarTaxiBooking.Service;

import com.example.CarTaxiBooking.Entities.Payment;

public interface PaymentService {

	
		Payment getPaymentById(int passengerId );
		Payment addPayment(Payment payment);
		Payment updateDb(int PassengerId,Payment payment);
		void deleteDb(int PassengerId);
	}


