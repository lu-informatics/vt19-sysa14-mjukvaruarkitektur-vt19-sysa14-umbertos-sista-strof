<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
    <style>
        #header {
            position: absolute;
            top: 0;
            width: 100%;
            background: grey;
            height: 175px;
            margin: 0px;
        }

        #wrap {
            min-height: 100%;
            max-height: 100%;
        }

        body {
            width: 100%;
            margin: 0px;
            position: absolute;
        }

        #main {
            position: relative;
            top: 175px;
            padding: 10px;
            padding-bottom: 250px;
            height: 400px;
            text-align: center;
        }

        #footer {
            position: relative;
            width: 100%;
            margin: 0px;
            background: grey;
            height: 250px;
        }


        #login {
            font-family: "Century Gothic", CenturyGothic, AppleGothic,sans-serif;
        }

        #CreateAccount {
            font-family: "Century Gothic", CenturyGothic, AppleGothic,sans-serif;
        }

        #Email {
            font-family: "Century Gothic", CenturyGothic, AppleGothic,sans-serif;
        }

        #lastname {
            font-family: "Century Gothic", CenturyGothic, AppleGothic,sans-serif;
        }

        u1 {
        }

        h1 {
            color: black;
            font-size: 50px;
            margin-left: 10px;
            font-family: "Century Gothic", CenturyGothic, AppleGothic,sans-serif;
        }

        p1 {
            color: white;
            font-size: 50px;
            margin-left: 10px;
            font-family: "Century Gothic", CenturyGothic, AppleGothic,sans-serif;
        }

        p2 {
            color: white;
            font-family: "Century Gothic", CenturyGothic, AppleGothic,sans-serif;
        }

        #FooterTable {
            background: grey;
            color: white;
            font-family: "Century Gothic", CenturyGothic, AppleGothic,sans-serif;
            text-align: center;
            padding: 5px;
            text-align: center;
        }
        #MainTable {
            background: white;
            color: black;
            font-family: "Century Gothic", CenturyGothic, AppleGothic,sans-serif;
            text-align: center;
            padding: 5px;
            text-align: center;
            margin-left: 35%;
            margin-right: 35%;
            margin-top: 100px;
        }

        fieldset {
            float: right;
            width: 100px;
            height: 60px;
            border: 0;
        }
        #AboutUs{
            text-align: left;
        }

        li {
            float: left;
            list-style: none;
        }

            li a {
                background-color: grey;
                display: block;
                color: white;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
                font-family: "Century Gothic", CenturyGothic, AppleGothic,sans-serif;
            }

        

        li a:hover {
            background-color: #111;
            color: white;
        }

    </style>
    <div id="header">
        <p1> Biblo </p1>
        <u1>
            <li style="position:absolute; left:0px; top:127px;"><a href="http://localhost:8080/WebISProject/jsp/Home.jsp">Home</a></li>
            <li style="position:absolute; left:71px; top:127px;"><a href="http://www.google.com">Books</a></li>
            <li style="position:absolute; left:139px; top:127px;"><a href="http://www.facebook.com">Reserve</a></li>
            <li style="position:absolute; left:219px; top: 127px; "><a href="http://localhost:8080/WebISProject/jsp/About.jsp">About</a></li>
        </u1>
        <fieldset id="PersonalFS">
            <p2>Email:</p2>
            <br>
            <input type="text" name="Email" id="Email" value="Donald">
            <br>
            <p2>Password:</p2>
            <br>
            <input type="text" name="lastname" id="lastname" value="Duck">
            <br>
            <br>
            <input type="submit" id="login" value="Log in">
            <input type="submit" id="CreateAccount" value="Create Account">
        </fieldset>
    </div>

    <div id="wrap">
        <div id="main">
            <table id="MainTable">
                <tr>
                    <td>About us</td>
                </tr>
                <tr>
                    <td id="AboutUs">
                        Welcome to Biblo! We are a small but ambitious Library located in Lund. The ultimate goal of Biblio is to make all the published works of humankind available to everyone in Lund. While large in scope and ambition, this goal is within our grasp.

                        On Biblo’s webpage you can check to see what books are in stock, if you select a book you may place a reservation. You will be asked to log in to your account to complete the reservation.
                    </td>
                </tr>
            </table>
        </div>
    </div>

    <div id="footer">
        <table style="width:100%;" id="FooterTable">
            <col width="33%" />
            <col width="33%" />
            <col width="33%" />
            <tr id="1">
                <th id="footerText">Opening hours</th>
                <th id="footerText">Address</th>
                <th id="footerText">Follow us on Social Media</th>
            </tr>
            <tr id="1">
                <td id="footerText">Mon 8-18</td>
                <td id="footerText">Tunavägen 5 Lund</td>
                <td id="footerText">Facebook</td>
            </tr>
            <tr id="1">
                <td id="footerText">Thu 8-18</td>
                <td></td>
                <td id="footerText">Twitter</td>
            </tr>
            <tr id="1">
                <td id="footerText">Wed 8-18</td>
                <td></td>
                <td id="footerText">Instagram</td>
            <tr id="1">
                <td id="footerText">Thu 8-18</td>
                <td></td>
                <td></td>
            </tr>
            <tr id="1">
                <td id="footerText">Fri 8-18</td>
                <td></td>
                <td></td>
            </tr>
            <tr id="1">
                <td id="footerText">Sat 10-16</td">
                <td></td>
                <td></td>
            </tr>
            <tr id="1">
                <td id="footerText">Sun closed</td>
                <th></th>
                <th></th>
            </tr>
        </table>
    </div>
</body>
</html>