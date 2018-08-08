<%-- 
    Document   : Mangas
    Created on : 06-08-2018, 22:25:14
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
            <h1 style="text-align: center">Mangas</h1>
        </div>
        <br>
        <table class="display" cellspacing="0" width="100%" id="tabla">
            <thead>
                <tr>
                    <th>Thumbnail</th>
                    <th>Nombre del manga</th> 
                    <th>Año</th> 
                    <th>Accion</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="manga" items="${mangas}" >
                    <tr>
                        <td><img class="float-none" src="images/mangas/${manga.idManga}.jpg" ></td>
                        <td><a href="CreadorPagina?id=${manga.idManga}">${manga.nombreManga}</td>
                        <td>${manga.año}</td>
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