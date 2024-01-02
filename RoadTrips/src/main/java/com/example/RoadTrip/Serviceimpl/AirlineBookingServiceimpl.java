package com.example.RoadTrip.Serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.RoadTrip.Exception.ResourceNotFoundException;
import com.example.RoadTrip.Repository.AirlineBookingRepo;
import com.example.RoadTrip.Service.AirlineBookingService;
import com.example.RoadTripEntities.AirlineBooking;

public class AirlineBookingServiceimpl implements AirlineBookingService {


	@Autowired
	AirlineBookingRepo airlineBookingRepo;

	public AirlineBooking getBookingById(int id) {
		Optional<AirlineBooking> rm=Optional.ofNullable(airlineBookingRepo.findById(id));
		AirlineBooking booking;
		if(rm.isPresent())
		{
			 booking=rm.get();
		}else {
				throw new ResourceNotFoundException();
			}
		return booking;

	}

	public AirlineBooking addBooking(AirlineBooking airlineBooking) {
		return  airlineBookingRepo.save(airlineBooking);
	}

	public AirlineBooking updateDb(int id,AirlineBooking airlineBooking) {


		AirlineBooking s1 = airlineBookingRepo.findById(id);

		if(s1!=null) {
			s1.setLastName(airlineBooking.getLastName());   
			s1.setFirstName(airlineBooking.getFirstName());
			s1.setDestination(airlineBooking.getDestination());
			s1.setDepartureDate(airlineBooking.getDepartureDate());
			s1.setArrivalDate(airlineBooking.getArrivalDate());
			s1.setPerferredSeating(airlineBooking.getPerferredSeating());
			s1.setEmail(airlineBooking.getEmail());
			s1.setAddress(airlineBooking.getAddress());
		return airlineBookingRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	public void deleteDb(int id) {


		AirlineBooking s2 = airlineBookingRepo.findById(id);

		if(s2!=null) {
			airlineBookingRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}



}
