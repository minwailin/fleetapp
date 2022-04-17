$('document').ready(function(){
	
	$('table #editButton').on('click',function(e){
		e.preventDefault();
		var href = $(this).attr('href');
		$.get(href ,function(state,status){
			$('#idEdit').val(state.id);
			$('#ddlCountryList1').val(state.countryid);
			$('#editCapital').val(state.capital);
			$('#editCode').val(state.code);
			$('#editName').val(state.name);
			$('#editDetails').val(state.details);
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
		$.get(href, function(state, status){
			$('#idDetail').val(state.id);
			$('#ddlCountryList2').val(state.countryid);			
			$('#nameDetails').val(state.name);
			$('#detailsDetails').val(state.details);
			$('#capitalDetails').val(state.capital);
			$('#codeDetails').val(state.code);
			//$('#lastModifiedByDetails').val(state.lastModifiedBy);
			//$('#lastModifiedDateDetails').val(state.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailsModal').modal("show");		
	});
});

