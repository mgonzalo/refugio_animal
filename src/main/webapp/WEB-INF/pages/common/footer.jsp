<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- Footer Section -->
    <footer>
      <!-- Container Starts -->
      <div class="container">
        <!-- Row Starts -->
        <div class="row section">
          <!-- Footer Widget Starts -->
          <div class="footer-widget col-xs-12 col-sm-6 col-md-8">
            <h3 class="small-title">Sobre Nosotros</h3>
            <c:out value="${commonData.aboutUsData.aboutUsDescription}" escapeXml="false"/>
            <div class="social-footer">
              <a href="#"><i class="fa fa-facebook icon-round"></i></a>
              <a href="#"><i class="fa fa-twitter icon-round"></i></a>
            </div>           
          </div><!-- Footer Widget Ends -->
          
         
          <!-- Footer Widget Starts -->
<!--           <div class="footer-widget col-md-3 col-xs-12 wow fadeIn" data-wow-delay=".8s"> -->
<!--             <h3 class="small-title"> -->
<!--               Suscribite -->
<!--             </h3> -->
<!--             <div class="contact-us"> -->
<!--               <p>Te llegaran las ultimas publicaciones</p> -->
<!--               <form> -->
<!--               <div class="form-group"> -->
<!--                 <input type="text" class="form-control" id="exampleInputName2" placeholder="Enter your name"> -->
<!--               </div> -->
<!--               <div class="form-group"> -->
<!--                 <input type="email" class="form-control" id="exampleInputEmail2" placeholder="Enter your email"> -->
<!--               </div> -->
<!--               <button type="submit" class="btn btn-common">Submit</button> -->
<!--             </form> -->
<!--             </div> -->
<!--           </div>Footer Widget Ends -->
        </div><!-- Row Ends -->
      </div><!-- Container Ends -->
      
      <!-- Copyright -->
      <div id="copyright">
        <div class="container">
          <div class="row">
            <div class="col-md-6 col-sm-6">
              <p class="copyright-text">
                ©2017 - RefugioAnimal.com.ar. Todos los derechos reservados.
              </p>
            </div>
          </div>
        </div>
      </div>
      <!-- Copyright  End-->
      
    </footer>
    <!-- Footer Section End-->
    
    <!-- Go To Top Link -->
    <a href="#" class="back-to-top">
      <i class="fa fa-angle-up">
      </i>
    </a> 

    <!-- JavaScript & jQuery Plugins -->
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