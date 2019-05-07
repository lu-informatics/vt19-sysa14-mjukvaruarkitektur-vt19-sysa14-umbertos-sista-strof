<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js">
</script>
</head>
    <body>
        <style>
            #header {
                position: absolute;
                top: 0;
                width: 100%;
                background: grey;
                height: 175px;
                margin:0px;
            }
            /* Style searchbar*/
            form input[type=text] {
                font-size: 12px;
                border: 1px solid grey;
                float: left;
                width: 77%;
                background: white;
            }
                #wrap {
                min-height: 100%;
                max-height: 100%;
            }
            
            body {
                width: 100%;
                margin: 0px;
                position:absolute; 
                max-width:100%;
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

            table, th, td {
                background: grey;
                color: white;
                font-family: "Century Gothic", CenturyGothic, AppleGothic,sans-serif;
                text-align: center;
            }

            th, td {
                padding: 5px;
                text-align: center;
            }
           
            fieldset {
                float: right;
                width: 100px;
                height: 60px;
                border: 0;
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
            #SearchText {
                font-family: "Century Gothic", CenturyGothic, AppleGothic,sans-serif;
                height: 26px;
            }

            #SearchBook {
                font-family: "Century Gothic", CenturyGothic, AppleGothic,sans-serif;
                height: 30px;
            }

            li a:hover {
                background-color: #111;
                color: white;
            }
            form {
                display: inline-block;
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
                                <form action="ServletISProject" method="Get">
                                    <h1>Search Book</h1>
                                    <input type="text" name="SearchText" id="SearchText" />
                                    <input type="submit" name="SearchBook" value="Search" id="SearchBook" />
                                </form>
                                
                    </div>
                </div>
        
                <div id="footer">
                    <table style="width:100%;">
                        <col width="200px" />
                        <col width="200px" />
                        <col width="200px" />
                        <tr>
                            <th>Opening hours</th>
                            <th>Address</th>
                            <th>Follow us on Social Media</th>
                        </tr>
                        <tr>
                            <td>Mon 8-18</td>
                            <td>Tunavägen 5 Lund</td>
                            <td>Facebook</td>
                        </tr>
                        <tr>
                            <td>Thu 8-18</td>
                            <td></td>
                            <td>Twitter</td>
                        </tr>
                        <tr>
                            <td>Wed 8-18</td>
                            <td></td>
                            <td>Instagram</td>
                        <tr>
                            <td>Thu 8-18</td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>Fri 8-18</td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>Sat 10-16</td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>Sun closed</td>
                            <th></th>
                            <th></th>

                        </tr>
                    </table>
                </div>
        </body>
</html>
<script>
$("#SearchBook").click( function() {
	var strValue = $("SearchText").val();
	if(strValue != "") {
		$.ajax({
			method: "GET",url: "http://localhost:8080/WebIsProject/ServletISproject/"+strValue,
			error: ajaxFindReturnError, 
			success: ajaxFindReturnSuccess
		})
		functionajaxFindReturnSuccess(result, status, xhr) {
			ParseJsonFileBook(result);
		}
		functionajaxFindReturnError(result, status, xhr) {
			alert("Error");
			console.log("Ajax-find Book: "+status);
		}
	}
})//btnclick

</script>