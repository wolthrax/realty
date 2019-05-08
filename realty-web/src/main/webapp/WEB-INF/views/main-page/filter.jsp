<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title></title>
    </head>
    <body>
        <div>
            <form action="/realty-web/j_spring_security_check" method="POST">
                <table>
                    <tr>
                        <td><label for="r_login">Комнат:</label></td>
                        <td><input id="r_login" type="text" name="r_login"></td>

                        <td class="form-table-button" colspan="2">
                            <input class="submitLarge" type="submit" value="Search"/>
                        </td>
                    </tr>

                    <tr>
                        <td><label for="r_password">Город:</label></td>
                        <td><input id="r_password" type="password" name="r_password"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
