package com.example.RoadTripEntities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class AirlineBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length=20)
	private String firstName;
	@Column(length=20)
	private String lastName;
	@Column(length=20)
	private String email;
	@Column(length=30)
	private String address;
	@Column(length=40)
    private int PerferredAirline;
	@Column(length=20)
    private String  PerferredSeating;
	@Column(length=34)
    private String destination;
	@Column(length=25)
    private String departureDate;
	@Column(length=22)
    private String arrivalDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPerferredAirline() {
		return PerferredAirline;
	}
	public void setPerferredAirline(int perferredAirline) {
		PerferredAirline = perferredAirline;
	}
	public String getPerferredSeating() {
		return PerferredSeating;
	}
	public void setPerferredSeating(String perferredSeating) {
		PerferredSeating = perferredSeating;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	@Override
	public String toString() {
		return "AirlineBooking [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + ", PerferredAirline=" + PerferredAirline + ", PerferredSeating="
				+ PerferredSeating + ", destination=" + destination + ", departureDate=" + departureDate
				+ ", arrivalDate=" + arrivalDate + "]";
	}



}
