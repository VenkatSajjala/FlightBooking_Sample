package com.hiyamee.FlightBookingDemo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;

public class FlightBookingDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String sourceCity;
	
	private String destinationCity;
	
	private Date travelDate;
	
	private Date returnDate;
	
	private int flightNumber;
	
	private String airlineName;
	
	private Date departureAndarrivalTime;
	
	//private long duration=travelDate.getTime() - returnDate.getTime();
	
	private int numberOfstops;
	
	private int price;

	
	
	
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

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

	/*public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}*/

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


	@Override
	public String toString() {
		return "FlightBookingEntity [id=" + id + ", sourceCity=" + sourceCity + ", destinationCity=" + destinationCity
				+ ", travelDate=" + travelDate + ", returnDate=" + returnDate + ", flightNumber=" + flightNumber
				+ ", airlineName=" + airlineName + ", departureAndarrivalTime=" + departureAndarrivalTime
				+ ", numberOfstops=" + numberOfstops + ", price=" + price + "]";
	}


	public FlightBookingDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	

	

}
