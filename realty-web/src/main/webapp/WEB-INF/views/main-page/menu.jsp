<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <title></title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/menu-style.css"/>">
    </head>
    <body>
        <ul class="outer">
            <li><a class="menu-link" href="#"><spring:message code="lang.rent"/></a></li>
            <li><a class="menu-link" href="#"><spring:message code="lang.sale"/></a>
                <ul class="inner">
                    <li><a class="menu-link" href="#"><spring:message code="lang.1_room"/></a></li>
                    <li><a class="menu-link" href="#"><spring:message code="lang.2_room"/></a></li>
                    <li><a class="menu-link" href="#"><spring:message code="lang.3_room"/></a></li>
                    <li><a class="menu-link" href="#"><spring:message code="lang.4_room"/></a></li>
                </ul>
            </li>
        </ul>
    </body>
</html>
