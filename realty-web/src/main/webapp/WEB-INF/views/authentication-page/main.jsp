<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Authentication</title>
    </head>
    <body>
    <div class="form">
        <form action="/realty-web/j_spring_security_check" method="POST">
            <h1 class="form-header">Log In</h1>
            <table class="form-table">
                <tr>
                    <td><label for="r_login">Login:</label></td>
                    <td><input id="r_login" type="text" name="r_login"></td>
                </tr>

                <tr>
                    <td><label for="r_password">Password:</label></td>
                    <td><input id="r_password" type="password" name="r_password"></td>
                </tr>

                <tr><td>&nbsp;</td></tr>

                <tr>
                    <td class="form-table-button" colspan="2">
                        <input class="submitLarge" type="submit" value="LogIn"/>
                    </td>
                </tr>
            </table>
        </form>
        <form action="/realty-web/registration" method="GET">
            <table class="form-table">
                <tr>
                    <td class="form-table-button"><input type="submit" value="Registration"/></td>
                <tr>
            </table>
        </form>
    </div>
    </body>
</html>
