package com.hiyamee.FlightBookingDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiyamee.FlightBookingDemo.entity.FlightBookingDto;
import com.hiyamee.FlightBookingDemo.entity.FlightBookingEntity;
import com.hiyamee.FlightBookingDemo.repo.FlightBookingRepository;
import com.hiyamee.FlightBookingDemo.repo.FlightSearchRepo;

@Service
public class FlightBookingServiceImpl implements FlightBookingService {
	
	@Autowired
	private FlightBookingRepository  flightBookingRepository;
	
	@Autowired
	private FlightSearchRepo flightSearchRepo;

	@Override
	public FlightBookingEntity save(FlightBookingEntity flightBookingEntity) {
		
		
		return flightBookingRepository.save(flightBookingEntity);
	}


	/*@Override
	public List<FlightBookingDto> getFlightDetails(String sourceCity,String destinationCity) {
		
		return flightSearchRepo.getFlightDetails(sourceCity,destinationCity);
	}
*/
}
