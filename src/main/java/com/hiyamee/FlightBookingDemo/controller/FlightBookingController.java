package com.hiyamee.FlightBookingDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hiyamee.FlightBookingDemo.entity.FlightBookingDto;
import com.hiyamee.FlightBookingDemo.entity.FlightBookingEntity;
import com.hiyamee.FlightBookingDemo.entity.FlightOutput;
import com.hiyamee.FlightBookingDemo.repo.FlightBookingRepository;
import com.hiyamee.FlightBookingDemo.repo.FlightSearchRepo;
import com.hiyamee.FlightBookingDemo.service.FlightBookingService;

@RequestMapping("/flight")
@RestController
public class FlightBookingController {

	@Autowired
	private FlightBookingService flightBookingService ;
	
	@Autowired 
	private FlightSearchRepo flightSearchRepo;
	
	@Autowired
	
	private FlightBookingRepository flightBookingRepository;
	
	
	@PostMapping("/save")
	public FlightBookingEntity saveFlight(@RequestBody FlightBookingEntity flightBookingEntity )
	{
	
		
	
		return flightBookingService.save(flightBookingEntity);
	}
	
	
	
	@GetMapping("/search/{sourceCity}/{destinationCity}")
	public List<FlightBookingEntity> getFlightDetails(@PathVariable String sourceCity,@PathVariable String destinationCity )
	{	
		 
		System.out.println("sourceCity :" +sourceCity);
		System.out.println("sourceCity :" +destinationCity);
		//List <FlightBookingDto> searchList=flightBookingService.getFlightDetails(sourceCity,destinationCity);
		
		List <FlightBookingEntity> searchList =flightSearchRepo.getFlightDetails(sourceCity, destinationCity);
		System.out.println("serach results" +searchList);
		return searchList;
	}
	
	@GetMapping("/all")
	
	public List<FlightBookingEntity> getAll()
	{
		return flightBookingRepository.findAll();
	}
	
	}

