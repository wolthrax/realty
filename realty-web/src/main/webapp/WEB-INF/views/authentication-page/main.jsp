<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Authentication</title>
    </head>
    <body>
    <div id="index">
        <form action="j_spring_security_check" method="POST">
            <table align="center">
                <tr>
                    <td valign="top">Login:</td>
                    <td><input type="text" name="r_login"></td>
                </tr>

                <tr>
                    <td valign="top">Password:</td>
                    <td><input type="password" name="r_password"></td>
                </tr>

                <tr><td>&nbsp;</td></tr>

                <tr>
                    <td colspan="2" align="center"><input class="submitLarge" type="submit" value="LogIn"/></td>
                </tr>
            </table>
        </form>
        <form action="registration" method="GET">
            <table align="center">
                <tr>
                    <td>
                        <input type="submit" value="Registration"/>
                    </td>
                <tr>
            </table>
        </form>
    </div>
    </body>
</html>
