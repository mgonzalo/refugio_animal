<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
      <div class="row">
        <div class="col-md-12 mb-50 text-center contact-title-text wow fadeIn" data-wow-delay="0.3s">
          <h2>Contactanos!</h2>
          <p>Si tenes Alguna sugerencia o alguna duda sobre la pagina, completa el siguiente formulario</p>
        </div>
        <div class="col-md-7 col-md-offset-1 contact-form contact-info-section">
          <form class="shake" role="form" method="post" id="contactForm" name="contact-form" data-toggle="validator">
            <div class="form-group wow slideInRight" data-wow-delay="0.3s">
              <label for="name" class="sr-only">Nombre</label>
              <input type="text" placeholder="Nombre" id="name" class="form-control contact-control" name="name" required data-error="Por favor complete tu nombre">
              <div class="help-block with-errors"></div>
            </div>

            <div class="form-group wow slideInRight" data-wow-delay="0.4s">
              <label for="email" class="sr-only">Email</label>
              <input type="email" placeholder="Email" id="email" class="form-control contact-control" name="email" required data-error="Por favor complete tu Email">
              <div class="help-block with-errors"></div>
            </div>

            <div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="subject" class="sr-only">Asunto</label>
              <input type="text" placeholder="Asunto" id="msg_subject" class="form-control contact-control" name="subject" required data-error="Por favor complete un asunto">
              <div class="help-block with-errors"></div>
            </div>

            <div class="form-group wow slideInRight" data-wow-delay="0.6s">
              <label for="message" class="sr-only">Mensaje</label>
              <textarea placeholder="Mensaje" rows="7" id="message" class="form-control" name="message" required data-error="Por favor complete tu mensaje"></textarea>
              <div class="help-block with-errors"></div>
            </div>

            <button class="btn btn-common btn-lg wow bounceInUp" data-wow-delay="0.8s" type="submit" id="form-submit"><i class="fa fa-envelope"></i> Enviar</button>
            <div id="msgSubmit" class="h3 text-center hidden"></div>
            <div class="clearfix"></div>
          </form>
        </div>
      </div>
    </div>
  </section>
  <!-- Contact Section End -->
	 <!-- Featured Section Ends -->
    <jsp:include page="../common/footer.jsp" />
  </body>
</html>