package com.hiyamee.FlightBookingDemo.entity;

import java.util.Date;

public class FlightOutput {
	
private int flightNumber;
	
	private String airlineName;
	
	private Date departureAndarrivalTime;
	
	//private long duration=travelDate.getTime() - returnDate.getTime();
	
	private int numberOfstops;
	
	private int price;

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public Date getDepartureAndarrivalTime() {
		return departureAndarrivalTime;
	}

	public void setDepartureAndarrivalTime(Date departureAndarrivalTime) {
		this.departureAndarrivalTime = departureAndarrivalTime;
	}

	public int getNumberOfstops() {
		return numberOfstops;
	}

	public void setNumberOfstops(int numberOfstops) {
		this.numberOfstops = numberOfstops;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
