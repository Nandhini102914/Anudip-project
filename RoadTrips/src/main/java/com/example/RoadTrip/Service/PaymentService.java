package com.example.RoadTrip.Service;

import com.example.RoadTripEntities.Payment;

public interface PaymentService {

	
		Payment getPaymentById(int passengerId );
		Payment addPayment(Payment payment);
		Payment updateDb(int PassengerId,Payment payment);
		void deleteDb(int PassengerId);
	}


