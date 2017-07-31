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
<!--               <h2>Cuidados de la Mascota</h2> -->
				<img alt="cuida tu mascotas" width="31%" height="35%" align="middle" src="<spring:url value="/resources/img/cuida_tu_mascota.png"/>">
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
            <article class="blog-post-wrapper wow fadeIn">
              <!-- Post Content -->
              <section class="blog-post-content">
                <div>
                  <h2 class="blog-post-title"><a href="#">Cuidados de los Perros</a></h2>
                </div>
                <div class="blog-post">
                                  <p><strong><u>Guía de cuidados: 6 a 10 semanas:</u></strong></p>
				  <p>Examen físico inicial: Examen de las heces y las primeras vacunas básicas: Moquillo, Hepatitis, Parainfluenza, Parvovirus (DHPP)
				  <BR>
				  Esquema de vacunación: Bordetella (Complejo de Tos Canina), Enfermedad de Lyme, Coronavirus, Leptospirosis
				  <BR>
				  Importante: Trata de limitar la exposición en lugares públicos y con otros perros hasta que se complete el esquema de vacunas básicas de 16 semanas.
				  <BR>
				  Consulta con tu veterinario: Debes estar preparado para dar la historia de tu cachorro (fecha de nacimiento, cualquier vacuna que ya haya recibido).
				  Consulta sobre las vacunas básicas y no básicas a tu veterinario y establezcan juntos el esquema de vacunación (las vacunas básicas son aquellas requeridas por la ley; mientras que las vacunas no básicas son opcionales dependiendo de la recomendación de tu veterinario y estilo de vida de tu mascota)
				  Consulta sobre las opciones de esterilización a tu veterinario y programa el procedimiento si es posible.</p>	
				  
				  <p><strong><u>Guía de cuidados: 10 a 12 semanas:</u></strong></p>
				  <p>Esquema de vacunación: Segunda vacunación /refuerzos de DHPP, Vacuna contra la rabia.
				  <BR>
				  Consulta con tu veterinario: Habla con tu veterinario sobre los programas de prevención del gusano del corazón y de prevención de pulgas.
				  o	Le estarán saliendo los dientes al cachorro y puede estar masticando artículos inapropiados. Dale a cambio un juguete masticable seguro. Dile a tu veterinario que te indique cómo cepillar los dientes de tu cachorro.</p>	
				  
				  <p><strong><u>Guía de cuidados: 14 a 16 semanas:</u></strong></p>
				  <p>Esquema de vacunación: Tercera vacunación /refuerzo para DHPP. Vacuna contra la rabia, si no se ha aplicado antes 
				  
				  <p><strong><u>Aseo e higiene:</u></strong></p>
				  <p>Podrás bañar a tu cachorro una vez completado el calendario de vacunas, es decir, al menos durante los primeros 6 meses de vida, los baños deberán ser en SECO, con productos especiales como espumas y talcos, que su veterinario recomendará. 
					<BR>
					Una vez terminado el calendario, y si tu cachorro está en condiciones de recibir un baño tradicional, podrás bañarlo con agua tibia y usando sólo shampoo para perros, los de humanos pueden tener componentes que provoquen alergias. Al finalizar, enjuagar y secarlo muy bien. 
					<BR>
					Los baños deben ser con agua tibia, cada 15 o 21 días, no debe ser más seguido, pues se corre el riesgo que la piel del perro pierda su protección natural. 
					<BR>	
					Los perros con pliegues en la piel requieren de aseo especial para evitar hongos. 
					<BR>
					Los Perros con orejas largas y caídas, necesitan un buen secado tras el baño, para evitar una otitis.</p>

					<p><strong><u>El Cepillado:</u></strong></p>
				  <p>Cepillar a tu mascota al menos una vez a la semana, te ayudará a eliminar el pelo muerto y mantener un pelaje sano y bello. Acostúmbralo desde cachorro, y de esa forma te será más fácil hacerlo cuando se convierta en adulto.  
					<BR>
					Las razas de pelo corto requieren cuidado semanal con un cepillo de cerdas naturales, una rascadera de goma o un mitón. 
					<BR>
					Las razas de pelo largo, requieren cepillado diario, y será necesario contar con peines con dientes de metal o especiales 
					<BR>	
					Nota: Si tu perro tiene las uñas negras, prefiere el corte de uñas profesional, para evitar sangramiento.</p>
                </div>

              </section>
            </article>
            <!-- Slider Post -->
            <article class="blog-post-wrapper format-slider wow fadeIn">
              <!-- Author Info -->
				<!-- Featured Content -->
             
              <!-- Post Content -->
              <section class="blog-post-content">
                <div>
                  <h2 class="blog-post-title"><a href="#">Cuidados de los Gatos</a></h2>
                </div>
                <div class="blog-post">
                   <p><strong><u>Bandeja sanitaria:</u></strong></p>
				  <p>Debe estar alejada del lugar donde come y bebe. En ella se colocarán las piedritas sanitarias que se consiguen en veterinarias y supermercados. 
				  Los gatos son extremadamente pulcros y aprenden a usar su "baño particular" muy pronto, pero hay que cambiar las piedritas con frecuencia para evitar el mal olor</p>
				  
				  <p><strong><u>Comida seca para gatos:</u></strong></p>
				  <p>Las dietas a base de comida seca son fáciles de utilizar y medir, y tienen una vida útil más larga una vez abierto el envase que las de comida húmeda.
				  <BR> 
				  Estos productos también ayudan a mantener la salud bucal de tu gato. Tu gato necesitará más esfuerzo para masticar los alimentos secos y tardará más tiempo en comer.
				  <BR>
				  Hay gatos que prefieren la comida seca crujiente y no les gusta que esté mezclada con agua</p>
				  
				  <p><strong><u>Comida húmeda para gato:</u></strong></p>
				  <p>Otros gatos simplemente prefieren el sabor y la textura de los alimentos húmedos. Los alimentos húmedos resultan muy útiles, pues, como se sirven en pequeñas bandejas o bolsitas, siempre se mantendrán frescos y son muy fáciles de servir.
				  <BR> 
				  Además, tu gato comerá más de una sola vez y beberá menos.
				  <BR>
				  Algunos dueños ofrecen a sus gatos una mezcla de alimentos húmedos y secos. Algunos gatos prefieren los alimentos húmedos por la mañana y los secos durante el resto del día. Prueba con ambos tipos para comprobar cuál es el preferido de tu gato.</p>
				  
				  <p><strong><u>Alimentacion para gatos adultos:</u></strong></p>
				  <p>Si tu gato pasa la mayor parte del tiempo dentro de casa, lo más indicado será una receta especial para gatos domésticos para reducir las bolas de pelo o una dieta baja en calorías, ya que hará menos ejercicio y será más propenso a ganar peso.
				  <BR> 
				  Si tu gato está esterilizado, también existen productos indicados para él, para prevenir problemas en el tracto urinario.
				  <BR>
				  Los gatos de edad avanzada deben seguir una dieta ajustada, al igual que las gatas gestación y los gatos con sobrepeso u obesidad.
				  <BR>
				  Si tu gato presenta necesidades nutricionales específicas o te preocupa algún aspecto relativo a su dieta, consúltalo con el veterinario.</p>
				  
                </div>
              </section>
              <!-- Footer -->
             </article>
		</section>

	<!-- Featured Section Ends -->
    <jsp:include page="../common/footer.jsp" />
  </body>
</html>