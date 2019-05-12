<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="css/Style.css" rel="stylesheet" type="text/css">
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js">
</script>
</head>
    <body>
    

<% if (session.getAttribute("email") == null) { %>
    <%@ include file="html/Header.html" %>
<% } else {%>
    <%@ include file="html/LoggedInHeader.jsp" %>
<% } %>
       
        
                <div id="wrap">
                    <div id="main">
                                <form action="Books" method="Get">
                                    <h1>Search Book</h1>
                                    <input type="text" name="Text" id="SearchText" />
                                    <input type="submit" name="submit" value="Search" id="submit" />
                                </form>
                                
                    </div>
                </div>
                <%@ include file="html/Footer.html" %>
        </body>
</html>