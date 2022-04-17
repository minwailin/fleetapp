$('document').ready(function(){
	
	$('table #editButton').on('click',function(e){
		e.preventDefault();
		var href = $(this).attr('href');
		$.get(href ,function(jobTitile,status){
			$('#idEdit').val(jobTitile.id);
			$('#editdescription').val(jobTitile.description);
			$('#editdetails').val(jobTitile.details);
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
		$.get(href, function(jobTitile, status){
			$('#Detailid').val(jobTitile.id);
			$('#detaildescription').val(jobTitile.description);
			$('#detaildetails').val(jobTitile.details);
			//$('#lastModifiedByDetails').val(jobTitile.lastModifiedBy);
			//$('#lastModifiedDateDetails').val(jobTitile.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailsModal').modal("show");		
	});
});

