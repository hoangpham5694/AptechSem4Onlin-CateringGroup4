<%-- 
    Document   : slide
    Created on : Aug 10, 2015, 8:48:06 PM
    Author     : MSI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css" type="text/css" media="screen">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css" media="screen">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/layout.css" type="text/css" media="screen">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/mybutton.css" type="text/css" media="screen">
        <script src="${pageContext.request.contextPath}/js/jquery-1.7.1.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/js/cufon-yui.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/js/cufon-replace.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/js/Dynalight_400.font.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/js/FF-cash.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/js/tms-0.3.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/js/tms_presets.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.easing.1.3.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.equalheights.js" type="text/javascript"></script>
    </head>
    <header>
        <div class="row-top">
            <div class="main">
                <div class="wrapper">
                    <h1><a href="index.html">Catering<span>.com</span></a></h1>
                    <nav>
                        <ul class="menu">
                            <li><a class="active" href="index.html">About</a></li>
                            <li><a href="menu.html">Menu</a></li>
                            <li><a href="catalogue.html">Catalogue </a></li>
                            <li><a href="shipping.html">Shipping</a></li>
                            <li><a href="faq.html">FAQ </a></li>
                            <li><a href="contact.html">Contact</a></li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
        <div class="row-bot">
            <div class="row-bot-bg">
                <div class="main">
                    <h2>Impressive Selection <span>for any Occasion</span></h2>
                    <div class="slider-wrapper">
                        <div class="slider">
                            <ul class="items">
                                <li> <img src="images/slider-img1.jpg" alt="" /> </li>
                                <li> <img src="images/slider-img2.jpg" alt="" /> </li>
                                <li> <img src="images/slider-img3.jpg" alt="" /> </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <script type="text/javascript">Cufon.now();</script>
    <script type="text/javascript">
        $(window).load(function () {
            $('.slider')._TMS({
                duration: 1000,
                easing: 'easeOutQuint',
                preset: 'slideDown',
                slideshow: 7000,
                banners: false,
                pauseOnHover: true,
                pagination: true,
                pagNums: false
            });
        });
    </script>
    <%@include file="footer.jsp" %>