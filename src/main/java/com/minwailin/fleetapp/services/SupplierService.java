package com.minwailin.fleetapp.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minwailin.fleetapp.models.Supplier;
import com.minwailin.fleetapp.repositories.SupplierRepository;

@Service
public class SupplierService {

	
	@Autowired
	private SupplierRepository supplierRepository ;
	
	// get list
	public List<Supplier> getSuppliers(){
		return supplierRepository.findAll();
	}

	//Get Supplier By Id
	public Optional<Supplier> findById(int id) {
		return supplierRepository.findById(id);
	}	

	//Save New Supplier
	public void SaveSupplier(Supplier supplier) {
		supplierRepository.save(supplier);
	}

	//delete  by id
	  public void delete(Integer id) { 
		  supplierRepository.deleteById(id);
	  }
}
