<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js">
</script>
</head>
    <body>
    

<% if (session.getAttribute("email") == null) { %>
    <%@ include file="html/HeaderHomePage.html" %>
<% } else {%>
    <%@ include file="html/LoggedInHeader.jsp" %>
<% } %>
       
        
                <div id="wrap">
                    <div id="main">
                                <table id = "asideTable">
                                <tr>
                               	<th><span id="city"></span></th>
                               	<th><span id="ipNbr"></span></th>
                                </tr>
                                
                               
                                </table>
                                
                    </div>
                    
                </div>
                <%@ include file="html/Footer.html" %>
        </body>
</html>
<script src = "js/WeatherAPI.js"></script>