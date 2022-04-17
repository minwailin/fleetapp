$('document').ready(function(){
	
	$('table #editButton').on('click',function(e){
		e.preventDefault();
		var href = $(this).attr('href');
		$.get(href ,function(supplier,status){
			$('#editid').val(supplier.id);
			$('#editname').val(supplier.name);
			$('#editphone').val(supplier.phone);
			$('#editmobile').val(supplier.mobile);
			$('#editwebsite').val(supplier.website);
			$('#ddlCountryList1').val(supplier.countryid);
			$('#ddlStateList1').val(supplier.stateid);
			$('#editcity').val(supplier.city);
			$('#editemail').val(supplier.email);
			$('#editaddress').val(supplier.address);
			$('#editdetails').val(supplier.details);
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
		$.get(href ,function(supplier,status){
			$('#detailname').val(supplier.name);
			$('#detailphone').val(supplier.phone);
			$('#detailmobile').val(supplier.mobile);
			$('#detailwebsite').val(supplier.website);
			$('#ddlCountryList2').val(supplier.countryid);
			$('#ddlStateList2').val(supplier.stateid);
			$('#detailcity').val(supplier.city);
			$('#detailemail').val(supplier.email);
			$('#detailaddress').val(supplier.address);
			$('#detaildetails').val(supplier.details);
		});		
		$('#detailsModal').modal("show");		
	});
});

