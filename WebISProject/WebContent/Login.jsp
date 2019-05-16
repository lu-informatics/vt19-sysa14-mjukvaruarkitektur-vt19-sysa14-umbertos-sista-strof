<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log in</title>
<style>

    * {
        box-sizing: border-box;
    }
    body {
        background-color: lightgrey;
        font-family: "Lato", sans-serif
    }


    h2, input, .btn, title {

        font-family: "Lato", sans-serif
    }

    .log-form {
        width: 40%;
        min-width: 320px;
        max-width: 475px;
        background: #b78c55;
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%,-50%);
    }
    form {
        display: block;
        width: 100%;
        padding: 2em;

    }

    h2 {
        width: 100%;
        color: white;
        font-size: 1.35em;
        display: block;
        width: 100%;
        padding: .75em 1em .75em 1.5em;
        margin: 0;

    }

    input {
        display: block;
        margin: auto auto;
        width: 100%;
        margin-bottom: 2em;
        padding: .5em 0;
        border: none;
        padding-bottom: 1.25em;
        color: black;

        
    }

        title {
            color: blue;
        }

        #submit {
        display: inline-block;
        background: black;
        border: none;
        padding: .5em 2em;
        color: white;
        margin-right: .5em;
           
    }
</style>
<body>
    <div class="log-form">
        <h2>Login to your account</h2>
        <form action="LoginServlet" Method="Get">
					email
<input type="text" name="email" id="email">
password
<input type="password" name="password" id="password">
<input type="submit" name="submit" value="Login" id="submit" />
    </div>

</body>
</html>
</body>
</html>