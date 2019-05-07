<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Registration</title>
    </head>
    <body>
        <form action="/realty-web/user/registration" method="POST">
            <div class="form">
                <h1 class="form-header">Registration</h1>
                <table class="form-table">
                    <tr>
                        <td><label for="r_login">Login:</label></td>
                        <td><input id="r_login" type="text" name='login'></td>
                    </tr>
                    <tr>
                        <td><label for="r_name">Name:</label></td>
                        <td><input id="r_name" type="text" name='name'></td>
                    </tr>
                    <tr>
                        <td><label for="r_surname">Surname:</label></td>
                        <td><input id="r_surname" type="text" name='surname'></td>
                    </tr>
                    <tr>
                        <td><label for="r_email">Email:</label></td>
                        <td><input id="r_email" type="email" name='email'/></td>
                    </tr>
                    <tr>
                        <td><label for="r_phone">Phone:</label></td>
                        <td><input id="r_phone" type="text" name='phone'/></td>
                    </tr>
                    <tr>
                        <td><label for="r_additionalPhone">Additional phone:</label></td>
                        <td><input id="r_additionalPhone" type="text" name='additionalPhone'/></td>
                    </tr>
                    <tr>
                        <td><label for="r_skype">Skype:</label></td>
                        <td><input id="r_skype" type="text" name='skype'/></td>
                    </tr>
                    <tr>
                        <td><label for="r_dayOfBirth">Day of birth:</label></td>
                        <td><input id="r_dayOfBirth" class="datetimepicker_mask" type="text" name='dayOfBirth'/></td>
                    </tr>
                    <tr>
                        <td><label for="r_password1">Password:</label></td>
                        <td><input id="r_password1" type="password" name='password1'/></td>
                    </tr>
                    <tr>
                        <td><label for="r_password2">Repeat password:</label></td>
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
