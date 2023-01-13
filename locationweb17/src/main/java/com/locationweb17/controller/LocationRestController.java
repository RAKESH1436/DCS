package com.locationweb17.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locationweb17.entity.Location;
import com.locationweb17.repository.LocationRepository;

@RestController
public class LocationRestController {
	
	@Autowired
	public LocationRepository locationRepo;
	
	@RequestMapping("/location/{id}")
	public Location getLocation(@PathVariable long id) {
		Optional<Location> findById = locationRepo.findById(id);
		Location location = findById.get();
		return location;
	}
		
	

}
