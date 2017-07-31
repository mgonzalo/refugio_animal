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
				"name": {
					required: true,
					validname: true,
					minlength: 4,
					maxlength: 150
				},
				"breed": {
					required: true,
					validname: true,
					minlength: 4,
					maxlength: 150
				},
				"description": {
					required: false,
					maxlength: 1000
				},
				"userDTO.name": {
					required: true,
					validname: true,
					minlength: 4,
					maxlength: 300
				},				
				"userDTO.docNumber": {
					required: true,
					validnumber: true,
					minlength: 4,
					maxlength: 11
				},
				"userDTO.email": {
					required: true,
					validemail: true,
					minlength: 4,
					maxlength: 150
				},
				"userDTO.phone": {
					required: true,
					validnumber: true,
					minlength: 4,
					maxlength: 80
				},
				"userDTO.street": {
					required: false,
					validstreet: true,
					minlength: 4,
					maxlength: 250
				},
		   },
		   messages:
		   {
				"name": {
					required: "Por favor ingrese el nombre de la mascota.",
					validname: "El nombre solo debe contener letras y espacios.",
					minlength: "El nombre es muy corto.",
					maxlenght: "El nombre supera la cantidad maxima de caracteres(150)."
				},
				"breed": {
					required: "Por favor ingresa la raza de la mascota.",
					validname: "La raza solo debe contener letras y espacios.",
					minlength: "La raza es muy corta.",
					maxlenght: "La raza supera la cantidad maxima de caracteres(150)."
				},	
				"description":{
					maxlenght: "La descripcion de la mascota no debe superar" +
							" la cantidad maxima de caracteres(1000)."
				},
				"userDTO.name": {
					required: "Por favor ingrese el nombre y apellido del dueño.",
					validname: "El nombre y apellido solo debe contener letras y espacios.",
					minlength: "El nombre y apellido es muy corto.",
					maxlenght: "El nombre y apellido supera la cantidad maxima de caracteres(300)."
				},	
				"userDTO.docNumber": {
					required: "Por favor ingrese un numero de documento.",
					validnumber: "El numero de documento solo debe contener numeros.",
					minlength: "El numero de documento es muy corto.",
					maxlenght: "El numero de documento supera la cantidad maxima de caracteres(11)."
				 },
				"userDTO.email": {
					required: "Por favor ingrese un email.",
					validemail: "El email ingresado no es valido.",
					minlength: "El mail es muy corto.",
					maxlenght: "El mail supera la cantidad maxima de caracteres(150)."
				},
				 "userDTO.phone": {
					required: "Por favor ingrese un numero de telefono.",
					validnumber: "El numero de telefono solo debe contener numeros.",
					minlength: "El numero de telefono es muy corto.",
					maxlenght: "El numero de telefono supera la cantidad maxima de caracteres(80)."
				},	
				"userDTO.street": {
					required: "Por favor ingrese una direccion.",
					validstreet: "La direccion solo debe contener letras y numeros.",
					minlength: "La direccion es muy corta",
					maxlenght: "La direccion supera la cantidad maxima de caracteres(250)."
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
	   	   submitHandler: function(form){form.submit();} }); 
		   		
});