package com.minwailin.fleetapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.minwailin.fleetapp.models.Client;
import com.minwailin.fleetapp.models.Invoice;
import com.minwailin.fleetapp.models.InvoiceStatus;
import com.minwailin.fleetapp.services.ClientService;
import com.minwailin.fleetapp.services.InvoiceService;
import com.minwailin.fleetapp.services.InvoiceStatusService;

@Controller
public class InvoiceController {
	
	
	@Autowired
	private InvoiceService inoviceService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private InvoiceStatusService invoiceStatusService;
	
	@GetMapping("/invoices")
	public String getInvoices(Model model) {
		List<Invoice> inoviceList = inoviceService.getInvoices();
		model.addAttribute("invoices", inoviceList);
		
		List<Client> clientList = clientService.getClients();
		model.addAttribute("clients", clientList);
		
		List<InvoiceStatus> invoiceStatusList = invoiceStatusService.getInvoiceStatuss();
		model.addAttribute("invoicestatus", invoiceStatusList);
		
		return "Invoice";
	}

	@PostMapping("/invoices/addNew")
	public String addNew(Invoice inovice) {
		inoviceService.SaveInvoice(inovice);
		return "redirect:/invoices";
	}

	@RequestMapping("/invoices/findById")
	@ResponseBody
	public Optional<Invoice> findById(int id) {
		return inoviceService.findById(id);
	}

	@RequestMapping(value = "/invoices/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(Invoice inovice) {
		inoviceService.SaveInvoice(inovice);
		return "redirect:/invoices";
	}

	
    @RequestMapping(value="/invoices/delete", method = {RequestMethod.DELETE,RequestMethod.GET}) 
    public String delete(Integer id) {
    	inoviceService.delete(id); 
    	return "redirect:/invoices"; 
    }
	
}
