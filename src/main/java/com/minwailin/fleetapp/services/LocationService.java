package com.minwailin.fleetapp.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minwailin.fleetapp.models.Location;
import com.minwailin.fleetapp.repositories.LocationRepository;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository locationRepository ;
	
	// get list
	public List<Location> getLocations(){
		return locationRepository.findAll();
	}

	//Get Location By Id
	public Optional<Location> findById(int id) {
		return locationRepository.findById(id);
	}	

	//Save New Location
	public void SaveLocation(Location location) {
		locationRepository.save(location);
	}

	//delete  by id
	  public void delete(Integer id) { 
		  locationRepository.deleteById(id);
	  }
	 
	
}
