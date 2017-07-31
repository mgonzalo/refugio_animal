<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

	<div class="container">
        <!-- Navbar Starts -->
        <nav class="navbar navbar-toggleable-sm navbar-light">
          <!-- Brand and toggle get grouped for better mobile display -->
          <div class="navbar-header">
             <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#main-menu" aria-controls="main-menu" aria-expanded="false" aria-label="Toggle navigation"/></button>
	            <a class="navbar-brand" href="<spring:url value="/home"/>">
	              <img src="<spring:url value="/resources/img/logo.png"/>" style="width: 100%;height:auto;" alt="RefugioAnimal">
	            </a>
          </div>
          <div class="collapse navbar-collapse justify-content-end" id="main-menu">
            <ul class="navbar-nav">
              <li class="nav-item ${navHomeActive}">
                <a class="nav-link ${navHomeActive}" href="<spring:url value="/home"/>">Home <span class="sr-only">(current)</span></a>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link ${navPetActive} dropdown-toggle" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Mascotas</a>
                <div class="dropdown-menu">
                  <a class="dropdown-item" href="<spring:url value="/pets/search"/>">Buscar</a>
                  <a class="dropdown-item" href="<spring:url value="/pets/publish"/>">Publicar</a>
                  <a class="dropdown-item" href="<spring:url value="/pets/animalcare"/>">Cuidados</a>
                </div>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link ${navVeterinaryShelterActive} dropdown-toggle" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Veterinarias</a>
                <div class="dropdown-menu">
                  <a class="dropdown-item" href="<spring:url value="/veterinaryshelter/search"/>">Buscar</a>
                  <a class="dropdown-item" href="<spring:url value="/veterinaryshelter/publish"/>">Publicar</a>
                </div>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link ${navContactActive} dropdown-toggle" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Contacto</a>
                <div class="dropdown-menu">
                  <a class="dropdown-item" href="<spring:url value="/contact/contactus"/>">Contacto</a>
                </div>
              </li>
            </ul>
<!--             <form class="form-inline"> -->
<!--               <div class="top_search_con"> -->
<!--                 <input class=" mr-sm-2" type="text" placeholder="Search Here ..."> -->
<!--                 <span class="top_search_icon"><i class="icon-magnifier"></i></span> -->
<!--               </div>             -->
<!--             </form> -->
          </div>

          <!-- Mobile Menu Start -->
          <ul class="wpb-mobile-menu">
            <li>
              <a class="active" href="<spring:url value="/home"/>">Home</a>    
            </li>
            <li>
              <a href="#">Mascotas</a>
              <ul>
                <li><a href="<spring:url value="/pets/search"/>">Buscar</a></li>                     
                <li><a href="<spring:url value="/pets/publish"/>">Publicar</a></li>
                <li><a href="<spring:url value="/pets/animalcare"/>">Cuidados</a></li>    
              </ul>                        
            </li>
            <li>
              <a href="#">Veterinarias</a>
              <ul>
                <li><a href="<spring:url value="/veterinaryshelter/search"/>">Buscar</a></li>
                <li><a href="<spring:url value="/veterinaryshelter/publish"/>">Publicar</a></li>
              </ul>                        
            </li>             
            <li>
              <a href="#">Contacto</a>
              <ul>
                <li><a href="<spring:url value="/contact/contactus"/>">Contacto</a></li>
              </ul>                        
            </li>  
          </ul>
          <!-- Mobile Menu End -->

        </nav>
      </div>