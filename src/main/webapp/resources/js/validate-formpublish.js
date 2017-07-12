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
		 
		 $("#formPublish").validate({				 
		 
		  rules:
		  {
			  
				name: {
					required: true,
					validname: true,
					minlength: 4
				},
				sex: {
					required: true,
					validsex: true,
					maxlength: 1
				},
				breed: {
					required: true,
					validname: true,
					minlength: 4
				},
				"userDTO.name": {
					required: true,
					validname: true,
					minlength: 4
					},				
				userdocnumber: {
					required: true,
					validname: true,
					minlength: 4
				},
				useremail: {
					required: true,
					validemail: true
				},
				userphone: {
					required: true,
					validemail: true,
					minlength: 4
				},
				userstreet: {
					required: true,
					validemail: true,
					minlength: 4
				},
		   },
		   messages:
		   {
				name: {
					required: "Por favor ingrese su nombre",
					validname: "Su nombre solo debe contener letras y espacios",
					minlength: "Su nombre es muy corto"
					  },
				sex: {
					required: "Por favor ingrese H o M",
					validsex: "Ingrese H o M",
					maxlength: "Solo ingrese H o M"
					  },
				breed: {
					required: "Por favor una raza",
					validname: "La raza solo debe contener letras y espacios",
					minlength: "La raza es muy corto"
					 },	  
				username: {
					required: "Por favor ingrese su nombre y apellido",
					validname: "Su nombre y apellido solo debe contener letras y espacios",
					minlength: "Su nombre y apellido es muy corto"
					  },	
				 userdocnumber: {
					required: "Por favor ingrese su numero de documento",
					validnumber: "Su numero de documento solo debe contener numeros",
					minlength: "Su numero de documento es muy corto"
					  },
				useremail: {
					required: "Por favor ingrese su mail",
					validemail: "Ingrese un mail valido"
					   },
				 userphone: {
					required: "Por favor ingrese su numero de telefono",
					validnumber: "Su numero de telefono solo debe contener numeros",
					minlength: "Su numero de telefono es muy corto"
					  },	
				userstreet: {
					required: "Por favor ingrese su direccion",
					validstreet: "Su direccion solo debe contener letras y numeros",
					minlength: "Su direccion es muy corta"
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
		   
		   		submitHandler: function(form){
					
					alert('submitted');
					form.submit();
					//var url = $('#register-form').attr('action');
					//location.href=url;
					
				}
				
				/*submitHandler: function() 
							   { 
							   		alert("Submitted!");
									$("#register-form").resetForm(); 
							   }*/
		   
		   }); 
		   
		   
		   
		   /*function submitForm(){
			 
			   
			   /*$('#message').slideDown(200, function(){
				   
				   $('#message').delay(3000).slideUp(100);
				   $("#register-form")[0].reset();
				   $(element).closest('.form-group').find("error").removeClass("has-success");
				    
			   });
			   
			   alert('form submitted...');
			   $("#register-form").resetForm();
			      
		   }*/
});