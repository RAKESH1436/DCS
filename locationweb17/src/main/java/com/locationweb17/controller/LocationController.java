package com.locationweb17.controller;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationweb17.dto.LocationUpdate;
import com.locationweb17.entity.Location;
import com.locationweb17.service.LocationService;
import com.locationweb17.util.EmailService;

@Controller
public class LocationController {
	
	@Autowired
	private LocationService locatiosService;
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping("/saveLocation")
	public String showLocationPage() {
		return"saveLocation";
	}
	@RequestMapping("/saveLocationInfo")
	public String saveLocationPage(@ModelAttribute("Location")Location location, ModelMap modelMap ) {
		locatiosService.saveLocation(location);
		emailService.sendSimpleMessage("anapurnadevi277@gmail.com", "Location Saved", "Location is saved");
		modelMap.addAttribute("msg","record is save!!");
		return "saveLocation";
		
	}
	@RequestMapping("/getLocations")
	public String getAllLocation(ModelMap modelMap) {
		List<Location> locations = locatiosService.getAllLocations();
		modelMap.addAttribute("locations",locations);
		return"searchLocations";
		
	}
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id")long id, ModelMap modelMap) {
		locatiosService.deleteLocationById(id);
		List<Location> locations = locatiosService.getAllLocations();
		modelMap.addAttribute("locations",locations);
		return"searchLocations";
		
	}
	@RequestMapping("/updateLocation")
	public String updateLocation(@RequestParam("id")long id,ModelMap modelMap ) {
		Location location = locatiosService.findLocationById(id);
		modelMap.addAttribute("location",location);
		return"updateLocation";
		
		
	}
	@RequestMapping("/updateLocationData")
	public String updateLocationData(LocationUpdate update,ModelMap modelMap) {
		Location location=new Location();
		location.setId(update.getId());
		location.setCode(update.getCode());
		location.setName(update.getName());
		location.setType(update.getType());
		locatiosService.saveLocation(location);
		List<Location> locations = locatiosService.getAllLocations();
		modelMap.addAttribute("locations",locations);
		return"searchLocations";
		
	}
	
}
		
		
	
//	@RequestMapping("/saveLocationInfo")
//	//public String saveLocationPage(@RequestParam("id")long id,@RequestParam("code")String code,@RequestParam("name")String name,@RequestParam("type")String type) {
//	public String saveLocationPage(SaveLocationData locationData) {
//		Location  location = new Location();
//		location.setId(locationData.getId());
//		location.setCode(locationData.getCode());
//		location.setName(locationData.getName());
//		location.setType(locationData.getType());
//		locatioserService.saveLocation(location);
		
		
//	second option//	Location location =new Location();
//		location.setId(id);
//		location.setCode(code);
//		location.setName(name);
//		location.setType(type);
		//locatioserService.saveLocation(location);
		//return"saveLocation";




