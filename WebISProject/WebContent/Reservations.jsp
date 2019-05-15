<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reservations</title>
</head>
<style>
#books{
width:50%;
}
.wraper{
	width:100%;
            margin: 0 auto;
            }

#inputText{
float:left;
width:75%;
height:50px;
left:10px;
margin-bottom:5px;
font-family: "lato",sans-riff;
font-size: 20px;
}
#inputButton{
float:right;
width:20%;
height:50px;
background-color: black;
color: white;
border: none;
cursor: pointer;
text-align:center;
margin-bottom:5px;
}
</style>
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
                <div class="wraper" align=center>
                   <div id = "reserveTable">
	</div> 
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