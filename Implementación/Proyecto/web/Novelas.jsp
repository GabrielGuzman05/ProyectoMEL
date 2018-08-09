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
                        <c:if test="${sessionScope.loged}">
                        <th>Accion</th>
                        </c:if>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="novela" items="${novelas}" >
                    <tr>
                        <td><img class="float-none" src="images/novelas/${novela.idNovela}.jpg" height="200" width="140"></td>
                        <td><a href="CreadorPagina?id=${novela.idNovela}">${novela.nombre}</td>
                        <td>${novela.año}</td>
                        <c:if test="${sessionScope.loged}">
                            <td>
                                <a href="">Agregar a una lista <br> </a>
                                <!-- Trigger/Open The Modal -->
                                <a data-toggle="modal" href="#myModal" class="open-CrearOnNew btn btn-primary" data-id="${novela.idNovela}">Agregar a nueva lista</a>
                            </td>
                        </c:if>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <!-- The Modal -->
        <div class="modal fade" id="myModal">

            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <form method="post" action="AgregarEnCrearLista">
                            <label>Nombre de la nueva lista:</label><br>
                            <input type="text" name="nombrelista" />
                            <label>Ultimo Capitulo:</label><br>
                            <input type="number" name="ulCap" id="ulcap"/><br>
                            <label>Terminado:</label><br>
                            <input type="checkbox" name="terminado" id="terminado"/><br>
                            <label>Al Dia:</label><br>
                            <input type="hidden" id="custId" name="origen" value="Novelas">
                            <input type="hidden" id="custid" name="id" value="">
                            <input type="checkbox" name="alDia" id="aldia"/><br>

                            <input type="submit" value="Crear Lista"/>
                        </form>
                    </div>
                </div>

            </div>
        </div>
        
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script>
            $(document).ready(function () {
                $('#tabla').DataTable({
                    "language": {
                        "url": "http://cdn.datatables.net/plug-ins/1.10.19/i18n/Spanish.json"
                    }
                });
            });
        </script>
        <script>
            $(document).on("click", ".open-CrearOnNew", function () {
                var id = $(this).data('id');
                console.log($(".modal-body #custid"));
                $(".modal-body #custid").val(id);
                $(".modal-body #custid").prop("type", "hidden");
                var modal = document.getElementById('myModal');
                modal.style.display = "block";
            });
        </script>
    </body>
</html>