<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
#books{
width:50%;
background-color:lightgrey;

}
#loanTable{
background-color:lightgrey;
border-collapse:separate; 
border-spacing:0 15px;
width:100%; 
}

#loanTable tr{
background-color:white;
width:100%;
table-layout: fixed;
height:40px;
outline: thin solid black;
margin-bottom:5px;

}
#loanTable td{
color: black;
text-align:center;
width:33,33%;
font-family: "lato",sans-riff;
font-size: 20px;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loans</title>
</head>
<body>
<% if (session.getAttribute("email") == null) { %>
    <% response.sendRedirect("http://localhost:8080/WebISProject/Home.jsp"); %>
<% } else {%>
    <%@ include file="html/LoggedInHeader.jsp" %>
<% } %>
 <table id="books" align="center">
            <th colspan="2">Loans</th>
            <tr>
                <td>
                   <table id = "loanTable">
	</table> 
                </td>
            </tr>
</table>
<form id = "value">
<input type ="hidden" value="<%= (String) session.getAttribute("email") %>" id= "myVal" name ="myVal">
</form>
	<div id = "1"></div>
	<%@ include file="html/Footer.html" %>
	
	<script src = "js/Loan.js"></script>
</body>
</html>