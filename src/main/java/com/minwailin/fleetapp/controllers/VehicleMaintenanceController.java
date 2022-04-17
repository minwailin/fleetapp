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

import com.minwailin.fleetapp.models.VehicleMaintenance;
import com.minwailin.fleetapp.services.SupplierService;
import com.minwailin.fleetapp.services.VehicleMaintenanceService;
import com.minwailin.fleetapp.services.VehicleService;

@Controller
public class VehicleMaintenanceController {

	@Autowired
	private VehicleMaintenanceService vehicleMaintenanceService;
	@Autowired
	private VehicleService vehicleService;
	@Autowired
	private SupplierService supplierService;

	@GetMapping("/vehiclemaintainances")
	public String getCountries(Model model) {
		List<VehicleMaintenance> vehicleMaintenanceList = vehicleMaintenanceService.getVehicleMaintenances();
		model.addAttribute("vehiclemaintainances", vehicleMaintenanceList);
		
		model.addAttribute("vehicles", vehicleService.getVehicles());
		
		model.addAttribute("suppliers", supplierService.getSuppliers());
		
		return "VehicleMaintenance"; 
	}

	@PostMapping("/vehiclemaintainances/addNew")
	public String addNew(VehicleMaintenance vehicleMaintenance) {
		vehicleMaintenanceService.SaveVehicleMaintenance(vehicleMaintenance);
		return "redirect:/vehiclemaintainances";
	}

	@RequestMapping("/vehiclemaintainances/findById")
	@ResponseBody
	public Optional<VehicleMaintenance> findById(int id) {
		return vehicleMaintenanceService.findById(id);
	}

	@RequestMapping(value = "/vehiclemaintainances/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(VehicleMaintenance vehicleMaintenance) {
		vehicleMaintenanceService.SaveVehicleMaintenance(vehicleMaintenance);
		return "redirect:/vehiclemaintainances";
	}

	
    @RequestMapping(value="/vehiclemaintainances/delete", method = {RequestMethod.DELETE,RequestMethod.GET}) 
    public String delete(Integer id) {
    	vehicleMaintenanceService.delete(id); 
    	return "redirect:/vehiclemaintainances"; 
    }
	 
}
