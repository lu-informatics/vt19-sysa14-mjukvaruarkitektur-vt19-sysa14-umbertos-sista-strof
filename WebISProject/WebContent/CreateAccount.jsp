<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="sv">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/Style.css" type="text/css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">

<body>
<%@ include file="html/Header.html" %>
    <form action="action_page.php" target="_blank">
        <div class="container">
            <h1> Register</h1>
            <p> Please fill in this form to create an account.</p>
            <hr>

            <label for="firstname"> <b> Firstname</b> </label>
            <input type="text" placeholder="Enter Firstname" name="firstname" required>

            <label for="lastname"> <b> Lastname</b> </label>
            <input type="text" placeholder="Enter Lastname" name="lastname" required>

            <label for="email"> <b> Email</b> </label>
            <input type="text" placeholder="Enter Email" name="email">

            <label for="phonenumber"> <b> Phonenumber</b> </label>
            <input type="text" placeholder="Enter Phonenumber" name="phonenumber">

            <label for="psw"> <b> Password</b> </label>
            <input type="password" placeholder="Enter Password" name="psw" required>

            <label for="psw-repeat"> <b> Repeat Password</b> </label>
            <input type="password" placeholder="Repeat Password" name="psw-repeat" required>
            <hr>

            <button type="submit" class="registerbtn"> Register</button>
        </div>

    </form>
    <%@ include file="html/Footer.html" %>
</body>
</html>