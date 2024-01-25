package com.example.CarTaxiBooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.CarTaxiBooking.Entities.Passenger;
import com.example.CarTaxiBooking.Service.PassengerService;
@RestController
    @CrossOrigin(origins="http://localhost:4200")
public class PassengerController {
 @Autowired
	     PassengerService  passengerServices;
			
			@GetMapping("/passenger/{Id}")
			public Passenger getPassengerById(@PathVariable int id) {
				return passengerServices.getPassengerById(id); 
			}
			
			@PostMapping("/addpassenger")
			public Passenger addPassenger(@RequestBody Passenger passenger) {
				return passengerServices.addPassenger(passenger);
			}
			
			@PutMapping("/updatepassenger")
			public Passenger update(@RequestHeader int id,@RequestBody Passenger passenger) {
				
				return passengerServices.updateDb( id ,passenger); 
			}
			@DeleteMapping("/deletepassenger")
			public String delete(@RequestHeader int id ) {
				passengerServices.deleteDb(id);
				return "data deleted";
			}
			
}

