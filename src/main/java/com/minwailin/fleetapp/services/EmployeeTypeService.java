package com.minwailin.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minwailin.fleetapp.models.EmployeeType;
import com.minwailin.fleetapp.repositories.EmployeeTypeRepository;

@Service
public class EmployeeTypeService {
	@Autowired
	private EmployeeTypeRepository employeeTypeRepository ;
	
	// get list
	public List<EmployeeType> getEmployeeTypes(){
		return employeeTypeRepository.findAll();
	}

	//Get EmployeeType By Id
	public Optional<EmployeeType> findById(int id) {
		return employeeTypeRepository.findById(id);
	}	

	//Save New EmployeeType
	public void SaveEmployeeType(EmployeeType employeeType) {
		employeeTypeRepository.save(employeeType);
	}

	//delete  by id
	  public void delete(Integer id) { 
		  employeeTypeRepository.deleteById(id);
	  }
}
