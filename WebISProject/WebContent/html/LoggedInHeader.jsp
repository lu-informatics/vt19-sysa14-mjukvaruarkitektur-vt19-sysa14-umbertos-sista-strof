<!DOCTYPE html>
<html lang="sv">
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<style>
	body{
        background-color: lightgrey;
    }

    body, hi, h2, h3, h4, h5, h6, h7 {
        font-family: "Lato", sans-serif
    }

    h1, button, fieldset {
        font-family: "Montserrat", sans-serif

    }
    
    u1 {
        list-style-type: none;
        margin: 0px;
        padding: 0px;
        overflow: hidden;
        background-color: #b78c55;
        top: 8px;
        left: 8px;
        position: absolute;
        float: left;
    }
    li {
        float: left;
        
    }

        li a {
            display: block;
            color: white;
            text-align: center;
            padding: 13px 15px;
            text-decoration: none;
        }

            /* Change the link color to #111 (black) on hover */
            li a:hover {
                background-color: #111;
            }
  
    .dropbtn {
        background-color: #b78c55;
        color: white;
        padding: 14px 15px;
        font-size: 14px;
        border: none;
        Width:120px;
    }

    .dropdown {
        position: absolute;
        display: inline-block;
        top: 8px;
        right: 8px;
        float: right;
    }

    .dropdown-content {
        display: none;
        position: absolute;
        background-color: #f1f1f1;
        width: 100%;
        box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
        z-index: 1;
    }

        .dropdown-content a {
            color: black;
            padding: 12px 16px;
            text-decoration: none;
            display: block;
            font-size: 12;
            text-align: center;
        }

            .dropdown-content a:hover {
                background-color: #ddd;
            }

    .dropdown:hover .dropdown-content {
        display: block;
    }

    .dropdown:hover .dropbtn {
        background-color: black;
        padding: 14px 15px;
    }

    p {
        position: absolute;
        top: 8px;
        right: 250px;
        color: white;
    }
    header {
        background-color: #b78c55;
        text-align: center;
        padding: 23px;
    }
  
  </style>
<body>


 <!-- Header -->
    <header>
        <!-- Navbar -->
        <h7>
            <div class="PLACEHOLDER">
                <div class="PLACEHOLDER">
                    <u1>
                        <li><a href="http://localhost:8080/WebISProject/Home.jsp">Home</a></li>
                        <li><a href="http://localhost:8080/WebISProject/Books.jsp">Books</a></li>
                        <li><a href="http://localhost:8080/WebISProject/About.jsp">About</a></li>
                        <li><a href="http://localhost:8080/WebISProject/Test.jsp">TEST</a></li>
                    </u1>
                     <p>Welcome, 
    <% String email = (String) session.getAttribute("email");
    out.println(email);
    %></p>
                    <div class="dropdown">
                        <button class="dropbtn">My Page</button>
                        <div class="dropdown-content">
                            <a href="http://localhost:8080/WebISProject/Reservations.jsp">Reservations</a>
                            <a href="http://localhost:8080/WebISProject/Loans.jsp">Loans</a>
                            <a href="http://localhost:8080/WebISProject/LogoutServlet">Log out</a>
                        </div>

                    </div>
                </div>
        </h7>
    </header>




</body>
</html>
    