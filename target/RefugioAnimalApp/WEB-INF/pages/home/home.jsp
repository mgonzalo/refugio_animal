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


    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
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
	 HEADERWRAP
	 ***************************************************************************************************************** -->
	<div id="headerwrap">
	    <div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 himg">
					<div id="myCarousel" class="carousel slide" data-ride="carousel">
					  <!-- Indicators -->
					  <ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel" data-slide-to="1"></li>
						<li data-target="#myCarousel" data-slide-to="2"></li>
					  </ol>

					  <!-- Wrapper for slides -->
					  <div class="carousel-inner">
						<div class="item active">
						  <img src="<spring:url value="/resources/img/Perros.jpg"/>" alt="Perros">
						</div>

						<div class="item">
						  <img src="<spring:url value="/resources/img/Gatos.jpg"/>" alt="Gatos">
						</div>

						<div class="item">
						  <img src="<spring:url value="/resources/img/Todos.jpg"/>" alt="Hamster">
						</div>
					  </div>

					  <!-- Left and right controls -->
					  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
						<span class="glyphicon glyphicon-chevron-left"></span>
						<span class="sr-only">Previous</span>
					  </a>
					  <a class="right carousel-control" href="#myCarousel" data-slide="next">
						<span class="glyphicon glyphicon-chevron-right"></span>
						<span class="sr-only">Next</span>
					  </a>
					</div>
				</div>
				<div class="col-lg-8 col-lg-offset-2">
					<h1>Adopta a tu proxima mascota!!</h1>
			        <p><br/><a href="blog.html" class="btn btn-default btn-lg">ADOPTAME</a></p>
				</div>
			</div><!-- /row -->
	    </div> <!-- /container -->
	</div><!-- /headerwrap -->
	 
	<!-- *****************************************************************************************************************
	 PORTFOLIO SECTION
	 ***************************************************************************************************************** -->
	 <div id="portfoliowrap">
        <h3>ULTIMOS PERROS PUBLICADOS</h3>
        <div class="portfolio-centered">
            <div class="recentitems portfolio">
				<div class="portfolio-item graphic-design">
					<div class="he-wrap tpl6">
					<img src="assets/img/portfolio/portfolio_09.jpg" alt="">
						<div class="he-view">
							<div class="bg a0" data-animate="fadeIn">
                                <h3 class="a1" data-animate="fadeInDown">A Graphic Design Item</h3>
                                <a data-rel="prettyPhoto" href="assets/img/portfolio/portfolio_09.jpg" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-search"></i></a>
                                <a href="single-project.html" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-link"></i></a>
                        	</div><!-- he bg -->
						</div><!-- he view -->		
					</div><!-- he wrap -->
				</div><!-- end col-12 -->
                            
                <div class="portfolio-item web-design">
                    <div class="he-wrap tpl6">
					<img src="assets/img/portfolio/portfolio_02.jpg" alt="">
						<div class="he-view">
							<div class="bg a0" data-animate="fadeIn">
                                <h3 class="a1" data-animate="fadeInDown">A Web Design Item</h3>
                                <a data-rel="prettyPhoto" href="assets/img/portfolio/portfolio_02.jpg" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-search"></i></a>
                                <a href="single-project.html" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-link"></i></a>
                        	</div><!-- he bg -->
						</div><!-- he view -->		
					</div><!-- he wrap -->
				</div><!-- end col-12 -->
        
                <div class="portfolio-item graphic-design">
                    <div class="he-wrap tpl6">
					<img src="assets/img/portfolio/portfolio_03.jpg" alt="">
						<div class="he-view">
							<div class="bg a0" data-animate="fadeIn">
                                <h3 class="a1" data-animate="fadeInDown">A Graphic Design Item</h3>
                                <a data-rel="prettyPhoto" href="assets/img/portfolio/portfolio_03.jpg" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-search"></i></a>
                                <a href="single-project.html" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-link"></i></a>
                        	</div><!-- he bg -->
						</div><!-- he view -->		
					</div><!-- he wrap -->
				</div><!-- end col-12 -->
        
                <div class="portfolio-item graphic-design">
                    <div class="he-wrap tpl6">
					<img src="assets/img/portfolio/portfolio_04.jpg" alt="">
						<div class="he-view">
							<div class="bg a0" data-animate="fadeIn">
                                <h3 class="a1" data-animate="fadeInDown">A Graphic Design Item</h3>
                                <a data-rel="prettyPhoto" href="assets/img/portfolio/portfolio_04.jpg" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-search"></i></a>
                                <a href="single-project.html" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-link"></i></a>
                        	</div><!-- he bg -->
						</div><!-- he view -->		
					</div><!-- he wrap -->
				</div><!-- end col-12 -->
                                        
                <div class="portfolio-item books">
                    <div class="he-wrap tpl6">
					<img src="assets/img/portfolio/portfolio_05.jpg" alt="">
						<div class="he-view">
							<div class="bg a0" data-animate="fadeIn">
                                <h3 class="a1" data-animate="fadeInDown">A Book Design Item</h3>
                                <a data-rel="prettyPhoto" href="assets/img/portfolio/portfolio_05.jpg" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-search"></i></a>
                                <a href="single-project.html" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-link"></i></a>
                        	</div><!-- he bg -->
						</div><!-- he view -->		
					</div><!-- he wrap -->
				</div><!-- end col-12 -->
            </div><!-- portfolio -->
        </div><!-- portfolio container -->
	 </div><!--/Portfoliowrap -->				
<!-- *****************************************************************************************************************
	 PORTFOLIO SECTION
	 ***************************************************************************************************************** -->
	 <div id="portfoliowrap">
        <h3>ULTIMOS GATOS PUBLICADOS</h3>
                                        
        <div class="portfolio-centered">
            <div class="recentitems portfolio">
				<div class="portfolio-item graphic-design">
					<div class="he-wrap tpl6">
					<img src="assets/img/portfolio/portfolio_06.jpg" alt="">
						<div class="he-view">
							<div class="bg a0" data-animate="fadeIn">
                                <h3 class="a1" data-animate="fadeInDown">A Graphic Design Item</h3>
                                <a data-rel="prettyPhoto" href="assets/img/portfolio/portfolio_06.jpg" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-search"></i></a>
                                <a href="single-project.html" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-link"></i></a>
                        	</div><!-- he bg -->
						</div><!-- he view -->		
					</div><!-- he wrap -->
				</div><!-- end col-12 -->
                    
                <div class="portfolio-item books">
                    <div class="he-wrap tpl6">
					<img src="assets/img/portfolio/portfolio_07.jpg" alt="">
						<div class="he-view">
							<div class="bg a0" data-animate="fadeIn">
                                <h3 class="a1" data-animate="fadeInDown">A Book Design Item</h3>
                                <a data-rel="prettyPhoto" href="assets/img/portfolio/portfolio_07.jpg" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-search"></i></a>
                                <a href="single-project.html" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-link"></i></a>
                        	</div><!-- he bg -->
						</div><!-- he view -->		
					</div><!-- he wrap -->
				</div><!-- end col-12 -->
                    
                <div class="portfolio-item graphic-design">
                    <div class="he-wrap tpl6">
					<img src="assets/img/portfolio/portfolio_08.jpg" alt="">
						<div class="he-view">
							<div class="bg a0" data-animate="fadeIn">
                                <h3 class="a1" data-animate="fadeInDown">A Graphic Design Item</h3>
                                <a data-rel="prettyPhoto" href="assets/img/portfolio/portfolio_08.jpg" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-search"></i></a>
                                <a href="single-project.html" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-link"></i></a>
                        	</div><!-- he bg -->
						</div><!-- he view -->		
					</div><!-- he wrap -->
				</div><!-- end col-12 -->
                                        
                <div class="portfolio-item web-design">
                    <div class="he-wrap tpl6">
					<img src="assets/img/portfolio/portfolio_01.jpg" alt="">
						<div class="he-view">
							<div class="bg a0" data-animate="fadeIn">
                                <h3 class="a1" data-animate="fadeInDown">A Web Design Item</h3>
                                <a data-rel="prettyPhoto" href="assets/img/portfolio/portfolio_01.jpg" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-search"></i></a>
                                <a href="single-project.html" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-link"></i></a>
                        	</div><!-- he bg -->
						</div><!-- he view -->		
					</div><!-- he wrap -->
				</div><!-- end col-12 -->
    
			<div class="portfolio-item books">
                <div class="he-wrap tpl6">
					<img src="assets/img/portfolio/portfolio_10.jpg" alt="">
						<div class="he-view">
							<div class="bg a0" data-animate="fadeIn">
                                <h3 class="a1" data-animate="fadeInDown">A Book Design Item</h3>
                                <a data-rel="prettyPhoto" href="assets/img/portfolio/portfolio_10.jpg" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-search"></i></a>
                                <a href="single-project.html" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-link"></i></a>
                        	</div><!-- he bg -->
						</div><!-- he view -->		
					</div><!-- he wrap -->
				</div><!-- end col-12 -->
                    
            </div><!-- portfolio -->
        </div><!-- portfolio container -->
	 </div><!--/Portfoliowrap -->
	 
	<!-- *****************************************************************************************************************
	 PORTFOLIO SECTION
	 ***************************************************************************************************************** -->
	 <div id="portfoliowrap">
        <h3>ULTIMOS ANIMALES PUBLICADOS</h3>

        <div class="portfolio-centered">
            <div class="recentitems portfolio">
				<div class="portfolio-item graphic-design">
					<div class="he-wrap tpl6">
					<img src="assets/img/portfolio/portfolio_09.jpg" alt="">
						<div class="he-view">
							<div class="bg a0" data-animate="fadeIn">
                                <h3 class="a1" data-animate="fadeInDown">A Graphic Design Item</h3>
                                <a data-rel="prettyPhoto" href="assets/img/portfolio/portfolio_09.jpg" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-search"></i></a>
                                <a href="single-project.html" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-link"></i></a>
                        	</div><!-- he bg -->
						</div><!-- he view -->		
					</div><!-- he wrap -->
				</div><!-- end col-12 -->
                            
                <div class="portfolio-item web-design">
                    <div class="he-wrap tpl6">
					<img src="assets/img/portfolio/portfolio_02.jpg" alt="">
						<div class="he-view">
							<div class="bg a0" data-animate="fadeIn">
                                <h3 class="a1" data-animate="fadeInDown">A Web Design Item</h3>
                                <a data-rel="prettyPhoto" href="assets/img/portfolio/portfolio_02.jpg" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-search"></i></a>
                                <a href="single-project.html" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-link"></i></a>
                        	</div><!-- he bg -->
						</div><!-- he view -->		
					</div><!-- he wrap -->
				</div><!-- end col-12 -->
        
                <div class="portfolio-item graphic-design">
                    <div class="he-wrap tpl6">
					<img src="assets/img/portfolio/portfolio_03.jpg" alt="">
						<div class="he-view">
							<div class="bg a0" data-animate="fadeIn">
                                <h3 class="a1" data-animate="fadeInDown">A Graphic Design Item</h3>
                                <a data-rel="prettyPhoto" href="assets/img/portfolio/portfolio_03.jpg" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-search"></i></a>
                                <a href="single-project.html" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-link"></i></a>
                        	</div><!-- he bg -->
						</div><!-- he view -->		
					</div><!-- he wrap -->
				</div><!-- end col-12 -->
        
                <div class="portfolio-item graphic-design">
                    <div class="he-wrap tpl6">
					<img src="assets/img/portfolio/portfolio_04.jpg" alt="">
						<div class="he-view">
							<div class="bg a0" data-animate="fadeIn">
                                <h3 class="a1" data-animate="fadeInDown">A Graphic Design Item</h3>
                                <a data-rel="prettyPhoto" href="assets/img/portfolio/portfolio_04.jpg" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-search"></i></a>
                                <a href="single-project.html" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-link"></i></a>
                        	</div><!-- he bg -->
						</div><!-- he view -->		
					</div><!-- he wrap -->
				</div><!-- end col-12 -->
                                        
                <div class="portfolio-item books">
                    <div class="he-wrap tpl6">
					<img src="assets/img/portfolio/portfolio_05.jpg" alt="">
						<div class="he-view">
							<div class="bg a0" data-animate="fadeIn">
                                <h3 class="a1" data-animate="fadeInDown">A Book Design Item</h3>
                                <a data-rel="prettyPhoto" href="assets/img/portfolio/portfolio_05.jpg" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-search"></i></a>
                                <a href="single-project.html" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-link"></i></a>
                        	</div><!-- he bg -->
						</div><!-- he view -->		
					</div><!-- he wrap -->
				</div><!-- end col-12 -->
            </div><!-- portfolio -->
        </div><!-- portfolio container -->
	 </div><!--/Portfoliowrap -->		 
	<!-- *****************************************************************************************************************
	 MIDDLE CONTENT
	 ***************************************************************************************************************** -->

	 <div class="container mtb">
	 	<div class="row">
	 		<div class="col-lg-4 col-lg-offset-1">
		 		<h4>Eventos</h4>
		 		<p>Aca van a ir los ultimos eventos que organiza el gobierno de la ciudad para el cuidado de las mascotas </p>
 				<p><br/><a href="about.html" class="btn btn-theme">Eventos</a></p>
	 		</div>
	 	</div>
	 </div>
	 
	 
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
		 			<h4>Redes Sociales</h4>
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


    <script>
// Portfolio
(function($) {
	"use strict";
	var $container = $('.portfolio'),
		$items = $container.find('.portfolio-item'),
		portfolioLayout = 'fitRows';
		
		if( $container.hasClass('portfolio-centered') ) {
			portfolioLayout = 'masonry';
		}
				
		$container.isotope({
			filter: '*',
			animationEngine: 'best-available',
			layoutMode: portfolioLayout,
			animationOptions: {
			duration: 750,
			easing: 'linear',
			queue: false
		},
		masonry: {
		}
		}, refreshWaypoints());
		
		function refreshWaypoints() {
			setTimeout(function() {
			}, 1000);   
		}
				
		$('nav.portfolio-filter ul a').on('click', function() {
				var selector = $(this).attr('data-filter');
				$container.isotope({ filter: selector }, refreshWaypoints());
				$('nav.portfolio-filter ul a').removeClass('active');
				$(this).addClass('active');
				return false;
		});
		
		function getColumnNumber() { 
			var winWidth = $(window).width(), 
			columnNumber = 1;
		
			if (winWidth > 1200) {
				columnNumber = 5;
			} else if (winWidth > 950) {
				columnNumber = 4;
			} else if (winWidth > 600) {
				columnNumber = 3;
			} else if (winWidth > 400) {
				columnNumber = 2;
			} else if (winWidth > 250) {
				columnNumber = 1;
			}
				return columnNumber;
			}       
			
			function setColumns() {
				var winWidth = $(window).width(), 
				columnNumber = getColumnNumber(), 
				itemWidth = Math.floor(winWidth / columnNumber);
				
				$container.find('.portfolio-item').each(function() { 
					$(this).css( { 
					width : itemWidth + 'px' 
				});
			});
		}
		
		function setPortfolio() { 
			setColumns();
			$container.isotope('reLayout');
		}
			
		$container.imagesLoaded(function () { 
			setPortfolio();
		});
		
		$(window).on('resize', function () { 
		setPortfolio();          
	});
})(jQuery);
</script>
  </body>
</html>