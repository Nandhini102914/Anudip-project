package com.example.RoadTrip.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.RoadTrip.Service.UserService;
import com.example.RoadTripEntities.User;
@RestController
public class UserController {
 @Autowired
	     UserService  userServices;
			
			@GetMapping("/passenger/{Id}")
			public User getPassengerById(@PathVariable int id) {
				return userServices.getPassengerById(id); 
			}
			
			@PostMapping("/addpassenger")
			public User addPassenger(@RequestBody User user) {
				return userServices.addPassenger(user);
			}
			
			@PutMapping("/updatepassenger")
			public User update(@RequestHeader int id,@RequestBody User user) {
				
				return userServices.updateDb( id ,user); 
			}
			@DeleteMapping("/deletepassenger")
			public String delete(@RequestHeader int id ) {
				userServices.deleteDb(id);
				return "data deleted";
			}
			
}

