package com.example.RoadTrip.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.RoadTripEntities.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	@Query(value =  "select * from Passenger where Id =?" , nativeQuery = true)
	User findById(int id);
 

 }
