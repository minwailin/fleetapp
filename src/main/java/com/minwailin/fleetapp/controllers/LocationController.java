package com.minwailin.fleetapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.minwailin.fleetapp.models.Country;
import com.minwailin.fleetapp.models.Location;
import com.minwailin.fleetapp.models.State;
import com.minwailin.fleetapp.services.CountryService;
import com.minwailin.fleetapp.services.LocationService;
import com.minwailin.fleetapp.services.StateService;

@Controller
public class LocationController {
	@Autowired
	private LocationService locationService;
	@Autowired
	private CountryService countryService;
	@Autowired
	private StateService stateService;
	
	@GetMapping("/locations")
	public String getCountries(Model model) {
		List<Location> locationList = locationService.getLocations();
		model.addAttribute("locations", locationList);
		
		List<Country> countryList = countryService.getCountries();
		model.addAttribute("countries", countryList);
		
		List<State> stateList = stateService.getStates();
		model.addAttribute("states", stateList);
		
		return "location";
	}

	@PostMapping("/locations/addNew")
	public String addNew(Location location) {
		locationService.SaveLocation(location);
		return "redirect:/locations";
	}

	@RequestMapping("/locations/findById")
	@ResponseBody
	public Optional<Location> findById(int id) {
		return locationService.findById(id);
	}

	@RequestMapping(value = "/locations/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(Location location) {
		locationService.SaveLocation(location);
		return "redirect:/locations";
	}

	
    @RequestMapping(value="/locations/delete", method = {RequestMethod.DELETE,RequestMethod.GET}) 
    public String delete(Integer id) {
    	locationService.delete(id); 
    	return "redirect:/locations"; 
    }
}
