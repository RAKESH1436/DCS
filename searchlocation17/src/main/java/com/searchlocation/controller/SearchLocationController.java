package com.searchlocation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.searchlocation.dto.Location;

@Controller
public class SearchLocationController {
	
	@RequestMapping("/searchlocation")
	public String loadSearchLocationPage() {
		return "searchLocation";
		
		
	}
	@RequestMapping("/searchLocation")
	public String searchLocation(@RequestParam("id")long id, ModelMap modelMap) {
		RestController restController=new RestController();
		Location location = restController.searchLocationById(id);
		modelMap.addAttribute("location",location);
		return"searchLocationResult";
		
	}

}
