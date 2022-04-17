$('document').ready(function(){
	
	$('table #editButton').on('click',function(e){
		e.preventDefault();
		var href = $(this).attr('href');
		$.get(href ,function(employeeType,status){
			$('#idEdit').val(employeeType.id);
			$('#editdescription').val(employeeType.description);
			$('#editdetails').val(employeeType.details);
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
		$.get(href, function(employeeType, status){
			$('#Detailid').val(employeeType.id);
			$('#detaildescription').val(employeeType.description);
			$('#detaildetails').val(employeeType.details);
			//$('#lastModifiedByDetails').val(employeeType.lastModifiedBy);
			//$('#lastModifiedDateDetails').val(employeeType.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailsModal').modal("show");		
	});
});

