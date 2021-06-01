	var check = function(){
              var password = document.getElementById("Password");
              var confirm = document.getElementById("Confirmpassword");
              var submit = document.getElementById("Submit");

            if(password.value == confirm.value){
                confirm.style.border = "";
                submit.disabled = false;
            }else {
                confirm.style.border = 'red 2px solid';
                submit.disabled = true;
            }
          }

          var isEmail = function(){
            var mailformat = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
            var email = document.getElementById("Email");
            var submit = document.getElementById("Submit");
            if(mailformat.test(email.value)){
                email.style.border = "";
                submit.disabled = false;
            } else {
                email.style.border = "red 2px solid";
                submit.disabled = true;
            }
          }

          var isPhoneNumber = function(){
			var phoneNumberFormat = /^[\+]?[(]?[0-9]{3}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$/im;
			var phoneNumber = document.getElementById("PhoneNumber");
			var submit = document.getElementById("Submit");
			if(phoneNumberFormat.test(phoneNumber.value)){
				phoneNumber.style.border = "";
				submit.disabled = false;
			} else {
				phoneNumber.style.border = "red 2px solid";
				submit.disabled = true;
			}
          }
          
var isNumber = function(){
	var number = document.getElementById("Number");
	var submit = document.getElementById("Submit");
	
	if(isNaN(number.value)){
		number.style.border = "red 2px solid";
		submit.disabled = true;
	} else {
		number.style.border = "";
		submit.disabled = false;
	}
}
          
          