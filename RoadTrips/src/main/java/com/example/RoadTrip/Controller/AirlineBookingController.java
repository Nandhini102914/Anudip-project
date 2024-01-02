package com.example.RoadTrip.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.RoadTrip.Service.AirlineBookingService;
import com.example.RoadTripEntities.AirlineBooking;

@RestController

	@CrossOrigin(origins = "http://localhost:4200")
	public class AirlineBookingController {

		@Autowired
		 AirlineBookingService  airlineBookingService;

		@GetMapping("/booking/{Id}")
		public AirlineBooking getBookingById(@PathVariable int id) {
			return airlineBookingService.getBookingById(id); 
		}

		@PostMapping("/postbook")
		public AirlineBooking addBooking(@RequestBody AirlineBooking airlineBooking) {

			return airlineBookingService.addBooking( airlineBooking);
		}

		@PutMapping("/updatebooking")
		public AirlineBooking update(@RequestHeader int id ,@RequestBody AirlineBooking  airlineBooking) {

			return airlineBookingService.updateDb(id , airlineBooking); 
		}
		@DeleteMapping("/deletebooking")
		public String delete(@RequestHeader int id) {
			airlineBookingService.deleteDb(id );
			return "data deleted";
		}


}
