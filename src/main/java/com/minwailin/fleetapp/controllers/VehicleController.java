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

import com.minwailin.fleetapp.models.Location;
import com.minwailin.fleetapp.models.Vehicle;
import com.minwailin.fleetapp.services.EmployeeService;
import com.minwailin.fleetapp.services.LocationService;
import com.minwailin.fleetapp.services.VehicleMakeService;
import com.minwailin.fleetapp.services.VehicleModelService;
import com.minwailin.fleetapp.services.VehicleService;
import com.minwailin.fleetapp.services.VehicleStatusService;
import com.minwailin.fleetapp.services.VehicleTypeService;

@Controller
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;
	@Autowired
	private LocationService locationService;
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private VehicleMakeService vehicleMakeService;
	@Autowired
	private VehicleStatusService vehicleStatusService;
	@Autowired
	private VehicleModelService vehicleModelService;
	@Autowired
	private VehicleTypeService vehicleTypeService;

	
	@GetMapping("/vehicles")
	public String getVehicles(Model model) {
		List<Vehicle> vehicleList = vehicleService.getVehicles();
		model.addAttribute("vehicles", vehicleList);
		
		model.addAttribute("locations", locationService.getLocations());
		model.addAttribute("employees", employeeService.getEmployees());
		model.addAttribute("vehiclemakes", vehicleMakeService.getVehicleMakes());
		model.addAttribute("vehiclestatus", vehicleStatusService.getVehicleStatuss());
		model.addAttribute("vehiclemodels", vehicleModelService.getVehicleModels());
		model.addAttribute("vehicletypes", vehicleTypeService.getVehicleTypes());
		
		return "vehicle";
	}

	@PostMapping("/vehicles/addNew")
	public String addNew(Vehicle vehicle) {
		vehicleService.SaveVehicle(vehicle);
		return "redirect:/vehicles";
	}

	@RequestMapping("/vehicles/findById")
	@ResponseBody
	public Optional<Vehicle> findById(int id) {
		return vehicleService.findById(id);
	}

	@RequestMapping(value = "/vehicles/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(Vehicle vehicle) {
		vehicleService.SaveVehicle(vehicle);
		return "redirect:/vehicles";
	}

	
    @RequestMapping(value="/vehicles/delete", method = {RequestMethod.DELETE,RequestMethod.GET}) 
    public String delete(Integer id) {
    	vehicleService.delete(id); 
    	return "redirect:/vehicles"; 
    }

}
