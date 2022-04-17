$('document').ready(function(){
	
	$('table #editButton').on('click',function(e){
		e.preventDefault();
		var href = $(this).attr('href');
		$.get(href ,function(client,status){
			$('#editid').val(client.id);
			$('#editname').val(client.name);
			$('#editphone').val(client.phone);
			$('#editmobile').val(client.mobile);
			$('#editwebsite').val(client.website);
			$('#ddlCountryList1').val(client.countryid);
			$('#ddlStateList1').val(client.stateid);
			$('#editcity').val(client.city);
			$('#editemail').val(client.email);
			$('#editaddress').val(client.address);
			$('#editdetails').val(client.details);
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
		$.get(href ,function(client,status){
			$('#detailname').val(client.name);
			$('#detailphone').val(client.phone);
			$('#detailmobile').val(client.mobile);
			$('#detailwebsite').val(client.website);
			$('#ddlCountryList2').val(client.countryid);
			$('#ddlStateList2').val(client.stateid);
			$('#detailcity').val(client.city);
			$('#detailemail').val(client.email);
			$('#detailaddress').val(client.address);
			$('#detaildetails').val(client.details);
		});		
		$('#detailsModal').modal("show");		
	});
});

