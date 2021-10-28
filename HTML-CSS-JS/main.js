function registration()
	{

				    var name=$("#name").val();
					var email=$("#email").val();
					var password=$("#password").val();
					var conPassword=$("#conPassword").val();
					var contact=$("#contact").val();
					var date=$('#dob').val();
					var gender=$("input[name='gender']:checked").val();
					var status=$('input[type=checkbox]:checked');
					var country=$("#country").val();
					var numbers = /^[0-9]+$/;
			
				   if(name.length !="" && name.length>3 && name.length<15 &&  && name.match(letters)) {
						$("#errName").html('');
					if(email.length>=6 && email.length<18 && email.length != "" && email.match(emailVal)) {
							$("#errEmail").html('');
					if(contact.length==10 && contact!="" && contact.match(numbers)) {
								$("#errContact").html('');
					
					if(gender) {
										$("#errGender").html('');
					if(status.length>0) {
											$("#status").html('');
					if(date!="") {
									$("#errDate").html('');
					if(country!="") {
					$("#errCountry").html('');
					if(password.length>8 && password.length<16 && password.length !="" && password.match(letterNum)) {
					 $("#errPassword").html('');
					if(conPassword==password) {
					 $("#errConPassword").html('');
					 } 
					 
					 else {
					$("#errConPassword").html('Password does not match');
							 }
					 } 
					 
					 else {
					   $("#errPassword").html('Only character allowed');
														}
					 
					   } else {
							   $("#errCountry").html('Choose an option');
													}
					   } 
												} 
						}else {
						  $("#status").html('Select status');
											}
						} else {
								 $("#errGender").html('Select gender');
										}
									}
						   } 
						   
						   else {
							$("#errName").html('Please input alphabet characters only');
								} 
								
								else {
									 $("#errEmail").html('Input valid email');
								}
							} 
							
							else {
							   
							   $("#errContact").html('Input valid contact');
							   }else {
										$('#errDate').html('Enter DOB');
									}
						
  }
