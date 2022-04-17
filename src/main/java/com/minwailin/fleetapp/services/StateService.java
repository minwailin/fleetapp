package com.minwailin.fleetapp.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minwailin.fleetapp.models.State;
import com.minwailin.fleetapp.repositories.StateRepository;

@Service
public class StateService {
	
	@Autowired
	private StateRepository stateRepository ;
	
	// get list
	public List<State> getStates(){
		return stateRepository.findAll();
	}

	//Get State By Id
	public Optional<State> findById(int id) {
		return stateRepository.findById(id);
	}	

	//Save New State
	public void SaveState(State state) {
		stateRepository.save(state);
	}

	//delete  by id
	  public void delete(Integer id) { 
		  stateRepository.deleteById(id);
	  }
	 

}
