function registration()
	{
		var email= document.getElementById("t1").value;
		
		var pwd= document.getElementById("t2").value;
	
		var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	   
		 if(email=='')
		{
			alert('Please enter your user email id');
		}
		else if (!filter.test(email))
		{
			alert('Invalid email');
		}

		else if(pwd=='')
		{
			alert('Please enter Password');
		}
		

	}
	function clearFunc()
	{
		document.getElementById("t1").value="";
		document.getElementById("t2").value="";
	}