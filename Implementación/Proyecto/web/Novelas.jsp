<%-- 
    Document   : Novelas
    Created on : 04-08-2018, 22:17:21
    Author     : Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">

        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>

        <style type="text/css">
            table, th, td {
                border: 1px solid black;
                text-align: center;
            }
            input {
                width: 100% ;
            }

        </style>

    </head>
    <body>
        <div>
            <h1 style="text-align: center">Novelas ligeras</h1>
        </div>
        <br>
        <table class="display" cellspacing="0" width="100%" id="tabla">
            <thead>
                <tr>
                    <th>Thumbnail</th>
                    <th>Nombre de la novela</th> 
                    <th>Año</th> 
                    <th>Accion</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="novela" items="${novelas}" >
                    <tr>
                        <td><img class="float-none" src="images/250px-Game_of_Thrones_title_card.jpg" ></td>
                        <td><a href="CreadorPagina?id=${novela.idNovela}" id="${novela.idNovela}">${novela.nombre}</td>
                        <td>${novela.año}</td>
                        <td>
                            <a href="">Agregar a una lista <br>
                                <a href="">Agregar a una nueva lista <br>
                        </td>
                    </tr>
                </c:forEach>
             </tbody>
        </table>

        <script>
            $(document).ready(function () {
                $('#tabla').DataTable({
                    "language": {
                        "url": "http://cdn.datatables.net/plug-ins/1.10.19/i18n/Spanish.json"
                    }
                });
            });
        </script>
    </body>
</html>