<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/style.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/form-style.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/datepicker/jquery.datetimepicker.css"/>">

    <script type="text/javascript" src="<c:url value="/assets/js/jquery.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/assets/js/datepicker/jquery.datetimepicker.full.js"/>"></script>
</head>
<body>
    <tiles:insertAttribute name="header"/>
    <tiles:insertAttribute name="main"/>
    <tiles:insertAttribute name="footer"/>

    <script type="text/javascript" src="<c:url value="/assets/js/datepicker/pickerinit.js"/>"></script>
</body>
</html>
