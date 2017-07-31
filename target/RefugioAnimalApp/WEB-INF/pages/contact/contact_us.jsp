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
              <h2>Contacto</h2>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- Page Header End -->

  <!-- Contact Section -->
  <section class="contact-form-section section-padding">
    <div class="container">
    	<c:choose>
			<c:when test="${resultStatus == 'CREATED'}">
				<c:set var="className" value="alert alert-success" />
			</c:when>
			<c:otherwise>
				<c:set var="className" value="alert alert-danger" />
			</c:otherwise>
		</c:choose>
		<div id="messageSave" class="${className}"
			style="display: ${showDiv};">
			<strong>${resultMessaje}</strong>
		</div>
      <div class="row">
        <div class="col-md-12 mb-50 text-center contact-title-text">
          <h2>Contactanos!</h2>
          <p>Si tenes Alguna sugerencia o alguna duda sobre la pagina, completa el siguiente formulario</p>
        </div>
        <div class="col-md-7 col-md-offset-1 contact-form contact-info-section">
        <spring:url value="/contact/new" var="contactActionUrl" />
		<form:form class="shake" role="form" action="${contactActionUrl}"
					modelAttribute="contactDTO" method="post" id="contactForm"
					name="contactForm" data-toggle="validator">
        
            <div class="form-group">
              <label for="name" class="sr-only">Nombre</label>
              <form:input path="contactName" id="contactName"  type="text" maxlength="255" placeholder="Nombre" class="form-control contact-control"/>
              <div class="help-block with-errors"></div>
            </div>

           <div class="form-group">
              <label for="email" class="sr-only">Email</label>
              <form:input path="contactEmail" id="contactEmail" type="email" maxlength="255" placeholder="Email" class="form-control contact-control"/>
              <div class="help-block with-errors"></div>
            </div>
            
           <div class="form-group">
              <label for="subject" class="sr-only">Asunto</label>
              <form:input path="contactSubject" id="contactSubject" type="text" maxlength="255" placeholder="Asunto" class="form-control contact-control"/>
              <div class="help-block with-errors"></div>
            </div>
            
			<div class="form-group">
              <label for="message" class="sr-only">Mensaje</label>
              <form:textarea path="contactMesagge" id="contactMesagge"
							maxlength="500" rows="7"
							placeholder="Mensaje"
							class="form-control" />
              <div class="help-block with-errors"></div>
            </div>

			<div class="wraptocenter">
				<button class="btn btn-common btn-lg" type="submit"
							id="form-submit">
					<i class="fa fa-envelope"></i> Enviar
				</button>
			</div>
<%--             <img id="btnImgSend" alt="Enviar" width="160px" height="80px" src="<spring:url value="/resources/img/enviar-boton.png"/>"> --%>
            <div class="clearfix"></div>
         </form:form>
        </div>
      </div>
    </div>
  </section>
  <!-- Contact Section End -->
	 <!-- Featured Section Ends -->
    <jsp:include page="../common/footer.jsp" />
    
    <script language="JavaScript" type="text/javascript" src="<spring:url value="/resources/js/jquery-1.11.2.min.js"/>"></script>
    <script language="JavaScript" type="text/javascript" src="<spring:url value="/resources/js/jquery.validate.min.js"/>"></script>
    <script language="JavaScript" type="text/javascript" src="<spring:url value="/resources/js/contact-validator.js"/>"></script>
	<!-- Tether Js -->
	<script language="JavaScript" type="text/javascript" src="<spring:url value="/resources/js/tether.min.js"/>"></script>
	<!-- Bootstrap JS -->
	<script language="JavaScript" type="text/javascript" src="<spring:url value="/resources/js/bootstrap.min.js"/>"></script>
	<!--Text Rotator-->
	<script language="JavaScript" type="text/javascript" src="<spring:url value="/resources/js/jquery.mixitup.js"/>"></script>
	<!--WOW Scroll Spy-->
	<script language="JavaScript" type="text/javascript" src="<spring:url value="/resources/js/wow.js"/>"></script>
	<!-- CounterUp -->
	<script language="JavaScript" type="text/javascript" src="<spring:url value="/resources/js/jquery.counterup.min.js"/>"></script>
	<!-- OWL Carousel -->
	<script language="JavaScript" type="text/javascript" src="<spring:url value="/resources/js/owl.carousel.js"/>"></script>
	<!-- ScrollTop -->
	<script language="JavaScript" type="text/javascript" src="<spring:url value="/resources/js/jquery.slicknav.js"/>"></script>
	<!-- Appear -->
	<script language="JavaScript" type="text/javascript" src="<spring:url value="/resources/js/jquery.appear.js"/>"></script>
	<!-- All JS plugin Triggers -->
	<script language="JavaScript" type="text/javascript" src="<spring:url value="/resources/js/main.js"/>"></script>
    
    <script type="text/javascript">
    
    $('#btnImgSend').click(function(){
    	contactForm.submit();
	});
    
    </script>
    
  </body>
</html>