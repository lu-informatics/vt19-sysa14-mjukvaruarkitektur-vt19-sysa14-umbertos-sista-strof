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

        #NavBar {
        margin-top:50px;
        }

        h1 {
            color: black;
            font-size: 50px;
            margin-left: 10px;
            font-family: "Century Gothic", CenturyGothic, AppleGothic,sans-serif;
        }

        #Title {
            color: white;
            font-size: 50px;
            margin-left: 10px;
            font-family: "Century Gothic", CenturyGothic, AppleGothic,sans-serif;
        }

        #LoginText {
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
            width: 100%;
            
            
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

        #PersonalFS {
            float: right;
            width: 100px;
            height: 60px;
            border: 0;
        }
        #AboutUs{
            text-align: left;
        }

       #NavButton {
            float: left;
            list-style: none;
        }

            #aNavButton {
                background-color: grey;
                display: block;
                color: white;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
                font-family: "Century Gothic", CenturyGothic, AppleGothic,sans-serif;
            }

        

        #aNavButton:hover {
            background-color: #111;
            color: white;
        }

    </style>
    <%@ include file="html/Header.html" %>
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
</body>
<%@ include file="html/Footer.html" %>
</html>