package com.minwailin.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minwailin.fleetapp.models.VehicleModel;
import com.minwailin.fleetapp.repositories.VehicleModelRepository;

@Service
public class VehicleModelService {
	@Autowired
	private VehicleModelRepository vehicleModelRepository ;
	
	// get list
	public List<VehicleModel> getVehicleModels(){
		return vehicleModelRepository.findAll();
	}

	//Get VehicleModel By Id
	public Optional<VehicleModel> findById(int id) {
		return vehicleModelRepository.findById(id);
	}	

	//Save New VehicleModel
	public void SaveVehicleModel(VehicleModel vehicleModel) {
		vehicleModelRepository.save(vehicleModel);
	}

	//delete  by id
	  public void delete(Integer id) { 
		  vehicleModelRepository.deleteById(id);
	  }
}
