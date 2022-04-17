package com.minwailin.fleetapp.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minwailin.fleetapp.models.Vehicle;
import com.minwailin.fleetapp.models.Vehicle;
import com.minwailin.fleetapp.repositories.VehicleRepository;

@Service
public class VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository ;
	
	public List<Vehicle> getVehicles(){
		return vehicleRepository.findAll();
	}

	//Get Vehicle By Id
	public Optional<Vehicle> findById(int id) {
		return vehicleRepository.findById(id);
	}	

	//Save New Vehicle
	public void SaveVehicle(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
	}

	//delete  by id
	  public void delete(Integer id) { 
		  vehicleRepository.deleteById(id);
	  }
}
