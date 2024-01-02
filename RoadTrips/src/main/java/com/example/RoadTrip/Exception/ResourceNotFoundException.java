package com.example.RoadTrip.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@ResponseStatus(value = HttpStatus.ACCEPTED)
	public class  ResourceNotFoundException  extends RuntimeException {

		public ResourceNotFoundException() {
			super("Invalid credentials");
			
		 }

	}


