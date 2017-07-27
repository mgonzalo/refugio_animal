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

      <!-- Main Carousel Section -->
      <div id="carousel-area">
        <div id="carousel-slider" class="carousel slide" data-ride="carousel">
          <ol class="carousel-indicators">
            <li data-target="#carousel-slider" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-slider" data-slide-to="1"></li>
            <li data-target="#carousel-slider" data-slide-to="2"></li>
          </ol>
          <div class="carousel-inner" role="listbox">
            <div class="carousel-item active">
              <img src="<spring:url value="/resources/img/perros_en_la_calle.jpg"/>">
              <div class="carousel-caption">
                <h2>Adopta a tu proxima mascota!!</h2>
                <h3>Brindale un hogar y el amor que ellos necesitan.</h3>
                <a class="btn btn-lg btn-common" href="<spring:url value="/pets/search"/>">
                  <i class="fa fa-heart">
                  </i>
                  Adoptar
                </a>
              </div>
            </div>
            <div class="carousel-item">
              <img src="<spring:url value="/resources/img/gatos.jpg"/>">
              <div class="carousel-caption">
                <h2>Adopta a tu proxima mascota!!</h2>
                <h3>Brindale un hogar y el amor que ellos necesitan.</h3>
                <a class="btn btn-common btn-lg " href="<spring:url value="/pets/search"/>">
                  <i class="fa fa-heart">
                  </i>
                  Adoptar
                </a>
              </div>
            </div>
            <div class="carousel-item">
              <img src="<spring:url value="/resources/img/animales_varios.jpg"/>">
              <div class="carousel-caption">
                <h2>Adopta a tu proxima mascota!!</h2>
                <h3>Brindale un hogar y el amor que ellos necesitan.</h3>
                <a class="btn btn-common btn-lg " href="<spring:url value="/pets/search"/>">
                  <i class="fa fa-heart">
                  </i>
                  Adoptar
                </a>
              </div>
            </div>
          </div>
          <a class="carousel-control-prev" href="#carousel-slider" role="button" data-slide="prev">
            <span class="carousel-control carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
          </a>
          <a class="carousel-control-next" href="#carousel-slider" role="button" data-slide="next">
            <span class="carousel-control carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
          </a>
        </div>
      </div>     
    </header>

	<!-- lastPets preguntar si no es vacio e iterar por tipo. (perro, gatos, resto) -->

	<c:choose>
		<c:when test="${lastPublishPets.lastPetPublishDTOs.size() > 0}">
			<!-- Portfolio Section -->
    <section id="portfolio" class="section">
      <!-- Container Starts -->
      <div class="container">
        <h1 class="section-title wow fadeInUpQuick" data-wow-delay=".3s">
          ULTIMAS MASCOTAS PUBLICADAS
        </h1>
        <p class="section-subcontent wow fadeInUpQuick" data-wow-delay=".4s">Aca vas a poder encontrar nuestras ultimas <br> mascotas publicadas</p>
        <div class="row">          
          <div class="col-md-12">
            <!-- Portfolio Controller/Buttons -->
            <div class="controls text-center wow fadeInUpQuick" data-wow-delay=".6s">
              <c:if test="${lastPublishPets.hasDogTypePet}">
              <a class="filter active btn btn-common" data-filter=".branding">
                Perros 
              </a>
              </c:if>
              <c:if test="${lastPublishPets.hasCatTypePet}">
              <a class="filter btn btn-common" data-filter=".marketing">
                Gatos 
              </a>
              </c:if>
              <c:if test="${lastPublishPets.hasOtherTypesPet}">
              <a class="filter btn btn-common" data-filter=".planning">
                Otros
              </a>
               </c:if>
            </div>
            <!-- Portfolio Controller/Buttons Ends-->
          </div>

          <!-- Portfolio Recent Projects -->
          <div id="portfolio" class="row wow fadeInUpQuick" data-wow-delay="0.8s">
          
          <c:forEach items="${lastPublishPets.lastPetPublishDTOs}" var="lastPetPublish">
          	<c:choose>
	          	<c:when test="${lastPetPublish.petType == 1}">
	          		<div class="col-sm-6 col-md-4 col-lg-4 col-xl-4 mix branding">
	              <div class="portfolio-item">
	                <div class="portfolio-img">
<%-- 	                  <img alt="${lastPetPublish.name}" --%>
<%-- 							src="<spring:url value="/resources/img/pets/${lastPetPublish.publicationId}/${lastPetPublish.name}_${lastPetPublish.petID}_0.jpg"/>" />                   --%>
	                <img alt="Imagen no Disponible" src="<spring:url value="/resources/img/no_imagen_dog.jpg"/>" />                  
	                </div> 
	                <div class="portfoli-content">
	                  <div class="sup-desc-wrap">
	                    <div class="sup-desc-inner">
	                      <div class="sup-link">
	                        <a class="right-link" href="<spring:url value="/pets/${lastPetPublish.publicationId}"/>"><i class="icon-heart"></i></a>
	                      </div>
	                      <div class="sup-meta-wrap">
	                        <a class="sup-title" href="<spring:url value="/pets/${lastPetPublish.publicationId}"/>"><h4>${lastPetPublish.name}</h4></a>
	                        <p class="sup-description">Hace click en el corazon para ver a la mascota</p>
	                      </div>
	                    </div>
	                  </div>
	                </div>               
	              </div>
	            </div>
	            <div class="col-sm-2 col-md-1 col-lg-1 col-xl-1"></div>
	          	</c:when>
          		<c:when test="${lastPetPublish.petType == 2}">
	          	<div class="col-sm-6 col-md-4 col-lg-4 col-xl-4 mix marketing">
	              <div class="portfolio-item">
	                <div class="portfolio-img">
<%-- 	                  <img alt="${lastPetPublish.name}" --%>
<%-- 							src="<spring:url value="/resources/img/pets/${lastPetPublish.publicationId}/${lastPetPublish.name}_${lastPetPublish.petID}_0.jpg"/>" />                   --%>
	                	  <img alt="Imagen no Disponible" src="<spring:url value="/resources/img/no_imagen_dog.jpg"/>" />                  
	                </div> 
	                <div class="portfoli-content">
	                  <div class="sup-desc-wrap">
	                    <div class="sup-desc-inner">
	                      <div class="sup-link">
	                        <a class="right-link" href="<spring:url value="/pets/${lastPetPublish.publicationId}"/>"><i class="icon-heart"></i></a>
	                      </div>
	                      <div class="sup-meta-wrap">
	                        <a class="sup-title" href="<spring:url value="/pets/${lastPetPublish.publicationId}"/>"><h4>${lastPetPublish.name}</h4></a>
	                        <p class="sup-description">Hace click en el corazon para ver a la mascota</p>
	                      </div>
	                    </div>
	                  </div>
	                </div>               
	              </div>
	            </div>
	            <div class="col-sm-2 col-md-1 col-lg-1 col-xl-1"></div>
          		</c:when>
          		<c:otherwise>
          		<div class="col-sm-6 col-md-4 col-lg-4 col-xl-4 mix planning">
	              <div class="portfolio-item">
	                <div class="portfolio-img">
	                  <img alt="${lastPetPublish.name}"
							src="<spring:url value="/resources/img/pets/${lastPetPublish.publicationId}/${lastPetPublish.name}_${lastPetPublish.petID}_0.jpg"/>" />                  
	                </div> 
	                <div class="portfoli-content">
	                  <div class="sup-desc-wrap">
	                    <div class="sup-desc-inner">
	                      <div class="sup-link">
	                        <a class="right-link" href="<spring:url value="/pets/${lastPetPublish.publicationId}"/>"><i class="icon-heart"></i></a>
	                      </div>
	                      <div class="sup-meta-wrap">
	                        <a class="sup-title" href="<spring:url value="/pets/${lastPetPublish.publicationId}"/>"><h4>${lastPetPublish.name}</h4></a>
	                        <p class="sup-description">Hace click en el corazon para ver a la mascota</p>
	                      </div>
	                    </div>
	                  </div>
	                </div>               
	              </div>
	            </div>
	            <div class="col-sm-2 col-md-1 col-lg-1 col-xl-1"></div>
          		</c:otherwise>
          	</c:choose>
          </c:forEach>
            
          </div>
         <div class="col-md-12">
            <!-- End Portfolio Recent Projects -->
            <div class="text-center loadmore-button wow fadeInUpQuick">
              <a href="<spring:url value="/pets/search"/>" class="btn btn-common"><i class="fa fa-arrows"></i> Ver mas</a>
            </div>
         </div>
          
        </div>
      </div>
      <!-- Container Ends -->
    </section>
    <!-- Portfolio Section Ends -->   
		</c:when>
	</c:choose>
    <!-- Featured Section Starts -->
    <section id="featured" class="section">
      <!-- Container Starts -->
      <div class="container">
        <h1 class="section-title wow fadeInUpQuick">
          EVENTOS
        </h1>
        <p class="section-subcontent">El gorbierno de la ciudad se preocupa mucho por las mascotas por eso hacen eventos en los principales parques,<br>  aca te informaremos donde son</p>
        <div class="row">
        	<!-- Start featured Icon 1 -->
 	         <c:choose>
 	         	<c:when test="${commonData.eventData.size() > 0}">
	 	         	<c:forEach items="${commonData.eventData}" var="events">
	 	         		<div class="col-md-4 col-sm-6 wow fadeInUpQuick">
				            <div class="featured-box">
				              <div class="featured-icon">
				                <i class="icon-pencil">
				                </i>
				              </div>
				              <div class="featured-content">
				                <h4><c:out value="${events.eventPlace}"/></h4>
				                <p><c:out value="${events.eventDescription}"/></p>
				              </div>
				            </div>
				         </div>
	 	         	</c:forEach>
 	         	</c:when>
 	         	<c:otherwise>
 	         		<p>No se encontraron eventos para este mes.</p>
 	         	</c:otherwise>
 	         </c:choose>
          <!-- End featured Icon 1 -->
        </div>
      </div>
      <!-- Container Ends -->
    </section>
    <!-- Featured Section Ends -->
    <jsp:include page="../common/footer.jsp" />
  </body>
</html>