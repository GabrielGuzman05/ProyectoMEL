<%-- 
    Document   : Lista
    Created on : 07-08-2018, 0:26:29
    Author     : Gabriel
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>VistaLista</title>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/styles.css">
    </head>

    <body>
        <p class="text-center" style="font-size:24px;">Nombre lista</p>
        <div class="container">
            <div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr>
                            <th style="background-color:#60c659;">Serie</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listas}" var="entrada">
                            <c:if test="${entrada.getTipo()==1}">
                                <tr>
                                    <td><a class="datosEntrada" data-toggle="modal" href="#myModal" data-ulCap="${entrada.getUltimoCapitulo()}">${entrada.getSerieGenericaidSerie().getNombre()}</a></td>                            
                                    <%-- 
                                    <td>${entrada.getAlDia()}</td
                                    <td>${entrada.getUltimoCapitulo()}</td
                                    <td>${entrada.getTerminado()}</td
                                    --%>
                                </tr>
                            </c:if>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr>
                            <th style="background-color:#60c659;">Anime</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listas}" var="entrada">
                            <c:if test="${entrada.getTipo()==2}">
                                <tr>
                                    <td>${entrada.getAnimacionidAnimacion().getNombre()}</td>
                                    <td>${entrada.getAlDia()}</td
                                    <td>${entrada.getUltimoCapitulo()}</td
                                    <td>${entrada.getTerminado()}</td
                                </tr>
                            </c:if>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr>
                            <th style="background-color:#60c659;">Manga</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listas}" var="entrada">
                            <c:if test="${entrada.getTipo()==3}">
                                <tr>
                                    <td>${entrada.getMangaidManga().getNombreManga()}</td>
                                    <td>${entrada.getAlDia()}</td
                                    <td>${entrada.getUltimoCapitulo()}</td
                                    <td>${entrada.getTerminado()}</td
                                </tr>
                            </c:if>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr>
                            <th style="background-color:#60c659;">Novela Ligera</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listas}" var="entrada">
                            <c:if test="${entrada.getTipo()==4}">
                                <tr>
                                    <td>${entrada.getNovelaidNovela().getNombre()}</td>
                                    <td>${entrada.getAlDia()}</td
                                    <td>${entrada.getUltimoCapitulo()}</td
                                    <td>${entrada.getTerminado()}</td
                                </tr>
                            </c:if>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="modal fade" id="myModal" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Modal Header</h4>
                    </div>
                    <div class="modal-body">
                        <p>${ulCap}</p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>

            </div>
        </div>
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script>
            $(document).ready(function () {
                $(".datoEntrada").click(function () { // Click to only happen on announce links
                    $("#ulCap").val($(this).data('ulCap'));
                    $('#myModal').modal('show');
                });
            });
        </script>
    </body>

</html>