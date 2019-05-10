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
	 <table id="books" align="center">
            <th colspan="2">Books</th>
            <tr>
                <td>
                   <table id = "bookTable">
	</table> 
                </td>
            </tr>
</table>
	<div id = "1"></div>
	<%@ include file="html/Footer.html" %>
	
	<script src = "js/Book.js"></script>
</body>
</html>