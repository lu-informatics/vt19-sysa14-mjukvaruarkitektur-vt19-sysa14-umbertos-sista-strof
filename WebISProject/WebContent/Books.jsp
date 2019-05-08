<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="css/Style.css" rel="stylesheet" type="text/css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book JSP</title>
</head>
<body>
<%@ include file="html/Header.html" %>
	<table>
		<c:forEach items="${book}" var="book">
			<tr>
				<td>${book.title}</td>
				<td>${book.author}</td>
				<td><form action="/reserve" Method = "Put" > <input type=submit value="reserve"></form></td>
			</tr>
		</c:forEach>
	</table>
	<%@ include file="html/Footer.html" %>
</body>
</html>