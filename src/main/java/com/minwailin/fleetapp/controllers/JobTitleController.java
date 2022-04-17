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

import com.minwailin.fleetapp.models.JobTitle;
import com.minwailin.fleetapp.services.JobTitleService;

@Controller
public class JobTitleController {
	@Autowired
	private JobTitleService jobTitleService;

	
	@GetMapping("/jobtitles")
	public String getCountries(Model model) {
		List<JobTitle> jobTitleList = jobTitleService.getJobTitles();
		model.addAttribute("jobtitles", jobTitleList);
		
		
		return "jobTitle";
	}

	@PostMapping("/jobtitles/addNew")
	public String addNew(JobTitle jobTitle) {
		jobTitleService.SaveJobTitle(jobTitle);
		return "redirect:/jobtitles";
	}

	@RequestMapping("/jobtitles/findById")
	@ResponseBody
	public Optional<JobTitle> findById(int id) {
		return jobTitleService.findById(id);
	}

	@RequestMapping(value = "/jobtitles/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(JobTitle jobTitle) {
		jobTitleService.SaveJobTitle(jobTitle);
		return "redirect:/jobtitles";
	}

	
    @RequestMapping(value="/jobtitles/delete", method = {RequestMethod.DELETE,RequestMethod.GET}) 
    public String delete(Integer id) {
    	jobTitleService.delete(id); 
    	return "redirect:/jobtitles"; 
    }
}
