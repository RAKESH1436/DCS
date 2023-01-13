package com.locationweb17.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.locationweb17.entity.Location;
import com.locationweb17.repository.LocationRepository;
@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	private LocationRepository locationRepo;
	

	@Override
	public void saveLocation(Location location) {   
		locationRepo.save(location);
		
		

	}


	@Override
	public List<Location> getAllLocations() {
		List<Location> locations = locationRepo.findAll();
		return locations;
	}


	@Override
	public void deleteLocationById(long id) {
		locationRepo.deleteById(id);
		
		
	}


	@Override
	public Location findLocationById(long id) {
		Optional<Location> findData = locationRepo.findById(id);
		Location location = findData.get();
		return location;
	}

}
