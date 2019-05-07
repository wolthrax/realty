<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Registration</title>
    </head>
    <body>
    <form action="user/registration" method="POST">
        <table>
            <tr><td>Login:</td><td>
                <input type="text" name='login'>
            </td></tr>
            <tr><td>Name:</td><td>
                <input type="text" name='name'>
            </td></tr>
            <tr><td>Surname:</td><td>
                <input type="text" name='surname'>
            </td></tr>
            <tr><td>Email:</td><td>
                <input type="email" name='email'/>
            </td></tr>
            <tr><td>Phone:</td><td>
                <input type="text" name='phone'/>
            </td></tr>
            <tr><td>Additional phone:</td><td>
                <input type="text" name='additionalPhone'/>
            </td></tr>
            <tr><td>Skype:</td><td>
                <input type="text" name='skype'/>
            </td></tr>
            <tr><td>Day of birth:</td><td>
                <input type="date" name='dayOfBirth'/>
            </td></tr>
            <tr><td>Password:</td><td>
                <input type="password" name='password1'/>
            </td></tr>
            <tr><td>Repeat password:</td><td>
                <input type="password" name='password2'/>
            </td></tr>
            <tr><td colspan='2'>
                <input name="submit" type="submit"/>
            </td></tr>
            <tr><td colspan='2'>
                <input name="reset" type="reset"/>
            </td></tr>
        </table>
    </form>
    </body>
</html>
