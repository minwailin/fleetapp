$('document').ready(function(){
	
	$('table #editButton').on('click',function(e){
		e.preventDefault();
		var href = $(this).attr('href');
			$.get(href, function(employee, status){
			$('#editid').val(employee.id);
			$('#addressedit').val(employee.address);
			$('#cityedit').val(employee.city);
			$('#ddlCountryListedit').val(employee.countryid);			
			var dob = employee.dateOfBirth.substr(0,10);
			$('#DoBedit').val(dob);
			$('#emailedit').val(employee.email);
			$('#firstnameedit').val(employee.firstname);
			$('#ddlGenderedit').val(employee.gender);
			$('#txtIdEdit').val(employee.id);
			$('#initialsedit').val(employee.initials);
			$('#lastnameedit').val(employee.lastname);
			$('#ddlMaritalStatusEdit').val(employee.maritalStatus);
			$('#mobileedit').val(employee.mobile);	
			$('#phoneedit').val(employee.phone);			
			$('#fupPhotoEdit').val(employee.photo);			
			$('#socialSecurityNumberedit').val(employee.socialSecurityNumber);			
			$('#ddlStateListedit').val(employee.stateid);	
			$('#ddlTitleedit').val(employee.title);			
			$('#ddlEmployeeTypeEdit').val(employee.employeetypeid);				
			var hireDate = employee.hireDate.substr(0,10);
			$('#hireDateedit').val(hireDate);
			$('#ddljobTitleedit').val(employee.jobtitleid);			
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
			$.get(href, function(employee, status){
			$('#detailid').val(employee.id);
			$('#addressdetail').val(employee.address);
			$('#citydetail').val(employee.city);
			$('#ddlCountryListdetail').val(employee.countryid);			
			var dob = employee.dateOfBirth.substr(0,10);
			$('#DoBdetail').val(dob);
			$('#emaildetail').val(employee.email);
			$('#firstnamedetail').val(employee.firstname);
			$('#ddlGenderdetail').val(employee.gender);
			$('#txtIdEdit').val(employee.id);
			$('#initialsdetail').val(employee.initials);
			$('#lastnamedetail').val(employee.lastname);
			$('#ddlMaritalStatusEdit').val(employee.maritalStatus);
			$('#mobiledetail').val(employee.mobile);	
			$('#phonedetail').val(employee.phone);			
			$('#fupPhotoEdit').val(employee.photo);			
			$('#socialSecurityNumberdetail').val(employee.socialSecurityNumber);			
			$('#ddlStateListdetail').val(employee.stateid);	
			$('#ddlTitledetail').val(employee.title);			
			$('#ddlEmployeeTypeEdit').val(employee.employeetypeid);				
			var hireDate = employee.hireDate.substr(0,10);
			$('#hireDatedetail').val(hireDate);
			$('#ddljobTitledetail').val(employee.jobtitleid);	
		});		
		$('#detailModal').modal("show");		
		});
	});
	
		$('.table #photoButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#photoModal #employeePhoto').attr('src', href);
		$('#photoModal').modal("show");		
	});	

})

