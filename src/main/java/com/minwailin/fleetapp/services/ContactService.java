package com.minwailin.fleetapp.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.minwailin.fleetapp.models.Contact;
import com.minwailin.fleetapp.repositories.ContactRepository;

@Service
public class ContactService {


	@Autowired
	private ContactRepository contactRepository ;
	
	public List<Contact> getContacts(){
		return contactRepository.findAll();
	}

	//Get Contact By Id
	public Optional<Contact> findById(int id) {
		return contactRepository.findById(id);
	}	

	//Save New Contact
	public void SaveContact(Contact contact) {
		contactRepository.save(contact);
	}

	//delete  by id
	  public void delete(Integer id) { 
		  contactRepository.deleteById(id);
	  }
	 
	
}
