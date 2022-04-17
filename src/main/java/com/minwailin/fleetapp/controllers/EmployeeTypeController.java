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

import com.minwailin.fleetapp.models.EmployeeType;
import com.minwailin.fleetapp.services.EmployeeTypeService;

@Controller
public class EmployeeTypeController {
	@Autowired
	private EmployeeTypeService employeeTypeService;

	
	@GetMapping("/employeetypes")
	public String getCountries(Model model) {
		List<EmployeeType> employeeTypeList = employeeTypeService.getEmployeeTypes();
		model.addAttribute("employeetypes", employeeTypeList);
		
		
		return "employeeType";
	}

	@PostMapping("/employeetypes/addNew")
	public String addNew(EmployeeType employeeType) {
		employeeTypeService.SaveEmployeeType(employeeType);
		return "redirect:/employeetypes";
	}

	@RequestMapping("/employeetypes/findById")
	@ResponseBody
	public Optional<EmployeeType> findById(int id) {
		return employeeTypeService.findById(id);
	}

	@RequestMapping(value = "/employeetypes/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(EmployeeType employeeType) {
		employeeTypeService.SaveEmployeeType(employeeType);
		return "redirect:/employeetypes";
	}

	
    @RequestMapping(value="/employeetypes/delete", method = {RequestMethod.DELETE,RequestMethod.GET}) 
    public String delete(Integer id) {
    	employeeTypeService.delete(id); 
    	return "redirect:/employeetypes"; 
    }

}
