package com.minwailin.fleetapp.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minwailin.fleetapp.models.VehicleMake;
import com.minwailin.fleetapp.repositories.VehicleMakeRepository;

@Service
public class VehicleMakeService {
	@Autowired
	private VehicleMakeRepository vehicleMakeRepository ;
	
	// get list
	public List<VehicleMake> getVehicleMakes(){
		return vehicleMakeRepository.findAll();
	}

	//Get VehicleMake By Id
	public Optional<VehicleMake> findById(int id) {
		return vehicleMakeRepository.findById(id);
	}	

	//Save New VehicleMake
	public void SaveVehicleMake(VehicleMake vehicleMake) {
		vehicleMakeRepository.save(vehicleMake);
	}

	//delete  by id
	  public void delete(Integer id) { 
		  vehicleMakeRepository.deleteById(id);
	  }
}
