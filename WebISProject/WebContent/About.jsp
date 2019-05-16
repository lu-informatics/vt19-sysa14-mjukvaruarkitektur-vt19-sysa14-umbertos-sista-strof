<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>About</title>
<style>
    body {
        background-color: lightgrey;
    }

    body {
        font-family: "Lato", sans-serif
    }


    th {
        padding: 10px;
        color: white;
        font-family: "Lato", sans-serif;
        text-align: center;
    }

    td {
        padding: 10px;
        color: white;
        font-family: "Lato", sans-serif;
        text-align: center;
    }
</style>
<body>
<% if (session.getAttribute("email") == null) { %>
    <%@ include file="html/Header.html" %>
<% } else {%>
    <%@ include file="html/LoggedInHeader.jsp" %>
<% } %>
    <!-- About us-->
    <div id="wrap">
                <table id="AboutUs">
                    <tr>
                        <th>
                            About us.
                        </th>
                    </tr>
                    <tr>
                        <td>
                            Welcome to Biblo! We are a small but ambitious Library located in Lund. The ultimate goal of Biblio is to make all the published works of humankind available to everyone in Lund. While large in scope and ambition, this goal is within our grasp.

                            Since first opening our doors, we have served all inhabitans of Lund with free and open places to gather, learn, connect, read and be transformed. We provide the innovative library services, technologies and tools students of Lund university need to reach their goals and to establish our city as a competitive force in the global marketplace.

                            Our library is that special third place—beyond home and work—where people come to improve their lives, nourish their intellect or savor entertainment.

                            Our rich collections, state-of-the-art technology, and cultural and public partnerships make us a thriving, engaged leader in Chicago’s diverse neighborhoods.
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Our people are librarians with excellent professional, academic and often technical skills, and wide ranging experience relevant to the academic environment we work within.

                            We are passionate about helping students develop and succeed. Library assistants and supervisors in our Customer Services teams are skilled in the library's automated circulation system and understand student needs and pressures, especially as many are recently students themselves. They look after all the borrowing and renewing, meeting room bookings, card top ups, fine payments and related enquiries. Plus they provide vital course reserve services.
                        </td>
                    </tr>
                    <tr>
                        <td>

                        </td>
                    </tr>
                </table>
        </div>
    <%@ include file="html/Footer.html" %>
</body>
</html>