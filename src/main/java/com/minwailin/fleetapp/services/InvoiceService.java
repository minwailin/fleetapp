package com.minwailin.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minwailin.fleetapp.models.Invoice;
import com.minwailin.fleetapp.repositories.InvoiceRepository;

@Service
public class InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository ;
	
	// get list
	public List<Invoice> getInvoices(){
		return invoiceRepository.findAll();
	}

	//Get Invoice By Id
	public Optional<Invoice> findById(int id) {
		return invoiceRepository.findById(id);
	}	

	//Save New Invoice
	public void SaveInvoice(Invoice invoice) {
		invoiceRepository.save(invoice);
	}

	//delete  by id
	  public void delete(Integer id) { 
		  invoiceRepository.deleteById(id);
	  }
	
}
