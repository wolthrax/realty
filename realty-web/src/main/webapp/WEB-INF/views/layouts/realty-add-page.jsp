<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Add realty</title>

        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/add-realty-style.css"/>">
        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/datepicker/jquery.datetimepicker.css"/>">
        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/style.css"/>">
        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/other/radio-button-style.css"/>">
        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/other/custom-upload-style.css"/>">

        <script type="text/javascript" src="<c:url value="/assets/js/jquery.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/assets/js/datepicker/timepicker.js"/>"></script>


    </head>
    <body>
        <tiles:insertAttribute name="header"/>
        <p id="header-text">Добавление объявления</p>
        <div class="add-container">
            <div class="add-realty-form">
                <tiles:insertAttribute name="map"/>
                <tiles:insertAttribute name="form"/>
            </div>
        </div>
        <tiles:insertAttribute name="footer"/>

        <script type="text/javascript" src="<c:url value="/assets/js/datepicker/pickerinit.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/assets/js/other/custom-upload.js"/>"></script>
    </body>
</html>
