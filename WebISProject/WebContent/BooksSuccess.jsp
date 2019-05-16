<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BooksError</title>
<style>
#searchbar{
	width:50%;
	align:center;
	height:40px;
}
#searchForm{
width:100%;
}
#bookText{
	width:75%;
	height:40px;
	float:left;
	margin-bottom: 50px;
}
#search {
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
            
            .wraper{
            width:50%;
            margin: 0 auto;
            }


#inputText{
float:left;
width:75%;
height:50px;
left:10px;
margin-bottom:20px;
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
margin-bottom:20px;
}

</style>
<body onload = "js/Book.js">
<% if (session.getAttribute("email") == null) { %>
    <%@ include file="html/Header.html" %>
<% } else {%>
    <%@ include file="html/LoggedInHeader.jsp" %>
<% } %>
<table id="searchbar" align="center">
<th style="color:green;">Reservation added!
</th>
	<tr>
        <td>
            <form id ="searchForm" method="get">
            <input type="text" name="txtSearchItem" id="bookText" value="" />
            
            </form>
            <button onclick="search()" id ="search">Search</button>
        </td>
       </tr>
</table>
	 	<div class="wraper" align=center>
                   <div id="table" align=right>
</div>
</div>
     
	<div id = "1"></div>
	<%@ include file="html/Footer.html" %>
	
	
</body>
<script src = "js/Book.js"></script>
</html>