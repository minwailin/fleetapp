package com.minwailin.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minwailin.fleetapp.models.Client;
import com.minwailin.fleetapp.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository ;
	
	// get list
	public List<Client> getClients(){
		return clientRepository.findAll();
	}

	//Get Client By Id
	public Optional<Client> findById(int id) {
		return clientRepository.findById(id);
	}	

	//Save New Client
	public void SaveClient(Client client) {
		clientRepository.save(client);
	}

	//delete  by id
	  public void delete(Integer id) { 
		  clientRepository.deleteById(id);
	  }
	 
	
}
