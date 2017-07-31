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
              <h2>Buscar Refugios o Veterinarias</h2>
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
          <h2>Buscar!</h2>
          <p>Para buscar refugios de animales o centros de atencion, completa los siguientes campos</p>
        </div>
        <div class="col-md-7 col-md-offset-1 contact-form contact-info-section">
          <form class="shake" role="form" method="post" id="contactForm" name="contact-form" data-toggle="validator">

		  <div class="form-group wow slideInRight" data-wow-delay="0.3s">
              <label for="name" class="sr-only">Tipo</label>
              <input type="text" placeholder="Refugio o Veterinaria" id="name" class="form-control contact-control" name="name" required data-error="Por favor complete una opcion">
              <div class="help-block with-errors"></div>
            </div>

            <div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="subject" class="sr-only">Ubicacion</label>
              <input type="text" placeholder="Ubicacion" id="msg_subject" class="form-control contact-control" name="subject" required data-error="Por favor complete una ubicacion">
              <div class="help-block with-errors"></div>
            </div>

            <button class="btn btn-common btn-lg wow bounceInUp" data-wow-delay="0.8s" type="submit" id="form-submit"><i class="fa fa-search"></i> Buscar</button>
            <div id="msgSubmit" class="h3 text-center hidden"></div>
            <div class="clearfix"></div>
          </form>
        </div>
      </div>
    </div>
  </section>
  <!-- Contact Section End -->
    
    <!-- Classic Blog Section -->
    <section class="animated-progress-area mt-50">
      <div class="container">	
        <div class="row">
          <!-- BLog Article Section -->
          <div class="col-md-9">
            <!-- Single Blog Post -->
            <article class="blog-post-wrapper wow fadeIn" data-wow-delay="0.3s">
              <!-- Post Content -->
              <section class="blog-post-content">
                <div>
                  <h2 class="blog-post-title"><a href="#">Resultados</a></h2>
                </div>
                <div class="blog-post">
                </div>
                  <p>resultados</p>
              </section>
            </article>
            <!-- Slider Post -->
            <article class="blog-post-wrapper format-slider wow fadeIn" data-wow-delay="0.3s">
              <!-- Author Info -->
				<!-- Featured Content -->
             
              <!-- Post Content -->
              <section class="blog-post-content">
                <div>
                  <h2 class="blog-post-title"><a href="#">Resultados</a></h2>
                </div>
                <div class="blog-post">
                  <p>Resultados</p>
                </div>
              </section>
              <!-- Footer -->
             </article>
            
		</section>
  	<!-- Featured Section Ends -->
    <jsp:include page="../common/footer.jsp" />
  </body>
</html>