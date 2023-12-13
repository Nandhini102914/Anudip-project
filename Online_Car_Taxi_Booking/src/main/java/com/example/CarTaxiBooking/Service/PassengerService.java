package com.example.CarTaxiBooking.Service;

import com.example.CarTaxiBooking.Entities.Passenger;

public interface PassengerService {
	Passenger getPassengerById(int id );
	Passenger addPassenger(Passenger passenger);
	Passenger updateDb(int pid, Passenger passenger);
	void deleteDb(int id);
	

	

}
