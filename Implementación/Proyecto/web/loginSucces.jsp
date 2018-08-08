<%-- 
    Document   : loginSucces
    Created on : 25-07-2018, 12:49:12
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>User's home</title>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/styles.css">
        <link rel="stylesheet" href="assets/css/User-Activity-Panel.css">
    </head>

    <div class="card" style="margin:0px;padding:49px;">
        <div class="card-body">
            <div class="media">
                <div><img src="assets/img/Of_Fire_by_FallingToPieces.jpg" class="mr-3" style="height:100px;width:100px;"></div>
                <div class="media-body">
                    <ul class="list-unstyled fa-ul">
                        <li><i class="fa fa-user fa-li"></i><a>${sessionScope.usuario.getNombreUsuario()}</a></li>
                    </ul>
                </div>
            </div>
            <hr>
            <div class="flex-column justify-content-center align-items-center align-content-center">
                <p class="align-items-center align-content-center" style="font-size:20px;text-align:center;/*line-height:50px;*/background-color:#068fba;color:rgb(233,233,233);">Listas creadas</p>
            </div>

            <c:forEach items="${lista}" var="item">
                <div class="media" style="margin:0px;">
                    <div><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x text-primary" style="color:rgb(0,224,63);"></i><i class="fa fa-file-text-o fa-stack-1x fa-inverse"></i></span></div>
                    <div class="media-body">

                        <div class="row">

                            <div class="col">
                                <p class="text-left"><a href="CreadorPaginaLista?id=${item.getIdLista()}" style="margin:12px;width:auto;padding:-2px;font-size:21px;"><strong>${item.getNombreLista()}</strong><br>
                                    </a> </p>
                            </div>

                            <div class="col">
                                <p class="text-left"><a onClick="JavaScipt:show_prompt('ModificarLista?id=${item.getIdLista()}&')"><strong>Modificar</strong></a> <a href="JavaScript:confirma('EliminarLista?id=${item.getIdLista()}')"><strong>Eliminar</strong><br>
                                    </a></p>
                            </div>
                        </div>

                    </div>
                </div>
            </c:forEach>
            <div class="media"></div>
            <hr>
            <div class="col-md-4 align-self-center mx-auto text-center" style="width:360px;margin:-5px;padding:-26px;">
                <a onClick="JavaScipt:show_prompt('CrearLista?')">
                    <span class="fa-stack fa-lg">
                        <i class="fa fa-circle fa-stack-2x text-primary"></i>
                        <i class="fa fa-file-text-o fa-stack-1x fa-inverse"></i>
                    </span>
                    <p>Crear nueva lista</p>
                </a>
            </div>
        </div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script language="JavaScript">
        function confirma(url) {
            if (confirm("¿Está seguro que desea eliminar este elemento?"))
                location.replace(url);
        }
    </script>
    <script lenguage="JavaScript">
        function show_prompt(url) {
            var name = prompt('Ingrese un nombre', 'Poppy');
            
            if (name !== null && name !== "") {
                location.replace(url + "name=" + name);
            }
        }
    </script>
</body>
</html>