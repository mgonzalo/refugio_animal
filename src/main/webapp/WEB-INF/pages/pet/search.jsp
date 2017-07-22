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
	href="<spring:url value="/resources/fonts/font-awesome/font-awesome.min.css"/>" />
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
								<form:option value="0" label="Todas" selected="selected" />
								<form:options items="${petTypes}" itemValue="id" itemLabel="description"/>
							</form:select>
						</div>
					</div>
					<div class="col-xs-8 col-md-4">
						<div class="form-group">
							<h6>Tamaño</h6>
							<form:select path="sizeType" id="sizeType"
								class="form-control contact-control">
								<form:option value="0" label="Todos" selected="selected" />
								<form:options items="${sizeTypes}" itemValue="id" itemLabel="description"/>
							</form:select>
						</div>
					</div>
					<div class="col-xs-8 col-md-4">
						<div class="form-group">
							<h6>Raza</h6>
							<form:input path="breed" type="text" id="breed"
								class="form-control contact-control" name="breed"/>
						</div>
					</div>
					<div class="col-xs-8 col-md-4">
						<div class="form-group">
							<h6>Edad</h6>
							<form:select path="age" id="age"
								class="form-control contact-control">
								<form:option value="0" label="Todas" selected="selected" />
								<form:option value="0.1" label="1 Mes" />
								<form:option value="0.2" label="2 Meses" />
								<form:option value="0.3" label="3 Meses" />
								<form:option value="0.4" label="4 Meses" />
								<form:option value="0.5" label="5 Meses" />
								<form:option value="0.6" label="6 Meses" />
								<form:option value="0.7" label="7 Meses" />
								<form:option value="0.8" label="8 Meses" />
								<form:option value="0.9" label="9 Meses" />
								<form:option value="0.10" label="10 Meses" />
								<form:option value="0.11" label="11 Meses" />
								<form:option value="1" label="1 Año" />
								<form:option value="2" label="2 Años" />
								<form:option value="3" label="3 Años" />
								<form:option value="4" label="4 Años" />
								<form:option value="5" label="5 Años" />
								<form:option value="6" label="6 Años" />
								<form:option value="7" label="7 Años" />
								<form:option value="8" label="8 Años" />
								<form:option value="9" label="9 Años" />
								<form:option value="10" label="10 Años" />
								<form:option value="11" label="11 Años" />
								<form:option value="12" label="12 Años" />
								<form:option value="13" label="13 Años" />
								<form:option value="14" label="14 Años" />
								<form:option value="15" label="15 Años" />
								<form:option value="16" label="16 Años" />
								<form:option value="17" label="17 Años" />
							</form:select>
						</div>
					</div>
					<div class="col-xs-8 col-md-4">
						<div class="form-group">
							<h6>Provincia</h6>
							<form:select path="provinceId"
								id="userProvince" class="form-control contact-control">
								<form:option value="0" label="Todas" selected="selected" />
								<form:options items="${provinces}" itemValue="id" itemLabel="name"/>
							</form:select>
						</div>
					</div>
					<div class="col-xs-8 col-md-4">
						<div class="form-group">
							<h6>Localidad</h6>
							<form:select path="locationId" id="userLocation" class="form-control contact-control">
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
			<c:when test="${results != null}">
				<c:choose>
					<c:when test="${results.size() > 0}">
						<h4 class="blog-post-title">Resultados</h4>
						<div class="row">
							<!-- BLog Article Section -->
							<div class="col-md-9">
								<c:forEach items="${results}" var="resultPetsSearch">
									<!-- Single Blog Post -->
									<a href="<spring:url value="/pets/${resultPetsSearch.publicationId}"/>">
										<article class="blog-post-wrapper wow fadeIn"> <!-- Post Content -->
										<section class="blog-post-content">
										<div>
											<img alt="${resultPetsSearch.petName}"
												src="<spring:url value="/resources/img/pets/${resultPetsSearch.publicationId}/${resultPetsSearch.petName}_${resultPetsSearch.petId}_0.jpg"/>" />
											<h2 class="blog-post-title">${resultPetsSearch.petName}</h2>
										</div>
										<div class="blog-post"></div>
										<p>${resultPetsSearch.petAge}
											- ${resultPetsSearch.petSex}
											- ${resultPetsSearch.petBreed}
										</p>
										<p>${resultPetsSearch.ubicacion}</p>
										</section></article>
									</a>
								</c:forEach>
							</div>
						</div>
					</c:when>
					<c:otherwise>
						<h3>No se encontraron resultados para la busqueda, revise los
							filtros aplicados.</h3>
					</c:otherwise>
				</c:choose>
			</c:when>
		</c:choose>
	</div>
	</section>
	<!-- Featured Section Ends -->
	<jsp:include page="../common/footer.jsp" />
	
	<script type="text/javascript">
	
	$(document).ready(function() {
		$('#userProvince').change();
	});
	
	$('#userProvince').change(function() {
		<spring:url value="/users/locations" var="locationsActionUrl" />
		var idProvinceSelected = $('#userProvince').val();
		getLocationsAjax('${locationsActionUrl}',idProvinceSelected);
	});
	
	function getLocationsAjax(uri,provinceId){
		$.ajax({
			url : uri,
			data : {'provinceId':provinceId},
			dataType: 'JSON',
			type : 'GET',
			contentType: 'application/json',
			success : function(jsonData) {
				$('#userLocation').empty();
				if(jsonData.length > 0){
					$(jsonData).each(function(){
						var option = $('<option />');
						option.attr('value', this.id).text(this.locationName);
						$('#userLocation').append(option);
					});
				}else{
					$('#userLocation').append('<option value="0" selected="selected">Todas</option>');
				}
			},
			error: function (xhr, ajaxOptions, thrownError) {
		        alert(xhr.status);
		        alert(thrownError);
		    }
		});
	}
	
	</script>
	
</body>
</html>