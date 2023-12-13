package com.example.CarTaxiBooking.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passengerId;
	private String passengerName;
	@Column(length=20)
	private  int totalAmount;
	@Column(length=15)
	private int paymentMode;
	@Column(length=20)
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
    public String getPassengerName() {
		return passengerName;
	}
    public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
    public int getTotalAmount() {
		return totalAmount;
	}
    public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
    public int getPaymentMode() {
		return paymentMode;
	}
    public void setPaymentMode(int paymentMode) {
		this.paymentMode = paymentMode;
    }
	@Override
	public String toString() {
		return "Payment [passengerId=" + passengerId + ", passengerName=" + passengerName + ", totalAmount="
				+ totalAmount + ", paymentMode=" + paymentMode + "]";
	}
	
}


