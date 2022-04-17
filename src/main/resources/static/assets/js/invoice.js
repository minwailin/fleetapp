$('document').ready(function(){
	
	$('table #editButton').on('click',function(e){
		e.preventDefault();
		var href = $(this).attr('href');
		$.get(href ,function(invoice,status){
			$('#idEdit').val(invoice.id);
			$('#ddlClientList1').val(invoice.clientid);
			
			var invoiceDate = invoice.invoiceDate.substr(0,10);
			$('#editdate').val(invoiceDate);
			
			$('#ddlInvoiceStatusList1').val(invoice.invoicestatusid);
			$('#editremark').val(invoice.remarks);
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
		var href = $(this).attr('href');
		$.get(href ,function(invoice,status){
			$('#idDetail').val(invoice.id);
			$('#ddlClientList2').val(invoice.clientid);
			
/*			var tt = invoice.invoiceDate ;
			tt.setMinutes( tt.getMinutes() + 480 );
			console.log(tt);*/
			
			var invoiceDate = invoice.invoiceDate.substr(0,10);
			$('#detaildate').val(invoiceDate);
			
			$('#ddlInvoiceStatusList2').val(invoice.invoicestatusid);
			$('#detailremark').val(invoice.remarks);
			//$('#lastModifiedByDetails').val(invoice.lastModifiedBy);
			//$('#lastModifiedDateDetails').val(invoice.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailsModal').modal("show");		
	});
});

