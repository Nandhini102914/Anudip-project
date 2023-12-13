package com.example.CarTaxiBooking.Serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CarTaxiBooking.Entities.Passenger;
import com.example.CarTaxiBooking.Exception.ResourceNotFoundException;
import com.example.CarTaxiBooking.Repository.PassengerRepo;
import com.example.CarTaxiBooking.Service.PassengerService;

@Service
	public class PassengerServiceimpl implements PassengerService {

		@Autowired
		PassengerRepo passengerRepo;
		
		@Override
		public Passenger getPassengerById(int id ) {
			Optional<Passenger> pay=Optional.ofNullable(passengerRepo.findById(id));

			Passenger p;
			if(pay.isPresent())
           {

				 p=pay.get();

			}

	else {

				throw new ResourceNotFoundException();

			}

			return p;

}

		@Override
		public Passenger addPassenger(Passenger passenger) {
			return  passengerRepo.save(passenger);
		}

		@Override
		public Passenger updateDb(int id, Passenger passenger) {
		Passenger s1 = passengerRepo.findById(id);
			
			if(s1!=null) {
				s1.setFirstName(passenger.getFirstName());   
				s1.setLastName(passenger.getLastName());
				s1.setPassengerId(passenger.getPassengerId());
				s1.setEmail(passenger.getEmail());
				s1.setPassword(passenger.getPassword());
				s1.setPhoneNumber(passenger.getPhoneNumber());
				
			return passengerRepo.save(s1);
			} 
			else 
			{
				throw new ResourceNotFoundException();
			} 
		}

		@Override
		public void deleteDb(int id) {
		
			
			Passenger s2 = passengerRepo.findById(id);
	
			if(s2!=null) {
				passengerRepo.delete(s2);
			}
			else {
				throw new ResourceNotFoundException();
			}		 
		

		
		
	}

		}

