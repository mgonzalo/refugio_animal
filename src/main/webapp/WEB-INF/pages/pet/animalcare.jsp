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
              <h2>Cuidados de la Mascota</h2>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- Page Header End -->
    
    <!-- Classic Blog Section -->
    <section class="classic-blog-section section-padding">
      <div class="container">	
        <div class="row">
          <!-- BLog Article Section -->
          <div class="col-md-9">
            <!-- Single Blog Post -->
            <article class="blog-post-wrapper wow fadeIn" data-wow-delay="0.3s">
              <!-- Post Content -->
              <section class="blog-post-content">
                <div>
                  <h2 class="blog-post-title"><a href="#">Cuidados de los Perros</a></h2>
                </div>
                <div class="blog-post">
                </div>
                  <p>Averiguar los cuidados especiales de los perros comidas vacunas</p>
              </section>
            </article>
            <!-- Slider Post -->
            <article class="blog-post-wrapper format-slider wow fadeIn" data-wow-delay="0.3s">
              <!-- Author Info -->
				<!-- Featured Content -->
             
              <!-- Post Content -->
              <section class="blog-post-content">
                <div>
                  <h2 class="blog-post-title"><a href="#">Cuidados de los Gatos</a></h2>
                </div>
                <div class="blog-post">
                  <p>Cuidados</p>
                </div>
              </section>
              <!-- Footer -->
             </article>
            <!-- Quote Post -->
            <article class="blog-post-wrapper format-qoute wow fadeIn" data-wow-delay="0.3s">
              <!-- Post Content -->
              <section class="blog-post-content">
                <blockquote class="blockquote">
                  <p>Aca tenes toda la informacion necesaria para los cuidados de tu mascota.</p>
                  <a href="#"><span>- AGMO</span></a>
                </blockquote>
              </section>
            </article>
		</section>

	<!-- Featured Section Ends -->
    <jsp:include page="../common/footer.jsp" />
  </body>
</html>