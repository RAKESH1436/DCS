package com.searchlocation.controller;

import org.springframework.web.client.RestTemplate;

import com.searchlocation.dto.Location;

public class RestController {
	public Location searchLocationById(long id) {
		RestTemplate resTemplate = new RestTemplate();
		Location location = resTemplate.getForObject("http://localhost:8080/locationweb17/location/"+id, Location.class);
		return location;
		
		
	}

}
