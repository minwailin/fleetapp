package com.minwailin.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minwailin.fleetapp.models.VehicleType;
import com.minwailin.fleetapp.repositories.VehicleTypeRepository;

@Service
public class VehicleTypeService {
	@Autowired
	private VehicleTypeRepository vehicleTypeRepository ;
	
	// get list
	public List<VehicleType> getVehicleTypes(){
		return vehicleTypeRepository.findAll();
	}

	//Get VehicleType By Id
	public Optional<VehicleType> findById(int id) {
		return vehicleTypeRepository.findById(id);
	}	

	//Save New VehicleType
	public void SaveVehicleType(VehicleType vehicleType) {
		vehicleTypeRepository.save(vehicleType);
	}

	//delete  by id
	  public void delete(Integer id) { 
		  vehicleTypeRepository.deleteById(id);
	  }
}
