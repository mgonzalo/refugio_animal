<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Viewport Meta Tag -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="RefugioAnimal, es una aplicacion para publicar o adptar mascotas, contactarte con refugios o veterinarios, realizar donaciones y aprender mas cobre como cuidar a tu mascota.">
   	<meta name="title" content="Refugio Animal Argentina - no compres, adopta!"/>
    <meta name="author" content="RefugioAnimal.org"/>
    <link rel="shortcut icon" href="<spring:url value="/resources/img/favicon.ico"/>">
    <title>Refugio Animal Argentina - no compres, adopta!.</title>
    <!-- Bootstrap -->
    <link rel="stylesheet" type="text/css" href="<spring:url value="/resources/css/bootstrap.min.css"/>"/>
    <!-- Main Style -->
    <link rel="stylesheet" type="text/css" href="<spring:url value="/resources/css/main.css"/>"/>
    <!-- Slicknav Css -->
    <link rel="stylesheet" type="text/css" href="<spring:url value="/resources/css/slicknav.css"/>"/>

    <!-- Responsive Style -->
    <link rel="stylesheet" type="text/css" href="<spring:url value="/resources/css/responsive.css"/>"/>
    <!--Fonts-->
    <link rel="stylesheet" media="screen" href="<spring:url value="/resources/fonts/font-awesome.min.css"/>"/>
    <link rel="stylesheet" media="screen" href="<spring:url value="/resources/fonts/simple-line-icons.css"/>"/>    
     
     <!-- Extras -->
    <link rel="stylesheet" type="text/css" href="<spring:url value="/resources/css/owl.carousel.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<spring:url value="/resources/css/owl.theme.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<spring:url value="/resources/css/animate.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<spring:url value="/resources/css/normalize.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<spring:url value="/resources/css/settings.css"/>"/>

    <!-- Color CSS Styles  -->
    <link rel="stylesheet" type="text/css" href="<spring:url value="/resources/css/green.css"/>" media="screen"/>       
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js">
    </script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js">
    </script>
    <![endif]-->
  </head>
  <body>

    <!-- Header area wrapper starts -->
    <header id="header-wrap">
      <jsp:include page="../common/header.jsp" />
    </header>
    <!-- Header-wrap Section End -->

    <!-- Page Header -->
    <div class="page-header-section">
      <div class="container">
        <div class="row">
          <div class="page-header-area">
            <div class="page-header-content">
              <h2>Ficha de la Mascota</h2>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- Page Header End -->

  <!-- Contact Section -->
  <section class="section">
    <div class="container">
		<div class="col-md-12 mb-50 text-center contact-title-text wow fadeIn">
          <h2>Ficha de la Mascota!</h2>
        </div> 
     </div><!-- Container Ends --> 
        <div class="col-md-7 col-md-offset-1 contact-form contact-info-section section split">
			<h4>Datos de la Mascota:</h4>
            <div class="form-group">
			  <h6>Nombre:</h6>
			  <span><label class="form-control contact-control">${data.petName}</label></span>
            </div>
            <div class="form-group">
			  <h6>Edad:</h6>
			  <span><label class="form-control contact-control">${data.petAge}</label></span> 
            </div>
            <div class="form-group">
			  <h6>Sexo:</h6>
			  <span><label class="form-control contact-control">${data.petSex}</label></span>
            </div>
			<h4>Caracteristicas de la Mascota:</h4>
            <div class="form-group">
               <h6>Tipo:</h6>
              	<span><label class="form-control contact-control">${data.petPetType}</label></span>
            </div>
			<div class="form-group">
			  <h6>Raza:</h6> 
		      <span><label class="form-control contact-control">${data.petBreed}</label></span>
            </div>
			<div class="form-group">
               <h6>Tamaño:</h6>
              <span><label class="form-control contact-control">${data.petSize}</label></span>
             </div>
			<div class="form-group">
              <h6>Castrado:</h6>
              <span><label class="form-control contact-control">${data.petCastrated}</label></span>
            </div>
			<div class="form-group">
  				<h6>Vacunado:</h6>              
              <span><label class="form-control contact-control">${data.petVaccinate}</label></span>
            </div>
            <div class="form-group">
              <h6>Cuidado especial:</h6>
              <span><label class="form-control contact-control">${data.petSpecialCare}</label></span>
            </div>
           <div class="form-group">
              <h6>Compatibilidad con otros animales:</h6>
              <span><label class="form-control contact-control">${data.petCompatibilityWithOtherAnimals}</label></span>
            </div>
            <div class="form-group">
			  <h6>Descripcion:</h6>   
              <span><label class="form-control contact-control">${data.petDescription}</label></span>
            </div>
			<h4>Datos del dueño:</h4>
			<div class="form-group">
			<h6>Nombre y Apellido:</h6> 
			<span><label class="form-control contact-control">${data.ownerName}</label></span>
           </div>
			<div class="form-group">
			<h6>Email:</h6>   
			<span><label class="form-control contact-control">${data.ownerEmail}</label></span>
             </div>
			<div class="form-group">
			   <h6>Telefono:</h6>
			  <span><label class="form-control contact-control">${data.ownerPhone}</label></span>
           </div>
            <div class="form-group">
              <h6>Provincia:</h6>
			  <span><label class="form-control contact-control">${data.ownerProvince}</label></span>
             </div>
			<div class="form-group">
              <h6>Localidad:</h6>
               <span><label class="form-control contact-control">${data.ownerCity}</label></span>
            </div>
			<div class="form-group">
			  <h6>Calle:</h6>
			  <span><label class="form-control contact-control">${data.ownerCity}</label></span>
            </div>
            <div class="clearfix"></div>
        </div>
  </section>
  <!-- Contact Section End -->

  <!-- Featured Section Ends -->
  <jsp:include page="../common/footer.jsp" />
  </body>
</html>