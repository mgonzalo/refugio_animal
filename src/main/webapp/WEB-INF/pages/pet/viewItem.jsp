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
    <link rel="stylesheet" media="screen" href="<spring:url value="/resources/fonts/font-awesome/font-awesome.min.css"/>"/>
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
    
     <link rel="stylesheet" type="text/css" href="<spring:url value="/resources/css/jcarousel.transitions.css"/>">
     
     <script type="text/javascript" src="<spring:url value="/resources/js/modernizr.js"/>"></script>
     <script type="text/javascript" src="<spring:url value="/resources/js/jquery.js"/>"></script>
     <script type="text/javascript" src="<spring:url value="/resources/js/jquery.jcarousel.min.js"/>"></script>
     <script type="text/javascript" src="<spring:url value="/resources/js/jcarousel.transitions.js"/>"></script>
    
     <script src="<spring:url value="/resources/js/jquery-min.js"/>"></script>
        <!-- Tether Js -->
    <script src="<spring:url value="/resources/js/tether.min.js"/>"></script>
    <!-- Bootstrap JS -->    
    <script src="<spring:url value="/resources/js/bootstrap.min.js"/>"></script>
    <!--Text Rotator-->
    <script src="<spring:url value="/resources/js/jquery.mixitup.js"/>"></script>
    <!--WOW Scroll Spy-->
    <script src="<spring:url value="/resources/js/wow.js"/>"></script>
    <!-- OWL Carousel -->
    <script src="<spring:url value="/resources/js/owl.carousel.js"/>"></script>
    <!-- WayPoint -->
    <script src="<spring:url value="/resources/js/waypoints.min.js"/>"></script>
    <!-- CounterUp -->
    <script src="<spring:url value="/resources/js/jquery.counterup.min.js"/>"></script>
    <!-- ScrollTop -->
    <script src="<spring:url value="/resources/js/jquery.slicknav.js"/>"></script>
    <!-- Appear -->
    <script src="<spring:url value="/resources/js/jquery.appear.js"/>"></script>
    <!-- Vide js -->
    <script src="<spring:url value="/resources/js/jquery.vide.js"/>"></script>
     <!-- All JS plugin Triggers -->
    <script src="<spring:url value="/resources/js/main.js"/>"></script>
    
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
  <section class="animated-progress-area mt-50 contact-form-section section-padding">
    <div class="container">
     <div class="row">
        <div class="col-md-12 col-md-offset-1 contact-form contact-info-section section split">
			<h1 class="tit-section name-pet col-md-12">${data.petName}</h1>
			<div class="form-group">
				<div class="jcarousel-wrapper">
		                <div class="jcarousel">
		                    <ul>
		                        <li style="background: url('<spring:url value="/resources/img/no_imagen_dog.jpg"/>');"></li>
		                        <li style="background: url('<spring:url value="/resources/img/no_imagen_dog.jpg"/>');"></li>
		                        <li style="background: url('<spring:url value="/resources/img/no_imagen_dog.jpg"/>');"></li>
		                    </ul>
		                </div>
		                <a href="#" class="jcarousel-control-prev">&lsaquo;</a>
		                <a href="#" class="jcarousel-control-next">&rsaquo;</a>
	            </div>
        	</div>
        	<ul class="data-list col-md-12">
        		<li>Edad <b>${data.petAge}</b></li>
        		<li>Sexo <b><img id="imgSexPet" alt="Sexo" src="<spring:url value="/resources/img/${data.petSex}_sex_icon.png"/>"></b></li>
        		<li>Tipo <b>${data.petPetType}</b></li>
        		<li>Raza <b>${data.petBreed}</b></li>
        		<li>Tamaño <b>${data.petSize}</b></li>
        		<li>Ubicacion <b>${data.ownerCity} - ${data.ownerProvince}</b></li>
        		<li>Castrado <b><img id="imgPetCastrated" alt="Castrado" src="<spring:url value="/resources/img/check_${data.petCastrated}.png"/>"></b></li>
        		<li>Vacunado <b><img id="imgPetVacunated" alt="Vacunado" src="<spring:url value="/resources/img/check_${data.petVaccinate}.png"/>"></b></li>
        		<li>Cuidado Especial <b><img id="imgPetSpecialCare" alt="Cuidado Especial" src="<spring:url value="/resources/img/check_${data.petSpecialCare}.png"/>"></b></li>
        		<li>Compatibilidad <b><img id="imgPetCompatibility" alt="Compatibilidad" src="<spring:url value="/resources/img/check_${data.petCompatibilityWithOtherAnimals}.png"/>"></b></li>
        	</ul>
            <div class="clearfix"></div>
              <div class="clearfix"></div>
            <div class="col-md-12" style="padding: 40px 15px 15px;">
			  <h6>Descripcion</h6>   
              <p class="inner-text">${data.petDescription}</p>
            </div>
            <div class="col-md-7 col-md-offset-1 contact-form contact-info-section" style="padding: 40px 0 15px;">
<%-- 					<img id="btnAdoptPet" alt="Adoptar!" width="180px" height="60px" align="right" src="<spring:url value="/resources/img/boton-adoptame_transp.png"/>"> --%>
				<button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#myModal"><img id="btnAdoptPet" alt="Adoptar!" width="180px" height="60px" align="right" src="<spring:url value="/resources/img/boton-adoptame_transp.png"/>">
				</button>
			</div>
		<!-- Modal -->
			<div id="myModal" class="modal fade" role="dialog">
			  <div class="modal-dialog modal-lg">
			    <!-- Modal content-->
			    <div class="modal-content">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal">&times;</button>
			        <h4 class="modal-title">Adoptar</h4>
			      </div>
			      <div class="modal-body">
			        <p>Some text in the modal.</p>
			      </div>
			      <div class="modal-footer">
			      	<button type="submit" class="btn btn-default" data-dismiss="modal">Adoptar</button>
			        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			      </div>
			    </div>
			  </div>
			</div>
			<!-- Modal -->
        </div>
       </div>
     </div>
  </section>
  <!-- Contact Section End -->

  <!-- Featured Section Ends -->
  <jsp:include page="../common/footer.jsp" />
  
  
  <script type="text/javascript">
  
  $(document).ready(function() {

//       $("#btnAdoptPet").click(function () {
//     	  var w = window.open("", "popupWindow", "width=600, height=400, scrollbars=yes");
//       });
	});	
  
  </script>
  
  </body>
</html>