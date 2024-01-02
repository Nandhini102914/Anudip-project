package com.example.RoadTrip.Serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RoadTrip.Exception.ResourceNotFoundException;
import com.example.RoadTrip.Repository.PaymentRepo;
import com.example.RoadTrip.Service.PaymentService;
import com.example.RoadTripEntities.Payment;
@Service
public class PaymentServiceimpl implements PaymentService {
	@Autowired
		PaymentRepo paymentRepo;
		
		public Payment getPaymentById(int passengerId ) {
			Optional<Payment> pay=Optional.ofNullable(paymentRepo.findById(passengerId));

			Payment p;
			if(pay.isPresent())
           {

				 p=pay.get();

			}

	else {

				throw new ResourceNotFoundException();

			}

			return p;

}

		public Payment addPayment(Payment payment) {
			return  paymentRepo.save(payment);
		}

		public Payment updateDb(int passengerId, Payment payment) {
		Payment s1 = paymentRepo.findById(passengerId);
			
			if(s1!=null) {
				s1.setPassengerName(payment.getPassengerName());   
				s1.setPaymentMode(payment.getPaymentMode());
				s1.setTotalAmount(payment.getTotalAmount());
			return paymentRepo.save(s1);
			} 
			else 
			{
				throw new ResourceNotFoundException();
			} 
		}

		@Override
		public void deleteDb(int passengerId) {
		
			
			Payment s2 = paymentRepo.findById(passengerId);
	
			if(s2!=null) {
				paymentRepo.delete(s2);
			}
			else {
				throw new ResourceNotFoundException();
			}		 
		

		
		
	}

}
