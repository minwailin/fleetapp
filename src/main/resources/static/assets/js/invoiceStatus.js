$('document').ready(function(){
	
	$('table #editButton').on('click',function(e){
		e.preventDefault();
		var href = $(this).attr('href');
		$.get(href ,function(invoiceStatus,status){
			$('#idEdit').val(invoiceStatus.id);
			$('#editdescription').val(invoiceStatus.description);
			$('#editdetails').val(invoiceStatus.details);
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
		$.get(href, function(invoiceStatus, status){
			$('#Detailid').val(invoiceStatus.id);
			$('#detaildescription').val(invoiceStatus.description);
			$('#detaildetails').val(invoiceStatus.details);
			//$('#lastModifiedByDetails').val(invoiceStatus.lastModifiedBy);
			//$('#lastModifiedDateDetails').val(invoiceStatus.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailsModal').modal("show");		
	});
});

