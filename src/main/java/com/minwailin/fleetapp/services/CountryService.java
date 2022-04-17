package com.minwailin.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minwailin.fleetapp.models.Country;
import com.minwailin.fleetapp.repositories.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository ;
	
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}

	//Get Country By Id
	public Optional<Country> findById(int id) {
		return countryRepository.findById(id);
	}	

	//Save New Country
	public void SaveCountry(Country country) {
		countryRepository.save(country);
	}

	//delete  by id
	  public void delete(Integer id) { 
		  countryRepository.deleteById(id);
	  }
	 
	
	
	

	
}