package com.minwailin.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minwailin.fleetapp.models.InvoiceStatus;
import com.minwailin.fleetapp.repositories.InvoiceStatusRepository;

@Service
public class InvoiceStatusService {
	@Autowired
	private InvoiceStatusRepository invoiceStatusRepository ;
	
	// get list
	public List<InvoiceStatus> getInvoiceStatuss(){
		return invoiceStatusRepository.findAll();
	}

	//Get InvoiceStatus By Id
	public Optional<InvoiceStatus> findById(int id) {
		return invoiceStatusRepository.findById(id);
	}	

	//Save New InvoiceStatus
	public void SaveInvoiceStatus(InvoiceStatus invoiceStatus) {
		invoiceStatusRepository.save(invoiceStatus);
	}

	//delete  by id
	  public void delete(Integer id) { 
		  invoiceStatusRepository.deleteById(id);
	  }
}
