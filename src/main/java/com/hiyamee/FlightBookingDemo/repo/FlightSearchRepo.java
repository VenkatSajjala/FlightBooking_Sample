package com.hiyamee.FlightBookingDemo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hiyamee.FlightBookingDemo.entity.FlightBookingDto;
import com.hiyamee.FlightBookingDemo.entity.FlightBookingEntity;
import com.hiyamee.FlightBookingDemo.entity.FlightOutput;

@Repository
public interface FlightSearchRepo extends CrudRepository<FlightBookingEntity, Integer> {
	
//@Query(value="select f.flightNumber,f.airlineName,f.departureAndarrivalTime,f.numberOfstops from FlightBookingEntity f where sourceCity=:sourceCity and destinationCity= :destinationCity",nativeQuery=true)

@Query(value="select * from flight_booking_entity f where f.source_city=:sourceCity and f.destination_city= :destinationCity",nativeQuery=true)
List<FlightBookingEntity> getFlightDetails(@Param("sourceCity") String sourceCity, @Param("destinationCity") String destinationCity);


}
