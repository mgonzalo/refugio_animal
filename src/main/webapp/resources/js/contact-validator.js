// JavaScript Validation For Registration Page

$('document').ready(function()
{ 		 		
		 // name validation
		  var nameregex = /^[a-zA-Z ]+$/;
		 
		 $.validator.addMethod("validname", function( value, element ) {
		     return this.optional( element ) || nameregex.test( value );
		 }); 
		 // street validation
		  var streetregex = /^[a-zA-Z0-9 ]+$/;
		 
		 $.validator.addMethod("validstreet", function( value, element ) {
		     return this.optional( element ) || streetregex.test( value );
		 }); 
		 // number validation
		  var numregex = /^[0-9]+$/;
		 
		 $.validator.addMethod("validnumber", function( value, element ) {
		     return this.optional( element ) || numregex.test( value );
		 }); 
		// sex validation
		  var sexregex = /^[H\h\M\m]+$/;
		 
		 $.validator.addMethod("validsex", function( value, element ) {
		     return this.optional( element ) || sexregex.test( value );
		 }); 
		 // valid email pattern
		 var eregex = /^([a-zA-Z0-9_\.\-\+])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		 
		 $.validator.addMethod("validemail", function( value, element ) {
		     return this.optional( element ) || eregex.test( value );
		 });
		 
		 $("#contactForm").validate({				 
			  rules:
			  {
				  	"contactName": {
						required: true,
						validname: true,
						minlength: 4,
						maxlength: 255
					},
					"contactEmail": {
						required: true,
						validemail: true,
						minlength: 4,
						maxlength: 255
					},
					"contactSubject": {
						required: true,
						validstreet: true,
						minlength: 2,
						maxlength: 255
					},
					"contactMesagge": {
						required: true,
						validstreet: true,
						minlength: 4,
						maxlength: 500
					}
			   },
			   messages:
			   {
					"contactName": {
						required: "Por favor ingrese su nombre.",
						validname: "Su nombre solo debe contener letras y/o espacios.",
						minlength: "Su nombre es muy corto.",
						maxlength: "El nombre supera la cantidad maxima de caracteres(255)."
					},
					"contactEmail": {
						required: "Por favor ingrese su email.",
						validemail: "El email ingresado no es valido.",
						minlength: "El email es muy corto.",
						maxlength: "El email supera la cantidad maxima de caracteres(255)."
					},
					"contactSubject": {
						required: "Por favor ingrese un asunto.",
						validstreet: "El asunto solo debe contener letras y/o espacios.",
						minlength: "El asunto es muy corto.",
						maxlength: "El asunto supera la cantidad maxima de caracteres(255)."
					},	
					"contactMesagge": {
						required: "Por favor ingrese un mensaje.",
						validstreet: "El mensaje solo debe contener letras y/o numeros.",
						minlength: "El mensaje es muy corto.",
						maxlength: "El mensaje supera la cantidad maxima de caracteres(500)."
					 }
			   },
			   errorPlacement : function(error, element) {
				  $(element).closest('.form-group').find('.help-block').html(error.html());
			   },
			   highlight : function(element) {
				  $(element).closest('.form-group').removeClass('has-success').addClass('has-error');
			   },
			   unhighlight: function(element, errorClass, validClass) {
				  $(element).closest('.form-group').removeClass('has-error').addClass('has-success');
				  $(element).closest('.form-group').find('.help-block').html('');
			   },
			   submitHandler: function(form){form.submit();}  
			});
});