package com.example.RoadTrip.Service;

import com.example.RoadTripEntities.AirlineBooking;

public interface AirlineBookingService {
	AirlineBooking getBookingById(int id);
	AirlineBooking addBooking( AirlineBooking airlineBooking);

	AirlineBooking updateDb(int id,AirlineBooking airlineBooking);

	void deleteDb(int id);


}
