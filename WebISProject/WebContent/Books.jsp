<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="css/Style.css" rel="stylesheet" type="text/css">
<head>
<style>
DIV.table 
{
    display:table;
}
FORM.tr, DIV.tr
{
    display:table-row;
}
SPAN.td
{
    display:table-cell;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book JSP</title>
</head>
<body onload = "js/Book.js">
<% if (session.getAttribute("email") == null) { %>
    <%@ include file="html/Header.html" %>
<% } else {%>
    <%@ include file="html/LoggedInHeader.jsp" %>
<% } %>
<table id="searchbar" align="center">
        <th colspan="2">
        <td>

            <form method="get">
            <input type="text" name="txtSearchItem" id="bookText" value="" />
            </form>
        </td>
        </th>

        <th>
        	<td>
            
            </td>
        </th>
</table>
<button onclick="search()" id ="search">Search</button>
	 
                   <div id="table">
</div>
     
	<div id = "1"></div>
	<%@ include file="html/Footer.html" %>
	
	
</body>
<script src = "js/Book.js"></script>
</html>