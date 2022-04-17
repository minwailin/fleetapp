$('document').ready(function(){
	
	$('table #editButton').on('click',function(e){
		e.preventDefault();
		var href = $(this).attr('href');
		$.get(href ,function(vehicleModel,status){
			$('#idEdit').val(vehicleModel.id);
			$('#editdescription').val(vehicleModel.description);
			$('#editdetails').val(vehicleModel.details);
		});
		
		$('#editModal').modal("show");
		console.log("this is good");
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
		$.get(href, function(vehicleModel, status){
			$('#Detailid').val(vehicleModel.id);
			$('#detaildescription').val(vehicleModel.description);
			$('#detaildetails').val(vehicleModel.details);
			//$('#lastModifiedByDetails').val(vehicleModel.lastModifiedBy);
			//$('#lastModifiedDateDetails').val(vehicleModel.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailsModal').modal("show");		
	});
});

