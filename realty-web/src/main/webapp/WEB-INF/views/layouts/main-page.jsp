<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Realty</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/style.css"/>">
        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/content-style.css"/>">

        <script type="text/javascript" src="<c:url value="/assets/js/jquery.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/assets/js/card/card.js"/>"></script>
    </head>
    <body>
        <tiles:insertAttribute name="header"/>
        <div id="main">
            <div>
                <tiles:insertAttribute name="menu"/>
            </div>
            <div class="filter">
                <tiles:insertAttribute name="filter"/>
            </div>
            <div class="content">
                <tiles:insertAttribute name="map"/>
                <tiles:insertAttribute name="realty-list"/>
            </div>

        </div>
        <tiles:insertAttribute name="footer"/>
    </body>
</html>