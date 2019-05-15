<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p style= color:red;>incorrect username or password</p>
<form action="LoginServlet" Method="Get">
please enter your email
<input type="text" name="email" id="email">
please enter your password
<input type="password" name="password" id="password">
<input type="submit" name="submit" value="Login" id="submit" />
</form>
</body>
</html>