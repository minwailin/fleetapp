

//window.addEventListener('DOMContentLoaded', function() {
 //document.getElementById("table #editButton").onclick = function ()
 //  {
 //    $('#editModal').modal();
     //validation code to see State field is mandatory.  
//   }
// });
$('document').ready(function(){
	
	$('table #editButton').on('click',function(e){
		e.preventDefault();
		var href = $(this).attr('href');
		$.get(href ,function(contact,status){
			$('#idEdit').val(contact.id);
			$('#firstnameEdit').val(contact.firstname);
			$('#lastnameEdit').val(contact.lastname);
			$('#mobileEdit').val(contact.mobile);
			$('#phoneEdit').val(contact.phone);
			$('#emailEdit').val(contact.email);
			$('#remarkEdit').val(contact.remarks);
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
		
	$('table #detailButton').on('click',function(e){
		e.preventDefault();
		var href = $(this).attr('href');
		$.get(href ,function(contact,status){
			$('#idDetail').val(contact.id);
			$('#firstnameDetail').val(contact.firstname);
			$('#lastnameDetail').val(contact.lastname);
			$('#mobileDetail').val(contact.mobile);
			$('#phoneDetail').val(contact.phone);
			$('#emailDetail').val(contact.email);
			$('#remarkDetail').val(contact.remarks);
		});
		
		$('#detailModal').modal("show");
		console.log("this is good");
	});
});




