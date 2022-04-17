$('document').ready(function(){
	
	$('table #editButton').on('click',function(e){
		e.preventDefault();
		var href = $(this).attr('href');
		$.get(href ,function(location,status){
			$('#idEdit').val(location.id);
			$('#ddlCountryList1').val(location.countryid);
			$('#ddlStateList1').val(location.stateid);
			$('#editaddress').val(location.address);
			$('#editcity').val(location.city);
			$('#editdescription').val(location.description);
			$('#editdetails').val(location.details);
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
		$.get(href, function(location, status){
			$('#Detailid').val(location.id);
			$('#ddlCountryList2').val(location.countryid);
			$('#ddlStateList2').val(location.stateid);
			$('#detailaddress').val(location.address);
			$('#detailcity').val(location.city);
			$('#detaildescription').val(location.description);
			$('#detaildetails').val(location.details);
			//$('#lastModifiedByDetails').val(location.lastModifiedBy);
			//$('#lastModifiedDateDetails').val(location.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailsModal').modal("show");		
	});
});

