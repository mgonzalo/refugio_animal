<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<meta name="description"
	content="RefugioAnimal, es una aplicacion para publicar o adptar mascotas, contactarte con refugios o veterinarios, realizar donaciones y aprender mas cobre como cuidar a tu mascota.">
<meta name="title"
	content="Refugio Animal Argentina - no compres, adopta!" />
<meta name="author" content="RefugioAnimal.org" />
<link rel="shortcut icon"
	href="<spring:url value="/resources/img/favicon.ico"/>">
<title>Refugio Animal Argentina - no compres, adopta!.</title>
<!-- Bootstrap -->
<link rel="stylesheet" type="text/css"
	href="<spring:url value="/resources/css/bootstrap.min.css"/>" />
<!-- Main Style -->
<link rel="stylesheet" type="text/css"
	href="<spring:url value="/resources/css/main.css"/>" />
<!-- Slicknav Css -->
<link rel="stylesheet" type="text/css"
	href="<spring:url value="/resources/css/slicknav.css"/>" />

<!-- Responsive Style -->
<link rel="stylesheet" type="text/css"
	href="<spring:url value="/resources/css/responsive.css"/>" />
<!--Fonts-->
<link rel="stylesheet" media="screen"
	href="<spring:url value="/resources/fonts/font-awesome.min.css"/>" />
<link rel="stylesheet" media="screen"
	href="<spring:url value="/resources/fonts/simple-line-icons.css"/>" />

<!-- Extras -->
<link rel="stylesheet" type="text/css"
	href="<spring:url value="/resources/css/owl.carousel.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<spring:url value="/resources/css/owl.theme.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<spring:url value="/resources/css/animate.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<spring:url value="/resources/css/normalize.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<spring:url value="/resources/css/settings.css"/>" />

<!-- Color CSS Styles  -->
<link rel="stylesheet" type="text/css"
	href="<spring:url value="/resources/css/green.css"/>" media="screen" />
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
	<header id="header-wrap"> <jsp:include
		page="../common/header.jsp" /> </header>
	<!-- Header-wrap Section End -->

	<!-- Page Header -->
	<div class="page-header-section">
		<div class="container">
			<div class="row">
				<div class="page-header-area">
					<div class="page-header-content">
						<h2>Buscar Mascotas</h2>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Page Header End -->
	<!-- Contact Section -->
	<section
		class="animated-progress-area mt-50 contact-form-section section-padding">
	<div class="container">
		<div class="row">
			<div class="col-md-12 mb-50 text-center contact-title-text">
				<h2>Busca tu proxima mascota!!</h2>
				<p>Busca tu proxima mascota, utilizando los siguientes filtros:</p>
			</div>
			<spring:url value="/pets/doSearch" var="searchActionUrl" />
			<form:form class="shake" role="form" action="${searchActionUrl}"
				modelAttribute="searchDTO" method="post" id="searchfrom"
				name="searchfrom">
				<div class="row">
					<div class="col-xs-8 col-md-4">
						<div class="form-group">
							<h6>Tipo de Mascota</h6>
							<form:select path="petType" id="petType"
								class="form-control contact-control" name="petType"
								data-error="Por favor seleccione el tipo de mascota">
								<form:option value="0" label="Todos" selected="selected"/>
								<form:option value="1" label="Perro" />
								<form:option value="2" label="Gato" />
								<form:option value="3" label="Conejo" />
								<form:option value="4" label="Paloma" />
							</form:select>
						</div>
					</div>
					<div class="col-xs-8 col-md-4">
						<div class="form-group">
							<h6>Tamaño</h6>
							<form:select path="sizeType" id="sizeType"
								class="form-control contact-control" name="sizeType"
								data-error="Por favor seleccione el tamaño de la mascota">
								<form:option value="0" label="Todos" selected="selected"/>
								<form:option value="1" label="Pequeño" />
								<form:option value="2" label="Mediano" />
								<form:option value="3" label="Grande" />
								<form:option value="4" label="Gigante" />
							</form:select>
						</div>
					</div>
					<div class="col-xs-8 col-md-4">
						<div class="form-group">
							<h6>Raza</h6>
							<form:input path="breed" type="text" id="breed"
								class="form-control contact-control" name="breed"
								data-error="Por favor complete la raza" />
						</div>
					</div>
					<div class="col-xs-8 col-md-4">
						<div class="form-group">
							<h6>Edad</h6>
							<form:input path="age" type="text" id="age"
								class="form-control contact-control" name="age"
								data-error="Por favor complete la edad" />
						</div>
					</div>
					<div class="col-xs-8 col-md-4">
						<div class="form-group">
							<h6>Provincia</h6>
							<form:select path="provinceId" id="provinceId"
								class="form-control contact-control" name="provinceId"
								data-error="Por favor seleccione seleccione la provincia">
								<form:option value="0" label="Todos" selected="selected"/>
								<form:option value="1" label="Buenos Aires" />
								<form:option value="2" label="Buenos Aires - GBA" />
								<form:option value="3" label="Capital Federal" />
								<form:option value="4" label="Catamarca" />
							</form:select>
						</div>
					</div>
					<div class="col-xs-8 col-md-4">
						<div class="form-group">
							<h6>Localidad</h6>
							<form:select path="locationId" id="locationId"
								class="form-control contact-control" name="locationId"
								data-error="Por favor seleccione seleccione la localidad">
								<form:option value="0" label="Todos" selected="selected"/>
								<form:option value="1" label="25 de Mayo" />
								<form:option value="2" label="3 de febrero" />
								<form:option value="3" label="A. Alsina" />
								<form:option value="4" label="A. Gonzáles Cháves" />
							</form:select>
						</div>
					</div>
					<div class="col-xs-8 col-md-3">
						<div class="form-group">
							<h6>Sexo:</h6>
							<span><form:radiobutton path="sex" id="sex" name="sex"
									itemValue="H" label="Hembra" /> <form:radiobutton path="sex"
									id="sex" name="sex" itemValue="M" label="Macho" /> </span>
						</div>
					</div>
					<div class="col-xs-8 col-md-3">
						<div class="form-group">
							<h6>Castrado:</h6>
							<span><form:checkbox path="castrated" id="castrated"
									label="" name="castrated" /></span>
						</div>
					</div>
					<div class="col-xs-8 col-md-3">
						<div class="form-group">
							<h6>Vacunado:</h6>
							<span><form:checkbox path="vaccinate" id="vaccinate"
									label="" name="vaccinate" /></span>
						</div>
					</div>

				</div>
				<div
					class="col-md-7 col-md-offset-1 contact-form contact-info-section">
					<button class="btn btn-common btn-lg" type="submit"
						id="form-submit">
						<i class="fa fa-search"></i>Buscar
					</button>
				</div>
			</form:form>
		</div>
	</div>
	</section>
	<!-- Contact Section End -->

	<!-- Classic Blog Section -->
	<section
		class="animated-progress-area mt-50 contact-form-section section-padding">
	<div class="container">
	 <c:choose>
 	        <c:when test="${results.size() > 0}">
 	        	<h4 class="blog-post-title">Resultados</h4>
				<div class="row">
					<!-- BLog Article Section -->
					<div class="col-md-9">
					<c:forEach items="${results}" var="resultPetsSearch">
						<!-- Single Blog Post -->
						<article class="blog-post-wrapper wow fadeIn"> <!-- Post Content -->
						<section class="blog-post-content">
							<div>
								<a href="<spring:url value="/pets/${resultPetsSearch.petID}"/>">
									<h2 class="blog-post-title">
										<img alt="${resultPetsSearch.name}" src="<spring:url value="/resources/img/pets/${resultPetsSearch.petID}/${resultPetsSearch.petID}_princ.jpg"/>"/>
										Nombre Mascota ${resultPetsSearch.name} - Edad ${resultPetsSearch.age} año - Sexo ${resultPetsSearch.sex} - Raza ${resultPetsSearch.breed}
									</h2>
								</a>
							</div>
						</section> 
						</article>
					</c:forEach>
					</div>
				</div>
 	        </c:when>
 	        <c:otherwise>
 	        	<h3>No se encontraron resultados para la busqueda, revise los filtros aplicados.</h3>
 	        </c:otherwise>
 	 </c:choose>
	</div>
	</section>
	<!-- Featured Section Ends -->
	<jsp:include page="../common/footer.jsp" />
</body>
</html>