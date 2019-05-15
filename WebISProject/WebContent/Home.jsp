<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js">
</script>
<style>

th{
padding:20px;
color: white;
font-family:"Lato", sans-serif;
text-align: center;
}
td{
padding:10px;
color: white;
font-family:"Lato", sans-serif;
text-align: center;
}
aside{
	float: right;
	background-color: grey;
	width: 30%;
	height: 300px;
}
aside2{
	float: left;
	background-color: lightgrey;
	width: 70%;
	height: 300px;
}
</style>
</head>
    <body>
    

<% if (session.getAttribute("email") == null) { %>
    <%@ include file="html/HeaderHomePage.html" %>
<% } else {%>
    <%@ include file="html/LoggedInHeader.jsp" %>
<% } %>
       
        
                <div id="wrap">
                    <div id="main">
                    	<aside2>
                    	<table id= "aside2Table">
                    	<tr>
                    	<th>What to do.
                    	</th>
                    	</tr>
                    	<tr>
                    	<td>
                    	On Biblio&#180;s webpage you have access to a number of services. To be able to use these services you will be asked to login to your account. If you don&#180;t have an account, press the &#34;Create Account&#34; button in the top left corner. Once pressed you be asked to fill in your credentials to create an account.  
                    	</td>
                    	</tr>
                    	<tr>
                    	<td>
                    	Once logged in, you may check to see what books we have in our library in the &#34;Books&#34; tab. In the &#34;Reservation&#34; tab you can select a book and place a reservation. You can also remove a reservation by pressing the &#34;Delete&#34; button. In the &#34;Loans&#34; tab you will see all of your loans
                    	</td>
                    	</tr>
                    	</table>
                    	
                    	</aside2>
                    		<aside>
                          	<table id = "asideTable">
                                <tr>
                               		<th><span id="city"></span></th>
                               		<th><span id="ipNbr"></span></th>
                                </tr>
                                <tr>
                                	<th><span id="weather"></span></th>
                                	<th><span id="degree"></span></th>
                                </tr>
                           	</table>
                           	</aside>     
                    </div>
                    
                </div>
                <%@ include file="html/Footer.html" %>
        </body>
</html>
<script src = "js/WeatherAPI.js"></script>