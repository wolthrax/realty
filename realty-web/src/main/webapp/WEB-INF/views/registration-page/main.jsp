<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <title>Registration</title>
    </head>
    <body>
        <form action="/realty-web/user/registration" method="POST" autocomplete="off">
            <div class="form">
                <h1 class="form-header"><spring:message code="lang.registration"/></h1>
                <table class="form-table">
                    <tr>
                        <td><label for="r_login"><spring:message code="lang.login"/>:</label></td>
                        <td><input id="r_login" type="text" name='login'></td>
                    </tr>
                    <tr>
                        <td><label for="r_name"><spring:message code="lang.name"/>:</label></td>
                        <td><input id="r_name" type="text" name='name'></td>
                    </tr>
                    <tr>
                        <td><label for="r_surname"><spring:message code="lang.surname"/>:</label></td>
                        <td><input id="r_surname" type="text" name='surname'></td>
                    </tr>
                    <tr>
                        <td><label for="r_email"><spring:message code="lang.email"/>:</label></td>
                        <td><input id="r_email" type="email" name='email'/></td>
                    </tr>
                    <tr>
                        <td><label for="r_phone"><spring:message code="lang.phone"/>:</label></td>
                        <td><input id="r_phone" type="text" name='phone'/></td>
                    </tr>
                    <tr>
                        <td><label for="r_additionalPhone"><spring:message code="lang.additional_phone"/>:</label></td>
                        <td><input id="r_additionalPhone" type="text" name='additionalPhone'/></td>
                    </tr>
                    <tr>
                        <td><label for="r_skype"><spring:message code="lang.skype"/>:</label></td>
                        <td><input id="r_skype" type="text" name='skype'/></td>
                    </tr>
                    <tr>
                        <td><label for="r_dayOfBirth"><spring:message code="lang.day_of_birth"/>:</label></td>
                        <td><input id="r_dayOfBirth" class="datetimepicker_mask" type="text" name='dayOfBirth'/></td>
                    </tr>
                    <tr>
                        <td><label for="r_password1"><spring:message code="lang.pwd"/>:</label></td>
                        <td><input id="r_password1" type="password" name='password1'/></td>
                    </tr>
                    <tr>
                        <td><label for="r_password2"><spring:message code="lang.repeat_pwd"/>:</label></td>
                        <td><input id="r_password2" type="password" name='password2'/></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td class="form-table-button" colspan='2'><input name="submit" type="submit"/></td>
                    </tr>
                    <tr>
                        <td class="form-table-button" colspan='2'><input name="reset" type="reset"/></td>
                    </tr>
                </table>
            </div>
        </form>
    </body>
</html>
