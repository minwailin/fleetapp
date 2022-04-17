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

import com.minwailin.fleetapp.models.VehicleModel;
import com.minwailin.fleetapp.services.VehicleModelService;

@Controller
public class VehicleModelController {
	@Autowired
	private VehicleModelService vehicleModelService;

	
	@GetMapping("/vehiclemodels")
	public String getCountries(Model model) {
		List<VehicleModel> vehicleModelList = vehicleModelService.getVehicleModels();
		model.addAttribute("vehiclemodels", vehicleModelList);
		
		
		return "vehicleModel";
	}

	@PostMapping("/vehiclemodels/addNew")
	public String addNew(VehicleModel vehicleModel) {
		vehicleModelService.SaveVehicleModel(vehicleModel);
		return "redirect:/vehiclemodels";
	}

	@RequestMapping("/vehiclemodels/findById")
	@ResponseBody
	public Optional<VehicleModel> findById(int id) {
		return vehicleModelService.findById(id);
	}

	@RequestMapping(value = "/vehiclemodels/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(VehicleModel vehicleModel) {
		vehicleModelService.SaveVehicleModel(vehicleModel);
		return "redirect:/vehiclemodels";
	}

	
    @RequestMapping(value="/vehiclemodels/delete", method = {RequestMethod.DELETE,RequestMethod.GET}) 
    public String delete(Integer id) {
    	vehicleModelService.delete(id); 
    	return "redirect:/vehiclemodels"; 
    }

}
