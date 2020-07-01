package com.hiyamee.FlightBookingDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hiyamee.FlightBookingDemo.entity.FlightBookingDto;
import com.hiyamee.FlightBookingDemo.entity.FlightBookingEntity;

@Service
public interface FlightBookingService {

	FlightBookingEntity save(FlightBookingEntity flightBookingEntity);

	//List<FlightBookingDto> getFlightDetails(FlightBookingDto flightBookingEntity);

	//List<FlightBookingDto> getFlightDetails(String sourceCity, String destinationCity);

	

}
