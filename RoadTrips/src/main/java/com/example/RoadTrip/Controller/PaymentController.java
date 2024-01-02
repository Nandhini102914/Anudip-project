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

import com.example.RoadTrip.Service.PaymentService;
import com.example.RoadTripEntities.Payment;

@RestController
public class PaymentController {
	@Autowired
	     PaymentService  paymentServices;
			
			@GetMapping("/payment/{Id}")
			public Payment getPaymentById(@PathVariable int passengerId) {
				return paymentServices.getPaymentById(passengerId); 
			}
			
			@PostMapping("/addpayment")
			public Payment addPayment(@RequestBody Payment payment) {
				
				return paymentServices.addPayment(payment);
			}
			
			@PutMapping("/updatepayment")
			public Payment update(@RequestHeader int passengerId ,@RequestBody Payment payment) {
				
				return paymentServices.updateDb( passengerId ,payment); 
			}
			@DeleteMapping("/deletepayment")
			public String delete(@RequestHeader int passengerId ) {
				paymentServices.deleteDb(passengerId );
				return "data deleted";
			}
			
			
		}

	


