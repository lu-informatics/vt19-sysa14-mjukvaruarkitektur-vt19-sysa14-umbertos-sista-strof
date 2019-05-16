<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="sv">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<style>
#createAccountTable{
	width:50%
}
#createAccountTable tr td{
text-align:center;
}
#text{
float:right;
width:50%;
height:40px;
}
#label{
float:left;
text-align:center;
height:40px;
}

.registerbtn{
 background-color: black;
            color: white;
            border: none;
            cursor: pointer;
            text-align:center;
            height:40px;
            width:20%;
            margin-top: 25px;

}
#button{
text-align:center;
}
.container{
text-align : center;
}
</style>

<body>
<% if (session.getAttribute("email") == null) { %>
	<%@ include file="html/Header.html" %>
<% } else {%>
    <% response.sendRedirect("http://localhost:8080/WebISProject/Home.jsp"); %>
<% } %>
    <form action="PersonServlet" Method="Post">
        <div class="container">
            <h1> Register </h1>
            <p> Please fill in this form to create an account.</p>
            <p style="color:red;">An account with this email already exist.</p>
            <hr>
			<table id="createAccountTable" align=center>
				<tr>
					<td>
            			<label for="firstname" id="label"> <b> Firstname:</b> </label>
           				<input type="text" id="text" placeholder="Enter Firstname" name="firstname" required>
					</td>
				</tr>
				<tr>
					<td>
            			<label for="lastname" id="label"> <b> Lastname:</b> </label>
            			<input type="text" id="text" placeholder="Enter Lastname" name="lastname" required>
					</td>
				</tr>
				<tr>
					<td>
            			<label for="email" id="label"> <b> Email:</b> </label>
            			<input type="text" id="text" placeholder="Enter Email" name="email">				
					</td>
				</tr>
				<tr>
					<td>
            			<label for="phone" id="label"> <b> Phonenumber:</b> </label>
            			<input type="text" id="text" placeholder="Enter Phonenumber" name="phone">
					</td>
				</tr>
				<tr>
					<td>
            			<label for="password" id="label"> <b> Password:</b> </label>
            			<input type="password" id="text" placeholder="Enter Password" name="password" required>
					</td>
				</tr>
				<tr>
					<td id= "button">
            			<button type="submit" class="registerbtn"> Register</button>
					</td>
				</tr>
				
			</table>
            <hr>
        </div>

    </form>
    <%@ include file="html/Footer.html" %>
</body>
</html>