


function validate() {
	
	
		
	
	var x= document.forms["form1"]["userName"].value;
	if(x=="") {
		alert("please fill username..");
		//return false;
	}
	var name = /^[A-Z][a-z]+$/
	if (name.test(document.form1.userName.value) == true){alert("it is a correct name");}
	if (name.test(document.form1.userName.value) == false){alert("it is a wrong name");}
	
	
	var x= document.forms["form1"]["mobile"].value;
	if(x=="") {
		alert("please fill mobile number..");
		//return false;
	}
	var mob = /^[7-9]{1}[0-9]{9}$/;
	if (mobile.test(document.form1.mobile.value) == true){alert("it is a correct mobile number");}
	if (mobile.test(document.form1.mobile.value) == false){alert("it is a wrong mobile number");}
	
	
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
 

