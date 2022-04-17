package com.minwailin.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minwailin.fleetapp.models.JobTitle;
import com.minwailin.fleetapp.repositories.JobTitleRepository;

@Service
public class JobTitleService {
	@Autowired
	private JobTitleRepository jobTitleRepository ;
	
	// get list
	public List<JobTitle> getJobTitles(){
		return jobTitleRepository.findAll();
	}

	//Get JobTitle By Id
	public Optional<JobTitle> findById(int id) {
		return jobTitleRepository.findById(id);
	}	

	//Save New JobTitle
	public void SaveJobTitle(JobTitle jobTitle) {
		jobTitleRepository.save(jobTitle);
	}

	//delete  by id
	  public void delete(Integer id) { 
		  jobTitleRepository.deleteById(id);
	  }
}
