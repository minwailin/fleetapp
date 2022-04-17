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

import com.minwailin.fleetapp.models.Employee;
import com.minwailin.fleetapp.models.JobTitle;
import com.minwailin.fleetapp.models.Country;
import com.minwailin.fleetapp.services.EmployeeService;
import com.minwailin.fleetapp.services.EmployeeTypeService;
import com.minwailin.fleetapp.services.JobTitleService;
import com.minwailin.fleetapp.services.CountryService;
import com.minwailin.fleetapp.services.StateService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private JobTitleService jobTitleService;
	@Autowired
	private EmployeeTypeService employeeTypeService;
	@Autowired
	private CountryService countryService;
	@Autowired
	private StateService stateService;

	
	@GetMapping("/employees")
	public String getCountries(Model model) {
		List<Employee> employeeList = employeeService.getEmployees();
		model.addAttribute("employees", employeeList);
		
		model.addAttribute("jobtitles", jobTitleService.getJobTitles());
		model.addAttribute("employeetypes", employeeTypeService.getEmployeeTypes());
		model.addAttribute("countries", countryService.getCountries());
		model.addAttribute("states", stateService.getStates());
		
		return "Employee";
	}

	@PostMapping("/employees/addNew")
	public String addNew(Employee employee) {
		employeeService.SaveEmployee(employee);
		return "redirect:/employees";
	}

	@RequestMapping("/employees/findById")
	@ResponseBody
	public Optional<Employee> findById(int id) {
		return employeeService.findById(id);
	}

	@RequestMapping(value = "/employees/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(Employee employee) {
		employeeService.SaveEmployee(employee);
		return "redirect:/employees";
	}

	
    @RequestMapping(value="/employees/delete", method = {RequestMethod.DELETE,RequestMethod.GET}) 
    public String delete(Integer id) {
    	employeeService.delete(id); 
    	return "redirect:/employees"; 
    }
	

}
