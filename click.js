


function validate() {
	var x= document.forms["form1"]["userName"].value;
	if(x=="") {
		alert("please fill username..");
		return false;
		
		var letters = /^[A-Za-z]+$/;
   if(x.value.match(letters))
     {
		 alert("message");
      return true;
     }
   else
     {
     alert("message");
     return false;
     }
	}
	var city= document.forms["form1"]["city"].value;
	if(city==""){
		alert("please enter city name");
		return false;
	}
	var pass= document.forms["form1"]["password"].value;
	if(pass==""){
		alert("enter password..");
		return false;
	} 
 

	if(!(document.getElementById('male').checked) && !(document.getElementById('female').checked)){
		alert("Please select Gender: Male or Female");
		return false;
	}
	else if((document.getElementById('male').checked) && (document.getElementById('female').checked)){
		alert("Select only one gender button");
		return false;
	}
	if(!(documenr.getElementById('eng').checked) && !(document.getElementById('tel')) &&
					!(document.getElementById('tam').checked)){
						alert("Select atleast one Language..");
						return false;
					}
} 
 

