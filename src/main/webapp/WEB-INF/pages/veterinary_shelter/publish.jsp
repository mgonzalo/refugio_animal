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
              <h2>Publicar Veterinaria o Refugio</h2>
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
        <div class="col-md-12 mb-50 text-center contact-title-text wow fadeIn" data-wow-delay="0.3s">
          <h2>Publicar Veterinaria o Refugio!</h2>
          <p>Para publicar, completa el siguiente formulario</p>
        </div>
        <div class="col-md-7 col-md-offset-1 contact-form contact-info-section">
		<h4>Tipo:</h4>	
          <form class="shake" role="form" method="post" id="contactForm" name="contact-form" data-toggle="validator">
            <div class="form-group wow slideInRight" data-wow-delay="0.3s">
              <label for="tipo" class="sr-only">Tipo</label>
              <input type="text" placeholder="Refugio o Veterinaria" id="Tipo" class="form-control contact-control" name="Tipo" required data-error="Por favor complete si es refugio o veterinaria">
              <div class="help-block with-errors"></div>
            </div>
			<h4>Datos:</h4>
            <div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="razonsocial" class="sr-only">Razon Social</label>
              <input type="text" placeholder="Razon Social" id="razonsocial" class="form-control contact-control" name="razonsocial" required data-error="Por favor complete la razon social">
              <div class="help-block with-errors"></div>
            </div>
				
			<div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="DNI" class="sr-only">DNI</label>
              <input type="text" placeholder="DNI" id="dni" class="form-control contact-control" name="dni" required data-error="Por favor complete el DNI">
              <div class="help-block with-errors"></div>
            </div>

			<div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="email" class="sr-only">Email</label>
              <input type="email" placeholder="Email" id="email" class="form-control contact-control" name="email" required data-error="Por favor complete tu Email">
              <div class="help-block with-errors"></div>
            </div>
			
			<div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="telefono" class="sr-only">Telefono</label>
              <input type="text" placeholder="Telefono" id="telefono" class="form-control contact-control" name="telefono" required data-error="Por favor complete el telefono">
              <div class="help-block with-errors"></div>
            </div>
			
            <div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="direccion" class="sr-only">Direccion</label>
              <input type="text" placeholder="Direccion" id="direccion" class="form-control contact-control" name="Direccion" required data-error="Por favor complete la direccion">
              <div class="help-block with-errors"></div>
            </div>
			
			<div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="ubicacion" class="sr-only">Ubicacion</label>
              <input type="text" placeholder="Ubicacion" id="ubicacion" class="form-control contact-control" name="ubicacion" required data-error="Por favor complete la ubicacion">
              <div class="help-block with-errors"></div>
            </div>
			
            <button class="btn btn-common btn-lg wow bounceInUp" data-wow-delay="0.8s" type="submit" id="form-submit"><i class="fa fa-send"></i> Publicar</button>
            <div id="msgSubmit" class="h3 text-center hidden"></div>
            <div class="clearfix"></div>
          </form>
        </div>
      </div>
    </div>
  </section>
  <!-- Contact Section End -->

  <!-- Contact Section -->
  <section class="animated-progress-area mt-50 contact-form-section section-padding">
    <div class="container">
      <div class="single-accordion-set wow fadeIn"  data-wow-delay="0.9s">
	  <div id="accordionFullWidth" class="mt-50" role="tablist" aria-multiselectable="true">
                <!-- Single Panel -->
                 <div class="panel panel-default">
                  <div class="panel-heading" role="tab" id="headingOneFull">
                    <h4 class="panel-title">
                      <a data-toggle="collapse" data-parent="#accordionFullWidth" href="#collapseOneFull" aria-expanded="true" aria-controls="collapseOneFull">
                        Publicar una mascota
                      </a>
                    </h4>
                  </div>
                  <div id="collapseOneFull"  role="tabpanel" aria-labelledby="headingOneFull">
                    <div class="panel-body clearfix">
        <div class="col-md-7 col-md-offset-1 contact-form contact-info-section">
		<h4>Tipo:</h4>
          <form class="shake" role="form" method="post" id="contactForm" name="contact-form" data-toggle="validator">
            <div class="form-group wow slideInRight" data-wow-delay="0.3s">
              <label for="animal" class="sr-only">Animal</label>
              <input type="text" placeholder="Animal" id="animal" class="form-control contact-control" name="animal" required data-error="Por favor complete el tipo de animal">
              <div class="help-block with-errors"></div>
            </div>
			<h4>Datos de la Mascota:</h4>
            <div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="nombre" class="sr-only">Nombre</label>
              <input type="text" placeholder="Nombre" id="nombre" class="form-control contact-control" name="nombre" required data-error="Por favor complete el nombre">
              <div class="help-block with-errors"></div>
            </div>

            <div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="edad" class="sr-only">Edad</label>
              <input type="text" placeholder="Edad" id="edad" class="form-control contact-control" name="edad" required data-error="Por favor complete la edad">
              <div class="help-block with-errors"></div>
            </div>

            <div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="sexo" class="sr-only">Sexo</label>
              <input type="text" placeholder="Hembra o Macho" id="sexo" class="form-control contact-control" name="sexo" required data-error="Por favor complete el sexo">
              <div class="help-block with-errors"></div>
            </div>
			
			<div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="ubicacion" class="sr-only">Ubicacion</label>
              <input type="text" placeholder="Ubicacion" id="ubicacion" class="form-control contact-control" name="ubicacion" required data-error="Por favor complete la ubicacion">
              <div class="help-block with-errors"></div>
            </div>
			
			<h4>Caracteristicas de la Mascota:</h4>
			<div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="raza" class="sr-only">Raza</label>
              <input type="text" placeholder="Raza" id="raza" class="form-control contact-control" name="raza" required data-error="Por favor complete la raza">
              <div class="help-block with-errors"></div>
            </div>
			
			<div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="tamano" class="sr-only">Tamano</label>
              <input type="text" placeholder="Tamano: Chico, Mediano o Grande" id="tamano" class="form-control contact-control" name="tamano" required data-error="Por favor complete el tamano">
              <div class="help-block with-errors"></div>
            </div>

			<div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="castrado" class="sr-only">Castrado</label>
              <input type="text" placeholder="Castrado: SI o NO" id="tamano" class="form-control contact-control" name="castrado" required data-error="Por favor complete si esta castrado">
              <div class="help-block with-errors"></div>
            </div>
			
			<div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="vacunado" class="sr-only">Vacunado</label>
              <input type="text" placeholder="Vacunado: SI o NO" id="vacunado" class="form-control contact-control" name="vacunado" required data-error="Por favor complete si esta vacunado">
              <div class="help-block with-errors"></div>
            </div>
			
			<h4>Fotos de la Mascota:</h4>
			
			<div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="foto1" class="sr-only">Foto1</label>
              <input type="file" id="nombre" class="form-control" name="foto1" >
              <div class="help-block with-errors"></div>
            </div>
			<div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="foto2" class="sr-only">Foto2</label>
              <input type="file" id="nombre" class="form-control" name="foto2" >
              <div class="help-block with-errors"></div>
            </div>
			<div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="foto3" class="sr-only">Foto3</label>
              <input type="file" id="nombre" class="form-control" name="foto3" >
              <div class="help-block with-errors"></div>
            </div>
			<div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="foto4" class="sr-only">Foto4</label>
              <input type="file" id="nombre" class="form-control" name="foto4" >
              <div class="help-block with-errors"></div>
            </div>
			<div class="form-group wow slideInRight" data-wow-delay="0.5s">
              <label for="foto5" class="sr-only">Foto5</label>
              <input type="file" id="nombre" class="form-control" name="foto5" >
              <div class="help-block with-errors"></div>
            </div>
			
            <button class="btn btn-common btn-lg wow bounceInUp" data-wow-delay="0.8s" type="submit" id="form-submit"><i class="fa fa-send"></i> Publicar</button>
            <div id="msgSubmit" class="h3 text-center hidden"></div>
            <div class="clearfix"></div>
          </form>
		  </div>                
                 </div>
			</div>
            </div>
        </div>
      </div>
    </div>
  </section>
    <!-- Featured Section Ends -->
    <jsp:include page="../common/footer.jsp" />
  </body>
</html>