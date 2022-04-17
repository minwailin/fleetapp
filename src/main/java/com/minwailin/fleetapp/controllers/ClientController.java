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

import com.minwailin.fleetapp.models.Country;
import com.minwailin.fleetapp.models.State;
import com.minwailin.fleetapp.models.Client;
import com.minwailin.fleetapp.services.CountryService;
import com.minwailin.fleetapp.services.StateService;
import com.minwailin.fleetapp.services.ClientService;

@Controller
public class ClientController {

	@Autowired
	private ClientService clientService;
	@Autowired
	private CountryService countryService;
	@Autowired
	private StateService stateService;
	
	@GetMapping("/clients")
	public String getCountries(Model model) {
		List<Client> clientList = clientService.getClients();
		model.addAttribute("clients", clientList);
		
		List<Country> countryList = countryService.getCountries();
		model.addAttribute("countries", countryList);
		
		model.addAttribute("states", stateService.getStates());
		
		return "Client";
	}

	@PostMapping("/clients/addNew")
	public String addNew(Client client) {
		clientService.SaveClient(client);
		return "redirect:/clients";
	}

	@RequestMapping("/clients/findById")
	@ResponseBody
	public Optional<Client> findById(int id) {
		return clientService.findById(id);
	}

	@RequestMapping(value = "/clients/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(Client client) {
		clientService.SaveClient(client);
		return "redirect:/clients";
	}

	
    @RequestMapping(value="/clients/delete", method = {RequestMethod.DELETE,RequestMethod.GET}) 
    public String delete(Integer id) {
    	clientService.delete(id); 
    	return "redirect:/clients"; 
    }
	
}
