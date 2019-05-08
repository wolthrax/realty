<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title></title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/menu-style.css"/>">
    </head>
    <body>
        <ul class="outer">
            <li><a class="menu-link" href="#">Аренда</a></li>
            <li><a class="menu-link" href="#">Продажа</a>
                <ul class="inner">
                    <li><a class="menu-link" href="#">1 комнатные</a></li>
                    <li><a class="menu-link" href="#">2 комнатные</a></li>
                    <li><a class="menu-link" href="#">3 комнатные</a></li>
                </ul>
            </li>
            <li><a class="menu-link" href="#">Цены</a></li>
            <li><a class="menu-link" href="#">Контакты</a></li>
        </ul>
    </body>
</html>
