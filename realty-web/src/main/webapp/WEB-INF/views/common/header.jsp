<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <title></title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/header-style.css"/>">
    </head>
    <body>
        <div id="header-line">
            <div>
                <security:authorize access="hasAnyRole('ROLE_USER', 'ROLE_ADMIN')">
                    <div class="login-mng">
                        <a href="#"><button class="header-btn">${userName}</button></a>
                        <a href="/realty-web/j_spring_security_logout"><button class="header-btn"><spring:message code="lang.log_out"/></button></a>
                    </div>
                </security:authorize>
                <security:authorize access="!hasAnyRole('ROLE_USER', 'ROLE_ADMIN')">
                    <div class="login-mng">
                        <a href="/realty-web/registration"><button class="header-btn"><spring:message code="lang.registration"/></button></a>
                        <a href="/realty-web/login"><button class="header-btn"><spring:message code="lang.log_in"/></button></a>
                    </div>
                </security:authorize>
                <div class="lang-mng">
                    <a href="?lang=ru"><img src="<c:url value="/assets/img/lang/rus.png"/>" class="icon" alt="RUS"></a>
                    <a href="?lang=en"><img src="<c:url value="/assets/img/lang/eng.png"/>" class="icon" alt="ENG"></a>
                </div>
            </div>
        </div>
        <div id="header">
            <div id="logo"><a href="/realty-web/realty"><img src="<c:url value="/assets/img/home_realty.png"/>"></a></div>
            <div id="email_logo"><img src="<c:url value="/assets/img/email_logo.png"/>"></div>
            <div id="phone_logo"><img src="<c:url value="/assets/img/phone_logo.png"/>"></div>
        </div>
    </body>
</html>
