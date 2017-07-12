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
              <h2>Publicar Mascota</h2>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- Page Header End -->

  <!-- Contact Section -->
  <section class="animated-progress-area mt-50 contact-form-section section-padding">
    <div class="container">
    	<c:choose>
    		<c:when test="${resultStatus == 'CREATED'}">
    			<c:set var="className" value="alert alert-success"/>
    		</c:when>
    		<c:otherwise>
    			<c:set var="className" value="alert alert-danger"/>
    		</c:otherwise>
    	</c:choose>
      <div id="messageSave" class="${className}" style="display: ${showDiv};">
  			<strong>${resultMessaje}</strong>
	  </div>
      <div class="row">
        <div class="col-md-12 mb-50 text-center contact-title-text wow fadeIn">
          <h2>Publicar Mascota!</h2>
          <p>Para publicar, completa el siguiente formulario:</p>
        </div>
        <div class="col-md-7 col-md-offset-1 contact-form contact-info-section">
          <spring:url value="/pets/new" var="petActionUrl" />
          <form:form class="shake" role="form" action="${petActionUrl}" modelAttribute="petDTO" method="post" id="formPublish" name="formPublish" data-toggle="validator">
			<h4>Datos de la Mascota:</h4>
            <div class="form-group">
              <form:input path="name" type="text" placeholder="Nombre" id="name" class="form-control contact-control" name="name" data-error="Por favor complete el nombre"/>
              <div class="help-block with-errors"></div>
            </div>
            <div class="form-group">
<%--               <form:input path="age" type="text" placeholder="Edad" id="age" class="form-control contact-control" name="age" data-error="Por favor complete la edad"/> --%>
              <h6>Edad:</h6>
              <span>
              <form:select path="age" id="age" class="form-control contact-control">
              	<form:option value="0.1" label="1 Mes"/>
              	<form:option value="0.2" label="2 Meses"/>
              	<form:option value="0.3" label="3 Meses"/>
              	<form:option value="0.4" label="4 Meses"/>
              	<form:option value="0.5" label="5 Meses"/>
              	<form:option value="0.6" label="6 Meses"/>
              	<form:option value="0.7" label="7 Meses"/>
              	<form:option value="0.8" label="8 Meses"/>
              	<form:option value="0.9" label="9 Meses"/>
              	<form:option value="0.10" label="10 Meses"/>
              	<form:option value="0.11" label="11 Meses"/>
              	<form:option value="1" label="1 Año"/>
              	<form:option value="2" label="2 Años"/>
				<form:option value="3" label="3 Años"/>
				<form:option value="4" label="4 Años"/>
				<form:option value="5" label="5 Años"/>
				<form:option value="6" label="6 Años"/>
				<form:option value="7" label="7 Años"/>
				<form:option value="8" label="8 Años"/>
				<form:option value="9" label="9 Años"/>
				<form:option value="10" label="10 Años"/>
				<form:option value="11" label="11 Años"/>
				<form:option value="12" label="12 Años"/>
				<form:option value="13" label="13 Años"/>
				<form:option value="14" label="14 Años"/>
				<form:option value="15" label="15 Años"/>
				<form:option value="16" label="16 Años"/>
				<form:option value="17" label="17 Años"/>
              </form:select>
              </span>
              <div class="help-block with-errors"></div>
            </div>
            <div class="form-group">
              <h6>Sexo:</h6>
              <span>
              <form:select path="sex" id="sex" class="form-control contact-control">
              	<form:option value="H" label="Hembra (H)"/>
              	<form:option value="M" label="Macho (M)"/>
              </form:select>
              </span>
              <div class="help-block with-errors"></div>
            </div>
			<h4>Caracteristicas de la Mascota:</h4>
			<div class="form-group">
              <h6>Especie:</h6>
              <span>
              <form:select path="specieType" id="specieType" class="form-control contact-control" name="specieType" data-error="Por favor seleccione el tipo de especie">
              	<c:forEach items="${specieTypes}" var="specie">
              		  <form:option value="${specie.id}" label="${specie.description}"/>
              	</c:forEach>
              </form:select>
              </span>
              <div class="help-block with-errors"></div>
            </div>
            <div class="form-group">
               <h6>Tipo:</h6>
               <span>
               <form:select path="petType" id="petType" class="form-control contact-control" name="petType" data-error="Por favor seleccione el tipo de mascota">
              	<form:option value="1" label="Perro"/>
              	<form:option value="2" label="Gato"/>
              	<form:option value="3" label="Conejo"/>
              	<form:option value="4" label="Paloma"/>
              </form:select>
               </span>
              <div class="help-block with-errors"></div>
            </div>
			<div class="form-group">
              <form:input path="breed" type="text" placeholder="Raza" id="breed" class="form-control contact-control" name="breed" data-error="Por favor complete la raza"/>
              <div class="help-block with-errors"></div>
            </div>
			<div class="form-group">
               <h6>Tamaño:</h6>
               <span>
              <form:select path="sizeType" id="sizeType" class="form-control contact-control" name="sizeType" data-error="Por favor seleccione el tamaño de la mascota">
              	<c:forEach items="${sizeTypes}" var="sizeType">
              		<form:option value="${sizeType.id}" label="${sizeType.description}"/>
              	</c:forEach>
              </form:select>
              </span>
              <div class="help-block with-errors"></div>
            </div>
			<div class="form-group">
              <h6>Castrado:</h6>
              <span><form:checkbox path="castrated" id="castrated" name="castrated" label="" cssStyle="form-control contact-control"/></span>
              <div class="help-block with-errors"></div>
            </div>
			<div class="form-group">
  				<h6>Vacunado:</h6>              
  				<span><form:checkbox path="vaccinate" id="vaccinate" name="vaccinate" label="" cssStyle="form-control contact-control"/></span>
              <div class="help-block with-errors"></div>
            </div>
            <div class="form-group">
              <h6>Cuidado especial:</h6>
              <span><form:checkbox path="specialCare" id="specialCare" name="specialCare" label="" cssStyle="form-control contact-control"/></span>
              <div class="help-block with-errors"></div>
            </div>
           <div class="form-group">
              <h6>Compatibilidad con otros animales:</h6>
              <span><form:checkbox path="compatibilityWithOtherAnimals" id="compatibilityWithOtherAnimals" name="compatibilityWithOtherAnimals" label="" cssStyle="form-control contact-control"/></span>	
              <div class="help-block with-errors"></div>
            </div>
            <div class="form-group">
              <form:textarea path="description" id="description" name="description" cols="100" rows="3" placeholder="Descripcion de la Mascota" cssStyle="form-control contact-control"/>
              <div class="help-block with-errors"></div>
            </div>
			<h4>Fotos de la Mascota:</h4>
			<div class="form-group">
              <h6>Foto Principal</h6>
              <span><input type="file" id="nombre" class="form-control" name="foto1"></span>
              <div class="help-block with-errors"></div>
            </div>
			<div class="form-group">
              <h6>Foto2</h6>
              <span><input type="file" id="nombre" class="form-control" name="foto2"></span>
              <div class="help-block with-errors"></div>
            </div>
			<div class="form-group">
              <h6>Foto3</h6>
              <span><input type="file" id="nombre" class="form-control" name="foto3"></span>
              <div class="help-block with-errors"></div>
            </div>

			<h4>Datos del dueño:</h4>
			<div class="form-group">
              <form:input path="userDTO.name" placeholder="Nombre y Apellido" id="user.name" class="form-control contact-control" name="user.name" data-error="Por favor complete el nombre y el Apellido"/>
              <div class="help-block with-errors"></div>
            </div>
            <div class="form-group">
               <form:input path="userDTO.docNumber" placeholder="Numero de Documento" id="user.docnumber" class="form-control contact-control" name="user.docnumber" data-error="Por favor complete el DNI"/>
              <div class="help-block with-errors"></div>
            </div>
			<div class="form-group">
              <form:input path="userDTO.email" placeholder="Email" id="user.email" class="form-control contact-control" name="user.email" data-error="Por favor complete tu Email"/>
              <div class="help-block with-errors"></div>
            </div>
			<div class="form-group">
               <form:input path="userDTO.phone" placeholder="Telefono" id="user.phone" class="form-control contact-control" name="user.phone" data-error="Por favor complete el telefono"/>
              <div class="help-block with-errors"></div>
            </div>
            <div class="form-group">
              <h6>Provincia:</h6>
			  <span><form:select path="userDTO.provinceId" id="user.provinceId" class="form-control contact-control" name="user.provinceId" data-error="Por favor seleccione seleccione la provincia">
              	<form:option value="1" label="Buenos Aires"/>
              	<form:option value="2" label="Buenos Aires - GBA"/>
              	<form:option value="3" label="Capital Federal"/>
              	<form:option value="4" label="Catamarca"/>
              </form:select>
              </span>
              <div class="help-block with-errors"></div>
            </div>
			<div class="form-group">
              <h6>Localidad:</h6>
              <span>
			  <form:select path="userDTO.locationId" id="user.locationId" class="form-control contact-control" name="user.locationId" data-error="Por favor seleccione seleccione la localidad">
              	<form:option value="1" label="25 de Mayo"/>
              	<form:option value="2" label="3 de febrero"/>
              	<form:option value="3" label="A. Alsina"/>
              	<form:option value="4" label="A. Gonzáles Cháves"/>
              </form:select>
              </span>
              <div class="help-block with-errors"></div>
            </div>
			<div class="form-group">
              <form:input path="userDTO.street" type="text" placeholder="Direccion" id="user.street" class="form-control contact-control" name="user.street" data-error="Por favor complete la ubicacion"/>
              <div class="help-block with-errors"></div>
            </div>
            <button class="btn btn-common btn-lg" type="submit" id="form-submit"><i class="fa fa-send"></i>Publicar</button>
            <div class="clearfix"></div>
          </form:form>
        </div>
      </div>
    </div>
  </section>
  <!-- Contact Section End -->

  <!-- Featured Section Ends -->
  <jsp:include page="../common/footer.jsp" />
  </body>
</html>