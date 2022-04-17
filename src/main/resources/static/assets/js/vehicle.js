$('document').ready(function() {	
	$('.table #editButton').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(vehicle, status){
			var acDate = vehicle.acquisitionDate.substr(0,10);
			$('#editacquisitionDate').val(acDate);
			
			$('#editdescription').val(vehicle.description);
			$('#ddlEmployeeEdit').val(vehicle.employeeid);
			$('#editfuelCapacity').val(vehicle.fuelCapacity);
			$('#editid').val(vehicle.id);
			$('#ddlCurrentLocationEdit').val(vehicle.locationid);
			$('#editname').val(vehicle.name);
			$('#editnetWeight').val(vehicle.netWeight);
			$('#editpower').val(vehicle.power);
			
			var regDate = vehicle.registrationDate.substr(0,10);
			$('#editregistrationDate').val(regDate);
			
			$('#editprices').val(vehicle.prices);
			$('#ddlVehicleMakeEdit').val(vehicle.vehiclemakeid);		
			$('#ddlVehicleModelEdit').val(vehicle.vehiclemodelid);			
			$('#editvehicleNumber').val(vehicle.vehicleNumber);			
			$('#ddlCurrentStatusEdit').val(vehicle.vehiclestatusid);			
			$('#ddlVehicleTypeEdit').val(vehicle.vehicletypeid);	
		});			
		$('#editModal').modal("show");		
	});
	
	$('table #deleteButton').on('click',function(e){
		e.preventDefault();
		var href = $(this).attr('href');
		$('#ConfirmDeleteButton').attr('href',href);
		$('#deleteModal').modal("show");
		
		});
		
	 $('table #detailButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href ,function(vehicle,status){
			var acDate = vehicle.acquisitionDate.substr(0,10);
			$('#detailacquisitionDate').val(acDate);
			
			$('#detaildescription').val(vehicle.description);
			$('#ddlEmployeeDetail').val(vehicle.employeeid);
			$('#detailfuelCapacity').val(vehicle.fuelCapacity);
			$('#detailid').val(vehicle.id);
			$('#ddlCurrentLocationDetail').val(vehicle.locationid);
			$('#detailname').val(vehicle.name);
			$('#detailnetWeight').val(vehicle.netWeight);
			$('#detailpower').val(vehicle.power);
			
			var regDate = vehicle.registrationDate.substr(0,10);
			$('#detailregistrationDate').val(regDate);
			
			$('#detailprices').val(vehicle.prices);
			$('#ddlVehicleMakeDetail').val(vehicle.vehiclemakeid);		
			$('#ddlVehicleModelDetail').val(vehicle.vehiclemodelid);			
			$('#detailvehicleNumber').val(vehicle.vehicleNumber);			
			$('#ddlCurrentStatusDetail').val(vehicle.vehiclestatusid);			
			$('#ddlVehicleTypeDetail').val(vehicle.vehicletypeid);	
		});		
		$('#detailsModal').modal("show");		
	});
});

