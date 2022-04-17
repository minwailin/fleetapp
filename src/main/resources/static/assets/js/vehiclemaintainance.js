$('document').ready(function(){
	
	$('table #editButton').on('click',function(e){
		e.preventDefault();
		var href = $(this).attr('href');
		$.get(href ,function(vehiclemaintainance,status){
			$('#editid').val(vehiclemaintainance.id);
			
			var startDate = vehiclemaintainance.startDate.substr(0,10);
			$('#editstartDate').val(startDate);
			var endDate = vehiclemaintainance.endDate.substr(0,10);
			$('#editendDate').val(endDate);
			
			$('#ddlSupplierList1').val(vehiclemaintainance.supplierid);
			$('#ddlVehicleList1').val(vehiclemaintainance.vehicleid);
			$('#editprice').val(vehiclemaintainance.price);
			$('#editremarks').val(vehiclemaintainance.remarks);
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
		$.get(href ,function(vehiclemaintainance,status){
			$$('#detailid').val(vehiclemaintainance.id);
			
			var startDate = vehiclemaintainance.startDate.substr(0,10);
			$('#detailstartDate').val(startDate);
			var endDate = vehiclemaintainance.endDate.substr(0,10);
			$('#detailendDate').val(endDate);
			
			
			$('#ddlSupplierList1').val(vehiclemaintainance.supplierid);
			$('#ddlVehicleList1').val(vehiclemaintainance.vehicleid);
			$('#detailprice').val(vehiclemaintainance.price);
			$('#detailremarks').val(vehiclemaintainance.remarks);
		});		
		$('#detailsModal').modal("show");		
	});
});

