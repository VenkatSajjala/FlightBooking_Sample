package com.hiyamee.FlightBookingDemo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.hiyamee.FlightBookingDemo.entity.FlightBookingEntity;

@Repository
public interface FlightBookingRepository extends JpaRepository<FlightBookingEntity, Long>{
	
	//@Query("select flightNumber from FlightBookingEntity where sourceCity=\"Hyderabad\" and destinationCity =\"chennai\"")
	
	@Query(value ="select f.flightNumber, f.airlineName,f.numberOfstops from FlightBookingEntity f where f.sourceCity='Hyderabad' and destinationCity='chennai'")
	
	//@Query(value ="select f.airline_name,f.flight_number from flight_info_db.flight_booking_entity f where f.source_city='Hyderabad' and f.destination_city ='chennai'" ,nativeQuery=true)
	List<FlightBookingEntity> getFlightDetails( FlightBookingEntity flightBookingEntity);
	

}
