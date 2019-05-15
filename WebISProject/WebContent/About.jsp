<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>About</title>
<body>
<% if (session.getAttribute("email") == null) { %>
    <%@ include file="html/Header.html" %>
<% } else {%>
    <%@ include file="html/LoggedInHeader.jsp" %>
<% } %>
    <div id="wrap">
        <div id="main">
            <table id="MainTable">
                <tr id=AboutUsRow>
                    <td id=AboutUs>About us</td>
                </tr>
                <tr id=AboutUsRow>
                    <td id="AboutUs">
                        Welcome to Biblo! We are a small but ambitious Library located in Lund. The ultimate goal of Biblio is to make all the published works of humankind available to everyone in Lund. While large in scope and ambition, this goal is within our grasp.

                        On Biblo’s webpage you can check to see what books are in stock, if you select a book you may place a reservation. You will be asked to log in to your account to complete the reservation.
                    </td>
                </tr>
            </table>
        </div>
    </div>
    <%@ include file="html/Footer.html" %>
</body>
</html>