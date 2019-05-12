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
<% if (session.getAttribute("email") == null) { %>
    <%@ include file="html/Header.html" %>
<% } else {%>
    <%@ include file="html/LoggedInHeader.jsp" %>
<% } %>
<table id="searchbar" align="center">
        <th colspan="2">
        <td>

            <form method="get">
            <input type="text" name="txtSearchItem" id="bookText" value="Search book" />
            </form>
        </td>
        </th>

        <th>
        	<td>
            <form Method="Put"> 
            <input type="submit" id = "searchButton" value="Search" />
            </form>
            </td>
        </th>
</table>
	 <table id="books" align="center">
            <th colspan="2">Books</th>
            <tr>
                <td>
                <form action="ReserveServlet" Method="POST">
                   <table id = "bookTable">
	</table> 
	</form>
                </td>
            </tr>
</table>
	<div id = "1"></div>
	<%@ include file="html/Footer.html" %>
	
	<script src = "js/Book.js"></script>
</body>
</html>