<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if (session.getAttribute("email") == null) { %>
    <% response.sendRedirect("http://localhost:8080/WebISProject/Home.jsp"); %>
<% } else {%>
    <%@ include file="html/LoggedInHeader.jsp" %>
<% } %>
 <table id="books" align="center">
            <th colspan="2">Reservations</th>
            <tr>
                <td>
                   <div class = table id = "reserveTable">
	</div> 
                </td>
            </tr>
</table>
<form id = "value">
<input type ="hidden" value="<%= (String) session.getAttribute("email") %>" id= "myVal" name ="myVal">
</form>
	<div id = "1"></div>
	<%@ include file="html/Footer.html" %>
	
	<script src = "js/Reserve.js"></script>
</body>
</html>