package com.locationweb17.service;

import java.util.List;

import com.locationweb17.entity.Location;

public interface LocationService {
	public void saveLocation(Location location);
	public List<Location> getAllLocations();
	public void deleteLocationById(long id);
	public Location findLocationById(long id);

}
