<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <title>Authentication</title>
    </head>
    <body>
    <div class="form">
        <form action="/realty-web/j_spring_security_check" method="POST">
            <h1 class="form-header"><spring:message code="lang.log_in"/></h1>
            <table class="form-table">
                <tr>
                    <td><label for="r_login"><spring:message code="lang.login"/>:</label></td>
                    <td><input id="r_login" type="text" name="r_login"></td>
                </tr>

                <tr>
                    <td><label for="r_password"><spring:message code="lang.pwd"/>:</label></td>
                    <td><input id="r_password" type="password" name="r_password"></td>
                </tr>

                <tr><td>&nbsp;</td></tr>

                <tr>
                    <td class="form-table-button" colspan="2">
                        <input class="submitLarge" type="submit" value="<spring:message code="lang.log_in"/>"/>
                    </td>
                </tr>
            </table>
        </form>
        <form action="/realty-web/registration" method="GET">
            <table class="form-table">
                <tr>
                    <td class="form-table-button"><input type="submit" value="<spring:message code="lang.registration"/>"/></td>
                <tr>
            </table>
        </form>
    </div>
    </body>
</html>
