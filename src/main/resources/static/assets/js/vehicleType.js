$('document').ready(function(){
	
	$('table #editButton').on('click',function(e){
		e.preventDefault();
		var href = $(this).attr('href');
		$.get(href ,function(vehicleType,status){
			$('#idEdit').val(vehicleType.id);
			$('#editdescription').val(vehicleType.description);
			$('#editdetails').val(vehicleType.details);
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
		$.get(href, function(vehicleType, status){
			$('#Detailid').val(vehicleType.id);
			$('#detaildescription').val(vehicleType.description);
			$('#detaildetails').val(vehicleType.details);
			//$('#lastModifiedByDetails').val(vehicleType.lastModifiedBy);
			//$('#lastModifiedDateDetails').val(vehicleType.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailsModal').modal("show");		
	});
});

