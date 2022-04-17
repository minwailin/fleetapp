$('document').ready(function(){
	
	$('table #editButton').on('click',function(e){
		e.preventDefault();
		var href = $(this).attr('href');
		$.get(href ,function(vehicleStatus,status){
			$('#idEdit').val(vehicleStatus.id);
			$('#editdescription').val(vehicleStatus.description);
			$('#editdetails').val(vehicleStatus.details);
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
		$.get(href, function(vehicleStatus, status){
			$('#Detailid').val(vehicleStatus.id);
			$('#detaildescription').val(vehicleStatus.description);
			$('#detaildetails').val(vehicleStatus.details);
			//$('#lastModifiedByDetails').val(vehicleStatus.lastModifiedBy);
			//$('#lastModifiedDateDetails').val(vehicleStatus.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailsModal').modal("show");		
	});
});

