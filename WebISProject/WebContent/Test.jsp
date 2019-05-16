<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
.testDiv{
height:300px;
}
.testTable{
width: 50%;
}
#testText{
width:75%;
	height:40px;
	float:left;
	margin-bottom: 50px;
}

#testButton{
background-color: black;
            color: white;
            border: none;
            cursor: pointer;
            text-align:center;
            height:40px;
            width:20%;
            float:right;
            margin-bottom: 50px;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test</title>
</head>
<% if (session.getAttribute("email") == null) { %>
    <%@ include file="html/Header.html" %>
<% } else {%>
    <%@ include file="html/LoggedInHeader.jsp" %>
<% } %>
<body>
<div class="testDiv">
<table class="testTable" align=center>
<tr>
<td>
	Här kan du skriva in ditt TestCase eller TestSuite:
	</td>
	</tr>
	<tr>
	<td>
	<form action="TestServlet" method="get" name="youTypeItForm">
		<input type="text"name="suite" id="testText" size=60value=/>
		<input type="submit" value="Run" id="testButton"/>
	</form>
	</td>
	</tr>
	</table>
</div>
</body>
 <%@ include file="html/Footer.html" %>
</html>