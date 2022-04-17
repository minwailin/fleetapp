package com.minwailin.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minwailin.fleetapp.models.Employee;
import com.minwailin.fleetapp.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository ;
	
	// get list
	public List<Employee> getEmployees(){
		return employeeRepository.findAll();
	}

	//Get Employee By Id
	public Optional<Employee> findById(int id) {
		return employeeRepository.findById(id);
	}	

	//Save New Employee
	public void SaveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	//delete  by id
	  public void delete(Integer id) { 
		  employeeRepository.deleteById(id);
	  }
	
}
