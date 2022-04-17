package com.minwailin.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minwailin.fleetapp.models.VehicleStatus;
import com.minwailin.fleetapp.repositories.VehicleStatusRepository;

@Service
public class VehicleStatusService {
	@Autowired
	private VehicleStatusRepository vehicleStatusRepository ;
	
	// get list
	public List<VehicleStatus> getVehicleStatuss(){
		return vehicleStatusRepository.findAll();
	}

	//Get VehicleStatus By Id
	public Optional<VehicleStatus> findById(int id) {
		return vehicleStatusRepository.findById(id);
	}	

	//Save New VehicleStatus
	public void SaveVehicleStatus(VehicleStatus vehicleStatus) {
		vehicleStatusRepository.save(vehicleStatus);
	}

	//delete  by id
	  public void delete(Integer id) { 
		  vehicleStatusRepository.deleteById(id);
	  }
}
