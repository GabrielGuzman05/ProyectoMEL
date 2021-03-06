<%-- 
    Document   : login
    Created on : 21-07-2018, 20:34:35
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>login</title>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/fonts/ionicons.min.css">
        <link rel="stylesheet" href="assets/css/Login-Form-Clean.css">
        <link rel="stylesheet" href="assets/css/Login-Form-Dark.css">
        <link rel="stylesheet" href="assets/css/styles.css">
    </head>

    <body>
        <div class="login-clean">
            <form method="post" action="loginUsuario">
                <h2 class="sr-only">Login Form</h2>
                <div class="illustration"><i class="icon ion-sad" style="color:rgb(5,122,38);"></i></div>
                <div class="form-group"><input class="form-control" type="text" name="User" placeholder="Usuario"></div>
                <div class="form-group"><input class="form-control" type="password" name="password" placeholder="Contraseña"></div>
                <div class="form-group"><button class="btn btn-primary btn-block" type="submit" style="background-color:rgb(5,122,38);">Log In</button></div><a href="#" class="forgot">Forgot your email or password?</a></form>
        </div>
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    </body>

</html>