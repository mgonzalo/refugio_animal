<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%-- <%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt'%> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="RefugioAnimal, es una aplicacion para publicar o adptar mascotas, contactarte con refugios o veterinarios, realizar donaciones y aprender mas cobre como cuidar a tu mascota.">
   	<meta name="title" content="Refugio Animal Argentina - no compres, adopta!"/>
    <meta name="author" content="RefugioAnimal.org"/>
    <link rel="shortcut icon" href="<spring:url value="/resources/img/favicon.ico"/>">

    <title>Refugio Animal Argentina - no compres, adopta!.</title>
    <!-- Bootstrap core CSS -->
    <link href="<spring:url value="/resources/css/bootstrap.css"/>" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<spring:url value="/resources/css/style.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/css/font-awesome.min.css"/>" rel="stylesheet">
  </head>
  <body>

  <!-- Fixed navbar -->
    <div class="navbar navbar-default navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
<!--           <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> -->
<!--             <span class="sr-only">Toggle navigation</span> -->
<!--             <span class="icon-bar"></span> -->
<!--             <span class="icon-bar"></span> -->
<!--             <span class="icon-bar"></span> -->
<!--           </button> -->
		  <img alt="Refugio Animal" width="50px" height="50px" style="position:absolute;" src="<spring:url value="/resources/img/logo_transparent.png"/>">
          <a class="navbar-brand" href="home.html">REFUGIO ANIMAL</a>
        </div>
        <div class="navbar-collapse collapse navbar-right">
          <ul class="nav navbar-nav">
            <li class="active"><a href="home.html">INICIO</a></li>
			<li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">MASCOTAS <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="/SearchPets">BUSCAR</a></li>
                <li><a href="/pets/publish">PUBLICAR</a></li>
				<li><a href="/AnimalCare">CUIDADOS</a></li>
              </ul>
            </li>
			<li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">VETERINARIAS/REFUGIOS<b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="/SearchVeterinaryRefuges">BUSCAR</a></li>
                <li><a href="/PublishVeterinaryRefuges">PUBLICAR</a></li>
              </ul>
            </li>
            <li><a href="/contactus">CONTACTO</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>

	<!-- *****************************************************************************************************************
	 BLUE WRAP
	 ***************************************************************************************************************** -->
	<div id="blue">
	    <div class="container">
			<div class="row">
				<h3>Publicar Mascota!</h3>
			</div><!-- /row -->
	    </div> <!-- /container -->
	</div><!-- /blue -->

	 
	 <!-- *****************************************************************************************************************
	 Publicar Veterinaria o refugio
	 ***************************************************************************************************************** -->
	
	<div class="container mtb">
	 	<div class="row">
		<h4>Publicar una mascota:</h4>
		<div class="hline"></div>
		<div class="spacing"></div>
	 		<div class="col-lg-8">
		 		<form role="form-horizontal">
					<div class="input-group">
						<span class="input-group-addon">Animal:</span>
						<input id="msg" type="text" class="form-control" name="msg" placeholder="Animal	">
					</div>
					<div class="spacing"></div>
					<div class="input-group">
						<span class="input-group-addon">Nombre:</span>
						<input id="msg" type="text" class="form-control" name="msg" placeholder="Nombre">
					</div>
					<div class="input-group">
						<span class="input-group-addon">Edad:</span>
						<input id="msg" type="text" class="form-control" name="msg" placeholder="Edad">
					</div>	
					<div class="input-group">
						<span class="input-group-addon">Sexo:</span>
						<input id="msg" type="text" class="form-control" name="msg" placeholder="Macho o Hembra">
					</div>	
					<div class="input-group">
						<span class="input-group-addon">Raza:</span>
						<input id="msg" type="text" class="form-control" name="msg" placeholder="Raza">
					</div>
					<div class="input-group">
						<span class="input-group-addon">Tamano:</span>
						<input id="msg" type="text" class="form-control" name="msg" placeholder="Tamano">
					</div>
					<div class="spacing"></div>
					<div class="input-group">
						<span class="input-group-addon">Castrado:</span>
						<input id="msg" type="text" class="form-control" name="msg" placeholder="Si o No">
					</div>
					<div class="input-group">
						<span class="input-group-addon">Vacunado:</span>
						<input id="msg" type="text" class="form-control" name="msg" placeholder="Si o No">
					</div>
					<div class="input-group">
						<span class="input-group-addon">Compatibilidad con otros animales:</span>
						<input id="msg" type="text" class="form-control" name="msg" placeholder="Si o No">
					</div>
					<div class="spacing"></div>
					<div class="input-group">
						<span class="input-group-addon">Ubicacion:</span>
						<input id="msg" type="text" class="form-control" name="msg" placeholder="Ubicacion">
					</div>
					<div class="input-group">
						<span class="input-group-addon">Telefono:</span>
						<input id="msg" type="text" class="form-control" name="msg" placeholder="Telefono">
					</div>
					<div class="spacing"></div>
	<!-- *****************************************************************************************************************
	 Prueba cargar fotos
	 ***************************************************************************************************************** -->				
					<h4>Fotos:</h4>
					<div class="input-group">
						<label class="input-group-btn">
							<span class="btn btn-primary">Examinar<input type="file" style="display: none;" multiple> </span>
						</label>
						<input type="text" class="form-control" readonly>
					</div>
					<div class="input-group">
						<label class="input-group-btn">
							<span class="btn btn-primary">Examinar<input type="file" style="display: none;" multiple> </span>
						</label>
						<input type="text" class="form-control" readonly>
					</div>
					<div class="input-group">
						<label class="input-group-btn">
							<span class="btn btn-primary">Examinar<input type="file" style="display: none;" multiple> </span>
						</label>
						<input type="text" class="form-control" readonly>
					</div>
					<div class="input-group">
						<label class="input-group-btn">
							<span class="btn btn-primary">Examinar<input type="file" style="display: none;" multiple> </span>
						</label>
						<input type="text" class="form-control" readonly>
					</div>
					<div class="input-group">
						<label class="input-group-btn">
							<span class="btn btn-primary">Examinar<input type="file" style="display: none;" multiple> </span>
						</label>
						<input type="text" class="form-control" readonly>
					</div>
	 <!-- *****************************************************************************************************************
	 Prueba cargar fotos
	 ***************************************************************************************************************** -->				
					<div class="spacing"></div>
				 
				</form>
			</div><! --/col-lg-8 -->
	 	</div><! --/row -->
	 </div><! --/container -->
	 
	<!-- *****************************************************************************************************************
	 Datos del dueño
	 ***************************************************************************************************************** -->
	
	<div class="container mtb">
	 	<div class="row">
		<h4>Datos del Dueño:</h4>
		<div class="hline"></div>
		<div class="spacing"></div>
	 		<div class="col-lg-8">
		 		<form role="form-horizontal">
					<div class="input-group">
						<span class="input-group-addon">Nombre y Apellido:</span>
						<input id="msg" type="text" class="form-control" name="msg" placeholder="Nombre y Apellido">
					</div>
					<div class="input-group">
						<span class="input-group-addon">DNI:</span>
						<input id="msg" type="text" class="form-control" name="msg" placeholder="DNI">
					</div>
					<div class="input-group">
						<span class="input-group-addon">Direccion:</span>
						<input id="msg" type="text" class="form-control" name="msg" placeholder="Direccion">
					</div>
					<div class="input-group">
						<span class="input-group-addon">Ubicacion:</span>
						<input id="msg" type="text" class="form-control" name="msg" placeholder="Ubicacion">
					</div>
					<div class="input-group">
						<span class="input-group-addon">Telefono:</span>
						<input id="msg" type="text" class="form-control" name="msg" placeholder="Telefono">
					</div>
					<div class="input-group">
						<span class="input-group-addon">Email:</span>
						<input id="msg" type="text" class="form-control" name="msg" placeholder="Email">
					</div>
					<div class="spacing"></div>
				  <button type="submit" class="btn btn-theme">Publicar</button>
				</form>
			</div><! --/col-lg-8 -->
	 	</div><! --/row -->
	 </div><! --/container -->
	 
	<!-- *****************************************************************************************************************
	 FOOTER
	 ***************************************************************************************************************** -->
	 <div id="footerwrap">
	 	<div class="container">
		 	<div class="row">
		 		<div class="col-lg-4">
		 			<h4>About</h4>
		 			<div class="hline-w"></div>
		 			<p>@AGMO 2017 V01</p>
		 		</div>
		 		<div class="col-lg-4">
		 			<h4>Social Links</h4>
		 			<div class="hline-w"></div>
		 			<p>
		 				<a href="#"><i class="fa fa-facebook"></i></a>
		 				<a href="#"><i class="fa fa-twitter"></i></a>
		 			</p>
		 		</div>
		 	</div><! --/row -->
	 	</div><! --/container -->
	 </div><! --/footerwrap -->
	 
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="<spring:url value="/resources/js/bootstrap.min.js"/>"></script>
	<script src="<spring:url value="/resources/js/retina-1.1.0.js"/>"></script>
	<script src="<spring:url value="/resources/js/jquery.hoverdir.js"/>"></script>
	<script src="<spring:url value="/resources/js/jquery.hoverex.min.js"/>"></script>
	<script src="<spring:url value="/resources/js/jquery.prettyPhoto.js"/>"></script>
  	<script src="<spring:url value="/resources/js/jquery.isotope.min.js"/>"></script>
  	<script src="<spring:url value="/resources/js/custom.js"/>"></script>


  </body>
</html>
