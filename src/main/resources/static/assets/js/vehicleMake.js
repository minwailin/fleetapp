$('document').ready(function(){
	
	$('table #editButton').on('click',function(e){
		e.preventDefault();
		var href = $(this).attr('href');
		$.get(href ,function(vehiclemake,status){
			$('#idEdit').val(vehiclemake.id);
			$('#editdescription').val(vehiclemake.description);
			$('#editdetails').val(vehiclemake.details);
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
		$.get(href, function(vehiclemake, status){
			$('#Detailid').val(vehiclemake.id);
			$('#detaildescription').val(vehiclemake.description);
			$('#detaildetails').val(vehiclemake.details);
			//$('#lastModifiedByDetails').val(vehiclemake.lastModifiedBy);
			//$('#lastModifiedDateDetails').val(vehiclemake.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailsModal').modal("show");		
	});
});

