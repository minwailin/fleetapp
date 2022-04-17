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

import com.minwailin.fleetapp.models.VehicleStatus;
import com.minwailin.fleetapp.services.VehicleStatusService;

@Controller
public class VehicleStatusController {
	@Autowired
	private VehicleStatusService vehicleStatusService;

	
	@GetMapping("/vehiclestatus")
	public String getCountries(Model model) {
		List<VehicleStatus> vehicleStatusList = vehicleStatusService.getVehicleStatuss();
		model.addAttribute("vehiclestatus", vehicleStatusList);
		
		
		return "vehicleStatus";
	}

	@PostMapping("/vehiclestatus/addNew")
	public String addNew(VehicleStatus vehicleStatus) {
		vehicleStatusService.SaveVehicleStatus(vehicleStatus);
		return "redirect:/vehiclestatus";
	}

	@RequestMapping("/vehiclestatus/findById")
	@ResponseBody
	public Optional<VehicleStatus> findById(int id) {
		return vehicleStatusService.findById(id);
	}

	@RequestMapping(value = "/vehiclestatus/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(VehicleStatus vehicleStatus) {
		vehicleStatusService.SaveVehicleStatus(vehicleStatus);
		return "redirect:/vehiclestatus";
	}

	
    @RequestMapping(value="/vehiclestatus/delete", method = {RequestMethod.DELETE,RequestMethod.GET}) 
    public String delete(Integer id) {
    	vehicleStatusService.delete(id); 
    	return "redirect:/vehiclestatus"; 
    }

}
